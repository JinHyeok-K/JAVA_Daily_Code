package Day17;

public class Day17_01 {

	
	public static void main(String[] args) {
		
		// ���׸� :
			// ���� : public class Ŭ������<���׸��̸�>
			// ���� : �ܺηκ��� ���� �ڷ������� ���ο� �ش� �ڷ��� ���
		
		
		//p.658

		// 1. ��ü ����
		Box<String> box1= new Box<String>();
		// Ŭ������ String Ÿ�� �ֱ�
		box1.set("������");
		String str =box1.get();
		
		// 2. ��ü ����
		Box<Integer> box2 = new Box<>();
	//Ŭ������ Integer Ÿ�Գֱ�    // �� <��������>
		box2.set(6);
		int value =box2.get();
		
		
		//p.659
		//1. ��ü �����ϴµ� ���׸�Ÿ�Գֱ�
		Product<Tv, String> product1 =new Product<>();
		// 2. ��ü �� �ʵ忡 �� ���׸�Ÿ������ �� �ֱ�
		product1.setKind(new Tv());
		product1.setModel("����Ʈtv");
		// 3. ȣ��
		Tv tv = product1.getKind(); //����ȯ����
		String tvmodel = product1.getModel();
		
		
		// 1. ��ü �����ϴµ� ���׸�Ÿ�� �ֱ�
		Product<Car,String> product2 = new Product<>();
		// 2. ��ü��
		product2.setKind(new Car());
		product2.setModel("����");
		// 3. ȣ��
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		//
		Product<Integer, Double>product3 =new Product<>();
		
		
		
		
	}
}

