package Day01;

import java.util.Random;
import java.util.Scanner;

public class Day01_elevator { // class start

	public static void main(String[] args) { // main start
		
		/* ����������
		 * 
		 * 5�� �ǹ�
		 * ���������ʹ� 1F~5F ����
		 * 	���� �߻� =>���� �� ���� ���������� ��ġ(floor)
		 * ���� ��ġ ���������� ǥ�� 
		 * ���� => ���� or ���� ���� ��ư Ŭ��
		 * ������ ������ �� ��ġ (�Է�1: ������) -> ���������� ���� (���������� �̵���Ȳ ǥ��) -> �Է�2:��ǥ�� -> ���������� �̵���Ȳ ǥ��
		 * 								-> ���� (���� ǥ��)
		 * 
		 */
		Scanner scanner = new Scanner(System.in); //�Է� ��ü ����
		Random random= new Random();  // ���� ��ü ����
		System.out.println("=========================");
		System.out.println(" =====�� �� �ǹ��ΰ���? =====");
		System.out.println("=========================");
		System.out.print(" ���� : "); 	int �����Է� = scanner.nextInt();
		
		int ������������ = random.nextInt(�����Է�)+1; // 2 ������ int ������ ��������
		int ����ġ = random.nextInt(�����Է�)+1; // 2 ������ int ������ ��������
//				// random.nextInt() : +- 20�� ������ ���� �߻�
				// random.nextInt(��) : 0~�� ������ ������ ���� �߻�
				// random.nextInt(��)+���۹�ȣ : ���۹�ȣ ~ �� ������ ���� �߻�
	
//		
//		int ������������ =5; // test �� ����
//		int ����ġ=1;// test �� ����
		
		System.out.println("=========================================");
		System.out.println(" ���� ���������ʹ� "+ ������������+"F �� �ֽ��ϴ�." );
		System.out.println(" ���� �� ��ġ "+ ����ġ+"F �Դϴ�." );
		System.out.println("=========================================\n\n");
		
		
		System.out.println("=========================================");
		System.out.println("���������͸� �����Ͻðڽ��ϱ�? ");
		System.out.println("1. ��  2. �ƴϿ�");
		System.out.println("=========================================");
		System.out.println("���� : "); int start = scanner.nextInt();
		
		if (start == 1) {
			System.out.println(" ���������͸� �����մϴ�." );
			
			if  (������������>����ġ) {
				System.out.println("==========================");
				for(int i=������������;i>=����ġ;i--) {
//					System.out.println("���� ���������ʹ�"+ i+"F �Դϴ�.");
					System.out.println(" �� "+i+" �� ");
				}
				������������=����ġ;
				System.out.println(" ���������Ͱ� �����Ͽ����ϴ�. ");
				System.out.println("==========================\n\n");
				while(true) {	
					System.out.println("==========================");
					System.out.println(" �� ������ ���ðڽ��ϱ�?");
					System.out.println("==========================");
					System.out.println("���� : "); int floar = scanner.nextInt();
					if (floar>�����Է�) {
						System.err.println("�߸��� ���� �Է��Դϴ�. �ǹ��� �� ���� �̻� �Է��� �� �����ϴ�.");
						System.out.println("�ȳ��� ���ʽÿ�");
						break;
					}
					else if (����ġ<floar) {
						System.out.println("==========================");
						System.out.println(" �ö� ���ϴ�.");
						for (int i=����ġ;i<=floar;i++) {
//							System.out.println("���� ���������ʹ�"+ i+" F �Դϴ�.");
							System.out.println(" �� "+i+" �� ");
						}
						System.out.println(" �����Ͽ����ϴ� "+floar+"F �Դϴ�.");
						System.out.println("==========================");
						����ġ=floar;
						������������= ����ġ;
					}
					else if (����ġ>floar) {
						System.out.println("==========================");
						System.out.println(" ���� ���ϴ�.");
						for (int i=����ġ;i>=floar;i--) {
							
//							System.out.println("���� ���������ʹ�"+ i+"F�Դϴ�.");
							
							System.out.println(" �� "+i+" �� ");
						}
						����ġ=floar;
						������������= ����ġ;
						System.out.println("�����Ͽ����ϴ� "+floar+"F �Դϴ�.");
						System.out.println("==========================");
					}
					else if(����ġ==floar) {
						System.out.println("������ ���������� �������� �ʽ��ϴ�.");
					}
				}
			}
			else if(������������<����ġ){
				
				for (int i=������������;i<=����ġ;i++) {
//					System.out.println( "���� ���������ʹ� "+ i +"F �Դϴ�");
					System.out.println(" �� "+i+" �� ");
				}
					������������=����ġ;
					System.out.println("==========================");
					System.out.println(" ���������Ͱ� �����Ͽ����ϴ�");
					System.out.println("==========================");
					while(true) {
					System.out.println("==========================");
					System.out.println(" �� ������ ���ðڽ��ϱ�?");
					System.out.println("==========================");
					System.out.println("���� : "); int floar = scanner.nextInt();
					if (floar>�����Է�) {
						System.err.println("�߸��� ���� �Է��Դϴ�. �ǹ��� �� ���� �̻� �Է��� �� �����ϴ�.");
						System.out.println("�ȳ��� ���ʽÿ�");
						break;
					}
					else if (����ġ<floar) {
						System.out.println("==========================");
						System.out.println(" �ö� ���ϴ�.");
						for (int i=����ġ;i<=floar;i++) {
							System.out.println(" �� "+i+" �� ");
//							System.out.println("���� ���������ʹ�"+ i+" F �Դϴ�.");
						}
						����ġ=floar;
						������������= ����ġ;
						System.out.println(" "+floar+"F �Դϴ�.");
						System.out.println("==========================");
					}
					else if (����ġ>floar) {
						System.out.println("==========================");
						System.out.println(" ���� ���ϴ�.");
						for (int i=����ġ;i>=floar;i--) {
//							System.out.println("���� ���������ʹ�"+ i+"F�Դϴ�.");
							
							System.out.println(" �� "+i+" �� ");
						}
						����ġ=floar;
						������������= ����ġ;
						System.out.println(" �����Ͽ����ϴ�. "+floar+"F �Դϴ�.");
						System.out.println("==========================");
					}
					else if(����ġ==floar) {
						System.out.println("������ ���������� �������� �ʽ��ϴ�.");}
				}
			}
			
				else if(������������==����ġ) { 
					while(true) {
					 System.out.println("=========================="); 
					 System.out.println(" ���������Ͱ� ���� ���� �ֽ��ϴ�.");
					 System.out.println(" �� ������ ���ðڽ��ϱ�?");
					 System.out.println("==========================");
					 System.out.println("���� : "); int floar = scanner.nextInt();
					 if (floar>�����Է�) {
						System.err.println("�߸��� ���� �Է��Դϴ�. �ǹ����� �̻� �Է��� �� �����ϴ�.");
						System.out.println("�ȳ��� ���ʽÿ�");
						break;
					 }
					 else if (����ġ<floar) {
						 System.out.println("==========================");
						System.out.println(" �ö� ���ϴ�.");
						for (int i=����ġ;i<=floar;i++) {
							System.out.println(" �� "+i+" �� ");
						}
						����ġ=floar;
						������������= ����ġ;
						System.out.println(" �����Ͽ����ϴ�. "+floar+"F �Դϴ�.");
						System.out.println("==========================");
					 }
					 else if (����ġ>floar) {
						 System.out.println("==========================");
						System.out.println(" ���� ���ϴ�.");
						for (int i=����ġ;i>=floar;i--) {
							System.out.println(" �� "+i+" �� ");
							
						}
						����ġ=floar;
						������������= ����ġ;
						System.out.println("==========================");
						System.out.println(" �����Ͽ����ϴ�. "+floar+"F �Դϴ�.");
						System.out.println("==========================");
					 }
					else if(����ġ==floar) {
							System.out.println("������ ���������� �������� �ʽ��ϴ�.");}
				
					 }System.out.println("�ȳ��� ���ʽÿ�");
				}
				}
		 else System.out.println("�ȳ��� ���ʽÿ�");
		
		//���� ���� (���� ���������� ��ġ)
		
		
	} // main end
	
} // class end
