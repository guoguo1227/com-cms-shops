/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('partnerApp',['angular-constants']);
app.controller('partnerCtrl',partnerCtrl);

function partnerCtrl($scope,$http,angularMeta,lgDataTableService){
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
        $scope.partnerFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/partnerPage.json",$scope.search,angularMeta.postCfg)
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
                $scope.partnerFlagObj = row;
                $scope.partnerFlagObj.showDetail = true;
            }
        };

        var headerArray = ['伙伴名称','伙伴图片','状态','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.imgurl = "<a class='fancybox' rel='group' href={{$row.fileName}}><img src={{$row.fileName}} style='width:300px;height: 100px;' /></a>";

            pg.action =  '<a title="下架" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">下架</a>';
            return pg;
        }), ['partnerName','imgurl','statusStr','action']);
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
                if(pageData[i].status){
                    if(pageData[i].status == 0){
                        pageData[i].statusStr = "未上架";
                    }else if(pageData[i].status == 1){
                        pageData[i].statusStr = "上架";
                    }else if(pageData[i].status == 2){
                        pageData[i].statusStr = "下架";
                    }
                }
            }
        }
        return pageData;
    }
}