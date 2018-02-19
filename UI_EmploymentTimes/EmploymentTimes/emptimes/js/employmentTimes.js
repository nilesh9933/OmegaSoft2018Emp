
$(document).ready(function(){

GetModelReady("#btnLogin","#loginModel");

CheckAuthentication();

CheckAuthorization();
});

function GetModelReady(ButtonId, modelID) {

    var myWindow = $(modelID);
    var button = $(ButtonId);

    AlignModelCenter(ButtonId,modelID);

    myWindow.kendoWindow({
        draggable: false,
        title: "User Login",
        maxWidth: "600px",
        maxHeight: "400px",       
        visible: false,
        resizable: false,
        modal: true,
        appendTo: "form#index"

    }).data("kendoWindow").center();

}

function AlignModelCenter(ButtonId,modelID){
	
 var myWindow = $(modelID);
 var button = $(ButtonId);
 button.click(function () {
 
        myWindow.data("kendoWindow").center().open();
        $(modelID).data('kendoWindow').center();
        $(modelID).closest(".k-window").css({
            position: 'fixed',
            margin: 'auto',
            top: '20%'
        });
    });
}

function DoLogin(){
	
	var userName=$('#userName').val();
	var password=$('#userPassword').val();
	
	var obj={
		userName:userName,
		password:password
	};
	
	$.ajax({
		type:"POST",
		url:"http://localhost:28790/Users/Login",
		data:obj,
		//contentType: "application/json; charset=utf-8",
        //dataType: "json",
		success:function(data){
			debugger;
			$('#loginModel').data("kendoWindow").close();
			$('#btnLogin').css('display','none');
			$('#mRegister').css('display','none');
			$('#btnLogout').css('display','block');
			$('#lnkWelcome').css('display','block');
			$('#lnkWelcome').text('Welcome : '+ data.email);
			sessionStorage.setItem("Email", data.email);
			sessionStorage.setItem("Role", data.role);
			$('#mViewEPaper').css('display','block');
		   $('#mPostEPaper').css('display','block');
		   $('#mAddSubscription').css('display','block');
		   $('#mPostJobs').css('display','block');
		   $('#mEditJobs').css('display','block');
		},
		error:function(e){
			debugger;
			console.log(e);
		}
		
	});	
}

function Logout()
{
	sessionStorage.removeItem('Email');
	sessionStorage.removeItem('Role');
	$('#mRegister').css('display','block');
	$('#btnLogin').css('display','block');
	$('#btnLogout').css('display','none');
	$('#lnkWelcome').css('display','none');
	$('#mViewEPaper').css('display','none');
		$('#mPostEPaper').css('display','none');
		$('#mAddSubscription').css('display','none');
		$('#mPostJobs').css('display','none');
		$('#mEditJobs').css('display','none');
}

function CheckAuthentication()
{
	if(sessionStorage.getItem("Email")==null)
	{
		
	$('#mRegister').css('display','block');
	$('#btnLogin').css('display','block');
	$('#btnLogout').css('display','none');
	$('#lnkWelcome').css('display','none');
	}
	else{
	$('#mRegister').css('display','none');
    $('#btnLogin').css('display','none');
	$('#btnLogout').css('display','block');
	$('#lnkWelcome').css('display','block');
	$('#lnkWelcome').text('Welcome : '+ sessionStorage.getItem("Email"));
	}
}

function CheckAuthorization()
{
	if(sessionStorage.getItem("Role")==null)
	{
		$('#mViewEPaper').css('display','none');
		$('#mPostEPaper').css('display','none');
		$('#mAddSubscription').css('display','none');
		$('#mPostJobs').css('display','none');
		$('#mEditJobs').css('display','none');		
	}
	else{
		if(sessionStorage.getItem("Role")=="Admin")
		$('#mViewEPaper').css('display','block');
		$('#mPostEPaper').css('display','block');
		$('#mAddSubscription').css('display','block');
		$('#mPostJobs').css('display','block');
		$('#mEditJobs').css('display','block');
	}
}