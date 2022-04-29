<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

		request.setCharacterEncoding("UTF-8"); // 한글텍스트 요청
		String loginid =(String)session.getAttribute("loginid");
		
		
	  Dao memberDao = new Dao();
		boolean result = memberDao.delete(loginid);
	if (result){
		session.invalidate();
		response.sendRedirect("main.jsp");
		//response.sendRedirect ->클라이언트에게 페이지 응답(반환)
		
	
	}else{
		response.sendRedirect("getout.jsp");
		
	}
%>>