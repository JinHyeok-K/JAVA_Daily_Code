<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{border: solid 1px blue;}
		.td{border: solid 1px red;}
	</style>
</head>
<body>
	
	<%@include file="1.��ġ.jsp" %>
	<table> <!--  �⺻ ���̺� : css ���� -->
		<tr>
			<th> ��ȣ </th>
			<th> ���� </th>
			<th> �۾��� </th>
		</tr>
		<tr> <td> 1 </td> <td> ���̺� �׽�Ʈ��1 </td> <td> ����1 </td> </tr>
		<tr> <td> 2 </td> <td> ���̺� �׽�Ʈ��2 </td> <td> ����2 </td> </tr>
		<tr> <td> 3 </td> <td> ���̺� �׽�Ʈ��3 </td> <td> ����3 </td> </tr>
	</table>
	
	
	<table class="table table-light"> <!-- bootstrap table (light ������) -->
		<tr>
			<th> ��ȣ </th>
			<th> ���� </th>
			<th> �۾��� </th>
		</tr>
		<tr> <td> 1 </td> <td> ���̺� �׽�Ʈ��1 </td> <td> ����1 </td> </tr>
		<tr> <td> 2 </td> <td> ���̺� �׽�Ʈ��2 </td> <td> ����2 </td> </tr>
		<tr> <td> 3 </td> <td> ���̺� �׽�Ʈ��3 </td> <td> ����3 </td> </tr>
	</table>
	
	<table class="table table-hover"> <!-- bootstrap table (hover ������) -->
		<tr>
			<th> ��ȣ </th>
			<th> ���� </th>
			<th> �۾��� </th>
		</tr>
		<tr> <td> 1 </td> <td> ���̺� �׽�Ʈ��1 </td> <td> ����1 </td> </tr>
		<tr> <td> 2 </td> <td> ���̺� �׽�Ʈ��2 </td> <td> ����2 </td> </tr>
		<tr> <td> 3 </td> <td> ���̺� �׽�Ʈ��3 </td> <td> ����3 </td> </tr>
	</table>
	
	
	<table class="table table-bordered" > <!-- bootstrap table (bordered ������ : ���̺� �� ) -->
		<tr>
			<th> ��ȣ </th>
			<th> ���� </th>
			<th> �۾��� </th>
		</tr>
		<tr> <td> 1 </td> <td> ���̺� �׽�Ʈ��1 </td> <td> ����1 </td> </tr>
		<tr> <td> 2 </td> <td> ���̺� �׽�Ʈ��2 </td> <td> ����2 </td> </tr>
		<tr> <td> 3 </td> <td> ���̺� �׽�Ʈ��3 </td> <td> ����3 </td> </tr>
	</table>
	
	<table class="table table-hover table-bordered" > <!-- bootstrap table (hover, bordered ������ : ���̺� �� ) -->
		<tr>
			<th> ��ȣ </th>
			<th> ���� </th>
			<th> �۾��� </th>
		</tr>
		<tr> <td> 1 </td> <td class="align-bottom" style=text-align:center> ���̺� �׽�Ʈ��1 ���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1���̺� �׽�Ʈ��1  </td> <td> ����1 </td> </tr>
		<tr> <td> 2 </td> <td> ���̺� �׽�Ʈ��2 </td> <td> ����2 </td> </tr>
		<tr> <td> 3 </td> <td> ���̺� �׽�Ʈ��3 </td> <td> ����3 </td> </tr>
	</table>
	
		
</body>
</html>