package Homework06_Day04_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ�2 { // time[18:31] |4

	/* �ζ� �Ǻ��� [10]
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */
	//������ : ��ȣó�� �̼�
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Random random =new Random();
		int[] ����� = new int[6];
		int[] ��ǻ�� = new int[6];
		
		System.out.println(" �ζ�");
		
		for (int i=0;i<6;i++) {
			System.out.println(" 1~45������ ���ڸ� �Է�");
			int �Է¼��� = scanner.nextInt();
			boolean check = true;
			if(�Է¼���<=0||�Է¼���>=46) {
				System.out.println("�߸��� �Է��Դϴ�.");
				i--;
				check= false;
			}
			else if(�Է¼���>0||�Է¼���<46) {
				for (int j=0;j<6;j++) {
					if(�Է¼���==�����[j]) {
						System.out.println("�ߺ��� ���ڸ� �Է��Ͽ����ϴ�.");
						i--;
						check =false;
					}			
				}	
			}
			
			if (check==true) {
				�����[i]= �Է¼���;
			}
			
		}
		
		for (int i=0;i<6;i++) {
			int ��÷��ȣ = random.nextInt(10)+1;
			
			boolean check2 = true;
			
			for (int j=0;j<6;j++) {
				if(��÷��ȣ==��ǻ��[j]) {
					i--;
					check2 =false;
			}
			
			}
			if(check2==true) {
				��ǻ��[i]=��÷��ȣ;
			}
			System.out.println(��ǻ��[i]);
		}
		
		
		
		
		
		int ���ϼ��� =0;
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if(�����[i]==��ǻ��[j]) {
					���ϼ���++;
				}
			}
		}
		
		if (���ϼ���==6) {
			System.out.println("1��");
		}
		else if (���ϼ���==5) {
			System.out.println("2��");
		}
		else System.out.println("��");
		}
	

}
