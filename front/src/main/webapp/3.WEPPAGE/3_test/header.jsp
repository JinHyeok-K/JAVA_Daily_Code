<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		body{
		text-align: center;
	}
	a{
		text-decoration: none;
		color: black;
	}
	#heaerbox{
		display:inline-block;
		width: 1000px;
	}
	#heaerlogo {
		float: left;
		font-size: 30px;
		padding-top: 7px;
	}
	#heaerlogo span {
		color: blue;
	}
	#heaermenu {
		float: right;
	}
	.menu_items li{
		display: inline;
		margin-right: 50px;
	}
	</style>
</head>
<body>
	<div id = "heaerbox">
			<div id = "heaerlogo"> <span>The</span> 스튜디오 </div>
			<div id = "heaermenu">
				<ul class= "menu_items">
					<li class="menu_item"><a href="#">스튜디오 소개</a></li>
					<li class="menu_item"><a href="#">스튜디오 예약</a></li>
					<li class="menu_item"><a href="#">블로그</a></li>
					<li class="menu_item"><a href="#">포토 갤러리</a></li>
					<li class="menu_item"><a href="#">오시는 길</a></li>
				</ul>
			</div>
		</div>
</body>
</html>