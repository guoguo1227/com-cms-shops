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
            {id:1,name:"位置1"},{id:2,name:"位置2"},{id:3,name:"位置3"},{id:4,name:"位置4"}
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
                $scope.adFlagObj.deleteOpen = false;
                $scope.deleteInfo = {id:row.adId};
            }
        };

        var headerArray = ['广告名称','广告图片','广告链接','广告状态','广告位置','创建人','创建时间','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatPageData(pageData);

        lgDataTableService.config($scope.tableData,{
            noscroll : true,
            nowrap : false,
            noexpand:[],
            width:{img:'20%'}

        });
        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.img = "<div class='thumbnail' style='height:180px;'><a class='fancybox' rel='group' href={{$row.newPicName}}><img  src={{$row.newPicName}}  /></a></div>";
            pg.link="<a href='{{$row.url}}' target='_blank'>{{$row.url}}</a>"
            pg.action =  /*'<a title="查看" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">查看</a>'+
                '<a title="编辑" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.delete($row)">编辑</a>'+*/
            '<a title="删除" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.delete($row)">删除</a>';
            /*'<a title="提交" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.delete($row)">提交</a>';*/
            ;
            return pg;
        }), ['adName','img','link','audStatusStr','adLocStr','creater','createDate','action']);
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
                //注册账号激活状态
                pageData[i].audStatusStr = "";
                if(pageData[i].audStatus){
                   if(pageData[i].audStatus == 0){
                       pageData[i].audStatusStr = "未审核";
                   }else if(pageData[i].audStatus == 1){
                       pageData[i].audStatusStr = "<span style='color: green'>已审核</span>";
                   }else if(pageData[i].audStatus == 2){
                       pageData[i].audStatusStr = "<span style='color: red'>审核未通过</span>";

                   }
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
    //取消删除
    $scope.deletCancle = function(){
        $scope.adFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/shopmanage/delete-shopType.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
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
        $scope.fileInfo = $scope.userImage;
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