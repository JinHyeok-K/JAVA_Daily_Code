<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!--  ���� ��ġ(����)�� �ٸ� ���� �����ϱ� -->
	<%@include file ="header.jsp" %>
	<br><br><br><br><br><br><br><br><br><br><br><br><br>
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="1000">
		
		<!--  �����̵� ��ġ ǥ�� : �ε�������  -->
		<div class= "carousel-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
			<button data-bs-target="#cs" data-bs-slide-to="1" > </button>
			<button data-bs-target="#cs" data-bs-slide-to="2" > </button>
			<button data-bs-target="#cs" data-bs-slide-to="3" > </button>
		</div>
		<!--  ĳ���� ���빰  -->
		<div class="carousel-inner"> 
			<div class="carousel-item active"> <img alt="" src="img/mainimage1.jpg" > </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage2.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage3.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage4.jpg"> </div>
		</div>
		
		<!-- �̹��� �̵� ��ư -->	
		<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-contorl-prev-icon"></span>
		</button>	
		
		<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-contorl-next-icon"></span>
		</button>
			
	</div> <!--  ĳ���� end -->
	<br><br>
	
	<div class="container text-center"> 
		<hr> <!-- �Ǽ� -->
			<h3> New ARRIVAL </h3>
			<p> �Ż�ǰ </p>
	</div>
	
	<div class="container">
		<div class="row">
		<% for(int i =0; i<8; i++){ %>
			<div class="col-md-3">
				<div class="card">
					<img class="card-img-top" alt="" src="img/��©1.gif "> <!--  �̹��� -->
					<div class="card-body">
						<p class="item">
							<span class="title"> �൵ �Ȱ��� ���� </span>
							<br> <br>
							<span class="content">
							������ �޷�������
							Ÿ��Ʈ�ϰ� ����� �������� ���� ����, 
							�� ����°� ��⼺�� ������ ���ڶ���ϴ�.
							���� �̰� �� ���� �Ȱ� �ִ��� �𸣰ھ��
							</span>
							<br> <br>
							<span class="price1"> 70,000,000 ��</span> 
							<br> 
							<span class="price2">70,000 ��</span>
							<br>
							<span class="badge bg-warning text-dark my-3"> �ֹ� �̴� </span>
							<span class="badge bg-danger text-dark my-3"> ���ּ��� ���� </span>
						</p>
					</div>
				</div>
			</div>
			<%} %>
			<!--  -->
			
			
		</div>
	</div>

	<%@include file ="footer.jsp" %>
</body>
</html>