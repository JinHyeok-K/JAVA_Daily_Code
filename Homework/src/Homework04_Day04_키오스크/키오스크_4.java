package Homework04_Day04_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_4 { // time :[13:36] | ����Ƚ�� 0ȸ

	// ���Ǳ� ���α׷� [10min]
		// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
		// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
		//			// 2. ��� �����ϸ� �˸�( ��� ���� )
		// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
		// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
				// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	
	//��ĥ�� ==> ��� ���� �ڵ� ���� �ʿ�
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int �ݶ󱸸� =0; int ȯŸ���� =0; int ���̴ٱ��� =0;
		int �ݶ���� =10; int ȯŸ��� =10; int ���̴���� =10;
		int �ݶ󰡰� =300; int ȯŸ���� =200; int ���̴ٰ��� =100;
		int �Աݱݾ� = 0; int �����ݾ� =0; int �ܾ� =0;
		while(true) {
		System.out.println(" ===���Ǳ�===");
		System.out.print("1. ���� 2.����"); int ���� = scanner.nextInt();
			while(true) {
				if(���� ==1 ) {
					System.out.println("1.�ݶ� 2.ȯŸ 3.���̴� 4.�ڷ�");
					System.out.print("���� : "); int ���ἱ�� = scanner.nextInt();
					if(���ἱ��==1) {
						if(�ݶ����==0) {
							System.out.println("��� �����մϴ�.");
						}
						else {
							�ݶ󱸸�++;
							�ݶ����--;
							System.out.println("�ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
						}
					}
					else if(���ἱ��==2) {
							if(ȯŸ���==0) {
								System.out.println("��� �����մϴ�.");
							}
							else {
								ȯŸ����++;
								ȯŸ���--;
								System.out.println("�ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							}
					}
					else if(���ἱ��==3) {
						if(���̴����==0) {
							System.out.println("��� �����մϴ�.");
						}
						else {
							���̴ٱ���++;
							���̴����--;
							System.out.println("�ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
						}
					}
					else if(���ἱ�� ==4) {
						break;
					}
					else System.out.println(" �߸��� �Է��Դϴ�.");
					
				}
				
				else if(���� ==2 ) {
					�����ݾ�= ���̴ٱ���*���̴ٰ���+�ݶ󰡰�*�ݶ󱸸�+ȯŸ����*ȯŸ����;
					System.out.println(" ���� �޴�");
					System.out.println("1.�Ա� 2���� 3��� 4�ڷ�");
					System.out.print("���� :"); int ��������= scanner.nextInt();
					if(�������� == 1) {
						System.out.print(" �Ա� :"); int �Աݾ� = scanner.nextInt();
						
						�Աݱݾ� =�Աݱݾ� +�Աݾ� ;
						System.out.println( "�Ա� �Ǿ����ϴ�. "+�Աݱݾ�+"���Դϴ�.");
					}
					else if(�������� == 2) {
						if(�����ݾ� == 0 ) {
							System.out.println("������ ��ǰ�� �����ϴ�.");
						}
						else if(�����ݾ�>�Աݱݾ� ) {
							System.out.println("�ܾ��� �����մϴ�.");
						}
						else {
							�ܾ� = �Աݱݾ� - �����ݾ�;
							System.out.println( "�����Ǿ����ϴ�. �ܾפ���"+�ܾ�+"���Դϴ�.");
						}
					}
					else if(�������� == 3) {
						System.out.println("��ٱ��ϸ� ���ϴ�.");
						���̴���� = ���̴����+���̴ٱ���;
						�ݶ���� = �ݶ����+�ݶ󱸸�;
						ȯŸ��� = ȯŸ���+ȯŸ����;
						
					}
					else if(�������� == 4) {
						break;
						
					}
					else System.out.println(" �߸��� �Է��Դϴ�.");
				}
				else { System.out.println("�߸��� �Է��Դϴ�.");}
			}
		
		}
	}
		
}
