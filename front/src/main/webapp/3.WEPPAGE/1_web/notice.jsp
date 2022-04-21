<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		
		*{
			
		}
		#notice{
			width: 1150px;
			height: 600px;
			margin: 0 auto;
		}
		#head{
			text-align : center;
			font-size : 20px;
			margin: 0 auto;
			height: 100px;
		}
		#serch_table{
		
			text-align : center;
			font-size : 20px;
			margin: 0 auto;
			background-color: #eeeeee;
			padding: 10px;
			border-bottom: solid 2px #d4d4d4;
		}
		#contents{
			width: 1150px;
			margin: 0 auto;
			border : solid 1px #eeeeee;
		
			
			line-height: 180%;
			font-size: 15px;
		}
		#list{
			
			border-bottom:solid 2px #eeeeee;
			text-align : center;
		}
		#list_line{
			border-bottom:solid 2px #eeeeee;
		}
		#bbs_number{
			border-bottom:solid 2px #eeeeee;
			
		}
		#bbs_contents{
			
			border-bottom: solid 2px #eeeeee;
			text-align : left;
		}
		#serch{
			width: 350px;
		}
		#table_under_line{
			border-bottom: solid 3px #eeeeee;
		}
	</style>

</head>
<body>

	<!--  헤더 -->
	<%@include file="header.jsp"%>
	
	<!--  헤더이미지 -->
	<%@include file="mainimage.jsp"%>
	<!--  본문 -->

	<form>
	<div id="notice">
		<div id="head"><h3>공지 사항</h3></div>
		<div id="serch_table"> <input id="serch" type="text" value="검색어를 입력해주세요."> <input  type="button" value=" 검색 ">  </div>
		<table id="contents">
			
			<tr  id="list">
				<td id="list_line">번호</td>
				<td id="list_line">제목</td>
				<td id="list_line">등록일</td>
			</tr>
			<tr id="list">
				<td id="bbs_number">3</td>
				<td id="bbs_contents">[공지사항] 개인정보 처리방침 변경안내처리방침</td>
				<td  id="list_line">2017.07.13</td>
			</tr>
			<tr id="list">
				<td id="bbs_number">2</td>
				<td id="bbs_contents">공지사항 안내입니다. 이용해주셔서 감사합니다</td>
				<td id="list_line">2017.06.15</td>
			</tr>
			<tr id="list">
				<td id="bbs_number">1</td>
				<td id="bbs_contents">공지사항 안내입니다. 이용해주셔서 감사합니다</td>
				<td id="list_line">2017.06.15</td>
			</tr>
			
		</table>
	</div>
	</form>
	
	<!--  푸터 -->
	<%@include file="footer.jsp" %>
</body>
</html>