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
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in); //�Է� ��ü ����
		Random random= new Random();  // ���� ��ü ����
		
		
		int ������������ = random.nextInt(5)+1; // 2 ������ int ������ ��������
		int ����ġ = random.nextInt(5)+1; // 2 ������ int ������ ��������
				// random.nextInt() : +- 20�� ������ ���� �߻�
				// random.nextInt(��) : 0~�� ������ ������ ���� �߻�
				// random.nextInt(��)+���۹�ȣ : ���۹�ȣ ~ �� ������ ���� �߻�
	
//		
		int ������������ =5; // test �� ����
		int ����ġ=5;// test �� ����
		System.out.println("=========================================");
		System.out.println(" ���� ���������ʹ� "+ ������������+"F �� �ֽ��ϴ�." );
		System.out.println(" ���� �� ��ġ "+ ����ġ+"F �Դϴ�." );
		System.out.println("=========================================\n\n");
		
		
		System.out.println("=========================================");
		System.out.println("���������͸� �����Ͻðڽ��ϱ�? ");
		System.out.println("1. ��  2. �ƴϿ�");
		System.out.println("���� : "); int start = scanner.nextInt();
		
		if (start == 1) {
			System.out.println(" ���������͸� �����մϴ�." );
			
			if  (������������>����ġ) {
					System.out.println("==========================");
					for(int i=������������;i>=����ġ;i--) {
						
						System.out.println("���� "+ i+"F �Դϴ�.");
						
					}
				System.out.println(" ���������Ͱ� �����Ͽ����ϴ�.");
				System.out.println("==========================\n\n");
				
				System.out.println("==========================");
				System.out.println(" �� ������ ���ðڽ��ϱ�?");
				System.out.println("���� : "); int floar = scanner.nextInt();
					if (����ġ<floar) {
						System.out.println(" �ö� ���ϴ�.");
						for (int i=����ġ;i<=floar;i++) {
							System.out.println("���� "+ i+" F �Դϴ�.");
						}
						System.out.println(" "+floar+"F �Դϴ�.");
					}
					else if (����ġ>floar) {
						System.out.println(" ���� ���ϴ�.");
						for (int i=����ġ;i>=floar;i--) {
							System.out.println("����"+ i+"F�Դϴ�.");
						}
						System.out.println(" "+floar+"F �Դϴ�.");
					}
			}
				else if(������������<����ġ){
					System.out.println("==========================");
					for (int i=������������;i<=����ġ;i++) {
						
						System.out.println( "���� "+ i +"F �Դϴ�");
						
					}
					System.out.println(" ���������Ͱ� �����Ͽ����ϴ�");
					System.out.println("==========================");
				}
				else if(������������==����ġ) { 
					 System.out.println("=========================="); 
					 System.out.println(" ���������Ͱ� ���� ���� �ֽ��ϴ�.");
					 System.out.println(" �� ������ ���ðڽ��ϱ�?");
					 System.out.println("==========================");
					 System.out.println("���� : "); int floar = scanner.nextInt();
					 if (����ġ<floar) {
							System.out.println(" �ö� ���ϴ�.");
							for (int i=����ġ;i<=floar;i++) {
								System.out.println("���� "+ i+" F �Դϴ�.");
							}
							System.out.println(" "+floar+"F �Դϴ�.");
						}
						else if (����ġ>floar) {
							System.out.println(" ���� ���ϴ�.");
							for (int i=����ġ;i>=floar;i--) {
								System.out.println("����"+ i+"F�Դϴ�.");
							}
							System.out.println(" "+floar+"F �Դϴ�.");
						}
				}
		}
		else {System.out.println("\n\n====================================");}	
		
		//���� ���� (���� ���������� ��ġ)
		
		
	} // main end
	
} // class end
