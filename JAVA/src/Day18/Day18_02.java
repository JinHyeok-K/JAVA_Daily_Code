package Day18;

import java.util.Vector;

public class Day18_02 {
	public static void main(String[] args) {
		// p. 730
		// 			Arraylist  vs  Vector
		// 동기화			X			 O
		// 스레드    싱글스레드(main)		멀티스레드(Thread, Runnable)
		
		
		//Vector 클래스
		//1. Vector 리스트개게 선언
		Vector<Board> list = new Vector<>();
		//2. 리스트 객체 내 추가
			// 1. 리스트 내 객체 바로 추가 new : 객체 메모리 할당
		list.add(new Board("제목1", "내용1", "작가1"));
			// 2. 객체 생성 후 리스트 내 객체 추가
		Board board = new Board("제목2", "내용1", "작가1");
		list.add(board);
		
		list.add(new Board("제목3", "내용3", "작가3"));
		list.add(new Board("제목4", "내용4", "작가4"));
		list.add(new Board("제목5", "내용5", "작가5"));
		
		System.out.println("확인 : "+list);
		
		// 3. 검색 
		System.out.println("객체 검색 : "+ list.contains(board));
		System.out.println("객체 위치 : "+ list.indexOf(board));
		// 4. 삭제 [ 삭세된인덱스 뒤로 한칸 씩 당기기 ] 
		list.remove(2); System.out.println("2번 index 삭제 후  : "+list);
		list.remove(2); System.out.println("2번 index 삭제 후  : "+list);
		// * 반복문 이용한 리스트 객체 내 모든 요소를 출력
		for(int i =0 ; i<list.size();i++) {
			Board temp = list.get(i);
			System.out.println(temp.제목+)
			
			
			
			
			
		}
		
		
	}
}
