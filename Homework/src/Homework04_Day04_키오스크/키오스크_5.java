package Homework04_Day04_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_5 { // time :[15:48] | ����Ƚ�� 0ȸ

	// ���Ǳ� ���α׷� [10min]
			// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
			//			// 2. ��� �����ϸ� �˸�( ��� ���� )
			// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
			// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
					// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	//��ĥ�� ==> �뼺�뼺 ���Դ� �κ� üũ
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int �ݶ󱸸�=0; int ȯŸ����=0;  int ���̴ٱ���=0;
		int �ݶ����=5; int ȯŸ���=5;  int ���̴����=5;
		int �ݶ󰡰�=300; int ȯŸ����=200; int ���̴ٰ���=100;
		
		int �Աݱݾ� =0; int �����ݾ� =0; int �ܾ� =0;
		
		while(true) {// while total 
			
			System.out.println(" == ���Ǳ� ==");
			System.out.println("1.���ἱ�� 2.����");
			System.out.print("���� : "); int ���� = scanner.nextInt();
			
			while(true) {
				
				if (����==1) {
					System.out.println("1. �ݶ� 2 .ȯŸ 3. ���̴� 4. �ڷ�");
					System.out.print(" ���� : "); int ���ἱ�� = scanner.nextInt();
					if(���ἱ��==1) {
						if (�ݶ����==0) {
							System.out.println("��� �����ϴ�.");
						}
						else {
							�ݶ󱸸� ++;
							�ݶ���� --;
							System.out.println("�ݶ� ��ҽ��ϴ�.");
						}
						
					}
					else if(���ἱ��==2) {
						if (�ݶ����==0) {
							System.out.println("��� �����ϴ�.");
						}
						else {
							�ݶ󱸸� ++;
							�ݶ���� --;
							System.out.println("�ݶ� ��ҽ��ϴ�.");
						}
						
					}
					else if(���ἱ��==3) {
						if (ȯŸ���==0) {
							System.out.println("��� �����ϴ�.");
						}
						else {
							ȯŸ���� ++;
							ȯŸ��� --;
							System.out.println("ȯŸ�� ��ҽ��ϴ�.");
						}
						
					}	
					else if(���ἱ��==4) {
						break;
						}
					else System.out.println("�߸��� �Է��Դϴ�."); 
					}
					
						
				
				else if(���� ==2 ) {
					�����ݾ� = ȯŸ����*ȯŸ����+�ݶ󱸸�*�ݶ󰡰�+���̴ٱ���*���̴ٰ���;
					
					System.out.println(" ���� �޴� ");
					System.out.println(" 1.�Ա� 2.���� 3.��� 4.�ڷ� ");
					System.out.print(" ���� : "); int �������� = scanner.nextInt();
					if(�������� ==1) {
						
						System.out.print("�Ա� �ݾ�"); int �Աݾ� = scanner.nextInt();
						�Աݱݾ� = �Աݱݾ�+�Աݾ�;
						System.out.println(�Աݱݾ�+"�� �Ա��Ͽ����ϴ�.");
					}
					else if(��������==2) {
						if(�����ݾ�==0) {
							System.out.println("������ ��ǰ�� �����ϴ�.");
						}
						else if(�Աݱݾ�<�����ݾ�) {
							System.out.println("������ �ݾ��� �����մϴ�.");
						}
						else if(�Աݱݾ�>=�����ݾ�) {
							�ܾ� = �Աݱݾ� -�����ݾ�;
							���̴ٱ��� =0; �ݶ󱸸�=0; ȯŸ����=0;
							System.out.println("�����Ǿ����ϴ�. �ܾ��� " +�ܾ�+" �� �Դϴ�.");
						}
					}
					else if(��������==3) {
						System.out.println("���� ��ǰ�� �ʱ�ȭ �մϴ�.");
						���̴���� += ���̴ٱ���; �ݶ���� += �ݶ󱸸�; ȯŸ��� += ȯŸ����;
					}
					else if(��������==4) {
						System.out.println("�ڷ� ���ư���.");
						break;
					}
					else {System.out.println(" �߸��� �Է��Դϴ�.");}
					
				}
					
			}
				
				
			
				
			
			
		}// while total end
		
	}
		
}
