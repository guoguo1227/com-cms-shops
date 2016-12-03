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
        if(!$scope.comment.askerName){
            return toastr.info("请输入企业/个人名称！")
        }
        if(!$scope.comment.content){
            return toastr.info("请输入内容！")
        }
        if(!$scope.comment.askerMail && !$scope.comment.askerPhone){
            return toastr.info("手机号和邮箱不能同时为空！")
        }
        $http.post("/shopIndex/addComment.do",$scope.comment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    toastr.info("提交成功！")
                    $('#myModal').modal('hide');
                }else{
                    toastr.info(data.msg);
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
