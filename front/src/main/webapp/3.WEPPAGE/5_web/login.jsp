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
		<div class="col-md-2 sidemenu"> <!-- 사이드바 메뉴 -->
			<a href="index.jsp"> <h3> HUNS </h3></a>
			<ul>
				<li> BEST </li>
				<li> NEW </li>
				<li> 당일배송 </li>
				<li> 1+1 / 코디세트 </li>
			</ul>
			
			<ul>
				<li> 아우터 </li>
				<li> 상의 </li>
				<li> 셔츠 </li>
				<li> 니트/가디건 </li>
				<li> 팬츠 </li>
				<li> 트레이닝 </li>
				<li> 신발 </li>
				<li> 악세사리</li>
				<li> 세일</li>
				
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
				
				고객센터　123-4567-8901 <br>
	
				카카오채널 @꿱<br>
				
				MON - FRI AM9 - PM4<br>
				
				(LUNCH TIME PM12:30 - PM13:30)<br>
				
				SAT, SUN, HOLIDAY CLOSE<br>
				
				업무시간외 문의는<br>
				
				Q＆A 게시판을 이용부탁드립니다.<br>
				
				우리은행 1234-567-8901234<br>
				
				예금주 : (주)유니
							
			
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
	
		          <input class="form-control textbox" type="text" placeholder="아이디">
	
		      </div>
		      <div class="row">
	
		          <input class="form-control textbox" type="text" placeholder="비밀번호">
	
		      </div>
		    </div>
		     <div class="col-md-4">
		     <button style="color:white" type="button" class="btn btn-default btn-lg bg-dark" >LOGIN</button>
		    </div>
		</div>
		<br><br>
		<div class="row title">
			<div class="col-md-4">
			<input  class="form-check-input" type="checkbox">아이디 저장
			</div>
			<div class="col-md-8">
			<ul style="font-size:14px;" class="nav d-flex p-2  ">
				<li><a href="#"> 보안접속</a> |  </li>
				<li><a href="#"> 아이디찾기</a> |  </li>
				<li><a href="#"> 비밀번호찾기</a></li>						
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
		<p class="subtext1">비회원의 경우, 주문시의 주문번호로 주문조회가 가능합니다.</p>
		</div>
		<br>
		<div class="row title my-1">
		<div class="col-md-6">
		주문자명
		</div>
		<div class="col-md-6">
		<input type="text">
		</div>
		</div>
		<div class="row title my-1">
		<div class="col-md-6 ">
		주문번호
		</div>
		<div class="col-md-6">
		<input  type="text" placeholder="하이픈(-) 포함">
		</div>
		</div>
		<div class="row title my-1">
		<div class="col-md-6">
		비회원주문 비밀번호
		<br><br>
		</div>
		<div class="col-md-6">
		<input type="text">
		</div>
		</div>
		<div class="row title my-1">
		<br><br>
		<button style="border:solid 1px gray;" type="button" class="btn btn-light btn-sm py-2">비회원 로그인</button>
		
		</div>
		<br><br><br><br><br><br>
		
		
	</div>

</div>

</div>
			<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>