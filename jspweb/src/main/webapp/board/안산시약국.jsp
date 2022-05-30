<%@page import="java.time.LocalTime"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 	<%@include file ="../header.jsp" %> 

	<div class="container">
	
	<%
	
		// * 공공 데이터 포털 [ web json 페이지를  -> JAVA 로 변환]
			//  1. URL 가져오기 [ URL : java.net 패키지  ]
			URL url = new URL("https://api.odcloud.kr/api/3035882/v1/uddi:5fae3cf5-bc15-4eba-87d8-8289b74e659b_201912202015?page=1&perPage=300&serviceKey=xHr1PMeKPkxLwuTQWPJ22J8buJpitmJTgjehLEkQmgxnArIbkfhd4oTvumHOtTifFbyg7gq%2B0kTIMhgzOmKLvA%3D%3D");
					//	1-1. URL class : JAVA 에서 HTTP URL 객채화
			//	2. JAVA 에서 해당 URL 읽기 [ 바이트 스트림 ]\
					//	2-1. BufferedReader : 외부 데이터 읽어올 때 사용되는 클래스 
			BufferedReader bf =new BufferedReader(new InputStreamReader (url.openStream(),"UTF-8"));
			//	3. 읽어오기
			String result = bf.readLine(); // 스트림 내 존재하는 바이트 모두 읽어오기 [ read() :한줄 씩 읽어오기 , readLine() : 전부 읽어오기]					
			//	4. 읽어온 스트림을 JSON 으로 변환
			JSONObject object = new JSONObject(result);
			//	5. JSON 객체에서 특정 키의 해당하는 데이터 가져오기
			
			JSONArray array = (JSONArray)object.get("data");   // #1
			//JSONArray array2 = new JSONArray(object.get("data").toString()); // #2 
			
			//System.out.print(array.toString());	
	
	%>
	
	<form action="안산시약국.jsp"> <!--  주소 검색 -->
		<input type="text" name="keyword" placeholder="주소">
		<input type="submit" value="검색">
	</form>
	
	<!-- 카카오지도를 표시할 div 입니다 -->
	<div id="map" style="width:100%;height:350px;"></div>
	
	
		<table class="table table-hover">
			<tr>
				<th> 약국명 </th> <th> 대표전화 </th>  <th> 주소 </th>  
				<th> 월요일운영 </th> <th> 화요일운영 </th>  <th> 수요일운영 </th>
				<th> 목요일운영 </th> <th> 금요일운영 </th>  <th> 토요일운영 </th>
				<th> 일요일운영 </th> <th> 공휴일운영 </th>  				
			</tr>		
		
	<%
	
	// 영업여부 [ 자바에서 요일 구하기 ]	
		// 1-1. Calendar : 달력 클래스 [ 현재(1900~9999) 날짜 / 시간 클래스]
		Calendar calendar = Calendar.getInstance();
				// 1-2. 요일 배열
		String[] 요일 = {"일","월","화","수","목","금","토"};
				// 1-3. 현재 요일 구하기
		String 현재요일 = 요일[calendar.get(Calendar.DAY_OF_WEEK)-1];
		
		
		// 2-1. 현재 시간 기준 -> 현재 시간 구하기
			// LocalTime : 시간 클래스
				// 1. LocalTime.of(시,분,초) : 시간 형식으로 형 변환
				// 2. LocalTime.now() : 현재 시간 구하기
		int hour = calendar.get(Calendar.HOUR_OF_DAY); // hour : 1시 | hour_of_day : 13시
		int minute =calendar.get(Calendar.MINUTE);
		
		LocalTime 현재시간 =  LocalTime.of(hour, minute, 0);
		//System.out.println(localTime);
	
		//LocalTime localTime2 = LocalTime.now();
		//System.out.println(localTime2);
	
	
		// JSON 출력
		for(int i = 0; i<array.length();i++){
			JSONObject jo = array.getJSONObject(i); // i 번째 json 객체
			String keyword = request.getParameter("keyword");
			
			// 검색
			if(keyword != null){ // 만약에 검색이 있을 경우
				int index = jo.get("주소").toString().indexOf(keyword);
				//System.out.println(index);			
				if(index== -1){ continue;} // -1 인덱스는 없다는 의미
			}
			
			
			// iterator : 인덱스가 없는(set) 리스트를 순회하는 인터페이스
			/* Iterator<JSONObject> iterator = jo.keys();
			while( iterator.hasNext()) {// hasnext() : 다음 객체가 있는지 확인 ->  무한루프 걸림
				String key = (String)jo.keys().next(); // next() :  다음 객체 호출
				if(key.equals(현재요일+"요일 운영")){ // 현재 요일과 동일한 키만 호출
					System.out.println(현재요일  +" : " + jo.get(key));
					jo.put("영업여부", jo.get(key)); // i 번째 json객체에 새로운 엔트리[키:값] 추가
				}
			}*/
			// 1. JSONObject.getNames(json객체) : 해당 json객체 내  모든 key 호출				
			String[] keys = JSONObject.getNames(jo);
			// 2. 영업 여부 저장하는 변수 선언
			String 영업여부 = "[영업 종료]";
			// 3. 모든 key 반복문 돌려기 
						for( String key : keys ){
							// 4. 만약에 해당 key가 현재 요일 과 같으면서 -(영업시간없다.) 아니면
							if( key.equals(현재요일+"요일 운영") && !jo.getString(key).equals("-") ){
								
								String[] 영업시간 = jo.getString(key).split("~");	//  ~ 기준으로 open , close
								System.out.println( 영업시간[0]  +" , " + 영업시간[1] );
								
								if(  Integer.parseInt(  영업시간[1].split(":")[0] ) <= 24 ){
									LocalTime 여는시간 =  LocalTime.of(  
											Integer.parseInt( 영업시간[0].split(":")[0] )    , 
											Integer.parseInt( 영업시간[0].split(":")[1] ) , 0 );
									
									LocalTime 닫는시간 =  LocalTime.of(  
											Integer.parseInt( 영업시간[1].split(":")[0] )    , 
											Integer.parseInt( 영업시간[1].split(":")[1] ) , 0 );
									
									if( 현재시간.isAfter(여는시간) ){ // 현재시간이 여는시간보다 이후이면 
										영업여부 = "영업중:"+jo.getString(key); // 5. 영업여부에 시간 넣어주기 
										// 닫는시간 
										if( 현재시간.isAfter(닫는시간) ){ // 현재시간이 닫는시간보다 이후이면
											System.out.println( 닫는시간 );
											영업여부 = "[영업종료]";
										}
									}else{
										영업여부 = "[영업종료]";
									}
									
								}
								
							}
						}
			
			
		%>
		
			<tr style="font-size:13px;" onclick="map('<%=jo.get("주소") %> ','<%=jo.get("약국명") %>','<%=영업여부%>')">
				<td> <%=jo.get("약국명") %></td> <td> <%=jo.get("대표전화") %></td>  <td> <%=jo.get("주소") %> </td>  
				<td> <%=jo.get("월요일 운영") %> </td> <td> <%=jo.get("화요일 운영") %></td>  <td><%=jo.get("수요일 운영") %> </td>
				<td> <%=jo.get("목요일 운영") %></td> <td><%=jo.get("금요일 운영") %></td>  <td><%=jo.get("토요일 운영") %></td>
				<td><%=jo.get("일요일 운영") %></td> <td><%=jo.get("공휴일 운영") %></td>  				
			</tr>	
		
		<%}
	
	%>
	</table>
	</div>
	
	<!-- services와 clusterer, drawing 라이브러리 불러오기 -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fdf27d5369aed85e3a46908d8def61cb&libraries=services,clusterer,drawing"></script>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fdf27d5369aed85e3a46908d8def61cb"></script><script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fdf27d5369aed85e3a46908d8def61cb"></script>
	
	
	<script type="text/javascript" src="/jspweb/js/kakaomap.js"></script>
	
	<%@include file ="../footer.jsp" %> 
	
</body>
</html>



















