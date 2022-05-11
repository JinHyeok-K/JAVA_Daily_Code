<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<%@include file ="../header.jsp" %>

	<div class="container">
	
<!------------------------------ 검색 처리 구역 ---------------------->
<%
		request.setCharacterEncoding("UTF-8"); // 한글 인코딩 타입 설정
		//검색에서 입력받은 데이터 요청
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		
	/*	// 세션을 이용한 검색처리 저장
		session.setAttribute("key", key);
		session.setAttribute("keyword", keyword);
		*/
		
			// 검색이 있을 경우
			if(key!=null && keyword !=null){
				session.setAttribute("key", key); // 세션설정 [세션명,세션데이터]	
				session.setAttribute("keyword", keyword);
			}else{ // 검색이 없을 경우
				key = (String)session.getAttribute("key"); // 세션 호출 [세션명 -> 세션데이터]
				keyword = (String)session.getAttribute("keyword"); // 세션 호출 [세션명 -> 세션데이터]
			}
		
		
		%>	 
<!------------------------------ 페이징 계산 처리 ---------------------->		
<!-- 	1. pagenum : 현재 페이지 번호
	2. totalrow : 총 게시물 수
	3. pagesize : 페이지 당 표시할 게시물 수
	 -->	 
<%
	//1. 게시물 전체 갯수 ( 최종 페이지 구하기)
	int totalrow = BoardDao.getBoardDao().gettotalrow(key,keyword);
	
	//2. 현재 페이지 번호
	int currentpage =1;
		// *요청받은 페이지 번호 ()<- 페이지 입력 )
		String pagenum = request.getParameter("pagenum");
		if(pagenum==null){ // 만약에 페이지 요청이 없으면 1페이지
			currentpage = 1 ;
		}else{
			currentpage =  Integer.parseInt(pagenum); // 요청된 페이지번호 -> 정수형 변환 => 현재페이지 설정
		}
	
	
	//3. 페이지당 게시물 표시할 갯수
	int listsize= 5; // 추후에 사용자에게 혹은 관리자에게 입력 받기 
	
	// 4. 페이지당 게시물의 시작번호
	int startrow = (currentpage-1)*listsize;
		// 1v페이지 = > 0 // 2페이지 -> 5 // 3페이지 -> 10~~~
	
	//5.  마지막 페이지 번호
	int lastpage; //
	if(totalrow % listsize==0){ // 나머지가 없으면 [전체 게시물 /화면표시게시물 수 나누기 했을 때 나머지가 0이면]
			lastpage = totalrow/listsize;
	}else{
		lastpage = totalrow/listsize+1; // 나머지가 있으면 나머지 게시물을 표시 할 페이지 +1
	}
	
	// 6-1 : 페이징 표시 갯수
	int btnsize = 5; // 추후 관리자 입력
	
	// 6-2. 페이징 버튼의 시작 번호
	int startbtn = ( (currentpage-1) / btnsize ) * btnsize +1;
			// 예) currentpage가 1 : -> 1-1->0/5->0*5=>0 +1 => 1
				//  currentpage 2 : -> 1  ---------> 1
				//  currentpage 5 : -> 5  ---------> 1
				//  currentpage 6 : 6-1 -> 5/5 -> 1 * 5 -> 5+1 -> 6
				//  currentpage 10 : 10-1 -> 9/5 -> 1*5 -> 5+1 -> 6
				//  currentpage 12 : 12-1 ->11/5 -> 2*5 -> 10+1 -> 11
	// 7. 페이징 버튼의 끝번호
	int endbtn = startbtn+(btnsize-1);
	if(endbtn>lastpage ) endbtn=lastpage; 
	// 만약 페이징 버튼이 마지막 페이지 번호 보다 커지면 페이징 버튼의 마지막 페이지 번호 설정
	
	
	// 1. 모든 게시물  호출 
	ArrayList<Board> boardlist = 
		BoardDao.getBoardDao().getboardlist(startrow,listsize,key,keyword);
%>	 
		
		<h3 class="boardlist_title"> 자유게시판 </h3>

		
		
		<!-- ---------------------------전체글 인기글 구역 -->
		<div class="row boardlist_topbtn">
			<div class="col-md-1 offset-10">
				<a href="boardlist.jsp?key=&keyword="><button class="form-control">전체글</button></a>
			</div>
			<div class="col-md-1">
				<button class="form-control">인기글</button>
			</div>
		</div>
		
		
		<table class="table table-hover text-center"> <!-- 테이블 -->
			<tr>
				<th width="10%"> 번호 </th> 
				<th width="50%"> 제목 </th> 
				<th width="20%"> 작성자 </th> 
				<th width="10%"> 조회수  </th> 
				<th width="20%"> 작성일 </th> 
			</tr>
			<!-- for 문 -->
			<%
			
				for( Board board : boardlist ){
			
			%>
				<!-- 
					행을 클릭했을때[ js ]   
						<tr onclick="location.href='boardview.jsp'">
					*링크 [ 식별 번호 같이 이동 ] 
						// 1. HTML : <a href='파일명(경로).jsp?변수명=값'">
						// 2. JS : "location.href='파일명(경로).jsp?변수명=값'"
						// 3. java : response.sendRedirect("파일명(경로).jsp?변수명=값");
				-->
				<tr>
					<td> <%=board.getBno() %> </td>
					<td  style="text-align: left;"> 
							<a href="boardview.jsp?bno=<%=board.getBno()%>">
								<%=board.getBtitle() %>
							</a> 
					</td>
					<td> <%=board.getMid() %> </td>
					<td> <%=board.getBview() %> </td>
					<td> <%=board.getBdate() %> </td>
				</tr>
			<%
				}
			%>
			
		
			
		</table>
		
		
		
	<!-- ---------------------- 글쓰기 버튼 구역 -------------------------- -->
		<div class="col-md-2 offset-10">
		<% String mid = (String)session.getAttribute("login");
			if( mid != null ){  
		%>
			<a href="boardwrite.jsp"> <button class="form-control">글쓰기</button> </a>
		<%}else{ %>
			<span>*로그인후 글쓰기 가능합니다.</span>
		<%} %>
		</div>

<!-- ---------------------------페이징 처리 구역 -->
	<!--  <div>
	 	<ul class="nav">
	 		<li style="margin: 10px; display:inline;"> 이전 </li>
	 		<li style="margin: 10px; display:inline;"> 1 </li>
	 		<li style="margin: 10px; display:inline;"> 2 </li>
	 		<li style="margin: 10px; display:inline;"> 3 </li>
	 		<li style="margin: 10px; display:inline;"> 4 </li>
	 		<li style="margin: 10px; display:inline;"> 5 </li>
	 		<li style="margin: 10px; display:inline;"> 다음 </li>	 		
	 	</ul>
	 </div>
	  -->
	  <!--------------------------  페이지 입력 ---------------------- --> 
	  <!-- 부트스트랩 버전 -->
	 <div class= "col-md-4 offset-4 d-flex justify-content-center ">
	 								<!-- d-flex justify-content-center: 박스권 내에서 센터로 이동 -->
	 	<ul class="pagination">
	 	<!-- 이전 버튼> -->
	 	<%if(currentpage==1) {%>
	 		<li class="page-item disabled" >
	 			<a class="page-link pagenum" href="boardlist.jsp"> 
	 			이전</a> 
 			</li>
		<%} else{ %>
				<li class="page-item">
	 			<a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=currentpage-1%>"> 
	 			이전</a> 
				</li>
		<%} %>
 			<% for (int i = startbtn; i<=endbtn; i++){ %>
		 		<li class="page-item"><a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=i%>"> 
		 			<%=i %></a> 
	 			</li>
	 		<%} %>
	 	<!-- 다음 버튼> -->
	 	<% if(currentpage == lastpage && currentpage>=endbtn) {%>	
	 		<li class="page-item disabled"><a class="page-link pagenum" href="boardlist.jsp"> 다음</a> </li>
	 		<%}else{ %>
	 		<li class="page-item"><a class="page-link pagenum" href="boardlist.jsp?pagenum=<%=currentpage+1%>"> 다음</a> </li>
	 		<%} %>
		</ul>
	 </div>
	 
	
<!-- ---------------------------검색 입력 구역 -->

		<form action="boardlist.jsp?pagenum=<%=currentpage%>" class="col-md-4 offset-4 d-flex justify-content-center">
			<div class="col-md-3 " > <!-- 키워드 선택 -->
				<select class="form-select" name="key">
					<option value="btitle"> 제목 </option> <!--  key = 필드명 -->
					<option value="bcontent"> 내용 </option>
					<option value="mid"> 작성자 </option>
				</select>
			</div>
			<div class="col-md-5"> <!-- 검색 =키워드 입력창 -->
				<input type="text" class="form-control" name="keyword"> <!-- 키워드 명 -->
			</div>
			<div class="col-md-2"> <!-- 검색 버튼 -->
				<input type="submit" class="form-control" value="검색">
			</div>
		
		</form> 












<!-- ----------------------------------->
	</div>
	<%@include file ="../footer.jsp" %>
</body>
</html>