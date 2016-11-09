/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('businessApp',['angular-constants']);
app.controller('businessrCtrl',businessrCtrl);

function businessrCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $(".fancybox").fancybox({
            openEffect	: 'none',
            closeEffect	: 'none'
        });
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.commentFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/businessPage.json",$scope.search,angularMeta.postCfg)
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

        var headerArray = ['项目名称','审核状态','发布人','发布日期','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="下架" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">下架</a>';
            return pg;
        }), ['bizName','statusStr','publisher','createDate','action']);
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
                pageData[i].statusStr = "";
                if(pageData[i].bizStatus){
                    if(pageData[i].bizStatus == 0){
                        pageData[i].brdStatusStr = "未审核";
                    }else if(pageData[i].bizStatus == 1){
                        pageData[i].brdStatusStr = "<span style='color: green'>已审核</span>";
                    }else if(pageData[i].bizStatus == 2){
                        pageData[i].brdStatusStr = "<span style='color: red'>审核未通过</span>";

                    }
                }
            }
        }
        return pageData;
    }
}