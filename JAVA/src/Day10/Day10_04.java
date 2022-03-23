package Day10;

import java.util.ArrayList;

public class Day10_04 {

	// 문법
	// 1. 입출력 2.변수 3.연산자 4.제어문/반복문 5.배열 6.클래스 7.인터페이스
	
	public static void main(String[] args) {
		// 배열	vs 리스트
		// 배열[인덱스 0부터 저장]
		String[] 배열 =new String[100];
		System.out.println("배열 : "+배열); // 메모리의 주소값
		배열[0]="우아오"; // 배열 [ 인덱스 ] : 인덱스 번호 기준으로 저장
		System.out.println("배열[0] : "+배열[0]); // 인덱스 출력 
		System.out.println("길이 : "+배열.length);
		
		
		
		// 리스트[ 클래스기반 배열 구조 ]
		ArrayList<String> 리스트이름 = new ArrayList<>();
		// ArrayList[자동완성]
			// <자료형> : 리스트에 저장할 자료형
			// 리스트명 : 아무거나
			// new : 메모리 할당 [ 객체 생성시 필수]
			// Arraylist<>() ; : 생성자
		System.out.println("리스트 : "+리스트이름); // 메모리 목록
		리스트이름.add("우우ㅜ"); // 리스트명.add(객체명) : 리스트에 객체 추가 메소드
		System.out.println("리스트[0] : "+리스트이름.get(0)); // 리스트명.get(인덱스) : 해당 인덱스 객체 호출 메소드(get)
		System.out.println("길이 : "+리스트이름.size());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////vv////////////////////////////////////////		
		
		// 배열 단점 : 메모리 할당 1번 => 메모리 크기는 고정 [메모리 효율성 떨어짐]
			// 회원배열 100개 => if 100명 초과하면 불가능
			// 회원배열 100개 => if 1명이면 나머지 99개 메모리 null(비효율)
		// 리스트 : 메모리 크기는 가변길이 [메모리 효율성 좋음]
			// 리스트의 기본길이 10 -> if 추가하거나 삭제하면 자동 메모리 할당
			// ex) 회원리스트 100개 -> 만일 100명 초과하면 길이가 추가
		// 		배열(문법) vs 리스트(클래스)
		// 		추가메소드X vs  추가메소드O
		//추가:배열명[인덱스]=값 vs 리스트명.add(값)
						//    삽입:리스트명.add(인덱스,값)
		//출력:배열명[인덱스]   vs 리스트명.get(인덱스)
		//삭제: null할당		vs 리스트명.remove(인덱스) 
						// 객체삭제 리스명.remove(특정객체) 특정객체 삭제 가능
			// 1 null 3		vs 1 3				 ex) 1 2 3 중 2 삭제 시
		//길이: 배열명.length  vs 리스트명.size()
		
		
		
		
		
		// 컬렉션[수집] 프레임워크[만들어진클래스]
		
	}
}
