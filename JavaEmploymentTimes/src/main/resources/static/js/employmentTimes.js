$(document).ready(function() {

	BindHeaderFooter();

	CheckAuthentication();

	CheckAuthorization();
});

function GetModelReady(ButtonId, modelID) {
	debugger;
	var myWindow = $(modelID);
	var button = $(ButtonId);

	AlignModelCenter(ButtonId, modelID);

	myWindow.kendoWindow({
		draggable : false,
		title : "User Login",
		maxWidth : "600px",
		maxHeight : "400px",
		visible : false,
		resizable : false,
		modal : true,
		appendTo : "form#index"

	}).data("kendoWindow").center();

}

function AlignModelCenter(ButtonId, modelID) {

	var myWindow = $(modelID);
	var button = $(ButtonId);
	button.click(function() {

		myWindow.data("kendoWindow").center().open();

		$('#userName').val('');
		$('#userPassword').val('');
		$('#errorBox').css('display', 'none');
		$('#errorMsg').text('');

		$(modelID).data('kendoWindow').center();
		$(modelID).closest(".k-window").css({
			position : 'fixed',
			margin : 'auto',
			top : '20%'
		});
	});
}

function DoLogin() {

	var userName = $('#userName').val();
	var password = $('#userPassword').val();

	var obj = {
		userName : userName,
		password : password
	};

	$.ajax({
		type : "POST",
		url : "http://localhost:28790/Users/Login",
		data : obj,
		// contentType: "application/json; charset=utf-8",
		// dataType: "json",
		success : function(data) {
			debugger;
			if (data.email == null || data.email == "") {
				$('#errorBox').css('display', 'block');
				$('#errorMsg').text('Invalid credentials, please try again.');
				$('#userName').val('');
				$('#userPassword').val('');
			} else {

				$('#errorBox').css('display', 'none');
				$('#errorMsg').text('');

				$('#loginModel').data("kendoWindow").close();
				$('#btnLogin').css('display', 'none');
				$('#mRegister').css('display', 'none');
				$('#btnLogout').css('display', 'block');
				$('#lnkWelcome').css('display', 'block');
				$('#lnkWelcome').text('Welcome : ' + data.email);
				sessionStorage.setItem("Email", data.email);
				sessionStorage.setItem("Role", data.role);
				$('#mViewEPaper').css('display', 'block');
				$('#mPostEPaper').css('display', 'block');
				$('#mAddSubscription').css('display', 'block');
				$('#mPostJobs').css('display', 'block');
				$('#mEditJobs').css('display', 'block');
			}
		},
		error : function(e) {
			debugger;
			console.log(e);
		}

	});
}

function Logout() {
	sessionStorage.removeItem('Email');
	sessionStorage.removeItem('Role');
	$('#mRegister').css('display', 'block');
	$('#btnLogin').css('display', 'block');
	$('#btnLogout').css('display', 'none');
	$('#lnkWelcome').css('display', 'none');
	$('#mViewEPaper').css('display', 'none');
	$('#mPostEPaper').css('display', 'none');
	$('#mAddSubscription').css('display', 'none');
	$('#mPostJobs').css('display', 'none');
	$('#mEditJobs').css('display', 'none');
}

function CheckAuthentication() {
	if (sessionStorage.getItem("Email") == null) {

		$('#mRegister').css('display', 'block');
		$('#btnLogin').css('display', 'block');
		$('#btnLogout').css('display', 'none');
		$('#lnkWelcome').css('display', 'none');
	} else {
		$('#mRegister').css('display', 'none');
		$('#btnLogin').css('display', 'none');
		$('#btnLogout').css('display', 'block');
		$('#lnkWelcome').css('display', 'block');
		$('#lnkWelcome').text('Welcome : ' + sessionStorage.getItem("Email"));
	}
}

function CheckAuthorization() {
	if (sessionStorage.getItem("Role") == null) {
		$('#mViewEPaper').css('display', 'none');
		$('#mPostEPaper').css('display', 'none');
		$('#mAddSubscription').css('display', 'none');
		$('#mPostJobs').css('display', 'none');
		$('#mEditJobs').css('display', 'none');
	} else {
		if (sessionStorage.getItem("Role") == "Admin")
			$('#mViewEPaper').css('display', 'block');
		$('#mPostEPaper').css('display', 'block');
		$('#mAddSubscription').css('display', 'block');
		$('#mPostJobs').css('display', 'block');
		$('#mEditJobs').css('display', 'block');
	}
}

function BindHeaderFooter() {
	debugger;
	$.ajax({
		type : "GET",
		url : "/Header.html",
		success : function(viewHtml) {
			debugger;
			$('#header').replaceWith(viewHtml);

			GetModelReady("#btnLogin", "#loginModel");
		},
		error : function(e) {
			debugger;
			console.log(e);
		}

	});

	$.ajax({
		type : "GET",
		url : "/Footer.html",
		success : function(viewHtml) {
			$('#footer').replaceWith(viewHtml);
		},
		error : function(e) {
			console.log(e);
		}

	});
}

var govApp = angular.module('myApp', [])

.controller('govAppController', function($scope, $http) {

	$http.get("http://localhost:9000/GetGovJobs").then(function(response) {
		$scope.jobList = response.data;
	});
});

/*
 * var privateApp=angular.module('privateApp',[])
 * 
 * .controller('privateController',function($scope,$http){
 * 
 * 
 * $http.get("http://localhost:8080/GetPrivateJobs") .then(function(response){
 * $scope.jobList= response.data; }); });
 * 
 * var defenceApp=angular.module('defenceApp',[])
 * 
 * .controller('defenceController',function($scope,$http){
 * 
 * 
 * $http.get("http://localhost:8080/GetDefenceJobs") .then(function(response){
 * $scope.jobList= response.data; }); });
 */

var viewPaper = angular.module('viewPaper', [])

.controller('viewPaperController', function($scope, $http) {

	$http.get("/GetEpaperDetails").then(function(response) {
		$scope.paperList = response.data;
	});
});

var viewSub = angular.module('viewSub', []);

viewSub.controller('SubController', function($scope, $http) {

	$http.get("/GetSubscriptions").then(function(response) {
		$scope.SubList = response.data;
	});
});

var viewSub = angular.module('viewSubDetails', []);

viewSub.controller('SubDetailsController', function($scope, $http) {
	var subId = GetParameterValues("subId");
	$http.get("/GetSubscriptionDetails?subId=" + subId).then(function(response) {
		$scope.subId = response.data.subId;
		$scope.subName = response.data.subName;
		$scope.subDes = response.data.subDes;
		$scope.subStartDate = response.data.subStartDate;
		$scope.subEndDate = response.data.subEndDate;
		$scope.subAmount = response.data.subAmount;
		$scope.subValidFor = response.data.subValidFor;
		$scope.subTimeDuration = response.data.subTimeDuration;
	});
});


function GetParameterValues(param) {  
    var url = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');  
    for (var i = 0; i < url.length; i++) {  
        var urlparam = url[i].split('=');  
        if (urlparam[0] == param) {  
            return urlparam[1];  
        }  
    }  
} 