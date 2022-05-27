<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AA 쇼핑몰</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/jspweb/css/main.css" rel="stylesheet">
	<!--  폰트 어썸 [아이콘] -->	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	
</head>
<body>
	<!--   헤더페이지[ 모든 페이지 사용되기 때문에 = 최상위에서 절대경로 ] -->
	
	<%
		String loginid 
			= (String)session.getAttribute("login"); // 세션 호출 ( 기본타입 = Odject )
	%>
	
	<div class="container">
		<!--  공통  -->
		<div class="py-4">	
		
			<div class="row">
				<div class="col-md-4">
					<a href="/jspweb/main.jsp" class="header_logo">더A블에A이 SHOP</a>
				</div>
				
				<div class="col-md-4 offset-4 d-flex justify-content-end header_topmenu">
					
					<ul class="nav">
				
					<!--  로그인이 안된 상태  -->
					<% if( loginid == null ){ %>
						<li> <a href="/jspweb/member/login.jsp" class="header_topmenu">로그인</a> </li>
						<li> <a href="/jspweb/member/signup.jsp" class="header_topmenu">회원가입</a> </li>
					<%} %>
					<!--  만약에 로그인된 상태 -->
					<% if( loginid != null ){ %>
						<li> <span> <%=loginid %>님 </span> </li>
						<li> <a href="/jspweb/logout" class="header_topmenu">로그아웃</a> </li>
						<li> <a href="/jspweb/member/myshopping.jsp" class="header_topmenu">나의쇼핑</a> </li>
						<!--  로그인 id 가 admin 이면 -->
						<%if(loginid.equals("admin")){ %>
						<li> <a href="/jspweb/admin/dashboard.jsp" class="header_topmenu">관리자모드</a> </li>
						<%} %>
						
					<%} %>
						<li> <a href="/jspweb/board/boardlist.jsp?key=&keyword=" class="header_topmenu">자유게시판</a> </li>
					
					</ul>
					
				</div>
				<div class="navbar navbar-expand-md navbar-light bg-white">
				
					<ul class="navbar-nav col-md-12 justify-content-between">
						<li class="nav-item"><a href="#">BIG SIZE</a></li>
						<li class="nav-item"><a href="#" style="color:#00D8FF;">MUCLE - FIT</a></li>
						<li class="nav-item"><a href="#" style="color:#0100FF;">1+1 이벤트</a></li>
						
					
						<li class="nav-item dropdown"> <!-- drowndown :드랍다우 -->
							<a href="#" >아우터</a> <!-- data-bs-toggle="dropdown":해당태그 클릭시 드랍다운 열기 -->
						
							<!--  드랍 다운중입나. -->
							<div class="dropdown-menu"> <!--dropdown-menu : 드랍다운 내용들 -->
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								<a class="dropdown-item" href="#"> 드랍다운메뉴 </a>
								
							</div>
						</li>
						
						<li class="nav-item"><a href="#">상의</a></li>
						<li class="nav-item"><a href="#">바지</a></li>
						<li class="nav-item"><a href="#">슈즈</a></li>
						<li class="nav-item"><a href="#">악세사리</a></li>
						<li class="nav-item"><a href="/jspweb/board/chatting.jsp">채팅(소켓)</a></li>
						<li class="nav-item"><a href="/jspweb/teamchatting.jsp">채팅(DB)</a></li>
						<li class="nav-item"> <a href="#"> 트레이닝 </a> </li>
						<li class="nav-item"> <a href="#" style="color: #FFBB00;"> 모델처럼입자 </a> </li>
						<li class="nav-item">
							<input type="text" class="header_input" size="13"> 
							<a href="#"> <i class="fas fa-search"></i></a></li>
						<li class="nav-item"> <a href="/jspweb/product/productcart.jsp">장바구니<span class="shoppingbox">3</span></a></li>
						
					</ul>
				</div>
				
			</div>
			
		</div>
	
	</div>
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	

</body>
</html>





