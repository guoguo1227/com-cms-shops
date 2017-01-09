/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('shopApp',['angular-constants','ngFileUpload']);
app.controller('shopCtrl',shopCtrl);

function shopCtrl($scope,$http,angularMeta,lgDataTableService,Upload){
    //初始化table
    $scope.init = function() {
        $scope.ready();
        $(".fancybox").fancybox({
            openEffect	: 'none',
            closeEffect	: 'none'
        });
    };

    $scope.ready = function(){
        $scope.search = {limit:15, currentPage:0,searchContent:'',checkStatus:1};
        $scope.shopFlagObj = {detailFlag:false};
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
            setGood : function(row){
                $http.post("/shop/update-type.json",{id:row.shop.id,type:3},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("设置成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            setFire : function(row){
                $http.post("/shop/update-type.json",{id:row.shop.id,type:2},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("设置成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            //查看详情
            detail : function(row){
                $http.post("/shop/detail.json",{id:row.shop.id},angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.showDetail(data.data);
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            setShortRoad : function(row){
                $scope.updateShopObj = row;
                $scope.shopFlagObj.updateRoad = true;
            },
            online : function(row){
                $scope.updateShopInfo = {
                    id : row.shop.id,
                    shopStatus :1
                }
                $http.post("/shop/update.json",$scope.updateShopInfo,angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("修改成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            },
            offline : function(row){
                $scope.updateShopInfo = {
                    id : row.shop.id,
                    shopStatus :2
                }
                $http.post("/shop/update.json",$scope.updateShopInfo,angularMeta.postCfg)
                    .success(function(data){
                        if(data.success){
                            $scope.searchLoad();
                            toastr.info("修改成功!");
                        }else{
                            toastr.error(data.message);
                        }
                    });
            }

        };

        var headerArray = ['商铺名称','所属地区','道路简称','图片1','图片2','所在楼层','租赁面积','装修情况','发布日期','发布人','状态','类型','基本操作'];
        lgDataTableService.setHeadWithArrays($scope.tableData, [headerArray]);
        pageData = $scope.formatShopPageData(pageData);

        lgDataTableService.setBodyWithObjects($scope.tableData, _.map(pageData, function(pg) {
            pg.shopImg1 = "<div class='thumbnail' style='height:160px;'><a class='fancybox' rel='group' href={{$row.img1}}><img  src={{$row.img1}}   style='height:160px;'/></a></div>";
            pg.shopImg2 = "<div class='thumbnail' style='height:160px;'><a class='fancybox' rel='group' href={{$row.img2}}><img  src={{$row.img2}}   style='height:160px;'/></a></div>";

            pg.action =  '<a title="设置旺铺" class="btn bg-red btn-xs shop-margin-top-3" ng-click="$table.setGood($row)">设置好铺</a>'+
                '<a title="设置好铺" class="btn bg-orange btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.setFire($row)">设置旺铺</a>'+
            '<a title="上架" ng-if="$row.shopStatus == 0 || $row.shopStatus == 2" class="btn bg-orange btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.online($row)">上架</a>'+
            '<a title="下架" ng-if="$row.shopStatus == 1" class="btn bg-orange btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.offline($row)">下架</a>'+
            '<a title="设置简称" class="btn bg-info btn-xs shop-margin-top-3" ng-click="$table.setShortRoad($row)">设置简称</a>'+
            '<a title="编辑" class="btn bg-green btn-xs shop-margin-top-3 shop-margin-left-3" ng-click="$table.detail($row)">编辑</a>';

            return pg;
        }), ['shop.shopName','districtStr','shop.road','shopImg1','shopImg2','shop.floor','shopSquareStr','buildingFinishing','shop.createDate','shop.publisher','shopStatusStr','shopTypeStr','action']);
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

    //取消修改道路简称
    $scope.updateRoadCancle = function(){
        $scope.shopFlagObj.updateRoad = false;
    }
    //保存修改
    $scope.updateRoadSave = function(){

        if(!$scope.updateShopObj.road){
            return toastr.info("道路简称不可为空!")
        }
        $http.post("/shop/update-road.json",{id:$scope.updateShopObj.shop.id,road:$scope.updateShopObj.road},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.searchLoad();
                    toastr.info("修改成功!");
                }else{
                    toastr.error(data.message);
                }
            });
        $scope.shopFlagObj.updateRoad = false;
        $scope.searchLoad(0);
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
                    pageData[i].shopTypeStr = "";
                    if(pageData[i].shop.type){
                        if(pageData[i].shop.type ==1){
                            pageData[i].shopTypeStr = "普通";
                        }else if(pageData[i].shop.type ==2){
                            pageData[i].shopTypeStr = "<font color='red'>热招旺铺</font>";
                        }else if(pageData[i].shop.type ==3){
                            pageData[i].shopTypeStr = "<font color='orange'>精选好铺</font>";
                        }
                    }
                    pageData[i].shopStatusStr = "";
                    if(pageData[i].shop.shopStatus ==0){
                        pageData[i].shopStatusStr = "待上架";
                    }else if(pageData[i].shop.shopStatus ==1){
                        pageData[i].shopStatusStr = "<font color='green'>上架</font>";
                    }else if(pageData[i].shop.shopStatus ==2){
                        pageData[i].shopStatusStr = "<font color='orange'>下架</font>";
                    }else if(pageData[i].shop.shopStatus =-1){
                        pageData[i].shopStatusStr = "<font color='red'>已删除</font>";
                    }
                }
            }
        }
        return pageData;
    }

    //添加商铺按钮
    $scope.addShopBtn = function(){
        $scope.shopListFlag = false;

        $scope.shopFlagObj.detailFlag = false;
        $scope.addshop = {facility:""};
        $scope.shopImage1 = "";
        $scope.shopImage2 = "";
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

        //  ue.setContent(template.content);

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

    //商铺详情
    $scope.showDetail = function(data){
        $scope.initUE();

        $scope.addshop = data;

        $scope.addshop.hotId += "";
        $scope.addshop.districtId += "";
        $scope.addshop.typeId += "";
        $scope.addshop.finishingId += "";
        $scope.addshop.archiId += "";
        $scope.addshop.depositType += "";
        $scope.addshop.rentType += "";

        $scope.shopImage1 = "";
        $scope.shopImage2 = "";
        $scope.shopFlagObj.detailFlag = true;

        $scope.shopDetailObj = {
            description: data.description,
            img1:$scope.addshop.img1,
            img2:$scope.addshop.img2
        }

        $scope.createDetailMap($scope.addshop);

        //查询街道
        $scope.changeDistrict();
        $scope.addshop.streetId += "";

        $http.post("/shopmanage/archit-all.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.architArr = data.data;
                    }
                }
            });
        if($scope.addshop.description){
            $scope.shopue.addListener("ready", function () {
                // editor准备好之后才可以使用
                $scope.shopue.setContent($scope.addshop.description);
                $scope.shopFlagObj.uelistener = true;
            });
        }
        if($scope.shopFlagObj.uelistener){
            $scope.shopue.setContent($scope.addshop.description);
        }
        $scope.shopListFlag = false;
    }
    $scope.initUE = function(){
        //实例化编辑器
        $scope.shopue = UE.getEditor('shopContent', {
            toolbars: [
                ['fullscreen','source','undo','redo','formatmatch','indent','justifyleft','justifyright','justifycenter','justifyjustify','background', 'link',  'fontfamily','fontsize','forecolor','bold','backcolor','italic','underline','inserttable','deletetable','insertrow','insertcol','simpleupload','insertimage','charts']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true
        });
    }
    $scope.createMap = function(){
        // 百度地图API功能
        $scope.map = new BMap.Map("allmap");
        var point = new BMap.Point(121.481294, 31.236669);
        var lng=0,  lat=0, zoom = 16;
        $scope.map.centerAndZoom(point, zoom);                 	// 初始化地图，设置中心点坐标和地图级别
        $scope.map.enableScrollWheelZoom;						// 允许鼠标滚轮控制缩放
        $scope.map.addControl(new BMap.NavigationControl());	// 地图平移缩放控件，默认位于地图左上方，它包含控制地图的平移和缩放的功能
        $scope.map.addControl(new BMap.MapTypeControl());		// 地图类型控件，默认位于地图右上方

        var marker = new BMap.Marker(point);        	// 创建标注
        $scope.map.addOverlay(marker);
        marker.enableDragging();
        marker.addEventListener("dragend", function(e){
            $scope.lng = e.point.lng;
            $scope.lat = e.point.lat;
            $scope.zoom = $scope.map.getZoom();
        });                       	// 将标注添加到地图中
        // 将标注添加到地图中
        $scope.map.addEventListener("click",function(e){
            $scope.addshop.lng = e.point.lng;
            $scope.addshop.lat = e.point.lat;
            $scope.addshop.zoom = $scope.map.getZoom();
            toastr.info("选取坐标："+e.point.lng+","+e.point.lat);// 单击地图获取坐标点；
            console.log("lng:"+$scope.addshop.lng+",lat:"+$scope.addshop.lat+",zoom:"+$scope.addshop.zoom)

            $scope.map.panTo(new BMap.Point(e.point.lng,e.point.lat));// map.panTo方法，把点击的点设置为地图中心点
        });
        var opts = {
            width : 25,     // 信息窗口宽度
            height: 10,     // 信息窗口高度
            title : "人民广场"  // 信息窗口标题
        }
        var infoWindow = new BMap.InfoWindow("上海市政府", opts);  // 创建信息窗口对象
        $scope.map.openInfoWindow(infoWindow, $scope.map.getCenter());      // 打开信息窗口

    }

    $scope.createDetailMap = function(addshop){
        // 百度地图API功能
        $scope.map = new BMap.Map("allmap");
        var point = new BMap.Point(addshop.lng, addshop.lat);
        var lng = addshop.lng,  lat = addshop.lat, zoom = addshop.zoom;
        $scope.map.centerAndZoom(point, zoom);                 	// 初始化地图，设置中心点坐标和地图级别
        $scope.map.enableScrollWheelZoom;						// 允许鼠标滚轮控制缩放
        $scope.map.addControl(new BMap.NavigationControl());	// 地图平移缩放控件，默认位于地图左上方，它包含控制地图的平移和缩放的功能
        $scope.map.addControl(new BMap.MapTypeControl());		// 地图类型控件，默认位于地图右上方

        var marker = new BMap.Marker(point);        	// 创建标注
        $scope.map.addOverlay(marker);
        marker.enableDragging();

        var opts = {
            width : 25,     // 信息窗口宽度
            height: 10,     // 信息窗口高度
            title : ""  // 信息窗口标题
        }
        var infoWindow = new BMap.InfoWindow(addshop.location, opts);  // 创建信息窗口对象
        $scope.map.openInfoWindow(infoWindow, $scope.map.getCenter());      // 打开信息窗口

    }
    $scope.searchMap = function(){
        if($scope.addshop.location){
            var local = new BMap.LocalSearch($scope.map, {
                renderOptions:{map: $scope.map}
            });
            console.log($scope.addshop.location)
            local.search($scope.addshop.location);
        }
    }
    //配套设施选择功能
    $scope.confirmCheckboxClicked = function(type){
        if (type.checked) {
            $scope.addshop.facility = $scope.addshop.facility.replace(type.facilId + ",", "");
        } else {
            $scope.addshop.facility = $scope.addshop.facility + type.facilId + ",";
        }
        type.checked = !type.checked;
        console.log($scope.addshop.facility)
    },
    /**
     * 选择地区
     */
    $scope.changeDistrict = function(){
        $http.post("/shopmanage/street-list.json",{districtId:$scope.addshop.districtId},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    if(data.data && Array.isArray(data.data)){
                        $scope.shopFlagObj.addStreetArr = data.data;
                        if($scope.addshop.streetId){
                            $scope.addshop.streetId += "";
                        }
                        console.log($scope.addshop.streetId)
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
        if(!$scope.addshop.hotId){
            return toastr.info("所属商铺类型不可为空!")
        }else{
            $scope.addshop.hotId =  parseInt($scope.addshop.hotId);
        }
        if($scope.addshop.shopNo && $scope.addshop.shopNo.length != 13){
            return toastr.info("商铺编号必须是13位!")
        }
        if(!$scope.addshop.districtId){
            return toastr.info("所在地区不可为空!")
        }else{
            $scope.addshop.districtId =  parseInt($scope.addshop.districtId);
        }
        if(!$scope.addshop.streetId){
            return toastr.info("所在街镇不可为空!")
        }else{
            $scope.addshop.streetId =  parseInt($scope.addshop.streetId);
        }
        if(!$scope.addshop.location){
            return toastr.info("详细地址不可为空!")
        }
        if(!$scope.addshop.publisher){
            return toastr.info("发布人不可为空!")
        }
        if(!$scope.addshop.lng){
            return toastr.info("请点击地图选取坐标!")
        }
        if(!$scope.addshop.onsellDate){
            return toastr.info("上架时间不可为空!")
        }else{
            $scope.addshop.onsellDate += " 00:00:00";
        }
        if(!$scope.addshop.offsellDate){
            return toastr.info("下架时间不可为空!")
        }else{
            $scope.addshop.offsellDate += " 23:59:59";
        }
        if(!$scope.addshop.typeId){
            return toastr.info("物业性质不可为空!")
        }else{
            $scope.addshop.typeId =  parseInt($scope.addshop.typeId);
        }
        if(!$scope.addshop.finishingId){
            return toastr.info("装修情况不可为空!")
        }else{
            $scope.addshop.finishingId =  parseInt($scope.addshop.finishingId);
        }
        if(!$scope.addshop.traffic){
            return toastr.info("公交线路不可为空!")
        }
        if(!$scope.addshop.archiId){
            return toastr.info("建筑结构不可为空!")
        }else{
            $scope.addshop.archiId =  parseInt($scope.addshop.archiId);
        }
        if(!$scope.addshop.ocpyId){
            return toastr.info("适应业态不可为空!")
        }else{
            $scope.addshop.ocpyId =  parseInt($scope.addshop.ocpyId);
        }
        if($scope.addshop.img1 === "" || $scope.addshop.img1 == undefined){
            return toastr.info("请先上传图片1!")
        }
        //描述
        $scope.addshop.description = $scope.shopue.getContentTxt();
        console.log($scope.addshop)

        $http.post("/shop/add.json",$scope.addshop,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.goback();
                    $scope.searchLoad();
                    toastr.info("添加成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }

    $scope.editPriceFun = function(){
        $scope.addshop.price2="";
        $scope.addshop.priceSe2="";

    }

    $scope.editPrice2Fun = function(){
        $scope.addshop.price="";
        $scope.addshop.priceSe="";

    }
    $scope.uploadImage = function (userImage,flag) {
        if(userImage == "" || userImage == undefined){
            return toastr.info("请重新选择需要上传的图片!");
        }
        Upload.upload({
            //服务端接收
            url: '/image/upload.json',
            //上传的同时带的参数
            data: { 'imageType': 7 },
            file: userImage
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