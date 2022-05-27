<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href = "/jspweb/css/chatting.css" rel="stylesheet"> 
	

</head>
<body>

	<%@include file ="../header.jsp" %>
	
	<div class= "container my-5"> <!--  박스권 --> 
	
		<div class= "col-sm-6 offset-3 chattingbox"> <!-- 채팅 관련 구역 -->
	
			<div class= "row">  <!--  하위 태그 가로배치 -->	
	<!-- js로 옮길곳    -->
				<div class= "col-sm-4"> <!--  접속자 목록 표시 구역 -->
					<h5 class="enter_title"> 접속자 목록 </h5> <!-- 타이틀 -->
					
					<div id ="enterlist">   <!--  접속된 정보 표시 -->
					
					</div>
					
					
					
				</div>
				
				<div class= "col-sm-8">	<!--  채팅 창 구역 -->
				<!-- ////////////////////////////////////////////////// -->
					<div id="contentbox" class="contentbox"> <!-- 메세지 표시 구역 -->
						
						<div class="secontent my-3"> <!--  보낼 때 -->
							<span class="date"> 오전 03:33  </span>
							<span class="content"> 하앍하앍 </span>
						</div>
						
						<div class="alarm"> <!-- 알람 메세지 구역 -->
							<span> 기묘한 니미 입장! 하여스미다 </span> 						
						</div>
						
						
						<div class="row g-0 my-3"> <!-- 부트스트랩  g-0 : div 간 여백 제거 -->
						 
							<div class="col-sm-1 mx-2"> <!-- 부트스트랩  mx-2 : margin -->
								<img alt="" src="../img/카톡프로필2.PNG" class="rounded-circle" width="100%">
							</div>
							
							<div class="col-sm-9">
								
								<div class="recontent"> <!-- 받을 때 메세지 구역 -->
									<div class="membername"> 기묘한 </div>
									<span class="content"> 후욹후욹 </span>
									<span class="date"> 오전 03:34 </span>
								</div>
								
							</div>
							
						</div>
						
						
						
					</div>
		<!-- ////////////////////////////////////////////////// -->
					<%
						String mid =(String)session.getAttribute("login");
					%>
		
					<input type="hidden" value="<%=mid%>" id="mid">
					
					<div class="row g-0"> <!--  입력 상자 혹은 전송 버튼 -->
						
						<div class="col-sm-10"> <!-- 입력 창 -->
							<textarea id="incontent" rows="3" cols="" class="form-control" onkeyup="enterkey('<%=mid%>')"> </textarea>
						</div>
						
						<div class="col-sm-2"> <!-- 전송 버튼-->
							<button class="form-control sendbtn" onclick="sendbtn('<%=mid%>')"> 전송 </button>
						</div>
						
					</div>
						
					<div class= "btnbox">
						<span> 이모티콘 </span>
						<span> 첨부파일 </span>
					</div>	
						
				</div>
	
			</div>	
	
		</div>
	</div>
	
	
	
	
	
	<script type="text/javascript" src = " /jspweb/js/chatting.js"></script>
	<%@include file ="../footer.jsp" %>
	
	
</body>
</html>