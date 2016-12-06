/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('streetApp',['angular-constants']);
app.controller('streetCtrl',streetCtrl);

function streetCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.streetFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/streetPage.json",$scope.search,angularMeta.postCfg)
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
                $scope.streetFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.streetId};
            }
        };

        var headerArray = ['街镇名称','地区名称','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="删除" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.delete($row)">删除</a>';
            return pg;
        }), ['streetName','districtName','action']);
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
        $scope.streetFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/shopmanage/delete-stree.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.streetFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("删除成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //添加街镇弹窗
    $scope.addStreeBtn = function(){
        $http.post("/shopmanage/district-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.streetFlagObj.districtArr = data.data;
                    }
                }
            });
        $scope.streetFlagObj.addOpen = true;
        $scope.addStreetObj = {};
    }
    //取消添加
    $scope.addStreetCancle = function(){
        $scope.streetFlagObj.addOpen = false;
    }
    $scope.addStreetSave = function(){
        if(!$scope.addStreetObj.streetName){
            return toastr.info("街镇名称不可为空")
        }
        if(!$scope.addStreetObj.districtId){
            return toastr.info("所属地区不可为空")
        }
        $http.post("/shopmanage/add-stree.json",$scope.addStreetObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.streetFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }

}