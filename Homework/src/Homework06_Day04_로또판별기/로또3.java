package Homework06_Day04_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ�3 { //time [09:35]
	/* �ζ� �Ǻ��� [10]
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] ����� = new int[6];
		int[] ��ǻ�� = new int[6];
		System.out.println("�ζ� ����");
		for (int i=0;i<6;i++) {
			
			System.out.println(" 1~45������ ���ڸ� �Է��ϼ���");
			int �Է¼��� = scanner.nextInt();
			boolean üũ = true;
			
			if(�Է¼���<=0|| �Է¼���>46) {
				System.out.println(" �߸��� ���ڸ� �Է��Ͽ����ϴ�.");
				i--;
				üũ=false;
			}
			else if(�Է¼���>1||�Է¼���<46) {
				for (int j=0;j<6;j++) {
					if(�Է¼���==�����[j]) {
						i--;
						üũ=false;
						System.out.println("�ߺ��� ���ڸ� �Է��Ͽ����ϴ�.1");
						
					}
				}
			}
			if(üũ==true) {
				�����[i]=�Է¼���;
			}
		} //for 1
		
		for(int i=0;i<6;i++) {
			int ��÷��ȣ = random.nextInt(45)+1;
			boolean check =true;
			for(int j=0;j<6;j++) {
				
				if(��÷��ȣ==��ǻ��[j]) {
					i--;
					check =false;
				}
				
			}
			if(check == true) {
				��ǻ��[i]=��÷��ȣ;
			}
		}
		int �ߺ����� =0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(�����[i]==��ǻ��[j]) {
					�ߺ�����++;
				}
			}
		}
		
		if(�ߺ�����==6) {
			System.out.println("1��");
		}
		else if(�ߺ�����==5) {
			System.out.println("2��");
		}
		else if(�ߺ�����==4) {
			System.out.println("3��");
		}
		else if(�ߺ�����==3) {
			System.out.println("4��");
		}
		else System.out.println("��");
	}
}
