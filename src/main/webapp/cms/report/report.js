/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('reportApp',['angular-constants']);
app.controller('reportCtrl',reportCtrl);

function reportCtrl($scope,$http,angularMeta,lgDataTableService){
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
            //查看详情
            openDetail : function(row){
                $scope.commentObj = row;
                $scope.commentFlagObj.showDetail = true;
            }
        };

        var headerArray = ['商铺名称','所属地区','所在楼层','租赁面积','装修情况','发布日期','发布人','基本操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="查看" class="btn bg-blue btn-xs lagou-margin-top-3" ng-click="$table.openDetail($row)">查看</a>'+
                '<a title="置顶" class="btn bg-green btn-xs lagou-margin-top-3" ng-click="$table.delete($row)">置顶</a>';
            return pg;
        }), ['shop.shopName','districtStr','shop.floor','shopSquareStr','buildingFinishing','shop.onsellDate','shop.publisher','action']);
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
    $scope.formatUserPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                //注册账号激活状态
                if(pageData[i].shop){
                    pageData[i].shopSquareStr = "";
                    if(pageData[i].shop.shopSquare){
                        pageData[i].shopSquareStr = pageData[i].shop.shopSquare+"平米";
                    }
                }
            }
        }
        return pageData;
    }
}