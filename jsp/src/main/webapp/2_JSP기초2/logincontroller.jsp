<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
	

			request.setCharacterEncoding("UTF-8");// 한글텍스트 요청
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
		  Dao dao = new Dao();
			boolean result = dao.login(id, password);
		if (result){
			
			
			session.setAttribute("loginid", id);
								//세션 이름=변수명, 세션값=값
			// 서블릿 내장 객체 : session 
				// 서버(톰캣) 내 메모리(필드) 생성 // 모든 페이지[파일]에서 접근 할 수 있는 메모리 -> 공통 메모리: static 
				// 브라우저 마다 메모리 별도 생성: 세션
				// 브라우저끼리 통신 : DB
			response.sendRedirect("main.jsp");
			//response.sendRedirect ->클라이언트에게 페이지 응답(반환)
		}else{
			response.sendRedirect("getout.jsp");
		}
	%>
