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
	
	<div id="header"> <!--  ��� ��ü -->
		<div id="box"> <!--  ����� �ڽ��� -->
			<div id="logo"> <!--  �ΰ�  -->
				<img alt="" src="logo.png">
			</div>
		
		
			<div id="menus"> <!--  �޴�   -->
				<ul id="top_menu"> <!--  ��� �޴� -->
					<li> ������(jykim)�� |</li>
					<li><a href="#">�α׾ƿ� |</li>
					<li><a href="#">�������� |</li>
				</ul>
					
			   	<ul id="main_menu"> <!--  �ϴ� �޴� -->
					<li> <a href="index.jsp"> Home </li>
					<li> <a href="#"> �⼮�� </li>
					<li> <a href="gallery.jsp"> ��ǰ ������</li>
					<li> <a href="#"> �Խ���</li>
				</ul>
							
			</div>
		</div>
	</div>
	
	
	
	
	
	
</body>
</html>