package Homework05_Day04_����������;

import java.util.Random;
import java.util.Scanner;

public class ����������2 { //time [07:57]
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
	//������ ==>  break ����
	// 			����� ���� ��� ����
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int �����; int ��ǻ��;
		int ���Ӽ�=0; int ����ڽ¼�=0; int ��ǻ�ͽ¼�=0;
		
		while(true) {
			System.out.println("���������� ����");
			System.out.println("0.���� 1.���� 2.�� 3.��������");
			System.out.print("���� : "); int ���� = scanner.nextInt();
			��ǻ�� = random.nextInt(2);
			
			if(���� == 3 ) {
				System.out.println( " ���� ���� ");
				if(����ڽ¼�>��ǻ�ͽ¼�) {
					System.out.println(" ����� �¸�");
					System.out.println(" �� ���Ӽ� :"+���Ӽ� );
					System.out.println(" ����� �¼� : "+����ڽ¼�);
				}
				else if(����ڽ¼� == ��ǻ�ͽ¼�) {
					System.out.println("���º�!");
				}
				else System.out.println("��ǻ�� �¸�");
					System.out.println(" �� ���Ӽ� :"+���Ӽ� );
					System.out.println(" ��ǻ�� �¼� : "+��ǻ�ͽ¼�);
			//����ڿ��� ����[0]����[1]��[2] ����[3] 	
			}
			else if (����>=0&&����<=2) {
				if(���� ==0&&��ǻ��==2 || ���� ==1&&��ǻ��==0|| ���� ==2&&��ǻ��==1) {
					System.out.println(" ����� �¸�");
					����ڽ¼�++;
				}
				else if (���� ==0 && ��ǻ�� ==0 || ����==1&&��ǻ��==1|| ����==2&&��ǻ��==2) {
					System.out.println("���º�");
				}
				else
					System.out.println("��ǻ�� �¸�");
				    ��ǻ�ͽ¼�++;
			}
			���Ӽ�++;
		}
	}
	
}



