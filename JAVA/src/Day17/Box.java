package Day17;

public class Box<T> {
			//<제네릭타입>
			// <아무거나 : 자료형 이름>
	//필드
	private T t;
	
	
	
	
	
	
	
	
	// get 메소드
	public T get() {
		return t;
	}
	// set 메소드
	public void set(T t) {
		this.t=t;
	}
}
