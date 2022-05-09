<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


	
<!-- 게시판api( 썸머노트) css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
 	<!-- 썸머노트 기본 부트스트랩버전 3버전 css cdn -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<!-- 썸머노트 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
	
</head>
<body>

	<%@include file ="../header.jsp" %>
	
	<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getBoardDao().getboard(bno);
	%>
	
	
	<div class="container">
		<a href="boardlist.jsp"><button>글목록</button></a>
		<h3> 글쓰기 </h3>
		<form action="../board/board_update?bno=<%=board.getBno()%>" method="post" enctype="multipart/form-data" >
			<input name="bbfile" value="<%=board.getBfile() %>" hidden="true">
			<!-- form 전송 인코딩 타입 : 기본타입은 첨부파일 불가능  -->
			<!-- form 첨부파일 전송 인코딩 타입 : enctype="multipart/form-data" -->
			제목 : <input type="text" name="btitle" value="<%=board.getBtitle()%>"> <br>
			<textarea name="bcontent" id="summernote"<%=board.getBcontent()%>></textarea>
			첨부파일 : 
			<% if(board.getBfile()!=null){ %>
			 <%=board.getBfile() %> 
			<button  type="button" onclick="filedelete(<%=board.getBno()%>)">파일삭제</button>
			<%}
			%>
			<input type="file" name="bfile"> <br>
			<input type="submit" value="등록"> <input type="reset" onclick="location.href='boardview.jsp?bno=<%=board.getBno()%>'" value="취소" >
																																	
		</form>
	</div>
	
		<!-- 썸머노트 기본 부트스트랩버전 3버전 js cdn -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<!-- 썸머노트 js cdn  -->
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<script src=" https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js"></script>
	<!-- 사용자 정의 js -->
	<script src="/jspweb/js/board.js" type="text/javascript"></script>
	
	<%@include file ="../footer.jsp" %>
	
	
</body>
</html>