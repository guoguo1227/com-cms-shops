/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('aboutmeApp',['angular-constants','ngFileUpload']);
app.controller('aboutmeCtrl',aboutmeCtrl);

function aboutmeCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $scope.initAboutmeUE();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.aboutMeFlagObj = {showDetail:false};
        $scope.searchLoad();
    }
    $scope.searchLoad = function(){
        $http.post("/shopmanage/aboutme-list.json",$scope.search,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.initTableData(data.data);
                }else{
                    $scope.initTableData(null);
                }
            });
    }
    //初始化表格数据
    $scope.initTableData = function(pageData){
        $scope.tableData = {
            edit : function(row){
                $scope.aboutMeFlagObj.addOpen = true;
                $scope.editAboutmeObj = {
                    id : row.id,
                    name : row.name,
                    title : row.title,
                    description : row.description,
                    picture : row.picture
                };
                if($scope.aboutMeFlagObj.uelistener){
                    if(row.description){
                        $scope.aboutmeue.setContent(row.description);
                    }
                }
            }
        };

        var headerArray = ['名称','标题','图片','描述','更新时间','操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        lgDataTableService.config($scope.tableData,{
            noscroll : true,
            nowrap : false,
            noexpand:[],
            width:{description:'50%'}

        });

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.img = "<div class='thumbnail' style='height:180px;'><a class='fancybox' rel='group' href={{$row.picture}}><img  src={{$row.picture}}  style='width: 100%;height:180px;'/></a></div>";
            pg.descriptionStr = "";
            if(pg.description){
                pg.descriptionStr = '<span style="word-wrap: break-word;">'+pg.description+'</span>';
            }

            pg.action =  '<a title="编辑"  class="btn bg-blue btn-xs shop-margin-top-3 shop-margin-left-2" ng-click="$table.edit($row)">编辑</a>';
            return pg;
        }), ['name','title','img','descriptionStr','createTime','action']);
    };

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
    //取消
    $scope.updateAboutmeCancle = function(){
        $scope.aboutMeFlagObj.addOpen = false;
    }
    //保存
    $scope.updateAboutmeSave = function(){
        if(!$scope.editAboutmeObj.name){
            return toastr.info("名称不可为空!")
        }
        if(!$scope.editAboutmeObj.title){
            return toastr.info("标题不可为空!")
        }
        if(!$scope.editAboutmeObj.picture){
            return toastr.info("图片不可为空!")
        }
        $scope.editAboutmeObj.description = $scope.aboutmeue.getContent();
        $http.post("/shopmanage/aboutme-update.json",$scope.editAboutmeObj,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    $scope.aboutMeFlagObj.addOpen = false;
                    toastr.info("更新成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }

    $scope.initAboutmeUE = function(){
        //之前的编辑器可能已经损坏,先销毁
        //UE.delEditor('boardContent');
        //实例化编辑器
        $scope.aboutmeue = UE.getEditor('aboutmeContent', {
            toolbars: [
                ['fullscreen','source','undo','redo','formatmatch','indent','justifyleft','justifyright','justifycenter','justifyjustify','background', 'link',  'fontfamily','fontsize','forecolor','bold','backcolor','italic','underline','inserttable','deletetable','insertrow','insertcol','simpleupload','insertimage','charts']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true
        });

        $scope.aboutmeue.addListener("ready", function () {
            // editor准备好之后才可以使用
            $scope.aboutmeue.setContent("");
            $scope.aboutMeFlagObj.uelistener = true;
        });
    }
    //格式化表格数据
    $scope.formatPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                pageData[i].descriptionStr = "";
                if(pageData[i].description){
                    pageData[i].descriptionStr = "<span>"+pageData[i].description+"</span>";
                }
            }
        }
        return pageData;
    }

    //上传图片
    $scope.uploadImage = function (aboutmeImage) {
        if(aboutmeImage == "" || aboutmeImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 9 },
            file: aboutmeImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            $scope.editAboutmeObj.picture = data.data.uploadPath;

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}