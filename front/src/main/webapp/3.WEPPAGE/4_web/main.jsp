<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!--  현재 위치(파일)에 다른 파일 포함하기 -->
	<%@include file ="header.jsp" %>
	<br><br><br><br><br><br><br><br><br><br><br><br><br>
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="1000">
		
		<!--  슬라이드 위치 표시 : 인디케이터  -->
		<div class= "carousel-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
			<button data-bs-target="#cs" data-bs-slide-to="1" > </button>
			<button data-bs-target="#cs" data-bs-slide-to="2" > </button>
			<button data-bs-target="#cs" data-bs-slide-to="3" > </button>
		</div>
		<!--  캐러셀 내용물  -->
		<div class="carousel-inner"> 
			<div class="carousel-item active"> <img alt="" src="img/mainimage1.jpg" > </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage2.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage3.jpg"> </div>
			<div class="carousel-item "> <img alt="" src="img/mainimage4.jpg"> </div>
		</div>
		
		<!-- 이미지 이동 버튼 -->	
		<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-contorl-prev-icon"></span>
		</button>	
		
		<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-contorl-next-icon"></span>
		</button>
			
	</div> <!--  캐러셀 end -->
	<br><br>
	
	<div class="container text-center"> 
		<hr> <!-- 실선 -->
			<h3> New ARRIVAL </h3>
			<p> 신상품 </p>
	</div>
	
	<div class="container">
		<div class="row">
		<% for(int i =0; i<8; i++){ %>
			<div class="col-md-3">
				<div class="card">
					<img class="card-img-top" alt="" src="img/움짤1.gif "> <!--  이미지 -->
					<div class="card-body">
						<p class="item">
							<span class="title"> 줘도 안가질 물건 </span>
							<br> <br>
							<span class="content">
							마음껏 달려보세요
							타이트하고 낑기는 디자인의 러닝 쇼츠, 
							땀 배출력과 통기성은 여전히 모자란답니다.
							저도 이걸 왜 만들어서 팔고 있는지 모르겠어요
							</span>
							<br> <br>
							<span class="price1"> 70,000,000 원</span> 
							<br> 
							<span class="price2">70,000 원</span>
							<br>
							<span class="badge bg-warning text-dark my-3"> 주문 미달 </span>
							<span class="badge bg-danger text-dark my-3"> 사주세요 제발 </span>
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