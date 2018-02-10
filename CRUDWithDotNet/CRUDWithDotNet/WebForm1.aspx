<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="CRUDWithDotNet.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <input type="text" runat="server" name="firstName" id="firstName" placeholder="Enter your First Name" class="form-control input-lg" /><br>
            <input type="text" runat="server" name="lastName" id="lastName" placeholder="Enter your Last Name" class="form-control input-lg" /><br>
            <input type="text" runat="server" name="empemail" id="empemail" placeholder="Enter your Email" class="form-control input-lg" />
            <br>
            <input type="text" runat="server" name="empaddress" id="empaddress" placeholder="Enter your Address" class="form-control input-lg" />
            <br>
            <input type="text" runat="server" name="empdob" id="empdob" placeholder="Enter your Date Of Birth" class="form-control input-lg" /><br>
            <input type="text" runat="server" name="emppassword" id="emppassword" placeholder="Enter your Password" class="form-control input-lg" />
            <br>
            <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />

        </div>
    </form>
</body>
</html>
