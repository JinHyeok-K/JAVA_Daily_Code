<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		// <%!선언부
		// <%스크립트
		// <%=표현식 	
  	%>
	<form action="3_결과페이지.jsp"> <!-- form : 폼 양식 (입력받은 데이터 전송) -->
		<input type="text" name="name"><br>
		 <!-- input : 입력 상자 (name : 식별 이름 ) -->
		 배경색 : <select name="color">
		 	<option value = "blue"> 파랑</option>
		 	<option value = "red"> 빨강</option>
		 	<option value = "orange"> 우석</option>
		 	<option value = "black"> 규석</option>
		 	<option value = "green"> 지웅</option>
		 	<option value = "pink"> 이츠미</option>
		 
		 </select>
		<!--  select : 선택상자 -->
		<input type="submit" value="전!송!">
		<!--  input type ="submit" :폼양식 전송(action 에 작성된 위치로 )-->
	</form>
	
	
</body>
</html>