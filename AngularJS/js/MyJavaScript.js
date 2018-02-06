var myApp=angular.module('myApp',[]);

myApp.controller('myController1',function($scope){

var names=[
    {'firstName':'Shital'},
    {'firstName':'Chinmay'},
	{'firstName':'Vijay'},
	{'firstName':'Nilesh'},
	{'firstName':'Om'},
	{'firstName':'Dipesh'},
	{'firstName':'Shantanu'}];

$scope.firstName="Abhishek-1";
$scope.lastName="Soni-1";
$scope.names=names;

});


myApp.controller('myController2',function($scope){
$scope.firstName="Abhishek-2";
$scope.lastName="Soni-2";
});

myApp.controller('myController3',function($scope){
$scope.firstName="Abhishek-3";
$scope.lastName="Soni-3";
});