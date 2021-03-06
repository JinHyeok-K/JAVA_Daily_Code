<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<%@include file ="../header.jsp" %>

	<div class="container">
		<h3> 내가 쓴 글 </h3>
		
		<%
			String mid = (String)session.getAttribute("login");
			if( mid != null ){
		%>
			<a href="boardwrite.jsp"><button> 글쓰기</button> </a>
		<%} %>
		
		<table class="table"> <!-- 테이블 -->
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th> 
				<th> 조회수  </th> <th> 작성일 </th> 
			</tr>
			<!-- for 문 -->
			<%
				// 1. 모든 게시물  호출 
				//ArrayList<Board> boardlist = 
				//	BoardDao.getBoardDao().getboardlist();
					ArrayList<Board> mypagelist =
							BoardDao.getBoardDao().getmyboard(mid);
				//	System.out.println( boardlist);
				for( Board board : mypagelist ){
				//	System.out.println( board.toString() );
			%>
				<!-- 
					행을 클릭했을때[ js ]   
						<tr onclick="location.href='boardview.jsp'">
					*링크 [ 식별 번호 같이 이동 ] 
						// 1. HTML : <a href='파일명(경로).jsp?변수명=값'">
						// 2. JS : "location.href='파일명(경로).jsp?변수명=값'"
						// 3. java : response.sendRedirect("파일명(경로).jsp?변수명=값");
				-->
				<tr>
					<td> <%=board.getBno() %> </td>
					<td> 
							<a href="../board/boardview.jsp?bno=<%=board.getBno()%>">
								<%=board.getBtitle() %>
							</a> 
					</td>
					<td> <%=board.getMid() %> </td>
					<td> <%=board.getBview() %> </td>
					<td> <%=board.getBdate() %> </td>
				</tr>
			<%
				}
			%>
			
			
		</table>
	</div>
	<%@include file ="../footer.jsp" %>

</body>
</html>