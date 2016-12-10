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

    //数据源
   /* $scope.data = response.data.records;
    //分页总数
    $scope.pageSize = 5;
    $scope.pages = Math.ceil($scope.data.length / $scope.pageSize); //分页数
    $scope.newPages = $scope.pages > 5 ? 5 : $scope.pages;*/
    $scope.pageList = [];
    $scope.selPage = 1;
    //设置表格数据源(分页)
   /* $scope.setData = function () {
        $scope.items = $scope.data.slice(($scope.pageSize * ($scope.selPage - 1)), ($scope.selPage * $scope.pageSize));//通过当前页数筛选出表格当前显示数据
    }
    $scope.items = $scope.data.slice(0, $scope.pageSize);*/
    //分页要repeat的数组
    $scope.total = $("#totalPage").val();
    if($scope.total){
        for (var i = 0; i < $scope.total && i<6; i++) {
            $scope.pageList.push(i + 1);
        }
    }

        //打印当前选中页索引
    $scope.selectPage = function (page) {
        //不能小于1大于最大
        if (page < 1 || page > $scope.total) return;
        //最多显示分页数5
        if (page > 2) {
        //因为只显示5个页数，大于2页开始分页转换
            var newpageList = [];
            for (var i = (page - 3) ; i < ((page + 2) > $scope.pages ? $scope.pages : (page + 2)) ; i++) {
                newpageList.push(i + 1);
            }
            $scope.pageList = newpageList;
        }
       /* $scope.selPage = page;
        $scope.setData();*/
        $scope.isActivePage(page);
        console.log("选择的页：" + page);
    };
    //设置当前选中页样式
    $scope.isActivePage = function (page) {
        return $scope.selPage == page;
    };
    //上一页
    $scope.Previous = function () {
        $scope.selectPage($scope.selPage - 1);
    }
    //下一页
    $scope.Next = function () {
        $scope.selectPage($scope.selPage + 1);
    };
}
