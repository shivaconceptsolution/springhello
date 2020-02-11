<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="scsaddlogic.do" method="post">
<input type="text" name="txtnum1" placeholder="Enter first number" />
<br><br>
<input type="text" name="txtnum2" placeholder="Enter second number" />
<br><br>
<input type="submit" name="btnsubmit" value="Add" />
</form>
${res}
</body>
</html>