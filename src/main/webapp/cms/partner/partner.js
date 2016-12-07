/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('partnerApp',['angular-constants','ngFileUpload']);
app.controller('partnerCtrl',partnerCtrl);

function partnerCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $(".fancybox").fancybox({
            openEffect	: 'none',
            closeEffect	: 'none'
        });
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.partnerFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/partnerPage.json",$scope.search,angularMeta.postCfg)
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
            offline : function(row){
                $http.post("/shopmanage/update-partner-status.json",{id:row.partnerId,ifOnline:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.partnerFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("添加成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            online : function(row){
                $http.post("/shopmanage/update-partner-status.json",{id:row.partnerId,ifOnline:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.partnerFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("添加成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            }
        };

        var headerArray = ['伙伴名称','伙伴图片','状态','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.imgurl = "<a class='fancybox' rel='group' href={{$row.fileName}}><img src={{$row.fileName}} style='width:300px;height: 100px;' /></a>";

            pg.action =  '<a title="下架" ng-if="$row.status == 1" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.offline($row)">下架</a>'+
             '<a title="上架" ng-if="$row.status !== 1" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.onli上ne($row)">架</a>';
            return pg;
        }), ['partnerName','imgurl','statusStr','action']);
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
    $scope.addPartnerBtn = function(){
        $scope.addPartnerObj = {};
        $scope.partnerFlagObj.addOpen = true;
    }

    //取消添加
    $scope.addPartnerCancle = function(){
        $scope.partnerFlagObj.addOpen = false;
    }
    $scope.adPartnerSave = function(){

        if(!$scope.addPartnerObj.partnerName){
            return toastr.info("伙伴名称不可为空!")
        }
        if(!$scope.addPartnerObj.fileName){
            return toastr.info("请重新上传图片!")
        }
        $http.post("/shopmanage/add-partner.json",$scope.addPartnerObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.partnerFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //格式化表格数据
    $scope.formatUserPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].statusStr = "";
                if(pageData[i].status == 0){
                    pageData[i].statusStr = "未上架";
                }else if(pageData[i].status == 1){
                    pageData[i].statusStr = "上架";
                }else if(pageData[i].status == 2){
                    pageData[i].statusStr = "下架";
                }
            }
        }
        return pageData;
    }
    //提交
    $scope.uploadImage = function (partnerImage) {
        if(partnerImage == "" || partnerImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 6 },
            file: partnerImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            $scope.addPartnerObj.fileName = data.data.uploadPath;

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}