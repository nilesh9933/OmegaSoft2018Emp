$(document).ready(function(){

	$.ajax({		
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
	});
	
	
});





function GetModelReady(ButtonId, modelID) {

    var myWindow = $(modelID);
    var button = $(ButtonId);

    AlignModelCenter(ButtonId,modelID);

    myWindow.kendoWindow({
        draggable: false,
        title: "User Login",
		minWidth:"500px",
        maxWidth: "800px",
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