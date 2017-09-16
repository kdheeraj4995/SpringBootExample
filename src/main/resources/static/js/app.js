var app = angular.module("myApp", ["ngRoute"]);
		app.config(['$routeProvider',function($routeProvider) {
			$routeProvider.when('/login', {
				templateUrl : 'views/login.html'
			}).when('/register', {
				templateUrl : 'views/register.html'
			}).otherwise({
               redirectTo: 'index.html'
            });
		}]);