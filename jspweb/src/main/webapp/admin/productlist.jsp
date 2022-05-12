<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
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
	//		int bno = Integer.parseInt( request.getParameter("bno") );		// 게시물번호
		//	String mid = (String)session.getAttribute("login"); 			// 세션 = 로그인된 아이디 
			
			// 조회수 중복방지 세션이 존재하지 않으면 
			
		//ArrayList<Board> boardlist = 
		//BoardDao.getBoardDao().getboardlist(startrow,listsize,key,keyword);
			
	%>
	<div class = "container ">
	<h3> 제품 목록 페이지</h3>
	
	<table class="table table-hover">
		<tr>
		
			<th> 제품번호 </th> <th> 대표이미지 </th> <th> 제품명 </th> <th> 가격 </th>
			<th> 할인율 </th> <th> 판매금액(실판매금액) </th> <th> 제품상태 </th> <th> 카테고리 </th>
			<th> 색상 </th> <th> 사이즈 </th> <th> 재고수량 </th> <th> 수정일 </th>
			<th> 비고 </th>
			
			<%
				ArrayList<Product> productlist =
					ProductDao.getProductDao().getproductlist();
				
				for( Product product : productlist){
				
				
		%>
				
		</tr> 
		<tr>
			<th><%=product.getPno() %> </th>
			<th><%=product.getPimg() %> </th>
			<th><%=product.getPname() %> </th>
			<th><%=product.getPprice() %> </th>
			<th><%=product.getPdiscount() %> </th>
			<th><%=(product.getPprice()*product.getPdiscount())  %> </th>
			<%if(product.getPactive()==0){ %>
			<th> 준비 중 </th>
				<%}else if(product.getPactive()==1){%>
			<th> 판매 중 </th>
				<%}else { %>
			<th> 재고 준비 중</th>
				<%} %>	
			<th><%=product.getCno() %> </th>
		
			<th> - </th> <th> - </th> <th> - </th> <th> - </th>
			<th> - </th>
		<%	}%>	
		</tr>
	</table> 
	</div>
</body>
</html>