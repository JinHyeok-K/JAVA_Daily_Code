<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<%@include file="../header.jsp" %>
	<div class="container">
		<h3>회원가입페이지</h3>
		<form>
			ID : <input id="mid" type="text" placeholder="User ID">
			<span id="idcheck"></span>
			<br>
			Password : <input id="mpassword" type="password" placeholder="User Password">
			Password check : <input id="mpasswordcheck" type="password" placeholder="Password Check">
			<span id="passwordcheck"></span>
			<br>
			Name : <input id="mname" type="text" placeholder="User Name">
			<span id="namecheck"></span>
			<br>
			Call No. : <input id="mphone" type="text" placeholder="User Phone">
			<span id="phonecheck"></span>
			<br>
			E-mail :   <input id="memail" type="text" placeholder="User email.">
			<span id="emailcheck"></span>
			<br>
			
			<br>
				<input type="text" id="address1" placeholder="우편번호">
				<input type="button" onclick="find_address()" value="우편번호 찾기"><br>
				<input style="width:350px" type="text" id="address2" placeholder="도로명주소"><br>
				<input style="width:350px" type="text" id="address3" placeholder="지번주소"><br>
				<span id="guide" style="color:#999;display:none"></span>
				<input style="width:350px" type="text" id="address4" placeholder="상세주소"><br>
				<input style="width:350px" type="text" id="address5" placeholder="참고항목"><br>
			<br>
			<button onclick="signup()" type="button"> 가입 하기 </button>
		</form>		
	</div>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

	<script src="../js/signup.js" type="text/javascript"></script>
	<%@include file="../footer.jsp" %>
</body>
</html>