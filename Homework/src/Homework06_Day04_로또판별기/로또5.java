package Homework06_Day04_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ�5 { // time [08:18]
	/* �ζ� �Ǻ��� [10]
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */
	//������ : for �� �Է½� ����� �Ѱ� 
	// 		��ȣ ó�� �̼�(�ּ� ��ǥ��)
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("�ζ� ����");
		int[] ����� = new int[6];
		int[] ��ǻ�� = new int[6];
		
		for(int i=0;i<6;i++) {
			System.out.println(" 1 ~ 45 ������ ���ڸ� �Է��ϼ���");
			System.out.print("���� �Է� : "); int ��ȣ�Է� = scanner.nextInt();
			boolean check = true;
			
			if(��ȣ�Է�<=0 || ��ȣ�Է� >=46) {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
				i--;
				check= false;
			}
			else if (��ȣ�Է� >=1 || ��ȣ�Է� <=45) {
				for (int j = 0; j<6;j++) {
					if(��ȣ�Է�==�����[j]) {
						i--;
						System.out.println("�ߺ��� ���ڸ� �Է��Ͽ����ϴ�.");
						check = false;
					}
					
				}
			}
			if(check == true ) {
				�����[i] = ��ȣ�Է�;
			}
		}//for 1
		
		
		for (int i = 0 ; i<6;i++) {
			
			int ��÷��ȣ = random.nextInt(45)+1;
			boolean check2=true;
			for(int j=0 ; j<6;j++) {
				if(��÷��ȣ == ��ǻ��[j]) {
					i--;
					check2=false;
				}
				
			}
			if(check2==true) {
				��ǻ��[i] = ��÷��ȣ;
			}
			
		}
		
		
		int �ߺ����� =0;
		
		for (int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if (�����[i]==��ǻ��[j]) {
					�ߺ�����++;
				}
			}
		}
		
		if (�ߺ�����==6) {System.out.println("1��");}
		else if (�ߺ�����==5) {System.out.println("2��");}
		else if (�ߺ�����==4) {System.out.println("3��");}
		else if (�ߺ�����==3) {System.out.println("4��");}
		else {System.out.println("��");}
		
	}
}

