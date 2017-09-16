var app = angular.module("myApp", ["ngRoute"]);
		app.config(['$routeProvider',function($routeProvider) {
			$routeProvider.when('/Page-1', {
				templateUrl : 'views/Page-1.html'
			}).when('/Page-2', {
				templateUrl : 'views/Page-2.html'
			}).when('/Page-3', {
				templateUrl : 'views/Page-3.html'
			}).otherwise({
               redirectTo: 'index.html'
            });
		}]);