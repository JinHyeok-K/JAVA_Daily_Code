package Homework05_Day04_Ű����ũ;

import java.util.Scanner;

public class Ű����ũ_2 { // time: [�ɸ��ð� 20:34] | ����Ƚ�� 0ȸ
	// ���Ǳ� ���α׷� [10min]
		// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
		// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
		//			// 2. ��� �����ϸ� �˸�( ��� ���� )
		// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
		// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
				// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	
	// ��ĥ��=> ���� ��ǰ ���� �� �˸� �߰� ���� 
	// ==> 
	public static void main(String[] args) { // main start
		
		Scanner scanner = new Scanner(System.in);
		int �ݶ����=10; int ȯŸ���=10; int ���̴����=10;
		int �ݶ󱸸�=0; int ȯŸ����=0; int ���̴ٱ���=0;
		int �ݶ󰡰�=0; int ȯŸ����=200; int ���̴ٰ���=100;
		int ���Աݾ� = 0; int �����ݾ� =0; int �ܾ�=0;
		
		while(true) { // total while
			System.out.println("==== ���Ǳ� ====");
			System.out.println("1. ���� ���� 2.����");
			System.out.print("���� : "); int ���� = scanner.nextInt();
			while(true) {
				if(���� ==1 ) {
					System.out.println("1. �ݶ� 2.ȯŸ 3.���̴� 4.�ڷ�");
					System.out.print("���� : "); int ���ἱ�� = scanner.nextInt();	
					if(���ἱ�� == 1 ) {
						if(�ݶ����>0) {
						�ݶ���� --;
						�ݶ󱸸� ++;
						System.out.println(" �ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�. ");
						}
						else { System.out.println(" ��� �����մϴ�. ");}
					}
					
					else if(���ἱ�� == 2 ) {
						if(ȯŸ���>0) {
							ȯŸ��� --;
							ȯŸ���� ++;
							System.out.println(" ȯŸ�� ��ٱ��Ͽ� ��ҽ��ϴ�. ");
						}
						else { System.out.println(" ��� �����մϴ�. ");}
					}
					else if(���ἱ�� == 3 ) {
						if(���̴����>0) {
						���̴���� --;
						���̴ٱ��� ++;
						System.out.println(" ���̴ٸ� ��ٱ��Ͽ� ��ҽ��ϴ�. ");
						}
						else { System.out.println(" ��� �����մϴ�. ");}
					}
					else if(���ἱ�� == 4) {
						break;
					}
					else System.out.println("�߸��� �Է��Դϴ�.");
					
					
				}
				else if (���� ==2) {
					System.out.println("=== ���� �޴� ===");
					System.out.println("1. �Ա� 2.���� 3. ���");
					System.out.print("���� : "); int �������� = scanner.nextInt();
					�����ݾ� = �ݶ󱸸�*�ݶ󰡰� + ȯŸ����*ȯŸ����+ ���̴ٱ���*���̴ٰ���;
					if (�������� ==1 ) {
						System.out.print( " �Աݾ� : "); int �Ա� = scanner.nextInt();
						���Աݾ� = �Ա�;
						System.out.println(���Աݾ�+"�� �Ա��Ͽ����ϴ�.");
					}	
					else if(�������� ==2 ) { 	
						if(���Աݾ�<�����ݾ�) {
							System.out.println(" ���� �ݾ��� �����մϴ�.");
						}
						else if(���Աݾ�>=�����ݾ�) {
							
						    �ܾ� = ���Աݾ� -�����ݾ�;
						    System.out.println(" �����Ǿ����ϴ�. �ܾ� : "+�ܾ�+ "�� �Դϴ�.");
						    
						}
						
					}
					else if(�������� == 3) {
						System.out.println(" ��ٱ��ϸ� ���ϴ�.");
						ȯŸ���= ȯŸ���+ȯŸ����; �ݶ����= �ݶ����+�ݶ󱸸�; ���̴����= ���̴����+���̴ٱ���;
					}
					else { break;
					}
					
				}else { System.out.println("�߸��� �Է��Դϴ�.");}
			
			
			
			}
			
			}  // total while end
			
		
	}//main start
}// class end
