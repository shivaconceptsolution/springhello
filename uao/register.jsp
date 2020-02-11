<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>
<header>
</header>
<section>
<center>
<h1>Job Seeker Register Here</h1>
<form action="regcode.do" method="post">
 <input type="text" name="txtuserid" placeholder="Enter username" required/>
<br><br>
<input type="password" name="txtpass" placeholder="Enter password" required />
<br><br>
<input type="text" name="txtemail" placeholder="Enter email" required />
<br><br>
<input type="text" name="txtmobile" placeholder="Enter Mobile" required />
<br><br>
<input type="submit" name="btnsubmit" value="Insert" />
</form>
${msg}
</section>
<footer>

</footer>

</body>
</html>