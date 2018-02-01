
$(document).ready(function(){

debugger;
var myRoleData;

$.ajax({
	type:"GET",
	url:"http://localhost:8080/GetUserRoles",
	success:function (data)
	{
	 myRoleData=data;
	},
	error:function ()
	{
	},
	
});
//var myRoleData=[{"rolId":1,"rolName":"Admin","rolDes":null,"delInd":null,"updateUser":null,"updateDate":null},{"rolId":2,"rolName":"Super Admin","rolDes":null,"delInd":null,"updateUser":null,"updateDate":null},{"rolId":3,"rolName":"End User","rolDes":null,"delInd":null,"updateUser":null,"updateDate":null},{"rolId":4,"rolName":"Posting Team","rolDes":null,"delInd":null,"updateUser":null,"updateDate":null}]


$("#ddlRole").kendoDropDownList({
                        dataTextField: "rolName",
                        dataValueField: "rolId",
                        dataSource: myRoleData,
                        index: 0,
                        //change: fillData
});

});