/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('businessApp',['angular-constants','ngFileUpload']);
app.controller('businessrCtrl',businessrCtrl);

function businessrCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $(".fancybox").fancybox({
            openEffect	: 'none',
            closeEffect	: 'none'
        });
        $scope.initUE();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.businessFlagObj = {showDetail:false};
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
                $scope.addBusinessObj = row;
                $scope.businessFlagObj.addOpen = true;
                $scope.businessFlagObj.detailFlag = true;

                if($scope.addBusinessObj.bizContent){
                    $scope.ue.setContent($scope.addBusinessObj.bizContent);
                }
            },
            pass : function(row){
                $http.post("/shopmanage/checkBusiness.json",{id:row.bizId,ifPass:true},angularMeta.postCfg)
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
                $http.post("/shopmanage/checkBusiness.json",{id:row.bizId,ifPass:false},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("审核不通过成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            }

        };

        var headerArray = ['项目名称','项目图片','顶部图片','审核状态','上架时间','下架时间','上架状态','发布人','发布日期','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatUserPageData(pageData);
        lgDataTableService.config($scope.tableData,{
            noscroll : true,
            nowrap : false,
            noexpand:[],
            width:{fileNameImg:'12%',fileNameImg2:'12%'}

        });

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="查看" class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.openDetail($row)">查看</a>'+
            '<a title="审核通过"  ng-if="$row.audStatus == 0" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.pass($row)">审核通过</a>'+
            '<a title="审核不通过" ng-if="$row.audStatus == 0" class="btn bg-orange btn-xs shop-margin-left-3 shop-margin-top-3" ng-click="$table.unpass($row)">审核不通过</a>';

            pg.fileNameImg = "<div class='thumbnail' style='max-height:180px;'><a class='fancybox' rel='group' href={{$row.fileName}}><img  src={{$row.fileName}}  style='width: 100%;height: 100%;'/></a></div>";
            pg.fileNameImg2 = "<div class='thumbnail' style='max-height:180px;'><a class='fancybox' rel='group' href={{$row.fileName2}}><img  src={{$row.fileName2}}  style='width: 100%;height: 100%;'/></a></div>";

            return pg;
        }), ['bizName','fileNameImg','fileNameImg2','statusStr','onsellDate','offsellDateStr','bizStatusStr','publisher','createDate','action']);
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

    //添加项目
    $scope.addBusinessBtn = function(){
        $scope.businessFlagObj.addOpen = true;
        $scope.addBusinessObj = {};

        $scope.initUE();
    }

    $scope.initUE = function(){
        //实例化编辑器
        $scope.ue = UE.getEditor('businessContent', {
            toolbars: [
                ['fullscreen','source','undo','redo','formatmatch','indent','justifyleft','justifyright','justifycenter','justifyjustify','background', 'link',  'fontfamily','fontsize','forecolor','bold','backcolor','italic','underline','inserttable','deletetable','insertrow','insertcol','simpleupload','insertimage','charts']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true
        });
    }

    $scope.addBusinessCancle = function(){
        $scope.businessFlagObj.addOpen = false;
    }
    //保存
    $scope.adBusinessSave = function(){
        if(!$scope.addBusinessObj.bizName){
            return toastr.info("项目名称不可为空!")
        }
        if(!$scope.addBusinessObj.onsellDate){
            return toastr.info("上架时间不可为空!")
        }

        if(!$scope.addBusinessObj.offsellDate){
            return toastr.info("下架时间不可为空!")
        }else{
            var flag = $scope.DataCompareAndEques($scope.addBusinessObj.offsellDate,$scope.addBusinessObj.onsellDate);
            if(!flag){
                toastr.info("结束时间必须大于等于开始时间");
                return;
            }
            if ($scope.addBusinessObj.offsellDate.indexOf("23:59:59")<0) {
                $scope.addBusinessObj.offsellDate +=  " 23:59:59";
            }
            if ($scope.addBusinessObj.onsellDate.indexOf("00:00:00") <0) {
                $scope.addBusinessObj.onsellDate +=  " 00:00:00";
            }
        }
        if(!$scope.addBusinessObj.fileName){
            return toastr.info("项目图片不可为空!")
        }
        //描述
        $scope.addBusinessObj.bizContent = $scope.ue.getContentTxt();
        if(!$scope.addBusinessObj.bizContent){
            return toastr.info("项目内容不可为空!")
        }
        $http.post("/shopmanage/add-business.json",$scope.addBusinessObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
        $scope.businessFlagObj.addOpen = false;

    }


    //格式化表格数据
    $scope.formatUserPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].statusStr = "";
                if(pageData[i].audStatus == 0){
                    pageData[i].statusStr = "未审核";
                }else if(pageData[i].audStatus == 1){
                    pageData[i].statusStr = "<span style='color: green'>已审核</span>";
                }else if(pageData[i].audStatus == 2){
                    pageData[i].statusStr = "<span style='color: red'>审核未通过</span>";

                }
                if(pageData[i].bizStatus == 0){
                    pageData[i].bizStatusStr = "未上架";
                }else if(pageData[i].bizStatus == 1){
                    pageData[i].bizStatusStr = "<span style='color: green'>已上架</span>";
                }else if(pageData[i].bizStatus == 2){
                    pageData[i].bizStatusStr = "<span style='color: red'>已下架</span>";

                }
                pageData[i].offsellDateStr = "";
                if(pageData[i].offsellDate){
                    pageData[i].offsellDateStr +=pageData[i].offsellDate;
                }else{
                    pageData[i].offsellDateStr = "无";
                }
            }
        }
        return pageData;
    }

    $scope.uploadImage = function (businessImage,flag) {
        if(businessImage == "" || businessImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 3 },
            file: businessImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            if(flag ==1){
                $scope.addBusinessObj.fileName = data.data.uploadPath;
            }else{
                $scope.addBusinessObj.fileName2 = data.data.uploadPath;
            }

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };

    /**
     * 比较两个日期的大小，大于或等于返回true
     * @param sDate1
     * @param sDate2
     * @constructor
     */
    $scope.DataCompareAndEques = function(sDate1,sDate2){
        var begin=new Date(sDate1.replace(/-/g,"/"));
        var end=new Date(sDate2.replace(/-/g,"/"));
        //js判断日期
        if(begin-end>=0){
            return true;
        }
        return false;
    }

}