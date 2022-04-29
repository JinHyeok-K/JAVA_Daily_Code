<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="signupcontroll.jsp" method="post">
		<!--  action = "이동경로(파일)" method 
		HTTP : 전송방식
			1. GET : URL 변수값 표시 O
			2. POST : URL 변수값 표시 X
		
		 -->
		<input type="text" name="id">
		<input type="text" name="name">
		<input type="password" name="password">
		<input type="submit" value=" 전 송 ">
	</form>
	
	
</body>
</html>