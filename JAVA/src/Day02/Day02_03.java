package Day02;

import java.util.Scanner;

public class Day02_03 { // c.s
	
	public static void main(String[] args) { // m.s
		
		//����1.
		// 1. �Է� ��ü �����. [�ڷ��� �ҹ��� , Ŭ������ �빮��]
		
		Scanner scanner = new Scanner(System.in);
		// 2. �Է� ���� ���� ������ ����. [ �Է� ��ü�� �Է� ���� ������ ���� �����Ͱ� ����� ]
		
		System.out.printf("�⺻�� : ");	int �⺻�� = scanner.nextInt();
		System.out.printf("���� : ");		int ����	 = scanner.nextInt();
				
		scanner.close();
		
		
		
		
		// 3. ������ ����(���)�Ѵ�.
		
		int ���� = (int)(�⺻��*0.1); // int*double �Ŀ� int ������ (����)��ȯ 
		int �Ǽ��ɾ� = �⺻�� + ���� - ����; // 100%: 1 , 10% 0.1
		// 4. ���
		
		System.out.println("ȣ������ �� ���ɾ� : " + �Ǽ��ɾ�);
					// ���ڿ� + ������ ( ���� �� ������ ȣ��)
					// + : 1. ���� ������ ��� 2. ���ϱ� ���
		
		
	} // m.e

} // c.e
