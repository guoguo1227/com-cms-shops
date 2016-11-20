/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('searchApp', ['angular-constants']);

app.controller('searchCtrl',searchCtrl);

function searchCtrl($scope){

    //搜索
    $scope.searchLoad = function(){
        $scope.searchContent = $("input#searchContent").val();
        window.location.href=encodeURI("/front/search-shop.action?searchContent="+$scope.searchContent);
    }

}
