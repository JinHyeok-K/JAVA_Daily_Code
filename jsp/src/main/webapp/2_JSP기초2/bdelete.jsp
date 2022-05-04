<%@page import="dto.Board"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
	//1. 전 페이지로부터 게시물 번호 요청
	int bno= Integer.parseInt(request.getParameter("bno"));	
	//2. dao 게시물 삭제 메소드 호출
	  Dao dao = new Dao();
		boolean result = dao.board_delete(bno);
	//3. 삭제가 성공했으면
	if (result){
		//페이지 전환(메인으로)
		response.sendRedirect("main.jsp");
		//response.sendRedirect ->클라이언트에게 페이지 응답(반환)
	}
	
	%>

