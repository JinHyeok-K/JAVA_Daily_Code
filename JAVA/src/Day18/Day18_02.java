package Day18;

import java.util.Vector;

public class Day18_02 {
	public static void main(String[] args) {
		// p. 730
		// 			Arraylist  vs  Vector
		// ����ȭ			X			 O
		// ������    �̱۽�����(main)		��Ƽ������(Thread, Runnable)
		
		
		//Vector Ŭ����
		//1. Vector ����Ʈ���� ����
		Vector<Board> list = new Vector<>();
		//2. ����Ʈ ��ü �� �߰�
			// 1. ����Ʈ �� ��ü �ٷ� �߰� new : ��ü �޸� �Ҵ�
		list.add(new Board("����1", "����1", "�۰�1"));
			// 2. ��ü ���� �� ����Ʈ �� ��ü �߰�
		Board board = new Board("����2", "����1", "�۰�1");
		list.add(board);
		
		list.add(new Board("����3", "����3", "�۰�3"));
		list.add(new Board("����4", "����4", "�۰�4"));
		list.add(new Board("����5", "����5", "�۰�5"));
		
		System.out.println("Ȯ�� : "+list);
		
		// 3. �˻� 
		System.out.println("��ü �˻� : "+ list.contains(board));
		System.out.println("��ü ��ġ : "+ list.indexOf(board));
		// 4. ���� [ �輼���ε��� �ڷ� ��ĭ �� ���� ] 
		list.remove(2); System.out.println("2�� index ���� ��  : "+list);
		list.remove(2); System.out.println("2�� index ���� ��  : "+list);
		// * �ݺ��� �̿��� ����Ʈ ��ü �� ��� ��Ҹ� ���
		for(int i =0 ; i<list.size();i++) {
			Board temp = list.get(i);
			System.out.println(temp.����+)
			
			
			
			
			
		}
		
		
	}
}
