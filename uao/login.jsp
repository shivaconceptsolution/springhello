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
<div style="float:right"><a href="hrlogin.do">HR Login Here</a></div>
</header>
<section>
<center>
<h1>Job Seeker Login Here</h1>
<form action="logincode.do" method="post">
 <input type="text" name="txtuserid" placeholder="Enter username" required />
<br><br>
<input type="password" name="txtpass" placeholder="Enter password" required />
<br><br>

<input type="submit" name="btnsubmit" value="Login"  />
</form>
${msg}
<br>
<a href="reg.do">New User Register Here</a>
</center>
</section>
<footer>

</footer>

</body>
</html>