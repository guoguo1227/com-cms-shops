/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('flashApp',['angular-constants']);
app.controller('flashCtrl',flashCtrl);

function flashCtrl($scope,$http,angularMeta,lgDataTableService){
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
            openDetail : function(row){
                $scope.commentObj = row;
                $scope.commentFlagObj.showDetail = true;
            }
        };

        var headerArray = ['Flash文件名','显示文件','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        $scope.formatPageData(pageData);
        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {

            pg.action =  '<a title="下架" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">下架</a>';
            return pg;
        }), ['oldName','imgurl','action']);
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
                pageData[i].imgurl = "";
                if(pageData[i].flashName){
                    pageData[i].imgurl = "<embed src="+pageData[i].flashName+" style='width:300px;height: 100px;'></embed>";

                }

            }
        }
        return pageData;
    }
}