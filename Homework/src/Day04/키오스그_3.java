package Day04;

import java.util.Scanner;

public class Ű������_3 { // [17:17]
	// ���Ǳ� ���α׷� [10min]
	// 1. �޴��� [ 1. �ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
	// 			// 1. �޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
	//			// 2. ��� �����ϸ� �˸�( ��� ���� )
	// 2. �ʱ� ��� [ ��ǰ�� 10�� �� ]
	// 3. ���� �� �ݾ��� �Է� �޾� ������ ��ŭ ���� �� �ܵ� ���
			// 1. ������ �ݾ׺��� ������(���ž�)�� ũ�� ���� ��� [ �ݾ� ���� ]
	
	 // ==> ���Ÿ�Ʈ ������ 
	public static void main(String[] args) { // ms
		Scanner scanner = new Scanner(System.in);
		int �ݶ󱸸�=0;
		int �ݶ���� =10;
		int �ݶ󰡰�=300;
		
		int ���̴ٱ���=0;
		int ���̴���� =10;
		int ���̴ٰ���= 200;
		
		int ȯŸ����=0;
		int ȯŸ��� =10;
		int ȯŸ���� =100;
		
		int �Աݱݾ� = 0 ; int �����ݾ�= 0; int �ܾ� = 0;
		
		while(true) {
		System.err.println(" === ���Ǳ� == ");
		System.err.print(" 1.���ἱ�� 2.����"); int ����= scanner.nextInt();
			while(true) {
				if( ���� ==1 ) {
					System.out.println("1.�ݶ� 2.���̴� 3.ȯŸ 4.�ڷ�");
					System.out.print("���� : "); int ���ἱ�� = scanner.nextInt();
					if (���ἱ�� == 1) {
						if(�ݶ����==0) {
							System.out.println("��� �����ϴ�.");
						}
						else {
							�ݶ����--;
							�ݶ󱸸�++;
						}
					}
				}
				else if( ���� ==2 ) {
					if(���̴����==0) {
						System.out.println("��� �����ϴ�.");
						
					}
					else {
						���̴����--;
						���̴ٱ���++;
					}
				}
				else if( ���� ==3 ) {
					if(ȯŸ���==0) {
						System.out.println("��� �����ϴ�.");
						
					}
					else {
						ȯŸ���--;
						ȯŸ����++;
					}
					
				}
				else if( ���� ==4 ) {
					
				    break;
				}else System.out.println(" �߸��� �Է��Դϴ�.");
			}
				
			
				while(true) {
					if( ���� ==2 ) { 
						System.out.println("���� �޴�");
						System.out.print("1. �Ա� 2. ���� 3.���"); int �������� = scanner.nextInt();
						�����ݾ� = �ݶ󱸸�*�ݶ󰡰� + ���̴ٱ���*���̴ٰ��� + ȯŸ����*ȯŸ����;
						if(�������� ==1 ) {
							System.out.print(" �Ա� �ݾ� : "); int �Աݾ� = scanner.nextInt();
							�Աݱݾ� = �Աݾ�;
							System.out.println(" �Ա� �ݾ� "+�Աݱݾ�+ "�Դϴ�.");
						}
						else if(�������� ==2){
							if (�����ݾ� ==0 ) {
								System.out.println(" ������ ��ǰ�� �����ϴ�.");
							}
							else 
								�ܾ� = �Աݱݾ�- �����ݾ�;
							System.out.println(" �����Ǿ����ϴ�.");
							System.out.println(" �ܾ��� "+�ܾ�+"���Դϴ�" );
							
							
						}
						
						else if(�������� ==3){
							System.out.println("���� ��� �Ǿ����ϴ�.");
							System.out.println("��ٱ��ϸ� ���ϴ�.");
							�ݶ���� = �ݶ����+�ݶ󱸸�;
							ȯŸ��� = ȯŸ���+ȯŸ����;
							���̴���� = ���̴����+���̴ٱ���;
							
						}
						else {break;}
						
					}
					
				}
			}
			
		
	}//me

}//ce


