/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('flashApp',['angular-constants','ngFileUpload']);
app.controller('flashCtrl',flashCtrl);

function flashCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.flashFlagObj = {};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/flashPage.json",$scope.search,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.pagesNumber = data.data.totalPage;
                    $scope.totalEntries = data.data.totalCount;
                    $scope.initTableData(data.data.pageData);
                }else{
                    $scope.pagesNumber = 0;
                    $scope.totalEntries = 0;
                    $scope.initTableData(null);
                }
            });
    }
    //初始化表格数据
    $scope.initTableData = function(pageData){
        $scope.tableData = {
            //查看详情
            online : function(row){
                $http.post("/shopmanage/update-flash-status.json",{id:row.id,ifOnline:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.flashFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("上架成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            offline : function(row){
                $http.post("/shopmanage/update-flash-status.json",{id:row.id,ifOnline:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.flashFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("下架成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            }
        };

        var headerArray = ['Flash文件名','显示文件','状态','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        $scope.formatPageData(pageData);
        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {

            pg.action = '<a title="下架" ng-if="$row.status ==1" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.offline($row)">下架</a>'+
            '<a title="上架" ng-if="$row.status !== 1" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.online($row)">上架</a>';
            return pg;
        }), ['oldName','imgurl','statusStr','action']);
    };

    //切换页面
    $scope.onChangePage = function(page) {
        $scope.search.currentPage = page ;
        $scope.searchLoad();
    };
    //选择每页条数
    $scope.onChangePageEntry = function(entry){
        $scope.search.limit = entry;
        $scope.searchLoad();
    }
    //添加弹窗
    $scope.addFlashBtn = function(){
        $scope.flashFlagObj.addOpen = true;
        $scope.addFlashObj = {};
    }

    //取消添加
    $scope.addFlashCancle = function(){
        $scope.flashFlagObj.addOpen = false;
    }
    $scope.adFlashSave = function(){

        if(!$scope.addFlashObj.flashName){
            return toastr.info("请重新上传flash!")
        }
        $http.post("/shopmanage/addPage.json",$scope.addFlashObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.flashFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //格式化表格数据
    $scope.formatPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].imgurl = "";
                if(pageData[i].flashName){
                    pageData[i].imgurl = "<embed src="+pageData[i].flashName+" style='width:300px;height: 100px;'></embed>";

                }
                pageData[i].statusStr = "";
                if(pageData[i].status == 0){
                    pageData[i].statusStr = "未上架";
                }else if(pageData[i].status == 1){
                    pageData[i].statusStr = "<span><font color='green'>已上架</font></span>";
                }else if(pageData[i].status ==2){
                    pageData[i].statusStr = "<span><font color='red'>已下架</font></span>"
                }

            }
        }
        return pageData;
    }
    //提交
    $scope.uploadImage = function (flashImage) {
        if(flashImage == "" || flashImage == undefined){
            return toastr.info("请重新选择需要上传的flash!");
        }
        $scope.addFlashObj.oldName = flashImage.name;
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 8 },
            file: flashImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            $scope.addFlashObj.flashName = data.data.uploadPath;

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}