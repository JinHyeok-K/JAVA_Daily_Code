package Day18;

import java.util.ArrayList;

public class Day18_01 {
	//p.722: 컬렉션 프레임워크
		//여러개 객체를 추가,검색,삭제 -> 배열
		//배열 문제점 : 
			// 1. 불특정 다수의 객체를 저장 불가 [ 길이를 크게 설정 => 비 효율적 ]
			// 2. 삭제했을 때 듬성듬성 빠진 옥수수 [ 삭제 시 인덱스 빈 현상 ]
		// 객체들을 효휼[!!]적으로 추가, 삭제, 검색 => 컬렉션 프레임 워크
	 	// 컬렉션 : 수집		프레임워크 : 사용 방법을 미리 정해 놓은 라이브러리
		// * 저장(수집) 관련 클래스/인터페이스
	// 1. List 인터페이스
		// 1. Arraylist 클래스
		// 2. Vector 클래스
		// 3. LinkedList 클래스
	
	// 2. Set
		// 1. HashSet 클래스
		// 2. TreeSet 클래스
	
	// 3. Map
		// 1. HashMap 클래스
		// 2. Hashtable 클래스
		// 3. TreeMap 클래스
		// 4. Properties 클래스
	
	
	
		public static void main(String[] args) {
		
			// p.728 :ArrayList 클래스
			// 배열과 유사 하지만 길이(저장수)가 가변[ 자동 ]
			// 다양한 메소드 제공
				// 1. 리스트객체명.add( 객채명 ) : 해당 객체를 리스트  객체 내 추가 [비어있는 마지막 인덱스]
				// *  리스트객체명.add( index, 객채명 ) : 해당 인덱스에 객체를 리스트객체 내 삽입 [ 기존 index는 뒤로 증가(index+1) (1->2) ]
				// 2. 리스트객체명.get( index ) : 리스트객체 내 해당 인덱스 객체 호출
				// 3. 리스트객체명.remove(index) : 리스트객체 내 해당 인덱스 객체 삭제 [삭제된 index 뒤로 index-1 ]
				// *  리스트객체명.remove(객체명) : 리스트객체 내 해당 객체 삭제
				// 4. 리스트객체명.clear() : 리스트 객체 내 모든 객체 비우기(삭제)
				// 5. 리스트객체명.size() : 리스트 객체 내 객체 수[길이]
				// 6. 리스트객체명.isEmpty() : 리스트객체 내 비어있는지 확인 [ 리스트 객체 내 객체 1개도 없으면 true | 1개 이상이면 false ] 
				// 7. 리스트객체명.contains( 객체명 ) : 리스트 객체 내 해당 객체 존재 여부 확인 [ True / false ]
				// 8. 리스트객체명.indexOf( 객체명 ) : 리스트객체 내 해당 객체의 인덱스번호 고지
			
			// 1. 리스트 클래스로 객체 선언 [ 리스트 안에 저장할 항목의 자료형 => 제네릭 (Day17) ]
			ArrayList<String> list = new ArrayList<>();
				// 1. ArrayList : 리스트 클래스
					// 2. < 제네릭 > : 클래스 내부에 들어가는 자료형
						// 3. list : 리스트 객체명(아무거나)
							// 4. new ArrayList<제네릭 = 생략가능>(길이=생략가능=10) ; // 생성자
			// 2. 리스트객체명.add(객체명=제네릭타입) : 리스트 객체 내 요소 추가
			list.add("java"); // index 0
			list.add("jdbc"); // index 1
			list.add("servlet/jsp"); // index 2
				// * 확인
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			
			list.add(2, "Database"); // index 2 에 요소추가 [기존 인덱스2 => 인덱스3 ]
			System.out.println( " 특정 인덱스에 추가 후 요소들 확인 :" + list);
			
			list.add("iBatis");
			
			//3. 리스트 객체명.size() : 리스트 객체 내 요소들의 갯수 [ 길이 ]
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			System.out.println(" 리스트 내 요소들의 갯수 : "+ list.size());
			
			//4. 리스트 객체명.get ( index ) : 리스트 객체 내 특정 index의 요소 호출
			System.out.println(" 리스트 내 요소 들 확인 : "+list.get(2));
			
			//5. 반복문 활용 [ 리스트와 반복문 같이 사용 ] : index가 필요 할 때
			for ( int i = 0 ; i <list.size();i++) { // i(index) 는 0부터 리스트 객체 내 총길이 까지 1씩 증가반복
				String str =list.get(i); //  i 번째 인덱스 요소를 호출해서 저장
				System.out.println(i+":"+str);// 출력
				
			}
			//	* 반복문 활용 
			int i =0;
			for(String str:list) { // index 없이 요소들을 하나씩 사용
				System.out.println(i+":"+str);
				i++;
			}
			
			
			// 6. 리스트객체명.remove(index/요소(객체직접))
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			list.remove(2); // 2번 인덱스 삭지
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			list.remove(2); // 2번 인덱스 삭지
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			list.remove("iBatis");
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
			list.clear();
			System.out.println(" 리스트 내 요소 들 확인 : "+list);
		}
	
	
	
	
	
	
	
	
	
	
}
