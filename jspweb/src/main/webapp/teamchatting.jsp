<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	

</head>
<body>
<%@include file="header.jsp" %>
<br><br><br><br><br><br><br><br>
<div class="container">
<div class="col-md-4 offset-4">
<h3 class="bigtext">채팅</h3>
<div id="chattingroom" style="border: 1px solid black; height : 500px;" ></div>
<div class="row">
	
		<div class="col-md-3"><input type="text" class="form-control" id="ninkname" placeholder="닉네임"></div>
		<div class="col-md-6"><input type="text" class="form-control" id="chatting" placeholder="내용"></div>
		<div class="col-md-3"><button type="button" class="form-control" onclick="gochatting()">전송</button></div>
	
</div>


</div>
</div>
	<!-- 사용자 정의 js -->
	<script src="/jspweb/js/chatting.js" type="text/javascript"></script>
	


<%@include file="footer.jsp" %>
</body>
</html>