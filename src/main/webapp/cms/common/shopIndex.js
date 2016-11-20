/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('myApp', ['angular-constants']);

app.controller('myCtrl',myCtrl);

function myCtrl($scope,$http,angularMeta){

    $scope.init = function(){
        $scope.comment = {};
    }

    $scope.addComment = function(){

        console.log($scope.comment)
        $http.post("/comment/add.json",$scope.comment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                }else{
                }
            });
    }
}
