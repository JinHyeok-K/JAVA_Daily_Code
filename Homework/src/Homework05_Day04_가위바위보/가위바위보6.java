package Homework05_Day04_����������;

import java.util.Random;
import java.util.Scanner;

public class ����������6 { // time [06:49]
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
	// ������ : ���� �ʱ�ȭ ����
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Random random =new Random();
		int �����; int ��ǻ��; int ���Ӽ�=0;
		int ����ڽ¼�=0; int ��ǻ�ͽ¼�=0;
		
		while(true) {
			��ǻ�� =random.nextInt();
			System.out.println("=====���������� ����=====");
			System.out.println("0.���� 1.����. 2.�� 3.���� ����");
			System.out.print("���� : "); ����� = scanner.nextInt();
			if(�����==3) {
				if(����ڽ¼�>��ǻ�ͽ¼�) {
					System.err.println("����� �¸�! ");
					System.err.println("�� ����Ƚ�� : "+���Ӽ�);
					System.err.println("����� �¸� �� : "+����ڽ¼�);
				}
				else if (����ڽ¼�==��ǻ�ͽ¼�) {
					System.err.println(" ���º� ");
					
				}
				else {
					System.err.println("��ǻ�� �¸�! ");
					System.err.println("�� ����Ƚ�� : "+���Ӽ�);
					System.err.println("��ǻ�� �¸� �� : "+��ǻ�ͽ¼�);
				}
				break;
			}
			
			else if(�����>=0&&�����<=2) {
				if(�����==0&&��ǻ��==2 || �����==1&&��ǻ��==0 || �����==2 && ��ǻ��==1) {
					System.err.println("����� �¸�! ");
					����ڽ¼�++;
				}
				else if(�����==0&&��ǻ��==0||�����==1&&��ǻ��==1||�����==2&&��ǻ��==2) {
					System.err.println("���º�");
					
				}
				else {
					System.err.println("��ǻ�� �¸�! ");
					��ǻ�ͽ¼�++;
				}
				���Ӽ�++;
			}
			
			
		}
		System.out.println(" �̿��� �ּż� �����մϴ�.");
	}

}
