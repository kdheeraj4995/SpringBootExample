var app = angular.module("myApp", ["ngRoute"]);
app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/login', {
        templateUrl: 'views/login.html'
    }).when('/register', {
        templateUrl: 'views/register.html'
    }).otherwise({
        redirectTo: 'index.html'
    });
}]);

app.service('userService', function ($http) {
    var baseUrl = "http://localhost:8090/"
    this.register = function (user) {
        return $http({
            method: 'POST',
            url: baseUrl+'register',
            data: user
        })
    }
})

app.controller('userCtrl', function ($scope, userService) {
    $scope.register = function () {
        $scope.user = {
            username: $scope.username,
            password: $scope.password,
            address: $scope.address
        }
        userService.register($scope.user);
        console.log($scope.user)
    }
})

