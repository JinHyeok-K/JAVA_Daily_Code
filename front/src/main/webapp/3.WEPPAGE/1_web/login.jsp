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
	<!--  ��� -->
	<%@include file="header.jsp"%>
	
	<!--  ����̹��� -->
	<%@include file="mainimage.jsp"%>
	<!--  ���� -->
	<div id = "contents">
		<h4> �α��� </h4>
	<table>
		<tr>
			<td> ���̵� </td>
			<td> <input type="text"> </td>
			<td rowspan="2"> <button>�α���</button> </td>
		</tr>
		
		<tr>
			<td> ��й�ȣ </td>
			<td> <input type="password"> </td>	
		</tr>
	</table>
	</div>
	<!--  Ǫ�� -->
	<%@include file="footer.jsp" %>
</body>
</html>