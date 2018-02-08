
$(document).ready(function(){

GetModelReady("#btnLogin","#loginModel");

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
		dataType:"json",
		success:function(data){
			debugger;
		},
		error:function(e){
			debugger;
			console.log(e);
		}
		
	});
	
	
}
