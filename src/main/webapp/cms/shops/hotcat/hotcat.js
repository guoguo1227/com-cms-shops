/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('hotcatApp',['angular-constants']);
app.controller('hotcatCtrl',hotcatCtrl);

function hotcatCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.hotcatFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/hotcatePage.json",$scope.search,angularMeta.postCfg)
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
                $scope.hotcatFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.hotId};
            }
        };

        var headerArray = ['商铺类型名称','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="删除" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.delete($row)">删除</a>';
            return pg;
        }), ['hotName','action']);
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
        $scope.hotcatFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/shopmanage/delete-hotcate.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.hotcatFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("删除成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //打开添加窗口
    $scope.addHotcatBtn = function(){
        $scope.hotcatFlagObj.addOpen = true;
        $scope.addHotcateObj = {};
    }
    //取消添加
    $scope.addHotcatCancle = function(){
        $scope.hotcatFlagObj.addOpen = false;
    }
    $scope.addHotcatSave = function(){
        if(!$scope.addHotcateObj.hotName){
            return toastr.info("类型名称不可为空")
        }
        $http.post("/shopmanage/add-hotcate.json",$scope.addHotcateObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.hotcatFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
}