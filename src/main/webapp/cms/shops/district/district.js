/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('districtApp',['angular-constants']);
app.controller('districtCtrl',districtCtrl);

function districtCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.districtFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/districtPage.json",$scope.search,angularMeta.postCfg)
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
            up : function(row){
                $scope.districtObj = row;
                $http.post("/shopmanage/update-priority.json",{id:row.districtId,ifup:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.districtFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("操作成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            down : function(row){
                $scope.districtObj = row;
                $http.post("/shopmanage/update-priority.json",{id:row.districtId,ifup:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.districtFlagObj.addOpen = false;
                            $scope.searchLoad();
                            toastr.info("操作成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            delete : function(row){
                $scope.districtFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.districtId};
            },
            //编辑
            edit : function(row){
                $scope.districtFlagObj.addOpen = true;
                $scope.districtFlagObj.edit = true;
                $scope.addDistrict = {
                    districtName:row.districtName,
                    priority:row.priority,
                    districtId : row.districtId
                };
            }

        };

        var headerArray = ['地区名称','次序','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="上移" class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.up($row)">上移</a>'+
            '<a title="下移" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.down($row)">下移</a>'+
            '<a title="编辑" class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.edit($row)">编辑</a>'+
                '<a title="删除" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.delete($row)">删除</a>';
            return pg;
        }), ['districtName','priority','action']);
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

    //添加地区弹窗
    $scope.addDistrictBtn = function(){
        $scope.districtFlagObj.addOpen = true;
        $scope.districtFlagObj.edit = false;
        $scope.addDistrict = {};
    }
    //取消弹窗
    $scope.addDistrictCancle = function(){
        $scope.districtFlagObj.addOpen = false;
    }
    //保存弹窗
    $scope.addDistrictSave = function(){
        if(!$scope.addDistrict.districtName){
            return toastr.info("地区名称不可为空")
        }
        $http.post("/shopmanage/add-district.json",$scope.addDistrict,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.districtFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //编辑地区
    $scope.editDistrictSave = function(){
        if(!$scope.addDistrict.districtName){
            return toastr.info("地区名称不可为空")
        }
        $http.post("/shopmanage/update-district.json",$scope.addDistrict,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.districtFlagObj.addOpen = false;
                    $scope.searchLoad();
                    toastr.info("编辑成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //取消删除
    $scope.deletCancle = function(){
        $scope.districtFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/shopmanage/delete-district.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.districtFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("操作成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
}