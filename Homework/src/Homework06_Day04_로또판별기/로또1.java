package Homework06_Day04_�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ�1 {// time 63:03 |7
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
		Random random =new Random();
		int[] �����= new int[6];
		int[] ��ǻ��= new int[6];
		
			System.out.println("�ζ� ����");
			
			for (int i =0;i<6;i++) {
				System.out.print("1~45 ������ ���ڸ� �Է��ϼ���"); 
				System.out.print("\n�Է� : "); 	
				
				boolean üũ = true;
				int ����= scanner.nextInt();
//				�����[i]= ����;
				if(����<1 || ����>46) {
					System.out.println("�߸��� �Է��Դϴ�.");
					i--; 
					üũ = false;
				}
				else if(����>=1||����<=46) {
					for (int j=0;j<6;j++) {
						if(���� ==�����[j]) {
							System.out.println("�ߺ��� ��ȣ�Դϴ�.");
							i--; 
							üũ = false;
						}
					}
				}
				if(üũ==true) {
					�����[i]= ����;
				}
			}
			
			
			for (int i =0;i<6;i++) {
				boolean üũ = true;
				int ��÷ = random.nextInt(10)+1;
				for(int j =0;j<6;j++) {
					if(��÷==��ǻ��[j]) {
						i--;
						üũ = false;
					}
				}
				if(üũ==true) {
					��ǻ��[i]=��÷;
				}
//				System.out.println(��ǻ��[i]);
			}
				
		
			int �ߺ�����=0;
			for (int i=0;i<6;i++) {
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
				System.out.println("2��");}
			else if(�ߺ�����==4) {
				System.out.println("3��");
			}
			else if(�ߺ�����==3) {
				System.out.println("4��");
			}
			else  {System.out.println("��");}
	}	
}
