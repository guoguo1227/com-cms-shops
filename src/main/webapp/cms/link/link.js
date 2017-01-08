/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('linkApp',['angular-constants']);
app.controller('linkCtrl',linkCtrl);

function linkCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.linkFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/friendPage.json",$scope.search,angularMeta.postCfg)
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
            online : function(row){
                $http.post("/shopmanage/update-friend-status.json",{id:row.friendId,status:1},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("上架成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            offline : function(row){
                $http.post("/shopmanage/update-friend-status.json",{id:row.friendId,type:2},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("下架成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            edit : function(row){
                $scope.linkFlagObj.addOpen = true;
                $scope.addLinkObj = row;
                $scope.linkFlagObj.edit = true;

            }
        };

        var headerArray = ['链接名称','友情链接','状态','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="上架" ng-if="$row.status !== 1" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.online($row)">上架</a>'+
                '<a title="下架" ng-if="$row.status == 1" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.offline($row)">下架</a>'+
            '<a title="编辑"  class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.edit($row)">编辑</a>';
            return pg;
        }), ['friendName','url','statusStr','action']);
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

    //添加友情链接
    $scope.addLinkBtn = function(){
        $scope.addLinkObj = {};
        $scope.linkFlagObj.addOpen = true;
        $scope.linkFlagObj.edit = false;

    }
    $scope.addFriendCancle = function(){
        $scope.linkFlagObj.addOpen = false;
    }
    //添加
    $scope.addFriendSave = function(){
        $http.post("/shopmanage/add-friend.json",$scope.addLinkObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    $scope.linkFlagObj.addOpen = false;
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //更新
    $scope.updateFriendSave = function (){
        $http.post("/shopmanage/update-friend.json",$scope.addLinkObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    $scope.linkFlagObj.addOpen = false;
                    toastr.info("编辑成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //格式化表格数据
    $scope.formatUserPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                //注册账号激活状态
                if(pageData[i].status){
                    pageData[i].statusStr = "";
                    if(pageData[i].status == 0){
                        pageData[i].statusStr = "<span>未上架</span>";
                    }else if(pageData[i].status == 1){
                        pageData[i].statusStr = "<span><font color='green'>已上架</font></span>";
                    }else if(pageData[i].status == 2){
                        pageData[i].statusStr = "<span><font color='red'>下架</font></span>";
                    }
                }
            }
        }
        return pageData;
    }
}