/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('boardApp',['angular-constants']);
app.controller('boardCtrl',boardCtrl);

function boardCtrl($scope,$http,angularMeta,lgDataTableService){
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
        $http.post("/board/page.json",$scope.search,angularMeta.postCfg)
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

        var headerArray = ['公告名称','公告类型','广告状态','创建人','创建日期','操作'];
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
        }), ['brdTitle','brdTypeStr','brdStatusStr','userName','createDate','action']);
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
                pageData[i].brdStatusStr = "";
                if(pageData[i].brdStatus){
                   if(pageData[i].brdStatus == 0){
                       pageData[i].brdStatusStr = "未审核";
                   }else if(pageData[i].brdStatus == 1){
                       pageData[i].brdStatusStr = "<span style='color: green'>审核通过</span>";
                   }else if(pageData[i].brdStatus == 2){
                       pageData[i].brdStatusStr = "<span style='color: red'>审核未通过</span>";

                   }
                }
                pageData[i].brdTypeStr = "";
                if(pageData[i].brdType){
                   if(pageData[i].brdType == 1){
                       pageData[i].brdTypeStr = "公告栏";
                   }else if(pageData[i].brdType == 2){
                       pageData[i].brdTypeStr = "开店一点通";
                   }else if(pageData[i].brdType == 3){
                       pageData[i].brdTypeStr = "政策法规";
                   }else if(pageData[i].brdType == 4){
                       pageData[i].brdTypeStr = "商铺知识";
                   }
                }
            }
        }
        return pageData;
    }
}