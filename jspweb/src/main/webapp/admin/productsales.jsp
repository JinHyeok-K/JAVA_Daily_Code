<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
		
		#chartdiv {
		  width: 100%;
		  height: 500px;
		}
	</style>


</head>
<body>
  
  	<h3> 매 출 관 리</h3>
   
	<div class="container">
		<div> <!--  일 매출 차트 -->
			<div id="chartdiv1"> </div>
		</div>
	
		<div class="row">
			
			<div class="col-sm-6"> <!--  일 매출 테이블 -->
				주문 확정 리스트
			</div>
			
			<div class="col-sm-6"> <!--  카테고리별 차트 -->
			<div id="chartdiv2"> </div>
				차트2
			</div>
		</div>
	
		
		
		
	</div>

	<script type="text/javascript" src="/jspweb/js/productsales.js"></script>

</body>
</html>