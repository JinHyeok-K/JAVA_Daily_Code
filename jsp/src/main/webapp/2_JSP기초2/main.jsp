<%@page import="Dto.Board"%>
<%@page import="java.util.ArrayList"%>
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
	<h3> 회원제 게시판 </h3>
	<a href="signup.jsp"> <button>회원가입</button></a> 
	
	
	
	<%
		String loginid =(String)session.getAttribute("loginid");
		if(loginid!=null){ // 세션이 있으면 로그인 성공
	%>	
	<a href="write.jsp">  <button>글쓰기</button></a>
			<div> <%=loginid %>님 안녕하슈 </div>
			<a href="logout.jsp"><button>로그아웃</button></a>
			
			<a href="delete.jsp"><button>회원탈퇴</button></a>
		
	<%}else{ //세션이 없으면 로그인실패 %>
		 <form action ="logincontroller.jsp" method="post">
			<input type="text" name="id">
			<input type="password" name="password">
			<input type="submit" value = " 로 그 인 ">
		</form>
		
		
 	<%	
		}
	%>
	
	
	<table>
		<tr>
			<th> 번호 </th> <th> 작성일 </th> <th> 작성자 </th> <th> 제목 </th> 
				
		</tr>
		<!-- 반복문 -->
		<%
			Dao dao = new Dao();
			ArrayList<Board> boardlist= dao.list();
			for(Board temp : boardlist){
		%>
		<tr>
			<td><%=temp.getBno() %></td>
			<td><%=temp.getDate()%></td>
			<td><%=temp.getWriter()%></td>
			<td><a href="view.jsp?bno=<%=temp.getBno()%>">
				<%=temp.getTitle()%></a></td>
				
				<!-- href ="파일명?변수명=값" get 방식 -->
		</tr>
		<%} %>
	</table>
	
</body>
</html>