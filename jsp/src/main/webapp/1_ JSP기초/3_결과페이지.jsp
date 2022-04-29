<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- 
    
    	전 페이지로부터 request(요청)	
    	request : 서블릿 클래스에서 제공해주는 내장 객체(미리 만들어진 객체)
    	request.getParameter("요청할 변수의 name값");
    -->
    
    <%
    	// 스크립트 문 = 자바 언어를 작성하고 실행 할 수 있는 공! 간! !!!!!!!!!
    	String 이름 = request.getParameter("name");
    	String 색상 = request.getParameter("color");
    	
    %>
    <html>
    	
    	<body style = "background-color: <%=색상%>">
    		작성할 이름 : <%= 이름 %><br>
    		선택한 색상 : <%= 색상 %><br>
    	
    	<br>
    	<!-- 
    		System.out.println(" 문제7) 줄수 : "); int line7 = scanner.nextInt();
				
			// 1. iteration 시작
			for (int i = 1 ; i<=line7 ;i++) {
			// 2-1. 공백 찍기
				for (int b=1; b<=line7-i;b++) {
				    System.out.print(" ");
				}
			// 2-2 별 찍기
				for (int s=1; s<=i*2-1;s++) {
				
					System.out.print("*");
					
				}
			System.out.println();	
				
			}
    	 -->
    	</body>
    
    </html>