<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	// session.invalidate(); // 모든 세션 초기화
    	session.setAttribute("loginid", null); 	//java 는 null 값 자동 관리
    	// 페이지 전 환
    	response.sendRedirect("main.jsp");
    	
    %>
    