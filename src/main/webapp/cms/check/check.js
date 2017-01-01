/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('checkApp',['angular-constants']);
app.controller('checkCtrl',checkCtrl);

function checkCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.commentFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shop/page.json",$scope.search,angularMeta.postCfg)
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
            pass : function(row){
                $http.post("/shop/check.json",{id:row.shop.id,ifPass:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("操作成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            unpass: function(row){
                $http.post("/shop/check.json",{id:row.shop.id,ifPass:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("操作成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            }
        };

        var headerArray = ['商铺名称','所属地区','所在楼层','租赁面积','装修情况','发布日期','发布人','审核状态','基本操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="通过" ng-if="$row.shop.auditStatus != 1"  class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.pass($row)">通过</a>'+
             '<a title="不通过" ng-if="$row.shop.auditStatus != 2"  class="btn bg-red btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.unpass($row)">不通过</a>';
            return pg;
        }), ['shop.shopName','districtStr','shop.floor','shopSquareStr','buildingFinishing','shop.createDate','shop.publisher','checkStatus','action']);
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
                pageData[i].checkStatus = "未审核";
                if(pageData[i].shop.auditStatus){
                    if(pageData[i].shop.auditStatus == 0){
                        pageData[i].checkStatus = "未审核";
                    }else if(pageData[i].shop.auditStatus ==1){
                        pageData[i].checkStatus = "<font color='green'>审核通过</font>";
                    }else if(pageData[i].shop.auditStatus ==2){
                        pageData[i].checkStatus = "<font color='red'>审核未通过</font>";
                    }
                }
            }
        }
        return pageData;
    }
}