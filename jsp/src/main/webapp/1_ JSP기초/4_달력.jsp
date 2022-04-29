<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% //자바언어 작성 공간 
			// form 이 전송하기전에는 요청할 수 가 없.다. [null]
					
		Calendar calendar = Calendar.getInstance(); 			
				// 1. 현재 달력 가져오기	
		int year = calendar.get(Calendar.YEAR) ; // 1-1 현재 연도
		int month = calendar.get(Calendar.MONTH)+1 ; // 1-2 현재 월
		boolean ch =false; // 출력 가능 달력이면   false 
		if( request.getParameter("year") !=null &&
				request.getParameter("month") !=null){
			//2. 요청 변수가 있을 경우 [요청변수가  null 이 아니면]
		year  = Integer.parseInt(request.getParameter("year")); // 2-1. form 에서 입력받은 값을 요청
		month = Integer.parseInt(request.getParameter("month")); // 2-2. form 에서 입력받은 값을 요청
			// 만약에 월이 1미만이면 연도 1감소 월 12 로설정
			if(month<1){
				month=12; year--;
			}
			// 만약에 월이 12 초과이면 연도 1증가 월 1로설정
			if(month>12){
				month=1; year++;
			}
			// 지원 불가 달력이면 (1900년도 이하)
			
			if(year< 1900 || year>2300|| month < 0 || month >12){
				ch = true; // 출력 불가능 달력이면 true 
			}
		}else{ // 요청 변수가 없을 경우 [요청 변수가 null 이면]
			
		}
		
		// 3. 입력받은 값으로 달력 설정
		calendar.set(year, month-1,1); //month-1 차감하는 이유 : 캘린더가 0이 1  0:1월 ~ 11:12월
		int sweek = calendar.get(Calendar.DAY_OF_WEEK);	     // 해당 월의 시작 요일 구하기
		int eday  = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 	     // 해당 월의 마지막 일 구하기
	%>
	
	<!--  html 작성 공간 -->
	<%
		if(ch== true){
	%>
		<div> 표 현 할 수 없 는 달 력 입 니 다.</div>
		<%} %>
	
	<form action="4_달력.jsp" method="get">
		<!--  action = "폼이 전송될 위치(파일명)" -->
		
		<input type="text" name="year" placeholder="연도">
		<input type="text" name="month" placeholder="월">
		<input type="submit" value="검색">	
	</form>
	<p> 입력한 연도 : <%= year %></p>
	<p> 입력한 월 : <%= month %></p>
	
	<form action="4_달력.jsp" method="get">
	<input type="submit" value = " 이전 ">
		<input type="text" name = "year" value="<%=year %>" >
		<input type="text" name="month" value="<%=month-1 %>">
	
	</form>
	&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<form action="4_달력.jsp" method="get">
		<input type="text" name = "year" value="<%=year %>" >
		<input type="text" name="month" value="<%=month+1 %>" >
		
		<input type="submit" value = " 다음 ">
	</form> 
	
	
	
	<table>
		<tr>
			<th> 일요일 </th>
			<th> 월요일 </th>
			<th> 화요일 </th>
			<th> 수요일 </th>
			<th> 목요일 </th>
			<th> 금요일 </th>
			<th> 토요일 </th>			
		</tr>
		<tr>
			<!--  시작 요일(2022/4기준=>6) 미만 공백으로 채움  -->
			<% for(int i = 1; i<sweek ; i++){	%>
				<td> </td>
				
			<% }%>
			<!--  1일부터 마지막 일 까지 1씩 증가하면서 출력 -->
			<% for(int i = 1; i<=eday ; i++){	%>
				<td> <%=i %> </td>
				<!--  7배수 마다 줄바꿈 [토요일 마다] -->
				<% if(sweek % 7 == 0){ %>
					</tr> <tr>
				<%} %>
				
				<% sweek++; %> <!--   -->
			<% }%>	
		</tr>
		
		
	</table>
	
</body>
</html>