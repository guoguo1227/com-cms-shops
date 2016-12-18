/**
 * Created by samuel on 16-10-25.
 */
var app = angular.module('myApp', ['angular-constants']);

app.controller('myCtrl',myCtrl);

function myCtrl($scope,$http,angularMeta){

    $scope.init = function(){
        $scope.comment = {};
        $scope.pageInit();
    }

    $scope.addComment = function(){

        console.log($scope.comment)
        if(!$scope.comment.askerName){
            return toastr.info("请输入企业/个人名称！")
        }
        if(!$scope.comment.content){
            return toastr.info("请输入内容！")
        }
        if(!$scope.comment.askerPhone){
            return toastr.info("手机号不能为空！")
        }
        $http.post("/shopIndex/addComment.do",$scope.comment,angularMeta.postCfg)
            .success(function(data){
                if(data.success){
                    toastr.info("提交成功！")
                    $scope.comment  = {};
                    $('#myModal').modal('hide');
                }else{
                    toastr.info(data.message);
                }
            });
        $scope.comment = {};
        $('#myModal').modal('hide');
        toastr.info("提交成功！")

    }

    $scope.myKeyup = function(e){
        var keycode = window.event?e.keyCode:e.which;
        if(keycode==13){
            $scope.searchLoad();
        }
    };

    //搜索
    $scope.searchLoad = function(){
        $scope.searchContent = $("input#searchContent").val();
        window.open(encodeURI("/front/search-shop.action?searchContent="+$scope.searchContent));
    }

    $scope.pageInit = function(){
        $scope.pageList = [];
        $scope.selPage = parseInt($("#currentPage").val())+1;
        $scope.total = parseInt($("#totalPage").val());
        if($scope.total){
            for (var i = 0; i < $scope.total && i<6; i++) {
                $scope.pageList.push(i + 1);
            }
        }
    }

    //打印当前选中页索引
    $scope.selectPage = function (page) {
        $scope.selPage = page;
        //不能小于1大于最大
        if (page < 1 || page > $scope.total)
            return toastr.info("没有更多页面！");
        //最多显示分页数5
        if (page > 2) {
        //因为只显示5个页数，大于2页开始分页转换
            var newpageList = [];
            for (var i = (page - 3) ; i < ((page + 2) > $scope.total ? $scope.total : (page + 2)) ; i++) {
                newpageList.push(i + 1);
            }
            $scope.pageList = newpageList;
        }

        $scope.isActivePage(page);
        console.log("选择的页：" + page);
        var currentPage = page -1;

        var prefixUrl = window.location.href;
        var index = prefixUrl.indexOf("&currentPage");
        if(index>0){
            prefixUrl = prefixUrl.substr(0,index);
        }
        prefixUrl += "&currentPage="+currentPage;

        window.open(prefixUrl);

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
