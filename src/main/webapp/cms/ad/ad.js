/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('adApp',['angular-constants','ngFileUpload']);
app.controller('adCtrl',adCtrl);

function adCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $scope.searchLoad();
        $(".fancybox").fancybox({
            openEffect	: 'none',
            closeEffect	: 'none'
        });
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.adFlagObj = {showDetail:false};
        $scope.searchLoad();
        $scope.adFlagObj.locationArr = [
            {id:1,name:"位置1"},{id:2,name:"位置2"},{id:3,name:"位置3"},{id:4,name:"位置4"},{id:5,name:"位置5"},{id:6,name:"位置6"},{id:7,name:"位置7"},{id:8,name:"位置8"},{id:9,name:"位置9"},{id:10,name:"位置10"}
        ]
    }
    $scope.searchLoad = function(){
        $http.post("/advert/page.json",$scope.search,angularMeta.postCfg)
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
            delete : function(row){
                $scope.adFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.adId};
            },
            pass : function(row){
                $http.post("/advert/check.json",{id:row.adId,ifPass:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("审核通过成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            unpass : function(row){
                $http.post("/advert/check.json",{id:row.adId,ifPass:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("审核不通过成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            edit : function(row){
                $scope.adFlagObj.addOpen = true;
                $scope.addAdInfo = row;
                $scope.addAdInfo.adLoc += "";
                $scope.adFlagObj.editFlag = true;
            }
        };

        var headerArray = ['广告名称','广告图片','广告链接','广告位置','优先级','广告状态','创建人','创建时间','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatPageData(pageData);

        lgDataTableService.config($scope.tableData,{
            noscroll : true,
            nowrap : false,
            noexpand:[],
            width:{img:'20%'}

        });
        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.img = "<div class='thumbnail' style='height:180px;'><a class='fancybox' rel='group' href={{$row.newPicName}}><img  src={{$row.newPicName}}  style='width: 100%;height:180px;'/></a></div>";
            pg.link="<a href='{{$row.url}}' target='_blank'>{{$row.url}}</a>"
            pg.action =
                '<a title="编辑" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.edit($row)">编辑</a>'+
                '<a title="审核通过"  ng-if="$row.audStatus == 0" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.pass($row)">审核通过</a>'+
                '<a title="审核不通过" ng-if="$row.audStatus == 0" class="btn bg-orange btn-xs shop-margin-left-3 shop-margin-top-3" ng-click="$table.unpass($row)">审核不通过</a>'+
                '<a title="删除" class="btn bg-red btn-xs shop-margin-left-3 shop-margin-top-3" ng-click="$table.delete($row)">删除</a>';
            /*'<a title="提交" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.delete($row)">提交</a>';*/
            ;
            return pg;
        }), ['adName','img','link','adLocStr','priority','audStatusStr','creater','createDate','action']);
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

    //格式化表格数据
    $scope.formatPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                //状态
                pageData[i].audStatusStr = "";
                if(pageData[i].audStatus == 0){
                    pageData[i].audStatusStr = "未审核";
                }else if(pageData[i].audStatus == 1){
                    pageData[i].audStatusStr = "<span style='color: green'>已审核</span>";
                }else if(pageData[i].audStatus == 2){
                    pageData[i].audStatusStr = "<span style='color: red'>审核未通过</span>";

                }
                pageData[i].adLocStr = "";
                if(pageData[i].adLoc){
                    pageData[i].adLocStr = "位置"+pageData[i].adLoc;
                }
            }
        }
        return pageData;
    }

    //添加广告弹窗
    $scope.addAdBtn = function(){
        $scope.adFlagObj.addOpen = true;
        $scope.addAdInfo = {};

    }
    //取消添加
    $scope.addAdCancle = function(){
        $scope.adFlagObj.addOpen = false;
    }
    $scope.adAdSave = function(){

        if(!$scope.addAdInfo.adName){
            return toastr.info("广告名称不可为空!")
        }
        if(!$scope.addAdInfo.adLoc){
            return toastr.info("广告位置不可为空!")
        }

        if($scope.addAdInfo.newPicName === "" || $scope.addAdInfo.newPicName == undefined){
            return toastr.info("请先上传图片!")
        }
        $http.post("/advert/add.json",$scope.addAdInfo,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //修改
    $scope.editSave = function(){
        if(!$scope.addAdInfo.adId){
            return toastr.info("广告id为空,请刷新重试!")
        }
        if(!$scope.addAdInfo.adName){
            return toastr.info("广告名称不可为空!")
        }
        if(!$scope.addAdInfo.adLoc){
            return toastr.info("广告位置不可为空!")
        }
        if($scope.addAdInfo.newPicName === "" || $scope.addAdInfo.newPicName == undefined){
            return toastr.info("请先上传图片!")
        }

        $scope.updateInfo = {
            adId : $scope.addAdInfo.adId,
            adName : $scope.addAdInfo.adName,
            adLoc : $scope.addAdInfo.adLoc,
            priority : $scope.addAdInfo.priority,
            newPicName : $scope.addAdInfo.newPicName,
            url : $scope.addAdInfo.url

        }
        $http.post("/advert/update.json",$scope.updateInfo,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("修改成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //取消删除
    $scope.deleteCancle = function(){
        $scope.adFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/advert/delete.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("删除成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //提交
    $scope.uploadImage = function (userImage) {
        if(userImage == "" || userImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 1 },
            file: userImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            $scope.addAdInfo.newPicName = data.data.uploadPath;

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}