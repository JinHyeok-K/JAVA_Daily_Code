package Day04;

import java.util.Scanner;

public class Ű����ũ7 { // 10:49
	// ���Ǳ� ���α׷� [10min]
	// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
	// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
	//			// 2. ��� �����ϸ� �˸�( ��� ���� )
	// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
	// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
			// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int �ݶ󱸸�=0; int ȯŸ����=0; int ���̴ٱ���=0;
		int �ݶ����=10; int ȯŸ���=10; int ���̴����=10;
		int �ݶ󰡰�=300; int ȯŸ����=200; int ���̴ٰ���=100;
		int �Աݱݾ�=0; int �����ݾ�= 0; int �ܾ�= 0;
		
		while(true) {
			System.out.println("���Ǳ�");
			System.out.println("1.���� 2. ����");
			System.out.print("���� :"); int ���� = scanner.nextInt();
			while(true) {
				if (����==1) {
					System.out.println("1.�ݶ� 2.ȯŸ 3.���̴� 4.�ڷ�");
					System.out.print("���� ���� : "); int ���ἱ�� = scanner.nextInt();
					
					if(���ἱ��==1) {
						if(�ݶ����==0) {
							System.err.println("��� �����ϴ�.");
						}
						else {
							�ݶ󱸸�++;
							�ݶ����--;
							System.err.println("�ݶ� ��ҽ��ϴ�.");
						}
							
					}
					else if(���ἱ��==2) {
						if(ȯŸ���==0) {
							System.err.println("��� �����ϴ�.");
						}
						else {
							ȯŸ����++;
							ȯŸ���--;
							System.err.println("ȯŸ�� ��ҽ��ϴ�.");
						}
					}
					else if(���ἱ��==3) 
						{if(���̴����==0) {
						System.err.println("��� �����ϴ�.");
					}
					else {
						���̴ٱ���++;
						���̴����--;
						System.err.println("���̴ٸ� ��ҽ��ϴ�.");
					}}
					else if(���ἱ��==4) {break;}
					else {System.out.println("�߸��� �Է��Դϴ�.");}
				}
				else if (����==2) {
					�����ݾ� = �ݶ󱸸�*�ݶ󰡰�+ȯŸ����*ȯŸ����+���̴ٰ���*���̴ٱ���;
					System.out.println("���� �޴�");
					System.out.println("1.�Ա� 2.���� 3.��� 4.�ڷ�");
					System.out.print("���� :"); int �������� = scanner.nextInt();
					
					if (��������==1) {
						System.out.print("�Ա� �ݾ� :"); int �Աݾ� = scanner.nextInt();
						�Աݱݾ� = �Աݱݾ�+�Աݾ�;
								System.err.println(�Աݱݾ�+ " �� �Ա��Ͽ����ϴ�.");
					}
					else if(��������==2){
						if(�����ݾ�==0) {
							System.err.println("������ ��ǰ�� �����ϴ�.");
						}
						else if(�����ݾ�>0) {
							System.err.println("������ �ݾ��� �����մϴ�.");
						}
						else
							���̴ٱ���=0; �ݶ󱸸�=0; ȯŸ����=0;
							�ܾ� = �Աݱݾ� -�����ݾ�;
						System.err.println("������ �Ϸ�Ǿ����ϴ�. �ܾ���"+ �ܾ�+ " ���Դϴ�.");
					}
					else if(��������==3){
						System.err.println("��ǰ ���Ÿ� ����մϴ�.");
						�ݶ���� += �ݶ󱸸�; ȯŸ��� += ȯŸ����; ���̴���� += ���̴ٱ���;
					}
					else if(��������==4){break;}
					else {System.err.println("�߸��� �Է��Դϴ�.");}
				}
				else {System.err.println("�߸��� �Է��Դϴ�.");}
			}
			
		}
	}

}

