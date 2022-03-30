package Day19;

import java.util.TreeSet;

public class Day19_05 {

	public static void main(String[] args) {
		// p.753 : TreeSet class
			// 1. 하나의 객체 = 노드
			// 2. 각 노드는 최대 2개의자식 노드를 가질 수있다.
			// 3. 부모보다 작으면 왼쪽 자식 /부모보다 크면 오른쪽 자식
			// 4. 트리구조에서 가장 왼쪽에 있는 가장 작은값
			//				가장 오른쪽에 있는 가장 큰값
			// 5. TreeSet < 기본자료형 클래스 > :
			// 6. TreeSet < 사용자 정의 클래스 > : Comparable ,Comparator 사용
		
		
		
		// 1. TreeSet Class 객체 선언
		TreeSet<Integer> scores = new TreeSet<>();
		// 2. TreeSet 객체에 객체(요소) 추가
		System.out.println("자동정렬");
		scores.add(99); System.out.println("확인 : "+scores);
		scores.add(89);	System.out.println("확인 : "+scores);
		scores.add(79);	System.out.println("확인 : "+scores);
		scores.add(69);	System.out.println("확인 : "+scores);
		scores.add(59);	System.out.println("확인 : "+scores);
		scores.add(49);	System.out.println("확인 : "+scores);
		// 3. 
		System.out.println(scores.first()); // 가장 왼쪽노드 호출
		System.out.println(scores.last());  // 가장 오른쪽 노드 호출
		System.out.println(scores.lower(95)); // 95 기준으로 왼쪽노드 호출[95보다 작은] 
		System.out.println(scores.higher(95)); // 95 기준으로 오른쪽노드 호출[95보다 큰]
		System.out.println(scores.floor(95)); // 95 포함 기준을로 인쪽노드[95보다 같거나 작은 ]
		System.out.println(scores.ceiling(85));// 85 포함  기준으로 오른쪽노드[85보다 같거나 큰]
		// 4.
		System.out.println(scores.pollFirst()); // 가장 왼쪽노드 삭제 [가장 작은]
		System.out.println(scores.pollLast());// 가장 오른쪽노드 삭제 [ 가장 큰 ]
		System.out.println("확인 :"+scores);
		
		// 5. 오름차순 vs 내림차순
		// *오름차순[ x: 기본값(default) : 오름차순 ]
		System.out.println("기본[오름차순] :"+scores);
		// *내림차순[ .descendingSet() : 내림차순 ]
		System.out.println("정렬[내림차순] :"+scores.descendingSet());
		
		// 오름차순으로 하나씩 출력
		System.out.println("오름차순");
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		
		System.out.println("내림차순");
		// 내림차순으로 하나씩 출력
		for(Integer temp:scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
