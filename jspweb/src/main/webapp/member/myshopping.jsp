<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%@include file = "../header.jsp" %>
	<div class="container">  <!-- 박스권 -->
		<div class="row"> <!--  가로배치 -->
			<div class= "col-md-3"> <!-- Side bar --> 
				<%@include file="infosidebar.jsp" %>
			</div>
			<div class= "col-md-9"> <!-- 본문 -->
				<h3> 주문 현황 </h3>
			</div>
		</div>
	</div>
	<%@include file = "../footer.jsp" %>
	
</body>
</html>