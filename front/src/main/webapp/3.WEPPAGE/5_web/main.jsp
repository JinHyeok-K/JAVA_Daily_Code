<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
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
		
		<div class="col-md-10 offset-2 content"> <!-- ���� -->	
			<div id="cs" class="carousel slide carousel-fade " data-bs-ride="carousel" data-bs-interval="1000"> <!-- ĳ���� -->
					
			
			<!--  �����̵� ��ġ ǥ�� : �ε�������  -->
			<div class= "carousel-indicators li ">
				
				 
			
				<button data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
				<button data-bs-target="#cs" data-bs-slide-to="1" > </button>
				<button data-bs-target="#cs" data-bs-slide-to="2" > </button>
				<button data-bs-target="#cs" data-bs-slide-to="3" > </button>
				
			</div>
			<!--  ĳ���� ���빰  -->
			<div class="carousel-inner"> 
				<div class="carousel-item active"> <img style="width:100%; height:100%; object-fit:cover;" alt="" src="img/mainimage1.jpg" > </div>
				<div class="carousel-item "> <img style="width:100%; height:100%; object-fit:cover;" alt="" src="img/mainimage2.jpg"> </div>
				<div class="carousel-item "> <img style="width:100%; height:100%; object-fit:cover;" src="img/mainimage3.jpg"> </div>
				<div class="carousel-item "> <img style="width:100%; height:100%; object-fit:cover;" src="img/mainimage4.jpg"> </div>
			</div>
			
			<!-- �̹��� �̵� ��ư -->	
			<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
				<span class="carousel-contorl-prev-icon"></span>
			</button>	
			
			<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
				<span class="carousel-contorl-next-icon"></span>
			</button>
				
		 
				
			</div><!--  ĳ���� end -->
				
				</div> <!-- ��ǰ --> 
		<br><br><br><br>		
		<div class="containe">
		
		
		<br><br>
		<div class="text-center offset-1">
		<br><br>
		<h3> BEST SELLER</h3>
		<p> #����Ʈ���� </p>
		<br><br><br><br>
		</div>
			<div class="offset-2 row">
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©1.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
				
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©2.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©3.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©2.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©3.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-6 "> <!-- col-md-3 : col-md :760px; �̻��ϰ�� col-sm : 570px���� �̻��ϰ�� -->
					<div class="card border-white px-1 mb-5" style="width: 20rem;"> <!-- ī������ -->
						<img class="card-img-top" alt="" src="img/��©1.gif"> <!-- �̹��� -->
						<div class="card-body">
							<p class="item">
								<span class="title"> [1+1] �÷��� ���̵� ������� </span>
								<hr>
								<span class="price1"> 29,900��</span><br>
								<span class="price2"> 2 color / 2 size </span>
							</p>
						</div>
					</div>
				</div>
				
					
			</div>
				
			
			<br><br>
			<div class="row text-center">
				<h3>INSTAGRAM</h3>
				<p> @hunsgram</p>
			<br><br><br><br>
			</div>
	
	
</body>
</html>