package Day16;

public class Day16_01 {
	
	public static void main(String[] args) {
		
		// ���׸�
		
		// p.656 �� ���׸� ��1)
		//1. Box ��ü ����
		Box box = new Box();
		//2. ��ä �� �޼ҵ� ȣ�� [�μ� : String ] : Object  ����
		box.set("�ǹ��Ǳ⵿��"); // => String -> Object  ok 
		//3 ��ü �� �޼ҵ� ȣ�� [ ��ȯ : Object ] 
//		String name =box.get(); // => Ojbect -> String X
		String name =(String)box.get(); 
		
			//�ڽ� ��ü -> �θ� ��ü [�ڵ� ����ȯ]
			//�θ� ��ü -> �ڽ� ��ü [�ڵ�X ����O]
		//4.
		box.set(new Apple()); // [ �μ� : Apple ]: Object  ����
								// ���Ŭ������ �ڵ������� Object Ŭ�������� ��ӹ���
		Apple apple = (Apple)box.get();
		
	}
}
