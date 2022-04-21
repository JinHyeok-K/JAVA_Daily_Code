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
	<!--  헤더 -->
	<%@include file="header.jsp"%>
	
	<!--  헤더이미지 -->
	<%@include file="mainimage.jsp"%>
	<!--  본문 -->
	
	<h3>회원 가입 폼</h3>
	<form>
	
		<ul id="join">			
					
			<li>
				<ul class="cols">
					<li class="col1"> 아이디 </li>
					<li class="col2"> <input type="text"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> 비밀번호 </li>
					<li class="col2"> <input type="password"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> 비밀번호 확인 </li>
					<li class="col2"> <input type="password"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1">이름 </li>
					<li class="col2"> <input type="text"> </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> 이메일 </li>
					<li class="email input"> <input type="text">@ 
						<select class="email select">
							<option> 직접입력 </option>
							<option> naver.com </option>
							<option> nate.com </option>
						
				 		 </select>	</li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> 이메일 수신 </li>
					<li> <input type ="radio" checked="checked"> 수신 
						<input type ="radio" > 비 수신 </li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1"> 가입 경로 </li>
						<li> <input type ="checkbox" > 친구 추천
							<input type ="checkbox" > 인터넷 검색
							<input type ="checkbox" checked="checked" > 기타
						</li>	
					
				</ul>
			</li>
			
			<li>
				<ul class="cols">
					<li class="col1 hello"> 인사말 </li>
						<li> <textarea rows="6" cols="40"></textarea>
						</li>	
					
				</ul>
			</li>
			
			
		
			
	</ul>
			</form>
			
			<input type="button" class="button" value="저장하기"  >		 
			<input type="button" class="button" value="가입하기" >
	
	
	
	
	<!--  푸터 -->
	<%@include file="footer.jsp" %>
</body>
</html>