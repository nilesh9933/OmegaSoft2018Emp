var govApp=angular.module('govApp',[])

.controller('govAppController',function($scope,$http){


$http.get("http://localhost:8080/GetGovJobs")
.then(function(response){
$scope.jobList= response.data;
});
});

var privateApp=angular.module('privateApp',[])

.controller('privateController',function($scope,$http){


$http.get("http://localhost:8080/GetPrivateJobs")
.then(function(response){
$scope.jobList= response.data;
});
});

var defenceApp=angular.module('defenceApp',[])

.controller('defenceController',function($scope,$http){


$http.get("http://localhost:8080/GetDefenceJobs")
.then(function(response){
$scope.jobList= response.data;
});
});

var bankApp=angular.module('bankApp',[])

.controller('bankController',function($scope,$http){


$http.get("http://localhost:8080/GetBankJobs")
.then(function(response){
$scope.jobList= response.data;
});
});


