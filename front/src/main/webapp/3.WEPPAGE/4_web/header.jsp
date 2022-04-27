<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<!--  ��Ʈ��Ʈ�� css ���� -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
	
	<!--  ����ڰ� ������ css ���� -->
	<link href="css/main.css" rel="stylesheet">
	<!--  ��Ʈ ��� [������] -->	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
	
	<div class="fixed-top bg-white">
		<div class="container " >
			<div class="py-3"> <!--  ��� �޴� -->
					<!--  p: ���� ����		py-*: �� �Ʒ� ���� ���� (padding)
						  m: �ٱ� ����		my-*: �� �Ʒ� �ٱ� ���� (margin)	
					-->
					<div class="row"> <!-- ���� ��ġ -->
						<div class="col-md-4 offset-4 text-center"><!-- �ΰ�  --> <!--  �׸���[12������ 4����] -->
								<!-- text-center: �ڽ��� ���빰 ��� ���� -->
								<!-- offset-4 : ���� �׸��� --> 
							<a href="main.jsp" class="header_logo"> ������������  </a>
						</div>
						<div class="col-md-4 d-flex justify-content-end"> <!--  ��� �޴� -->
							<ul class="nav"> <!--  ���ι�ġ -->
								<li><a href="#">�α���</a> | </li>
								<li><a href="signup.jsp">ȸ������</a> | </li>
								<li><a href="#">��ٱ���</a> | </li>
							</ul>
						</div>
					</div>
				<div class="navbar navbar-expand-md navbar-light bg-white"> <!--  �� �޴� -->
					
					<!--  ������ �޴� ��ġ�� ��ư -->
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
						data-bs-target="#navcl"	>
		    		  <span class="navbar-toggler-icon"></span>
		   			 </button>
					
					
					
					<div class="collapse navbar-collapse" id="navcl"> <!--  ����� ������ ��� �Ʒ� ul ����� -->
						<ul class="navbar-nav col-md-12 justify-content-between">
													<!-- justify-content-between : �ڵ� ���� ��ġ  -->
							<li class="nav-item"><a href="#">����Ʈ ��ǰ</a> </li>
							<li class="nav-item"><a href="#">��Ʈ</a> </li>
							<li class="nav-item"><a href="#">�ƿ��� </a></li>
							<li class="nav-item"><a href="#">����</a> </li>
							<li class="nav-item"><a href="#">��Ʈ</a> </li>
							<li class="nav-item"><a href="#">����</a> </li>
							<li class="nav-item"><a href="#">����</a> </li>
							<li class="nav-item"><a href="#">�Ź�</a> </li>
							<li class="nav-item"><a href="#">�Ǽ��縮</a> </li>
							<li class="nav-item"><a href="#">��Ÿ��</a> </li>
							<li class="nav-item"><a href="#">����</a> </li>
							<li class="nav-item"><a href="boardlist.jsp">������</a> </li>
							<li class="nav-item"><a href="#"><i class="fas fa-search"></i> </a> </li>
							
						</ul>
					</div>
				</div>	
			</div>
		</div>
	</div>
	<!--  ��Ʈ��Ʈ�� js ���� -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
	
</body>
</html>