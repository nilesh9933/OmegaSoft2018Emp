
$(document).ready(function(){


	$.ajax({		
		type:"GET",
		url:"http://localhost:9000/header.html",
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
		url:"http://localhost:9000/footer.html",
		success:function(viewHtml){	
	
			$('#footer').replaceWith(viewHtml);
		},
		error:function(e){			
			console.log(e);
		}		
	});
	
	
	FillProductTypeDropDown();
	
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
        // appendTo: "form#index"

    }).data("kendoWindow").center();

}

function AlignModelCenter(ButtonId,modelID){
	
 var myWindow = $(modelID);
 var button = $(ButtonId);
 button.click(function () {
 debugger;
        myWindow.data("kendoWindow").center().open();
        $(modelID).data('kendoWindow').center();
        
        $('#userEmail').val('');
	    $('#userPassword').val('');
	    $('#errorBox').css('display','none');
	    $('#errorMsg').text('');
        
        
        
        $(modelID).closest(".k-window").css({
            position: 'fixed',
            margin: 'auto',
            top: '20%'
        });
    });
}


function DoLogin(){
	
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
			
			if(data.email==null || data.email=="")
			{
				$('#errorBox').css('display','block');
				$('#errorMsg').text('Invalid credentials, please try again.');
			    $('#userEmail').val('');
			    $('#userPassword').val('');
			}
			else {
				
			$('#errorBox').css('display','none');
			$('#errorMsg').text('');
			$('#loginModel').data("kendoWindow").close();
			sessionStorage.setItem("Email", data.email);
			sessionStorage.setItem("Role", data.role);
			
			if(data.role=="Admin")
				{
			$('#mRoles').css("display","block");
			$('#mJobs').css("display","block");
			$('#mProdType').css("display","block");
			$('#mProd').css("display","block");
			$('#mEmpDetails').css("display","block");
			$('#mOffers').css("display","block");
			$('#mInventory').css("display","block");
			$('#mEngAssignment').css("display","block");
			$('#mInvoice').css("display","block");
			$('#mReports').css("display","block");
			$('#mPayments').css("display","block");
			$('#mLogin').css("display","none");
            $('#mLogout').css("display","block");
			
				}
			}
		},
		error:function(e){
			
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
	}
	
	
	
	
	
	
	


function FillProductTypeDropDown()
{
	 $.ajax({
		  type:"GET",
		  url:"http://localhost:9000/GetProductTypes",
		  success:function(data)
		  {
		  
		   $('#dropdown').kendoDropDownList({
		   dataSource:data,
		   dataTextField:"proType",
		   dataValueField:"proTypeId",
		  
		  });
		  
		  },
		  error:function(e)
		  {
		    
		  console.log(e);
		  }
		  
		  });
		  
}