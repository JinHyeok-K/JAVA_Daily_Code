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
			
			
			<th> 
					<button onclick="#" class="">제품 삭제</button> 
					<button onclick="#" class="">제품 수정</button> 
					<button onclick="#" class="">상태 변경</button> 
					<button onclick="#" class="">재고 변경</button> 
				</th>
			
		<%	}%>	
		</tr>
	</table> 
	</div>
</body>
</html>