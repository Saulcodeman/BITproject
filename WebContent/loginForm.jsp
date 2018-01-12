<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form input {border:3px dotted red;
			border-radius:12px;
			text-align:center;}
			
</style>
</head>
<body>
<%
String msg = (String)request.getAttribute("msg");

if(msg!=null) {
%>
	<label><b><%=msg%></b></label>
<%} %>
	<form action="LoginAction" ><!-- í¼íê·¸ì ë©ìë ì ì¡ë°©ìì GET -->
		id: <input name="id" type=text value="" placeholder="your id."><br>
		pwd:<input name="pwd" type=password value="" placeholder="your password."><br>
			<input type=submit value="OK">
	</form>
</body>
</html>