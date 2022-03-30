package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_01 {
	public static void main(String[] args) {
	
		
		
		
		
		
		
		// 2. Set �÷���
			// * �ε��������� ( ������������⶧���� �ڵ����� ��ü�� �ߺ��Ұ���)
			// 1. HashSet Ŭ����
				// 1. .add(��ü��): set ��ü �� ��ü(���) �߰�
				// 2. .size() : set ��ü �� ��ü(���) ����
				// 3. .iterator() : set ��ü ��ȸ �޼ҵ�
					// * Iterator<���׸�> �������̽��� : �������� ��ü ��ȸ �������̽�
					// * Iterator<���׸�> iterator = set.iterator();
					//		1. iterator.hasnext() : ���� ��ü ���� ���� Ȯ��
					// 		2. iterator.next() : ���� ��� ��������
					// or
					// for(�ӽð�ü�� : set��ü��) {}
				// 4. .remove(��ü��) : set ��ü �� ��ü ����
				// 5. .clear() : set ��ü �� ��ü ��ü ����
		
		
		
		
		
		
		
		
		//p737
		//	1. HashSet Ŭ������ ��ü ����
		HashSet<String> set = new HashSet<>();
		// 1. HashSet : �ä����� �����ӿ�ũ Ŭ����
			// 2. <���׸�> : Set Ŭ���� �ȿ� ���� �ڷ���
				// 3. ��ü��(�ƹ��ų�)
					//4. new : ��ü ���� �� �޸� �Ҵ�
						//5. HashSet<���׸�:��������>():������
		// 2. set ��ä �� ��ü �ֱ� [set��ü��.add(��ü��)];
		
		set.add("java"); System.out.println("Ȯ�� : "+ set);
		set.add("jdbc"); System.out.println("Ȯ�� : "+ set);
		set.add("Servlet/JSP"); System.out.println("Ȯ�� : "+set);
		set.add("java");	System.out.println("Ȯ�� : "+set); // ��ü �ߺ� �Ұ���
		set.add("iBATIS"); System.out.println("Ȯ�� : "+ set); 
		// 3. set ��ü �� ��ü �� [ set��ü��.size():]
		System.out.println("set �ȿ� ����ִ� ��ü �� : "+set.size());
		// 4. Iterator : ����� ��ü�� �ѹ� �� �������� �ݺ��� ���� (��ȸ)
			// * set �÷��� ���� ���Ǵ� ���� : �ε����� ���� ������ ��ü�� ȣ���ϴ� ���X (=get ������)
		Iterator<String>  iterator  = set.iterator(); // set  ��ü ��  iterator() :��ȸ
		while(iterator.hasNext()) { // .hasNext() : ���� ��� ���� ���� Ȯ�� = ���� ��Ұ� ������ true ������ false
			String element = iterator.next(); // .next() : ���� ��� ��������
			System.out.println("\t"+element);
		}
		//* for ���� �÷��� Ȱ��
			// for(�ӽ� ��ü�� :�÷���/�迭) : �÷���/�迭 �� ��ҵ��� �ѹ��� �������� �ݺ���
		for(String element : set) {
			System.out.println("\t"	+ element);
		}
		
		// 5. set��ü��.remove(��ü��) : set ��ü �� �ش� ��ü�� ����
		set.remove("jdbc"); System.out.println("Ȯ�� : "+set);
		set.remove("iBATIS"); System.out.println("Ȯ�� : "+set);
		// 6. set��ü��.clear() : set ��ü �� ��� ��ü�� ����[����]
		set.clear(); System.out.println("Ȯ�� : 	"+set); 
		
		
	}
	
	
}
