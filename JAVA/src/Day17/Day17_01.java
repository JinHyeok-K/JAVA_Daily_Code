package Day17;

public class Day17_01 {

	
	public static void main(String[] args) {
		
		// 제네릭 :
			// 선언 : public class 클래스명<제네릭이름>
			// 목적 : 외부로부터 받은 자료형으로 내부에 해당 자료형 사용
		
		
		//p.658

		// 1. 객체 생성
		Box<String> box1= new Box<String>();
		// 클래스에 String 타입 넣기
		box1.set("ㅎㄱㄷ");
		String str =box1.get();
		
		// 2. 객체 생성
		Box<Integer> box2 = new Box<>();
	//클래스에 Integer 타입넣기    // 뒤 <생략가능>
		box2.set(6);
		int value =box2.get();
		
		
		//p.659
		//1. 객체 생성하는데 제네릭타입넣기
		Product<Tv, String> product1 =new Product<>();
		// 2. 객체 내 필드에 각 제네릭타입으로 값 넣기
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		// 3. 호출
		Tv tv = product1.getKind(); //형변환없다
		String tvmodel = product1.getModel();
		
		
		// 1. 객체 생성하는데 제네릭타입 넣기
		Product<Car,String> product2 = new Product<>();
		// 2. 객체내
		product2.setKind(new Car());
		product2.setModel("디젤");
		// 3. 호출
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		//
		Product<Integer, Double>product3 =new Product<>();
		
		
		
		
	}
}

