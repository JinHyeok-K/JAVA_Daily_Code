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
	<br><br><br><br><br><br><br>
	<div class="container">
		<h3 class="titleline text-center"> 문의 글 </h3>
	
		<!--  버튼  -->
		<div class="my-3">
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 목록보기</button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 삭제</button></a> <!-- 작성자만 가능 [유효성 검사] -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 수정</button></a> <!-- 작성자만 가능 [유효성 검사] -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info"> 답변</button></a> <!-- 관리자만 가능 [유효성 검사] -->
		</div>
		<!--  작성자 입력한 내용 -->
		<div> <!--  div박스권 : display :block /span 박스권 :display: inline -->
			<div>	<span>작성자</span>  <span> 오징어</span> </div>
			<div> <span>문의 날짜</span> <span>2022-04-24 10:10</span> </div>			
		</div>
		<div>
			<span> 환불해라 애송이 </span> <span> </span>
		</div>	
		<div>
			<textarea rows="20" cols="" class="form-control" readonly="readonly" style="resize: none">17171717171</textarea>	
		</div>												<!-- readonly : textarea:크기고정 -->
		
		<div class="row my-4"> <!--  첨부된 사진들 -->
			<h4> 첨부 사진 </h4>
			<div class="col-md-3">
				<img alt="" src="img/움짤1.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/움짤2.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/움짤3.gif" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/움짤1.gif" width="100%">
			</div>
		</div>
		
					
		<br>
		<!--  관리자가 답변한 내용 -->
		<h4> 킹받는관리자 답변</h4>
		<p> 답변일 : </p>
		<div>
			<textarea rows="" cols="" class="form-control" readonly="readonly" style="resize: none">181818181818</textarea>
		</div>
		
	</div>		
	<%@include file="footer.jsp" %>
</body>
</html>
