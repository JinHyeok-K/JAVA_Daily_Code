package Homework05_Day04_����������;

import java.util.Random;
import java.util.Scanner;

public class ����������3 { // time [8:11]
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
	// ������ : ��ȣ ó�� ����
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int �����; int ��ǻ��; int ���Ӽ�=0;
		int ����ڽ¼�=0; int ��ǻ�ͽ¼�=0;
		
		while(true) {
			
			System.out.println("====== ���������� ���� ======");
			System.out.println("0.���� 1.���� 2.�� 3.��������");
			System.out.print("���� : "); ����� = scanner.nextInt();
			��ǻ�� = random.nextInt(2);
			System.err.println(��ǻ��);
			if(����� == 3 ) {
				System.out.println("====== ���� ���� ======");
				if(����ڽ¼�>��ǻ�ͽ¼�) {
					System.err.println("����� �¸� !");
					System.err.println("�� ���Ӽ�"+ ���Ӽ�);
					System.err.println("����� �¸� Ƚ�� :" +����ڽ¼� );
					break;
				}
				else if(����ڽ¼�==��ǻ�ͽ¼�) {
					System.out.println("���º�!");
					break;
				}
				else
					System.err.println("�� ���Ӽ�"+ ���Ӽ�);
					System.err.println("��ǻ�� �¸� Ƚ�� :" +��ǻ�ͽ¼� );
					break;
			}
			
			else if(�����>=0&&�����<=2) {
				if(�����==0&&��ǻ��==2 || �����==1&&��ǻ��==0||�����==2&&��ǻ��==1) {
					System.out.println("����� �¸�");
					����ڽ¼�++;
				}
				else if (�����==0&&��ǻ��==0||�����==1&&��ǻ��==1||�����==2&&��ǻ��==2) {
					System.out.println("���º�");
				}
				else { ��ǻ�ͽ¼�++;
					System.out.println("��ǻ�� �¸�");}
			}
			���Ӽ�++;
			
			
			
			
			
			
		}
	}
		
}
