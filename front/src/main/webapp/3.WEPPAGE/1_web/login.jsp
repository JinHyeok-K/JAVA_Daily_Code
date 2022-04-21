<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		#contets{
			 margin: 200px 50px;
		}
		table{ width: 350px; margin: 0 auto;
				padding-bottom: 50px ;
		 }
		input { height: 25px; }
		button { padding: 22px 20px; }
		h4{ text-align: center;
			padding-top: 50px;
			margin-bottom: 30px;
		 }
	</style>

</head>
<body>
	<!--  헤더 -->
	<%@include file="header.jsp"%>
	
	<!--  헤더이미지 -->
	<%@include file="mainimage.jsp"%>
	<!--  본문 -->
	<div id = "contents">
		<h4> 로그인 </h4>
	<table>
		<tr>
			<td> 아이디 </td>
			<td> <input type="text"> </td>
			<td rowspan="2"> <button>로그인</button> </td>
		</tr>
		
		<tr>
			<td> 비밀번호 </td>
			<td> <input type="password"> </td>	
		</tr>
	</table>
	</div>
	<!--  푸터 -->
	<%@include file="footer.jsp" %>
</body>
</html>