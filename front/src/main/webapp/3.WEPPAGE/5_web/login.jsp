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
	<br><br>
	
	<div class="row">
		<div class="col-md-2 sidemenu"> <!-- ���̵�� �޴� -->
			<a href="index.jsp"> <h3> HUNS </h3></a>
			<ul>
				<li> BEST </li>
				<li> NEW </li>
				<li> ���Ϲ�� </li>
				<li> 1+1 / �ڵ�Ʈ </li>
			</ul>
			
			<ul>
				<li> �ƿ��� </li>
				<li> ���� </li>
				<li> ���� </li>
				<li> ��Ʈ/����� </li>
				<li> ���� </li>
				<li> Ʈ���̴� </li>
				<li> �Ź� </li>
				<li> �Ǽ��縮</li>
				<li> ����</li>
				
			</ul>
			<ul>
			
				<li> NOTICE </li>
				<li> Q & A  </li>
				<li> REVIEW </li>
				<li> EVENT  </li>
				
			</ul>
			<div>
				<input type="text"> <i class="fas fa-search"></i> 
			</div>		
			<br>
			<div class="side_info offset-1">
				
				�����͡�123-4567-8901 <br>
	
				īī��ä�� @��<br>
				
				MON - FRI AM9 - PM4<br>
				
				(LUNCH TIME PM12:30 - PM13:30)<br>
				
				SAT, SUN, HOLIDAY CLOSE<br>
				
				�����ð��� ���Ǵ�<br>
				
				Q��A �Խ����� �̿��Ź�帳�ϴ�.<br>
				
				�츮���� 1234-567-8901234<br>
				
				������ : (��)����
							
			
			</div>
					
		</div>
	
	
	
	<div class="col-md-10 offset-2 content">
<h4 class="col-md-3 offset-5">LOGIN</h4>
<br><br><br>
<div class="row">
	<div class="col-md-3 offset-4">
		<div class="row">
		    <div class="col-md-8">
		      <div class="row">
	
		          <input class="form-control textbox" type="text" placeholder="���̵�">
	
		      </div>
		      <div class="row">
	
		          <input class="form-control textbox" type="text" placeholder="��й�ȣ">
	
		      </div>
		    </div>
		     <div class="col-md-4">
		     <button style="color:white" type="button" class="btn btn-default btn-lg bg-dark" >LOGIN</button>
		    </div>
		</div>
		<br><br>
		<div class="row title">
			<div class="col-md-4">
			<input  class="form-check-input" type="checkbox">���̵� ����
			</div>
			<div class="col-md-8">
			<ul style="font-size:14px;" class="nav d-flex p-2  ">
				<li><a href="#"> ��������</a> |  </li>
				<li><a href="#"> ���̵�ã��</a> |  </li>
				<li><a href="#"> ��й�ȣã��</a></li>						
			</ul>
			</div>
		</div>
		<br><br>
		<div class="row">
		<div class="col-md-6">
		<img style="width:100%" alt="" src="img/btn_naver_login.gif">
		<br>
		</div>
		<div class="col-md-6">
		<img style="width:100%" alt="" src="img/btn_facebook_login.gif">
		<br>
		</div>
		<br>
		</div>
		<br>
		<div class="row">
		<div class="col-md-6">
		<img style="width:100%" alt="" src="img/btn_kakao_login.gif">
		</div>
		<div class="col-md-6">
		<img style="width:100%" alt="" src="img/btn_apple_login.gif">
		</div>
		</div>
		<br>
		
		<div class="row">
			<button type="button" class="btn btn-secondary ">JOIN US</button>
		</div>
		<br><br><br>
		
		<div class="text-center">
		<p class="subtext1">��ȸ���� ���, �ֹ����� �ֹ���ȣ�� �ֹ���ȸ�� �����մϴ�.</p>
		</div>
		<br>
		<div class="row title my-1">
		<div class="col-md-6">
		�ֹ��ڸ�
		</div>
		<div class="col-md-6">
		<input type="text">
		</div>
		</div>
		<div class="row title my-1">
		<div class="col-md-6 ">
		�ֹ���ȣ
		</div>
		<div class="col-md-6">
		<input  type="text" placeholder="������(-) ����">
		</div>
		</div>
		<div class="row title my-1">
		<div class="col-md-6">
		��ȸ���ֹ� ��й�ȣ
		<br><br>
		</div>
		<div class="col-md-6">
		<input type="text">
		</div>
		</div>
		<div class="row title my-1">
		<br><br>
		<button style="border:solid 1px gray;" type="button" class="btn btn-light btn-sm py-2">��ȸ�� �α���</button>
		
		</div>
		<br><br><br><br><br><br>
		
		
	</div>

</div>

</div>
			<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>