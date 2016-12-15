/**
 * Created by samuel on 15-12-25.
 */
var app = angular.module('investmentApp',['angular-constants']);
app.controller('investmentCtrl',investmentCtrl);

function investmentCtrl($scope,$http,angularMeta,lgDataTableService){
    //初始化table
    $scope.init = function() {
        $scope.ready();
    };

    $scope.ready = function(){
        $http.post("/shop/query-investment.json",{},angularMeta.postCfg)
            .success(function(data) {
                if (data.success) {
                    $scope.investment = data.data;
                }
            });
    }

    $scope.updateInvestSave = function(){
        $http.post("/shop/update-investment.json",$scope.investment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    $scope.ready();
                    toastr.info("保存成功!");
                }else{
                    toastr.error(data.message);
                }
            });
    }

}