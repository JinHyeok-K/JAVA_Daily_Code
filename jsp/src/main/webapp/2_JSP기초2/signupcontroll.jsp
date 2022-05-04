<%@page import="org.apache.catalina.filters.SetCharacterEncodingFilter"%>
<%@page import="Dao.Dao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <%
   

      		// 컨트롤 페이지로 사용
      		
      		// request : 요청 [ 서버가 -> 클라이언트 ]
      				// 요청 시 사용되는 인코딩( 서블릿 -> 외국서 제작: 영문 자동 인코딩)
      				// 요청 시 사용되는 한글 인코딩 변환
     			request.setCharacterEncoding("UTF-8");
   
      
      
   	  		String id= request.getParameter("id");		
   		    String password = request.getParameter("password");
   		    String name = request.getParameter("name");
   		    
   		    // 변수 3개 ->객체화(DTO)
   	    Member member = new Member(0, id, password, name);
   		    // 객체(DTO)) -> DAO(DB)
   		Dao memberDao = new Dao();
   		    // DAO 메소드에 dto 넣기 (dao 가입메소드 실행)
   	    boolean result =  memberDao.signup(member);
   		if(result){
   	response.sendRedirect("main.jsp");
   	// responese(응답)
   	//response.sendRedirect ("이동할 페이지")
   		}else{
   	
   		}
   %>
    