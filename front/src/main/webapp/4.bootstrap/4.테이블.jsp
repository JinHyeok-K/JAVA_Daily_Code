<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{border: solid 1px blue;}
		.td{border: solid 1px red;}
	</style>
</head>
<body>
	
	<%@include file="1.설치.jsp" %>
	<table> <!--  기본 테이블 : css 없음 -->
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 글쓴이 </th>
		</tr>
		<tr> <td> 1 </td> <td> 테이블 테스트중1 </td> <td> 좀비1 </td> </tr>
		<tr> <td> 2 </td> <td> 테이블 테스트중2 </td> <td> 좀비2 </td> </tr>
		<tr> <td> 3 </td> <td> 테이블 테스트중3 </td> <td> 좀비3 </td> </tr>
	</table>
	
	
	<table class="table table-light"> <!-- bootstrap table (light 적용중) -->
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 글쓴이 </th>
		</tr>
		<tr> <td> 1 </td> <td> 테이블 테스트중1 </td> <td> 좀비1 </td> </tr>
		<tr> <td> 2 </td> <td> 테이블 테스트중2 </td> <td> 좀비2 </td> </tr>
		<tr> <td> 3 </td> <td> 테이블 테스트중3 </td> <td> 좀비3 </td> </tr>
	</table>
	
	<table class="table table-hover"> <!-- bootstrap table (hover 적용중) -->
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 글쓴이 </th>
		</tr>
		<tr> <td> 1 </td> <td> 테이블 테스트중1 </td> <td> 좀비1 </td> </tr>
		<tr> <td> 2 </td> <td> 테이블 테스트중2 </td> <td> 좀비2 </td> </tr>
		<tr> <td> 3 </td> <td> 테이블 테스트중3 </td> <td> 좀비3 </td> </tr>
	</table>
	
	
	<table class="table table-bordered" > <!-- bootstrap table (bordered 적용중 : 테이블 선 ) -->
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 글쓴이 </th>
		</tr>
		<tr> <td> 1 </td> <td> 테이블 테스트중1 </td> <td> 좀비1 </td> </tr>
		<tr> <td> 2 </td> <td> 테이블 테스트중2 </td> <td> 좀비2 </td> </tr>
		<tr> <td> 3 </td> <td> 테이블 테스트중3 </td> <td> 좀비3 </td> </tr>
	</table>
	
	<table class="table table-hover table-bordered" > <!-- bootstrap table (hover, bordered 적용중 : 테이블 선 ) -->
		<tr>
			<th> 번호 </th>
			<th> 제목 </th>
			<th> 글쓴이 </th>
		</tr>
		<tr> <td> 1 </td> <td class="align-bottom" style=text-align:center> 테이블 테스트중1 테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1테이블 테스트중1  </td> <td> 좀비1 </td> </tr>
		<tr> <td> 2 </td> <td> 테이블 테스트중2 </td> <td> 좀비2 </td> </tr>
		<tr> <td> 3 </td> <td> 테이블 테스트중3 </td> <td> 좀비3 </td> </tr>
	</table>
	
		
</body>
</html>