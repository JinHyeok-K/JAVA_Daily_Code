package Day19;

import java.util.TreeSet;

public class Day19_05 {

	public static void main(String[] args) {
		// p.753 : TreeSet class
			// 1. �ϳ��� ��ü = ���
			// 2. �� ���� �ִ� 2�����ڽ� ��带 ���� ���ִ�.
			// 3. �θ𺸴� ������ ���� �ڽ� /�θ𺸴� ũ�� ������ �ڽ�
			// 4. Ʈ���������� ���� ���ʿ� �ִ� ���� ������
			//				���� �����ʿ� �ִ� ���� ū��
			// 5. TreeSet < �⺻�ڷ��� Ŭ���� > :
			// 6. TreeSet < ����� ���� Ŭ���� > : Comparable ,Comparator ���
		
		
		
		// 1. TreeSet Class ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		// 2. TreeSet ��ü�� ��ü(���) �߰�
		System.out.println("�ڵ�����");
		scores.add(99); System.out.println("Ȯ�� : "+scores);
		scores.add(89);	System.out.println("Ȯ�� : "+scores);
		scores.add(79);	System.out.println("Ȯ�� : "+scores);
		scores.add(69);	System.out.println("Ȯ�� : "+scores);
		scores.add(59);	System.out.println("Ȯ�� : "+scores);
		scores.add(49);	System.out.println("Ȯ�� : "+scores);
		// 3. 
		System.out.println(scores.first()); // ���� ���ʳ�� ȣ��
		System.out.println(scores.last());  // ���� ������ ��� ȣ��
		System.out.println(scores.lower(95)); // 95 �������� ���ʳ�� ȣ��[95���� ����] 
		System.out.println(scores.higher(95)); // 95 �������� �����ʳ�� ȣ��[95���� ū]
		System.out.println(scores.floor(95)); // 95 ���� �������� ���ʳ��[95���� ���ų� ���� ]
		System.out.println(scores.ceiling(85));// 85 ����  �������� �����ʳ��[85���� ���ų� ū]
		// 4.
		System.out.println(scores.pollFirst()); // ���� ���ʳ�� ���� [���� ����]
		System.out.println(scores.pollLast());// ���� �����ʳ�� ���� [ ���� ū ]
		System.out.println("Ȯ�� :"+scores);
		
		// 5. �������� vs ��������
		// *��������[ x: �⺻��(default) : �������� ]
		System.out.println("�⺻[��������] :"+scores);
		// *��������[ .descendingSet() : �������� ]
		System.out.println("����[��������] :"+scores.descendingSet());
		
		// ������������ �ϳ��� ���
		System.out.println("��������");
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		
		System.out.println("��������");
		// ������������ �ϳ��� ���
		for(Integer temp:scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
