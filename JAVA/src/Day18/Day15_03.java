package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day15_03 {
	// p.731~732 : LinkedLis
	//				ArrayList   			vs   LinkedList
	//					�迭							��ũ
	//���α�������		�ε����������� �޸� ����[��]		 ���� �ٸ� �޸��ּ� ����
	// �ӵ�
	//   add[�߰�]		����
	//	 add[����=�߰�]								����
	//   �˻�				����
	//   ����[�߰�]											����
	
	
	
	
	public static void main(String[] args) {
	// 1. ArrayList ��ü ���� [ ���׸� : String ]
	ArrayList<String> list1 = new ArrayList<>();
	// 2. LinkedList  ��ü ���� [ ���׸� : String ] 
	LinkedList<String> list2 = new LinkedList<>();
	
	// 3. �ð�����
	long starttime;
	long endtime;
	
	// 4. arraylist ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
	starttime=System.nanoTime(); // ����ð� ����ð����� ȣ��
	for(int i=0;i<10000;i++) {
		list1.add(0,i+""); // ����-> ���ڿ���ȯ : 1 String.valueOf(����)  2. ����+""
							// ���ڿ� -> ������ȯ : 1. Integer.parseInt(���ڿ�) 
		
	}	
	endtime=System.nanoTime();	
	System.out.println("arraylist time :"+(endtime-starttime)+"ns");	
		
		
	// 5. linkedlist ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
	starttime=System.nanoTime(); // ����ð� ����ð����� ȣ��
	starttime=System.nanoTime(); // ����ð� ����ð����� ȣ��
	for(int i=0;i<10000;i++) {
		list2.add(0,i+"");  
							 
		
	}	
	endtime=System.nanoTime();	
	System.out.println("arraylist time :"+(endtime-starttime)+"ns");	
	
	
	
	
	
		
	}
}
