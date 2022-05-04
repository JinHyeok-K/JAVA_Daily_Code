<%@page import="dto.Board"%>
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
    //1. 전 페이지로부터 게시물 번호 요청
	int bno= Integer.parseInt(request.getParameter("bno"));
    Dao dao = new Dao();	
    Board board = dao.get(bno);
	session.setAttribute("bno", bno);
    %>
	<form action="updatecontroller.jsp" method="get"> 
		<input type="text" name ="title" value="<%=board.getTitle() %>" >
		<textarea rows="5" cols="10" name="content"><%=board.getContent()%></textarea>
		<input type="submit" value="수정"> 
	</form>
	
</body>
</html>   
    
     
     