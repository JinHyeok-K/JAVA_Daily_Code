<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<!--  jsp :  html과 java를 동시에 작성하는 파일 -->
				<!-- html : <마크업> / java 태그 -->
	<h3> 선언문 태그 : 메모리 할당 [변수 생성, 객체 생성,메소드 실행 x, 메소드 선언o , 클래스 정의 O]</h3>
	<h3>스트립트 태그 : 자바 실행문 [변수 생성, 객체 생성,메소드 실행 o, 메소드 선언 x, 클래스 정의 O]</h3>
	<h3>표현식 태그 : 메모리 호출</h3>
	<!--  html 작성 공간 -->
	<p>html 에서 작성된 코드</p>
	
	<%!
		int 변수1 =10; 				// 변수 선언 가능
		Date date1 = new Date();	// 객체 선언 가능
	// 자바 언어가 작성할 수 있는 공간 [선언부 <%! % ]
	//System.out.print("jsp 파일에서 작성된 코오드으1" +변수1);
		int 함수1(){return 2;} 		// 함수o(인수와 반환이 있는 미리 작성된 코드)
		class 클래스1{				// 클래스 선언
			String 필드1 = "우서가살려죠";
		}
		클래스1 객체1 = new 클래스1(); 	// 사용자 정의 클래스 객체 생성O
	%>
	
	
	<%
	int 변수2 =20;
	Date date2 = new Date();
		// 자바 언어가 작성할 수 있는 공간 [ ]
		System.out.println("jsp 파일에서 생선된 변수 " + 변수2);
		System.out.println("jsp 파일에서 생성된 객체" +  date2);
		//int 함수2(){return 2;}
		class 클래스2{				// 클래스 선언
			String 필드2 = "우서가버리꺼야?";
		}
		클래스2 객체2 = new 클래스2(); 	// 사용자 정의 클래스
	%>
	
	
	
	<!--  이곳은 다시 html 구역이다 -->
	선언문의 변수 : <%= 변수1 %> <br>
	선언문의 객체 : <%= date1 %> <br>
	선언문의 함수 정의 : <%= 함수1()%> <br>
	선언문의 사용자 정의 객체 : : <%= 객체1.필드1%> <br>
	<hr>
	스크립트문의 변수  : <%= 변수2%> <br>
	스크립트문의 객체 : <%= date2%> <br>
	스크립트문의 함수 정의[x] :  <br>
	스크립트문의 사용자 정의 객체 : <%= 객체2.필드2%> <br>
</body>
</html>