package Day17;

public class Product<제네릭타입1, 제네릭타입2> {
				//<외부로부터받을 자료형이름:아무거나>
	//필드
	private 제네릭타입1 kind; //Tv
	private 제네릭타입2 model;//String
	
	
	
	
	
	
	
	
	
	//get
	//set
	
	public 제네릭타입1 getKind() {
		return kind;
	}
	public void setKind(제네릭타입1 kind) {
		this.kind = kind;
	}
	public 제네릭타입2 getModel() {
		return model;
	}
	public void setModel(제네릭타입2 model) {
		this.model = model;
	}
	
	
	
	
	
	
	
	
}
