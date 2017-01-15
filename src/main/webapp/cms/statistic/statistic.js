/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('statisticApp',['angular-constants']);
app.controller('statisticCtrl',statisticCtrl);

function statisticCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {type:1};
        $scope.linkFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/statistic.json",$scope.search,angularMeta.postCfg)
            .success(function(data){
                $scope.initTableData(data);
            });

        $scope.searchWeek = {type:2};
        $http.post("/shopmanage/statistic.json",$scope.searchWeek,angularMeta.postCfg)
            .success(function(data){
                $scope.initWeekTbleData(data);
            });

    }
    //初始化表格数据
    $scope.initTableData = function(pageData){
        $scope.tableData = {

        };

        var headerArray = ['时间','网站总点击数','商铺点击总数(好铺|旺铺)','电子商务点击数','广告点击数','在线客服点击数','留言总数'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatMonthPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            return pg;
        }), ['dateStr','totalStr','shopClickTotalStr','businessClick','adClick','qqClick','qaClick']);
    };

    //初始化表格数据
    $scope.initWeekTbleData = function(pageData){
        $scope.weekTableData = {

        };

        var headerArray = ['时间','网站总点击数','商铺点击总数(好铺|旺铺)','电子商务点击数','广告点击数','在线客服点击数','留言总数'];
        lgDataTableService.setHeadWithArrays($scope.weekTableData, [headerArray]);
        pageData = $scope.formatWeekPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.weekTableData, _.map(pageData, function(pg) {
            return pg;
        }), ['dateStr','totalStr','shopClickTotalStr','businessClick','adClick','qqClick','qaClick']);
    };

    //格式化表格数据
    $scope.formatMonthPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].shopClickTotalStr = pageData[i].shopClickTotal;
                if(pageData[i].shopClickTotal){
                    pageData[i].shopClickTotalStr += "("+pageData[i].shopGoodClick+" | "+pageData[i].shopFireClick+")";
                }
                pageData[i].dateStr = "";
                if(pageData[i].date){
                    pageData[i].dateStr = pageData[i].date+"月";
                }
                pageData[i].totalStr = "";
                if(pageData[i].total){
                    pageData[i].totalStr = Number(pageData[i].total) +  Number(pageData[i].shopClickTotal) + Number(pageData[i].businessClick) + Number(pageData[i].adClick) + Number(pageData[i].qqClick) ;
                }else{
                    pageData[i].totalStr = Number(pageData[i].shopClickTotal) + Number(pageData[i].businessClick) + Number(pageData[i].adClick) + Number(pageData[i].qqClick) ;
                }
            }
        }
        return pageData;
    }

    $scope.formatWeekPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].shopClickTotalStr = pageData[i].shopClickTotal;
                if(pageData[i].shopClickTotal){
                    pageData[i].shopClickTotalStr += "("+pageData[i].shopGoodClick+" | "+pageData[i].shopFireClick+")";
                }
                pageData[i].dateStr = "";
                if(pageData[i].date){
                    var tmp = pageData[i].date.substr(0,4);
                    var nav = pageData[i].date.substr(4,pageData[i].date.length);
                    pageData[i].dateStr = tmp+"年-第"+nav+"周";
                }
                pageData[i].totalStr = "";
                if(pageData[i].total){
                    pageData[i].totalStr = Number(pageData[i].total) +  Number(pageData[i].shopClickTotal) + Number(pageData[i].businessClick) + Number(pageData[i].adClick) + Number(pageData[i].qqClick) ;
                }else{
                    pageData[i].totalStr = Number(pageData[i].shopClickTotal) + Number(pageData[i].businessClick) + Number(pageData[i].adClick) + Number(pageData[i].qqClick) ;
                }
            }
        }
        return pageData;
    }
}