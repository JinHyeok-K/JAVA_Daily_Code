<%@page import="Dao.Dao"%>
<%@page import="dto.Board"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    request.setCharacterEncoding("UTF-8"); // 요청 시 데이터 인코딩 타입 설정
        	String title = request.getParameter("title"); //제목
        	String content = request.getParameter("content"); //내용
        	String writer = (String)session.getAttribute("loginid"); //작성자 
    	    	// 작성자는 로그인 성공 시 세션에서 가져오기
    	    	// 세션 호출 시 기본 자료형이 object -> 꼭 형변환(1. 자동형변환 2.강제형변환)
        	
        	Date now = new Date(); // 현재 시스템 날짜/시간 
        	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷(모양)
        	String date = sf.format(now); //현재 날짜/시간 포맷(형변환)
        	
        	// 변수 -> 객체화
        	Board board = new Board(0,title,content,writer,date);
        	// dao
        	Dao dao = new Dao();
        	boolean result = dao.write(board);
        	if(result){
        		response.sendRedirect("main.jsp");
        	}
    %>
    