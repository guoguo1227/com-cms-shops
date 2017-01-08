/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('adaptApp',['angular-constants']);
app.controller('adaptCtrl',adaptCtrl);

function adaptCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.adaptFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/buildOccupPage.json",$scope.search,angularMeta.postCfg)
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
                $scope.adaptFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.ocpyId};
            },
            edit : function(row){
                $scope.adaptFlagObj.addOpen = true;
                $scope.addAdaptObj = {
                    ocpyId : row.ocpyId,
                    ocpyName : row.ocpyName
                };
                $scope.adaptFlagObj.edit = true;
            }
        };

        var headerArray = ['适宜生态','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action = '<a title="编辑" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.edit($row)">编辑</a>'+
                '<a title="删除" class="btn bg-red btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.delete($row)">删除</a>';
            return pg;
        }), ['ocpyName','action']);
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
    //取消删除
    $scope.deletCancle = function(){
        $scope.adaptFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/shopmanage/delete-buildOccup.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adaptFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("删除成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //打开添加窗口
    $scope.addAdaptBtn = function(){
        $scope.adaptFlagObj.addOpen = true;
        $scope.addAdaptObj = {};
        $scope.adaptFlagObj.edit = false;
    }
    //取消添加
    $scope.addAdaptCancle = function(){
        $scope.adaptFlagObj.addOpen = false;
    }
    $scope.addAdaptSave = function(){
        if(!$scope.addAdaptObj.ocpyName){
            return toastr.info("名称不可为空")
        }
        $http.post("/shopmanage/add-buildOccup.json",$scope.addAdaptObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adaptFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });

    }
    //编辑
    $scope.updateAdaptSave = function(){
        if(!$scope.addAdaptObj.ocpyName){
            return toastr.info("名称不可为空")
        }
        $http.post("/shopmanage/update-buildOccup.json",$scope.addAdaptObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.adaptFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("修改成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
}