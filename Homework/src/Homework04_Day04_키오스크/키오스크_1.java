package Homework04_Day04_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_1 { // time: [30] | ����Ƚ�� 1ȸ
	// ���Ǳ� ���α׷� [10min]
		// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
		// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
		//			// 2. ��� �����ϸ� �˸�( ��� ���� )
		// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
		// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
				// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	// ��ĥ�� : �����ϰ� ����, ���� �̽�
	//		  �߰�ȣ ���� ����� ����
	// 		  
	public static void main(String[] args) {
		
		
		int �ݶ����= 10; int ȯŸ���= 10; int ���̴����= 10;
		int �ݶ󰡰�=300; int ȯŸ����=200; int ���̴ٰ���=100;
		int �ݶ󱸸�= 0; int ȯŸ����= 0; int ���̴ٱ���= 0;
		int �Աݱݾ�=0; int ������=0; int �ܾ�=0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println(" ==== �޴� ====");
			System.out.println(" 1. ���� ���� 2. ����");
			System.out.print(" ���� : "); int �޴����� = scanner.nextInt();
			while(true) {
				if(�޴�����==1) {
					System.out.println(" �����Ͻ� ���� ����");
					System.out.println("1. �ݶ� 2.ȯŸ 3.���̴� 4.�ڷ�");
					System.out.print(" ���� : "); int ���� = scanner.nextInt();
					if (���� ==1 ) {
						if(�ݶ����>=1) {
						�ݶ���� = �ݶ����-1;
						�ݶ󱸸�= 1;
						System.out.println("�ݶ� ��ٱ��Ͽ� �־����ϴ�.");
						
						}
						else System.out.println("��� �����ϴ�.");
					}
					else if(���� ==2 ) {
						if(ȯŸ���>=1) {
							ȯŸ��� = ȯŸ���-1;
							ȯŸ����= 1;
							System.out.println("ȯŸ�� ��ٱ��Ͽ� �־����ϴ�.");
							}
						else System.out.println("��� �����ϴ�.");
						
					}
					else if(���� ==3 ) {
						if(���̴����>=1) {
							���̴���� = ���̴����-1;
							���̴ٱ���= 1;
							System.out.println("���̴ٸ� ��ٱ��Ͽ� �־����ϴ�.");
							}
							else System.out.println("��� �����ϴ�.");
					}else if(���� ==4 ) {
						break;
					}
					else System.out.println(" �߸��� �Է��Դϴ�. ");
					
				}
			
			
				if(�޴����� ==2 ) {
					System.out.println(" ���� �޴�");
					System.out.println(" 1. �Ա� 2. ����");
					System.out.print(" ���� : "); int select2= scanner.nextInt();
					if (select2 == 1 ) {
						System.out.print(" �Ա� �ݾ� :"); int money = scanner.nextInt();
						 �Աݱݾ� =  �Աݱݾ� + money;
					}
					else if (select2 ==2 ) {
						������ = (�ݶ󱸸�*�ݶ󰡰�)+(ȯŸ����*ȯŸ����)+(���̴ٱ���*���̴ٰ���);
						
						if(�Աݱݾ� >=������) {
							
							�ܾ�= �Աݱݾ�-������; 	
							System.out.println(�Աݱݾ�);
							System.out.println(������);
							System.out.println(�ܾ�);
							System.out.println(" ������ �Ϸ�Ǿ����ϴ�.");
							break;
						}
						else if (�Աݱݾ� <������) {
							System.out.println("�ܾ��� �����մϴ�.");
							
						}
					}
					else {
							������ = 0; �Աݱݾ� =0;
							���̴���� = ���̴����+���̴ٱ���;
							ȯŸ��� = ȯŸ���+ȯŸ����;
							�ݶ���� = �ݶ����+�ݶ󱸸�;
							System.out.println(" ��ٱ��ϸ� ������ϴ�.");
							break;
					}
						
					
			}
			}	
			}
		}
		
		
	
	
}
