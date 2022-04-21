<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		li{list-style-type: none;}
		a{ text-decoration: none; color: black;}
		a:horver { color:orange;}
		#header{ height: 200px;}
		#box{ width : 1100px; margin: 0 auto;}
		#logo{ float: left;}
		#menus{float: right; text-align: right;}
		#menus li{display: inline;}
	
		@font-face {
	    font-family: 'Yeongdo-Rg';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2202-2@1.0/Yeongdo-Rg.woff') format('woff');
	    font-weight: normal;
	    font-style: normal;
		}
		#top_menu{ margin: 30px 0px;}
		#top_menu li { margin: 5px;}
		#main_menu li{
			font-family: "Yeongdo-Rg";
			font-size: 20px; margin: 50px 0 0 80px;
		}
		#logo { margin: 50px 50px;}
	</style>

</head>
<body>
	
	<div id="header"> <!--  헤더 전체 -->
		<div id="box"> <!--  헤더내 박스권 -->
			<div id="logo"> <!--  로고  -->
				<img alt="" src="logo.png">
			</div>
		
		
			<div id="menus"> <!--  메뉴   -->
				<ul id="top_menu"> <!--  상단 메뉴 -->
					<li> 김지영(jykim)님 |</li>
					<li><a href="#">로그아웃 |</li>
					<li><a href="#">정보수정 |</li>
				</ul>
					
			   	<ul id="main_menu"> <!--  하단 메뉴 -->
					<li> <a href="index.jsp"> Home </li>
					<li> <a href="#"> 출석부 </li>
					<li> <a href="gallery.jsp"> 작품 갤러리</li>
					<li> <a href="#"> 게시판</li>
				</ul>
							
			</div>
		</div>
	</div>
	
	
	
	
	
	
</body>
</html>