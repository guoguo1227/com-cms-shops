/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('shopApp',['angular-constants']);
app.controller('shopCtrl',shopCtrl);

function shopCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:''};
        $scope.shopFlagObj = {};
        $scope.shopListFlag = true;
        $scope.searchLoad();

        $http.post("/shopmanage/hotcate-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.hotcateArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/district-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.districtArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/street-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.streetArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/buildOccup-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.buildOccupArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/buildFinish-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.buildFinishArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/shopType-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.shoptypeArr = data.data;
                    }
                }
            });

    }
    $scope.searchLoad = function(page){
        if(page){
            $scope.search.currentPage = page ;
        }
        $http.post("/shop/page.json",$scope.search,angularMeta.postCfg)
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

        var headerArray = ['商铺名称','所属地区','所在楼层','租赁面积','装修情况','发布日期','发布人','基本操作'];
        lgDataTableService.setWidth($scope.tableData, undefined, [4,8],true);
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatShopPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.action =  '<a title="查看" class="btn bg-blue btn-xs shop-margin-top-3" ng-click="$table.openDetail($row)">查看</a>'+
                '<a title="置顶" class="btn bg-green btn-xs shop-margin-top-3" ng-click="$table.delete($row)">置顶</a>';
            return pg;
        }), ['shop.shopName','districtStr','shop.floor','shopSquareStr','buildingFinishing','shop.onsellDate','shop.publisher','action']);
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
    $scope.formatShopPageData = function(pageData){

        if(pageData != undefined && pageData != "" && pageData.length>0){
            for(var i in pageData){
                //注册账号激活状态
                if(pageData[i].shop){
                    pageData[i].shopSquareStr = "";
                    if(pageData[i].shop.squareMetres){
                        pageData[i].shopSquareStr = pageData[i].shop.squareMetres+"平米";
                    }
                }
            }
        }
        return pageData;
    }

    //添加商铺按钮
    $scope.addShopBtn = function(){
        $scope.shopListFlag = false;
        $scope.addshop = {};
        $('#datetimepickerStart').datepicker({
            format: 'yyyy-mm-dd',
            language:'zh-CN',
            clearBtn: true,
            todayHighlight: true,
            autoclose:true
        });
        $('#datetimepickerEnd').datepicker({
            format: 'yyyy-mm-dd',
            language:'zh-CN',
            clearBtn: true,
            todayHighlight: true,
            autoclose:true
        });

        //                ue.setContent(template.content);

        $http.post("/shopmanage/archit-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.architArr = data.data;
                    }
                }
            });
        $http.post("/shopmanage/buildFaciAll.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.buildFaciArr = data.data;
                    }
                }
            });
        $scope.initUE();

        $scope.createMap();
    }

    $scope.goback = function(){
        $scope.shopListFlag = true;
    }

    $scope.initUE = function(){
        //实例化编辑器
        $scope.ue = UE.getEditor('shopContent', {
            toolbars: [
                ['fullscreen','source','undo','redo','formatmatch','indent','justifyleft','justifyright','justifycenter','justifyjustify','background', 'link',  'fontfamily','fontsize','forecolor','bold','backcolor','italic','underline','inserttable','deletetable','insertrow','insertcol','simpleupload','insertimage','charts']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true
        });
    }

    $scope.createMap = function(){
        // 百度地图API功能
        var map = new BMap.Map("allmap");
        var point = new BMap.Point(116.331398,39.897445);
        map.centerAndZoom(point,12);
        // 创建地址解析器实例
        var myGeo = new BMap.Geocoder();
        // 将地址解析结果显示在地图上,并调整地图视野
        myGeo.getPoint("北京市海淀区上地10街", function(point){
            if (point) {
                map.centerAndZoom(point, 16);
                map.addOverlay(new BMap.Marker(point));
            }else{
                alert("您选择地址没有解析到结果!");
            }
        }, "北京市");
    }

    /**
     * 选择地区
     */
    $scope.changeDistrict = function(){
        $http.post("/shopmanage/street-list.json",{districtId:$scope.addshop.districtId},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.addStreetArr = data.data;
                    }else{
                        $scope.shopFlagObj.addStreetArr =[];
                    }
                }
            });
    }

    /**
     * 保存商铺
     * @param shopImage
     * @param flag
     */
    $scope.shopSave = function(){
        if(!$scope.addshop.shopName){
            return toastr.info("商铺名称不可为空!")
        }
        if(!$scope.addshop.hotcateId){
            return toastr.info("所属商铺类型不可为空!")
        }
        if(!$scope.addshop.districtId){
            return toastr.info("所在地区不可为空!")
        }
        if(!$scope.addshop.streetId){
            return toastr.info("所在街镇不可为空!")
        }
        if(!$scope.addshop.location){
            return toastr.info("详细地址不可为空!")
        }
        if(!$scope.addshop.publisher){
            return toastr.info("发布人不可为空!")
        }
        if(!$scope.addshop.onsellDate){
            return toastr.info("上架时间不可为空!")
        }
        if(!$scope.addshop.offsellDate){
            return toastr.info("下架时间不可为空!")
        }
        if(!$scope.addshop.typeId){
            return toastr.info("物业性质不可为空!")
        }
        if(!$scope.addshop.finishingId){
            return toastr.info("装修情况不可为空!")
        }
        if(!$scope.addshop.traffic){
            return toastr.info("公交线路不可为空!")
        }
        if(!$scope.addshop.archiId){
            return toastr.info("建筑结构不可为空!")
        }
        if($scope.addshop.img1 === "" || $scope.addshop.img1 == undefined){
            return toastr.info("请先上传图片1!")
        }
        //描述
        $scope.addshop.description = ue.getContext();
        console.log($scope.addshop)
    }

    $scope.editPriceFun = function(){
        $scope.addshop.shopPrice2="";
        $scope.addshop.shopPricese2="";

    }

    $scope.editPrice2Fun = function(){
        $scope.addshop.shopPrice="";
        $scope.addshop.shopPricese="";

    }
    $scope.uploadImage = function (shopImage,flag) {
        $scope.fileInfo = shopImage;
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 7 },
            file: shopImage
        }).progress(function (evt) {
            //进度条
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progess:' + progressPercentage + '%' + evt.config.file.name);
        }).success(function (data, status, headers, config) {
            //上传成功
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
            toastr.info("上传成功!");
            if(flag ==1){
                $scope.addshop.img1 = data.data.uploadPath;
            }else{
                $scope.addshop.img2 = data.data.uploadPath;
            }

        }).error(function (data, status, headers, config) {
            //上传失败
            toastr.info("上传失败!");
            console.log('error status: ' + status);
        });

    };
}