package Homework05_Day04_����������;

import java.util.Random;
import java.util.Scanner;

public class ����������_1 { //time [20] | 
	/*
	 * ��������������[10]
		1. ����ڿ��� ����[0]����[1]��[2] ����[3] �߿�  �Է¹ޱ�
		2. ��ǻ�� �����߻�[0~2] 
		3. ����ڿ� ��ǻ���� �¸��� �Ǵ� [ ����Ǽ� ]
		4. 3�� �����ϱ� ������ ���� ���� 
		5. 3�� ���ý� �������� 
			1. �� ���Ӽ� ���	��) 3��
			2. ���� �¸� ���	��) ��ǻ�� 2  ����� 1
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int �����;
		int ��ǻ��;
		int �Ѱ׼�=0;
		int �Ľ�=0; int ����ڽ¸�=0;
		int ���º�=0;
		
		Random random =new Random()	;
		while(true) {
		��ǻ�� = random.nextInt(3);
//		System.out.println(��ǻ��);
		System.out.println(" ����������");
		System.out.println("0.����  1.���� 2.��  3.���� ");
		System.out.print("���� : "); int ���� = scanner.nextInt();
		
			if(���� ==3 ) {
				
				System.out.println("������ ���� �մϴ�");
				System.out.println(" �� ���Ӽ�"+�Ѱ׼�);
				if (����ڽ¸�>�Ľ�) {
					System.out.println(" ����� �¸�!");
					System.out.println("����� �¼� :" +����ڽ¸�);
				}
				else if(����ڽ¸�==�Ľ�) {
					System.out.println("���º�!! " );
					
				}
				else System.out.println("��ǻ�� �¸�");
					System.out.println("��ǻ�� �¼� :" +�Ľ�);
			}
			else if(����>=0&&����<=2) {
				if(����==0&&��ǻ��==0 || ����==1&&��ǻ��==1|| ����==2&&��ǻ��==2) {
					���º�++;
					System.out.println("���º�");
				}
				else if(����==0&&��ǻ��==2 || ����==1&&��ǻ��==0|| ����==2&&��ǻ��==1) {
					System.out.println("����� �¸�");
					����ڽ¸�++;
				}
				else {System.out.println("��ǻ�� �¸�");
					�Ľ�++;
				}
				�Ѱ׼�++;	
			}
		}
		
		//
		
		
		
		
		
	}
}
