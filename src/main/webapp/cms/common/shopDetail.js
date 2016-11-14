/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('shopDetailApp', ['angular-constants']);

app.controller('shopDetailAppCtrl',shopDetailAppCtrl);

function shopDetailAppCtrl($scope,$http,angularMeta){

    $scope.init = function(){
        //$scope.queryData();
       // alert(comment)
        $scope.createMap();
    }

    $scope.queryData = function(){
        $http.post("/shop/byId.json",$scope.comment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                }else{
                }
            });
    }

    $scope.createMap = function(){

        // 百度地图API功能
        var map = new BMap.Map("allmap");
        var point = new BMap.Point(116.400244,39.92556);
        map.centerAndZoom(point, 12);
        var marker = new BMap.Marker(point);  // 创建标注
        map.addOverlay(marker);              // 将标注添加到地图中
        map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放

        // 将地址解析结果显示在地图上,并调整地图视野
        map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
        var label = new BMap.Label("我是文字标注哦",{offset:new BMap.Size(20,-10)});
        marker.setLabel(label);
    }

}
