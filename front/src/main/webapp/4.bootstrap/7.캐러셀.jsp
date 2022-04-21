<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		
		.carousel-item{ /*이미 정의된 부트스트랩 클래스 수정 */
			width: 100%; height: 100%
		}
		
	</style>
</head>
<body>
	<%@include file="1.설치.jsp" %>
	<!--  이미지 슬라이드 : 캐러셀 -->
	
	<div class="container" > <!--  박스권  -->
		<!--  캐러셀  -->
		<div id="cs" class="carousel slide-fade" data-bs-ride="carousel"
		data-bs-interval="100"> <!-- 1/1000 초 -->
		 
		 <!--  캐러셀 [내용위치] 하단 버튼 : 인디케이터  -->
		 <div class="carousel-indicators">
		 	<button type="button" data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
		 	<button type="button" data-bs-target="#cs" data-bs-slide-to="1"> </button>
		 	<button type="button" data-bs-target="#cs" data-bs-slide-to="2"> </button>
		 	
		 </div>
		 
			<div class="carousel-inner">
				<div class="carousel-item active ">	<!--  carousel-item: 캐러셀 내용 | active : 실행-->
					<img alt="" src="../백여우2.jpg" ></div>
				<div class="carousel-caption"> asdfasdf</div>	
				<div class="carousel-item ">	<!--  캐러셀 내용 -->
					<img alt="" src="../photo7.jpg" >	</div>
				
				<div class="carousel-item">	<img alt="" src="../백여우2.jpg" >	</div>
			</div>	
				<!--  캐러셀 이동 버튼 -->
				<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>
				
				<button class="carousel-control-next"  data-bs-target="#cs" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>
			
		</div>
		
	</div>
	
	
	
</body>
</html>