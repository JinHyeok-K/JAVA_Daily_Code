<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		h3{ text-align: center;}
		li{	list-style-type: none;	}
		
		#join{
			margin: 0 auto;
			width: 600px;
			margin: 0 aut;
			border-top : solid 2px #eeeeee;
			border-bottom : solid 2px #eeeeee;
			padding : 30px;
		}
		.cols{padding: 5px; margin: 0 auto;}
		.cols li{display: inline-block; margin: 0 auto;}
		.col1{width:150px; margin: 0 auto;}
		.col2 input, select {width:200px; height: 30 px; margin: 0 auto;}
		.email input, select{ height:30px; margin: 0 auto;}
		.hello{vertical-align: top; margin: 0 auto;}
		.button{ 
			 margin: 0 auto;
			  display: inline-block;
			  font-size: 20px;
			  position: relative;
			  top : 50%;
			    left :55%;
			  }
	</style>


</head>
<body>
	<!--  ��� -->
	<%@include file="header.jsp"%>
	
	<!--  ����̹��� -->
	<%@include file="mainimage.jsp"%>
	<!--  ���� -->
	
	<h3>ȸ�� ���� ��</h3>
	<form>
	
		<ul id="join">			
					
			<li>
				<ul class="cols">
					<li class="col1"> ���̵� </li>
					<li class="col2"> <input type="text"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> ��й�ȣ </li>
					<li class="col2"> <input type="password"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> ��й�ȣ Ȯ�� </li>
					<li class="col2"> <input type="password"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1">�̸� </li>
					<li class="col2"> <input type="text"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> �̸��� </li>
					<li class="email input"> <input type="text">@ 
						<select class="email select">
							<option> �����Է� </option>
							<option> naver.com </option>
							<option> nate.com </option>
						
				 		 </select>	</li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> �̸��� ���� </li>
					<li> <input type ="radio" checked="checked"> ���� 
						<input type ="radio" > �� ���� </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> ���� ��� </li>
						<li> <input type ="checkbox" > ģ�� ��õ
							<input type ="checkbox" > ���ͳ� �˻�
							<input type ="checkbox" checked="checked" > ��Ÿ
						</li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1 hello"> �λ縻 </li>
						<li> <textarea rows="6" cols="40"></textarea>
						</li>	
					
				</ul>
			</li>
			
			
		
			
	</ul>
			</form>
			
			<input type="button" class="button" value="�����ϱ�"  >		 
			<input type="button" class="button" value="�����ϱ�" >
	
	
	
	
	<!--  Ǫ�� -->
	<%@include file="footer.jsp" %>
</body>
</html>