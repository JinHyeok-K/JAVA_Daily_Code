<%@page import="dao.ProductDao"%>
<%@page import="dto.Category"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 
 <div class="container offset-2">
 <h3> 제품 등록 페이지 </h3>
 <!-- 폼에서 첨부파일 전송시에는 enctype = "multipart/form-data" -->
	<form id="addform"> 
		제품명 <input type="text" id="pno" name="pno" placeholder="제품명"> <br>
		가격  <input type="text" id="pprice" name="pprice" placeholder="가격"> <br>
		할인율 <input type="text" id="pdiscount" name="pdiscount" placeholder="할인율"> <br>
		
		카테고리<button onclick="categorybtn()" type="button" >카테고리추가</button><br>
		<div id="categotyinput">	</div> <!--  버튼 클릭 시 카테고리ㅗ 입력창 표시되는 구역 -->
		<div id="categorybox">	</div> <!--	* DB에 저장된 카테고리 만큼 버튼 표시 [ DB -> JAVA(서블릿) -> JS -> HTML ]  -->	
		대표이미지 <input type="file" id="pimg" name="pimg"> <br>
		<button type="button" onclick="productadd()">등록</button> <!-- js에서 form 비동기 통신 -->
		<input type="reset" value ="초기화">
	</form>
</div>
 
 <!-- 사용자정의 js 호출 --> <script src="/jspweb/js/productadd.js" type="text/javascript"></script>
</body>
</html>