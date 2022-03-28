package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day15_03 {
	// p.731~732 : LinkedLis
	//				ArrayList   			vs   LinkedList
	//					배열							링크
	//내부구조차이		인덱스기준으로 메모리 연결[통]		 서로 다른 메모리주소 연결
	// 속도
	//   add[추가]		빠름
	//	 add[삽입=중간]								빠름
	//   검색				빠름
	//   삭제[중간]											빠름
	
	
	
	
	public static void main(String[] args) {
	// 1. ArrayList 객체 선언 [ 제네릭 : String ]
	ArrayList<String> list1 = new ArrayList<>();
	// 2. LinkedList  객체 선언 [ 제네릭 : String ] 
	LinkedList<String> list2 = new LinkedList<>();
	
	// 3. 시간변수
	long starttime;
	long endtime;
	
	// 4. arraylist 객체에 10000개 객체를 삽입하는데 걸리는 시간 체크
	starttime=System.nanoTime(); // 현재시간 나노시간으로 호출
	for(int i=0;i<10000;i++) {
		list1.add(0,i+""); // 정수-> 문자열변환 : 1 String.valueOf(정수)  2. 정수+""
							// 문자열 -> 정수변환 : 1. Integer.parseInt(문자열) 
		
	}	
	endtime=System.nanoTime();	
	System.out.println("arraylist time :"+(endtime-starttime)+"ns");	
		
		
	// 5. linkedlist 객체에 10000개 객체를 삽입하는데 걸리는 시간 체크
	starttime=System.nanoTime(); // 현재시간 나노시간으로 호출
	starttime=System.nanoTime(); // 현재시간 나노시간으로 호출
	for(int i=0;i<10000;i++) {
		list2.add(0,i+"");  
							 
		
	}	
	endtime=System.nanoTime();	
	System.out.println("arraylist time :"+(endtime-starttime)+"ns");	
	
	
	
	
	
		
	}
}
