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


	
	<h3> 제품 목록 페이지</h3>
	
	<table id="producttable" class="table table-hover">
		<tr>
		
			<th width="5%"> 제품번호 </th> <th width="5%"> 대표이미지         </th> <th width="5%"> 제품명 </th> <th width="5%"> 가격 </th>
			<th width="5%"> 할인율   </th> <th width="5%"> 판매금액(실판매금액) </th> <th width="5%"> 제품상태 </th> <th width="5%"> 카테고리 </th>
			<th width="5%"> 색상    </th> <th width="5%"> 사이즈           </th> <th width="5%"> 재고수량 </th> <th width="5%"> 수정일 </th>
			<th width="5%"> 비고 </th>
		</tr>	
			<%
				ArrayList<Product> productlist =
					ProductDao.getProductDao().getproductlist();
				
				for( Product product : productlist){
			%>
				
		 
		<tr>
			<th><%=product.getPno() %> </th> 
			<th><img width="100%" src="/jspweb/admin/productimg/<%=product.getPimg()%>"></th> 
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
					<button onclick="pnomove(<%=product.getPno() %>)" data-bs-toggle="modal" data-bs-target="#activemodal">상태 변경</button> 
					<button onclick="#" class="">재고 변경</button> 
			</th>
			
		<%	}%>	
		</tr>
	</table> 
	<!-- 상태변경 부트스트랩 - 모달구역  -->
	<div class="modal" tabindex="-1" id="activemodal">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">  <!-- 모달 제목 -->
	        <h5 class="modal-title"> 제품의 상태변경 </h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">  <!-- 모달 내용  -->
	        <p> 변경할 상태를 선택해주세요. </p>
	        <input type="hidden" id="modelinput">
	      </div>
	      <div class="modal-footer"> <!-- 모달 버튼 -->
	      		<button type="button" class="btn btn-primary" onclick="activechange(0)">준비</button>
	      		<button type="button" class="btn btn-primary" onclick="activechange(1)">판매</button>
	      		<button type="button" class="btn btn-primary" onclick="activechange(2)">품절</button>
	      		<button type="button" class="btn btn-primary" onclick="activechange(3)">중단</button>
	        	<button id="modalclosebtn" type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<script src="/jspweb/js/productlist.js" type="text/javascript"></script>

</body>
</html>