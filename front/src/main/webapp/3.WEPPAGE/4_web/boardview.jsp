<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	<br><br><br><br><br><br><br>
	<div class="container">
		<h3 class="titleline text-center"> ���� �� </h3>
	
		<!--  ��ư  -->
		<div class="my-3">
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> ��Ϻ���</button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> ����</button></a> <!-- �ۼ��ڸ� ���� [��ȿ�� �˻�] -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> ����</button></a> <!-- �ۼ��ڸ� ���� [��ȿ�� �˻�] -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> �亯</button></a> <!-- �����ڸ� ���� [��ȿ�� �˻�] -->
		</div>
		<!--  �ۼ��� �Է��� ���� -->
		<div> <!--  div�ڽ��� : display :block /span �ڽ��� :display: inline -->
			<div>	<span>�ۼ���</span>  <span> ��¡��</span> </div>
			<div> <span>���� ��¥</span> <span>2022-04-24 10:10</span> </div>			
		</div>
		<div>
			<span> ȯ���ض� �ּ��� </span> <span> </span>
		</div>	
		<div>
			<textarea rows="20" cols="" class="form-control" readonly="readonly" style="resize: none">17171717171</textarea>	
		</div>												<!-- readonly : textarea:ũ����� -->
		
		<div class="row my-4"> <!--  ÷�ε� ������ -->
			<h4> ÷�� ���� </h4>
			<div class="col-md-3">
				<img alt="" src="img/��©1.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/��©2.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/��©3.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/��©1.gif" width="100%">
			</div>
		</div>
		
					
		<br>
		<!--  �����ڰ� �亯�� ���� -->
		<h4> ŷ�޴°����� �亯</h4>
		<p> �亯�� : </p>
		<div>
			<textarea rows="" cols="" class="form-control" readonly="readonly" style="resize: none">181818181818</textarea>
		</div>
		
	</div>		
	<%@include file="footer.jsp" %>
</body>
</html>
