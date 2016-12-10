/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('shopDetailApp', ['angular-constants']);

app.controller('shopDetailAppCtrl',shopDetailAppCtrl);

function shopDetailAppCtrl($scope,$http,angularMeta){

    $scope.init = function(){
        $scope.createMap();
        $scope.comment = {};

    }

    //搜索
    $scope.searchLoad = function(){
        $scope.searchContent = $("input#searchContent").val();
        window.location.href=encodeURI("/front/search-shop.action?searchContent="+$scope.searchContent);
    }


    $scope.createMap = function(){

       /* var lng = $("#lng").val(),lat=$("#lat").val(),zoom=$("zoom").val();
        alert(lng+lat+zoom);*/

        // 百度地图API功能
        var map = new BMap.Map("allmap");
        /*var point = new BMap.Point(116.400244,39.92556);
        map.centerAndZoom(point, 12);
        var marker = new BMap.Marker(point);  // 创建标注
        map.addOverlay(marker);              // 将标注添加到地图中
        map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放

        // 将地址解析结果显示在地图上,并调整地图视野
        map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
        var label = new BMap.Label("我是文字标注哦",{offset:new BMap.Size(20,-10)});
        marker.setLabel(label);*/
        var lng=$("#lng").val()*1, lat=$("#lat").val()*1, zoom = $("#zoom").val()*1;
        var existData = false;
        var point;
        if(lng !=0){
            existData = true;
            point = new BMap.Point(lng, lat);
        }else{
            point = new BMap.Point(121.481294, 31.236669);
        }
        map.centerAndZoom(point, zoom);
        map.enableScrollWheelZoom;
        map.addControl(new BMap.NavigationControl());
        var marker = new BMap.Marker(point);
        map.addOverlay(marker);
        if(existData){
            var opts = {
                width : 25,     // 信息窗口宽度
                height: 10,     // 信息窗口高度
                title : $("#shopName").text()  // 信息窗口标题
            }
            var infoWindow = new BMap.InfoWindow($("#shopLoc").text(), opts);
            map.openInfoWindow(infoWindow, map.getCenter());
        }else{
            var opts = {
                width : 25,     // 信息窗口宽度
                height: 10,     // 信息窗口高度
                title : "人民广场"  // 信息窗口标题
            }
            var infoWindow = new BMap.InfoWindow("上海市政府", opts);
            map.openInfoWindow(infoWindow, map.getCenter());
        }

    }

    $scope.addComment = function(){

        console.log($scope.comment)
        if(!$scope.comment.askerName){
            return toastr.info("请输入企业/个人名称！")
        }
        if(!$scope.comment.content){
            return toastr.info("请输入内容！")
        }
        if(!$scope.comment.askerMail && !$scope.comment.askerPhone){
            return toastr.info("手机号和邮箱不能同时为空！")
        }
        $scope.comment.shopId = $("#shopId").val();
        $http.post("/shopIndex/addComment.do",$scope.comment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    toastr.info("提交成功！")
                    $scope.comment = {};//清空
                }else{
                    toastr.info(data.message);
                }
            });
        $('#myModal').modal('hide');
        toastr.info("提交成功！")

    }

    //搜索
    $scope.searchLoad = function(){
        $scope.searchContent = $("input#searchContent").val();
        window.location.href=encodeURI("/front/search-shop.action?searchContent="+$scope.searchContent);
    }

}
