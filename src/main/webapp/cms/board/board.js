/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('boardApp',['angular-constants','ngFileUpload']);
app.controller('boardCtrl',boardCtrl);

function boardCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $scope.initUE();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.boardFlagObj = {showDetail:false};
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
            delete : function(row){
                $scope.boardFlagObj.deleteOpen = true;
                $scope.deleteInfo = {id:row.brdId};
            },
            pass : function(row){
                $http.post("/board/check.json",{id:row.brdId,ifPass:true},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("审核通过成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            unpass : function(row){
                $http.post("/board/check.json",{id:row.brdId,ifPass:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("审核不通过成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            update : function(row){
                $scope.addBoardObj = {
                    brdId : row.brdId,
                    brdType : row.brdType,
                    brdTitle : row.brdTitle,
                    boardContent : row.boardContent,
                    img : row.img
                };
                $scope.addBoardObj.brdType += "";
                $scope.boardFlagObj.addOpen = true;
                $scope.boardFlagObj.edit = true;
                if(row.brdContent){
                    if($scope.boardFlagObj.uelistener){
                        $scope.boardue.setContent(row.brdContent);
                    }
                }
            }
        };

        var headerArray = ['公告名称','公告类型','公告图片','广告状态','创建人','创建日期','操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.boardImg = "<div class='thumbnail' style='height:160px;'><a class='fancybox' rel='group' href={{$row.img}}><img  src={{$row.img}}   style='height:160px;'/></a></div>";

            pg.action = '<a title="删除" class="btn bg-red btn-xs shop-margin-top-3" ng-click="$table.delete($row)">删除</a>'+
            '<a title="审核通过" ng-if="$row.brdStatus != 1" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.pass($row)">审核通过</a>'+
            '<a title="审核不通过" ng-if="$row.brdStatus == 1" class="btn bg-orange btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.unpass($row)">审核不通过</a>'+
            '<a title="编辑" class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.update($row)">编辑</a>';
            return pg;
        }), ['brdTitle','brdTypeStr','boardImg','brdStatusStr','userName','createDate','action']);
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

    //添加公告弹窗
    $scope.addBoardBtn = function(){
        $scope.addBoardObj = {};
        $scope.boardFlagObj.addOpen = true;
        $scope.boardFlagObj.edit = false;
        //$scope.initUE();
        if($scope.boardFlagObj.uelistener){
           $scope.boardue.setContent("");
        }
    }
    $scope.addBoardCancle = function(){
        $scope.boardFlagObj.addOpen = false;
    }
    //添加公告
    $scope.addBoardSave = function(){
        if(!$scope.addBoardObj.brdTitle){
            return toastr.info("标题不可为空!")
        }
        if(!$scope.addBoardObj.brdType){
            return toastr.info("类型不可为空!")
        }
        if(!$scope.addBoardObj.img){
            return toastr.info("图片不可为空!")
        }
        $scope.addBoardObj.brdContent = $scope.boardue.getContent();
        $http.post("/board/add.json",$scope.addBoardObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    $scope.boardFlagObj.addOpen = false;
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //更新公告
    $scope.updateBoardSave = function(){
        if(!$scope.addBoardObj.brdTitle){
            return toastr.info("标题不可为空!")
        }
        if(!$scope.addBoardObj.brdType){
            return toastr.info("类型不可为空!")
        }
        if(!$scope.addBoardObj.img){
            return toastr.info("图片不可为空!")
        }
        $scope.addBoardObj.brdContent = $scope.boardue.getContent();
        $http.post("/board/update.json",$scope.addBoardObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    $scope.boardFlagObj.addOpen = false;
                    toastr.info("更新成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    $scope.initUE = function(){
        //之前的编辑器可能已经损坏,先销毁
        //UE.delEditor('boardContent');
        //实例化编辑器
        $scope.boardue = UE.getEditor('boardContent', {
            toolbars: [
                ['fullscreen','source','undo','redo','formatmatch','indent','justifyleft','justifyright','justifycenter','justifyjustify','background', 'link',  'fontfamily','fontsize','forecolor','bold','backcolor','italic','underline','inserttable','deletetable','insertrow','insertcol','simpleupload','insertimage','charts']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true
        });

        $scope.boardue.addListener("ready", function () {
            // editor准备好之后才可以使用
            $scope.boardue.setContent("");
            $scope.boardFlagObj.uelistener = true;
        });
    }
    //取消删除
    $scope.deletCancle = function(){
        $scope.boardFlagObj.deleteOpen = false;
    }
    $scope.deleteSave = function(){
        $http.post("/board/delete.json",{id:$scope.deleteInfo.id},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.boardFlagObj.deleteOpen = false;
                    $scope.searchLoad();
                    toastr.info("删除成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }
    //格式化表格数据
    $scope.formatPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].brdStatusStr = "";
                if(pageData[i].brdStatus == 0){
                    pageData[i].brdStatusStr = "未审核";
                }else if(pageData[i].brdStatus == 1){
                    pageData[i].brdStatusStr = "<span style='color: green'>审核通过</span>";
                }else if(pageData[i].brdStatus == 2){
                    pageData[i].brdStatusStr = "<span style='color: red'>审核未通过</span>";

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
                   }else if(pageData[i].brdType == 5){
                       pageData[i].brdTypeStr = "北翼要闻";
                   }else if(pageData[i].brdType == 6){
                       pageData[i].brdTypeStr = "最新动态";
                   }
                }
            }
        }
        return pageData;
    }
    //上传图片
    $scope.uploadImage = function (boardImage) {
        if(boardImage == "" || boardImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 2 },
            file: boardImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            $scope.addBoardObj.img = data.data.uploadPath;

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}