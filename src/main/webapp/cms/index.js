/*[[
    /lib/font-awesome/css/font-awesome.css,
    /lib/bootstrap/css/bootstrap.css,

    /lib/lodash.js,
    /lib/angular/angular.js,
    /lib/angular/angular-ui-router.js,
    /lib/echarts-all.js,
    /lib/moment.js,

    /module/module.js,

    /guide/guide.js,
]]*/

/*var app = angular.module('MainApp', ['lg.platform','lg.datatable','webSocketApp',
    'commentApp','adApp','adaptApp','buildApp','checkApp',
    'districtApp','flashApp','friendApp','investmentApp',
    'linkApp','propertyApp','renovationApp','replyApp','reportApp',
    'shopApp','shoptypeApp','streetApp','supportApp']).
    controller('MainCtrl', ['$scope', '$location','lgDataTableService', function($scope, $location,dtService) {
    }]);*/

var app = angular.module('MainApp', ['lg.platform','lg.datatable',
    /*'webSocketApp',*/
    'commentApp','adApp','adaptApp','buildApp','checkApp',
    'districtApp','flashApp','investmentApp',
    'linkApp','propertyApp','renovationApp','replyApp','reportApp',
    'shopApp','hotcatApp','supportApp','streetApp','boardApp','partnerApp','businessApp','userLoginApp','searchApp','statisticApp','aboutmeApp'
    ]).
    controller('MainCtrl', ['$scope', '$location','lgDataTableService', function($scope, $location,dtService) {
    }]);

