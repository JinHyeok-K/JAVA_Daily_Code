package Test_p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;


public class ��������_Controller { //���
	static Scanner scanner = new Scanner(System.in);
	public static void main() {
		
//			�޷�
//		while(true) {
//			System.out.println();		
//			System.out.print("�� : ");  int month = scanner.nextInt();
//			//���ѷ��� �߰�
//				//1. Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
//				Calendar calendar = Calendar.getInstance();
//					//2.����, ��, ��
//				int day = calendar.get(Calendar.DAY_OF_MONTH);
//						calendar.set(month, 1);
//						int sweek = calendar.get(Calendar.DAY_OF_WEEK);
//						int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//					
//					//3. ���
//				System.out.println("===== "+month+"�� =====");
//				System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//				
//					for(int i = 1; i<sweek; i++);{ 	System.out.println("\t");}
//					for(int i = 1; i <= eday; i++ ) {
//						System.out.print(i+"\t");	if( sweek % 7 == 0)	//7�� ��� ã��
//								System.out.println(); //������� �ٹٲ�
//							sweek++; } //�Ϸ羿 ������ ����
//		
		//////////////////////////////////////////////////////

		HashSet<String> �߰��̿� = new HashSet<String>();
		int ���ĺ��� = 0;
		int ������ = 0;
		int �ｺ�� = 0;
		
	//	while(true) {
		System.out.println();
			System.out.print("\n��¥�� �������ּ���. : "); String ��¥ = scanner.next();
			//��¥ ����
			
			System.out.print("�ش� ��¥�� �̿��� �ü��� �������ּ���.\n1.���� 2.�߰� �̿� �ü� 3. �ڷΰ���"); int ch = scanner.nextInt();
			System.out.println();
	
			while(true) {
				if(ch==1) { System.out.print("�̿��� ������ �������ּ���."); }
				else if (ch ==2) {
					
				
					System.out.print("�߰� �̿� �ü��� �������ּ���.(�� 1ȸ�� ������ �����մϴ�.)"
							+ "\n1.���ĺ���(30,000)\n2.������(20,000)\n3.�ｺ��(10,000)\n4.����"); int ch2 = scanner.nextInt();
						if(ch2==1) { System.out.println("���ĺ��並 �̿��մϴ�.");
						�߰��̿�.add("���ĺ���"); //����� ����
						���ĺ���++;
						
						} else if (ch2 ==2) { System.out.println("�������� �̿��մϴ�.");
						�߰��̿�.add("������"); //����� ����
						������++;
						
						} else if(ch2 == 3) { System.out.println("�ｺ���� �̿��մϴ�.");
						�߰��̿�.add("�ｺ��"); //����� ����
						�ｺ��++;
						
						} else {break;} //�ڷΰ���
						
						
				} else if (ch ==3) {break;}
				else {System.err.println("�ùٸ��� �Է��Ͽ� �ּ���.");}
				
				}
			System.out.println();
			System.out.println(��¥+"�Ͽ� �̿��ϴ� �߰� �̿� �ü� : "+�߰��̿�);
			

			int �����ݾ� = (���ĺ���*30000)+(������*20000)+(�ｺ��*10000);

			System.out.println("�� �����ݾ� :"+�����ݾ�);

				while(true) { System.out.println("�Ա� �ݾ� : "); int �Աݾ� = scanner.nextInt();
					if(�Աݾ� < �����ݾ�) { System.out.println("�ݾ��� �����մϴ�.");}
					else {System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");}
					
					���ĺ��� = 0; ������ = 0; �ｺ�� =0;
					System.out.println("�ܵ� : "+(�Աݾ�-�����ݾ�)+"��");
					break;
				}
			
			// ��¥�� �ش� �� ���� �� �߰��̿� ����
			�߰��̿�.remove(�߰��̿�);
			
			
			} // while end


	//	} //while end
		
////////////////////////////////////////////////////////////////////	
	
	
}