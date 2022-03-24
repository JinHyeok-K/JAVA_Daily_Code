package Day16;

public class Day16_01 {
	
	public static void main(String[] args) {
		
		// 제네릭
		
		// p.656 비 제네릭 예1)
		//1. Box 객체 생성
		Box box = new Box();
		//2. 객채 내 메소드 호출 [인수 : String ] : Object  가능
		box.set("맨발의기동이"); // => String -> Object  ok 
		//3 객체 내 메소드 호출 [ 반환 : Object ] 
//		String name =box.get(); // => Ojbect -> String X
		String name =(String)box.get(); 
		
			//자식 객체 -> 부모 객체 [자동 형변환]
			//부모 객체 -> 자식 객체 [자동X 강제O]
		//4.
		box.set(new Apple()); // [ 인수 : Apple ]: Object  가능
								// 모든클래스는 자동적으로 Object 클래스에게 상속받음
		Apple apple = (Apple)box.get();
		
	}
}
