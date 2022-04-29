<%@page import="Dto.Board"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// view.jsp ? bno= 게시물 번호
		int bno = Integer.parseInt(request.getParameter("bno")); 
		// 링크에서 선택한 게시물 가져오기
		Dao dao = new Dao();
		Board board = dao.get(bno);
		
		// 마약 로그인된 정보와 작성자가 동일할 경우 삭제 / 수정 표시 
		String loginid=(String)session.getAttribute("loginid");
		if(loginid!=null && loginid.equals(board.getWriter())){
		
			
	%>
		<a href="bupdate.jsp?bno=<%=board.getBno()%>"> 수정 </a>
		<a href="bdelete.jsp?bno=<%=board.getBno()%>"> 삭제 </a>
	<%
	}
	 %>

	<a href="main.jsp"> 목록보기 </a>
	
	<div> 제목 : <%=board.getTitle() %> </div>
	<div> 작성자 : <%=board.getWriter() %> </div>
	<div> 작성일 : <%=board.getDate() %></div>
	<div> 내용 : <%=board.getContent() %> </div>
	
	
</body>
</html>