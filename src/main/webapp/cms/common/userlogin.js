/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('userLoginApp', ['angular-constants']);

app.controller('userLoginCtrl',userLoginCtrl);

function userLoginCtrl($scope,$http,angularMeta){

    $scope.init = function(){
        $scope.user = {};
        $scope.user.username =  $scope.getCookieValue("userName");
        $scope.user.password =  $scope.getCookieValue("userPass");
        $scope.user.remember =  $scope.getCookieValue("rem_pwd");

        if(!$scope.getCookieValue("rem_pwd")){
            $scope.user.remember = false;
        }
    }

    $scope.login = function(){

        if($scope.remember == true){
            //添加cookie
            $scope.addCookie("userName",$scope.user.username,7,"/");
            $scope.addCookie("userPass",$scope.user.password,7,"/");
            $scope.addCookie("rem_pwd",$scope.remember,7,"/");
        }else{
            $scope.deleteCookie("userPass");
            $scope.addCookie("rem_pwd",$scope.remember,7,"/");

        }

        console.log($scope.user)
        $http.post("/user/login.json",$scope.user,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    window.location.href= "admin.html";
                }else{
                    toastr.info(data.message);
                }
            });
    }

    $scope.onLogout = function(){
        $http.post("/user/loginout.json",{},angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    window.location.href= "admin.html";
                }else{
                    toastr.info(data.message);
                }
            });
    }

    $scope.addCookie = function (name,value,days,path)
    {
        var name = escape(name);
        var value = escape(value);
        var expires = new Date();
        expires.setTime(expires.getTime() + days * 3600000 * 24);
        path = path == "" ? "" : ";path=" + path;
        var _expires = (typeof days) == "string" ? "" : ";expires=" + expires.toUTCString();
        document.cookie = name + "=" + value + _expires + path;
    }
    $scope.getCookieValue = function (name)
    {
        var name = escape(name);
        var allcookies = document.cookie;
        name += "=";
        var pos = allcookies.indexOf(name);
        if (pos != -1){
            var start = pos + name.length;
            var end = allcookies.indexOf(";",start);
            if (end == -1) end = allcookies.length;
            var value = allcookies.substring(start,end);
            return (value);
        }else{
            return "";
        }
    } ;
    $scope.deleteCookie =function(name,path)
    {
        var name = escape(name);
        var expires = new Date(0);
        path = path == "" ? "" : ";path=" + path;
        document.cookie = name + "="+ ";expires=" + expires.toUTCString() + path;
    };

}
