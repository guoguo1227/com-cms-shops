/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('adApp',['angular-constants']);
app.controller('adCtrl',adCtrl);

function adCtrl($scope,$http,angularMeta,lgDataTableService){
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
            //查看详情
            openDetail : function(row){
                $scope.commentObj = row;
                $scope.commentFlagObj.showDetail = true;
            }
        };

        var headerArray = ['广告名称','广告链接','广告状态','广告位置','创建人','创建时间','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="查看" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">查看</a>'+
                '<a title="编辑" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.delete($row)">编辑</a>'+
            '<a title="删除" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.delete($row)">删除</a>'+
            '<a title="提交" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.delete($row)">提交</a>';
            ;
            return pg;
        }), ['adName','url','audStatusStr','adLocStr','creater','createDate','action']);
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
}