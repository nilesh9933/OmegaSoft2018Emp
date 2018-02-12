$(document).ready(function(){

GetModelReady("#btnLogin","#loginModel");

	/*$.ajax({		
		type:"GET",
		url:"http://localhost:28790/Header/Header",
		success:function(viewHtml){	
		
			$('#header').replaceWith(viewHtml);
			
	        GetModelReady("#btnLogin","#loginModel");
		},
		error:function(e){			
			console.log(e);
		}		
	});
	$.ajax({		
		type:"GET",
		url:"http://localhost:28790/Header/Footer",
		success:function(viewHtml){	
	
			$('#footer').replaceWith(viewHtml);
		},
		error:function(e){			
			console.log(e);
		}		
	});*/
	
	
});





function GetModelReady(ButtonId, modelID) {

debugger;
    var myWindow = $(modelID);
    var button = $(ButtonId);

    AlignModelCenter(ButtonId,modelID);

    myWindow.kendoWindow({
        draggable: false,
        title: "User Login",
		minWidth:"300px",
        maxWidth: "500px",
        maxHeight: "400px",       
        visible: false,
        resizable: false,
        modal: true,
        //appendTo: "form#index"

    }).data("kendoWindow").center();

}

function AlignModelCenter(ButtonId,modelID){
	
 var myWindow = $(modelID);
 var button = $(ButtonId);
 button.click(function () {
 debugger;
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
	debugger;
	var userName=$('#userEmail').val();
	var password=$('#userPassword').val();
	
	var obj={
		userName:userName,
		password:password
	};
	
	$.ajax({
		type:"POST",
		url:"http://localhost:9000/Login",
		data:JSON.stringify(obj),
		contentType: "application/json; charset=utf-8",
        dataType: "json",
		success:function(data){
			debugger;
			
			$('#loginModel').data("kendoWindow").close();
			sessionStorage.setItem("Email", data.email);
			sessionStorage.setItem("Role", data.role);
		},
		error:function(e){
			debugger;
			console.log(e);
		}
		
	});	
}