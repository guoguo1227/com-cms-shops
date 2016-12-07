/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('commentApp',['angular-constants']);
app.controller('commentCtrl',commentCtrl);

function commentCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.commentFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(page){
        if(page){
            $scope.search.currentPage = page ;
        }
        $http.post("/shopmanage/qaPage.json",$scope.search,angularMeta.postCfg)
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
            check : function(row){
                $http.post("/shopmanage/qa-check.json",{id:row.qa.qaId},angularMeta.postCfg)
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

        var headerArray = ['商铺名称','所属地区','留言人','留言日期','留言内容','留言人手机','留言人邮箱','留言人地址','审核状态','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        $scope.formatCommentPageData(pageData);
        lgDataTableService.config($scope.tableData,{
            noscroll : true,
            nowrap : false,
            noexpand:[],
            width:{shopName:'10%',distruct:'100px','qa.content':'40%'}

        });
        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="审核"  ng-if="$row.qa.auditStatus == 0" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.check($row)">审核</a>';
            return pg;
        }), ['shopName','distruct','qa.askerName','qa.createDate','qa.content','qa.askerPhone','qa.askerMail','qa.askerLoc','auditStatusStr','action']);
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
    $scope.formatCommentPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                //注册账号激活状态
                if(pageData[i].qa){
                    pageData[i].auditStatusStr = "";
                    if(pageData[i].qa.auditStatus == 0){
                        pageData[i].auditStatusStr = "<span>未审核</span>";
                    }else if(pageData[i].qa.auditStatus == 1){
                        pageData[i].auditStatusStr = "<span><font color='green'>已审核</font></span>";
                    }else if(pageData[i].qa.auditStatus == 2){
                        pageData[i].auditStatusStr = "<span><font color='red'>审核未通过</font></span>";
                    }
                }
            }
        }
        return pageData;
    }
}