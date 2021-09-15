<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test page</title>
<script type="text/javascript">
function fun(){
var helloTxtValue = document.getElementById("helloTxt").value;
alert(helloTxtValue);
}
</script>
</head>
<body>
<input type="text" id="helloTxt" onclick="fun()"/>
</body>
</html>