package Homework07_Day04;

import java.util.Random;
import java.util.Scanner;

public class ƽ����3 { // time [ 10:50 ]
	/*
	 * ��� ���� [ ƽ���� ���� ] [15]
			1. ������ 9ĭ ���� 
				1. String[] �迭 = new String[9]
		
			2. ����ڿ��� 0~8 �ε�����ȣ �Է¹ޱ�
				1. �ش� �ε����� O ǥ��
				2. �̹� �� �ڸ��� �� �Է� 
		
			3. ��ǻ�ʹ� 0~8 ���� ���� �߻� 
				1. �ش� �ε����� X ǥ��
				2. �̹� �� �ڸ��� �� ���� ����  
		
			4. �¸��Ǵ� 
				���� �ε������� ����� ��� �����ϸ�
				012 345 678
					ù��° �ε����� 0���� 6���� 3������
						�ι��� : ù��°+1
 						������ : ù��°+2 
				���� �ε������� ����� ��� �����ϸ� 
				036 147 258
					ù��° �ε����� 0���� 2���� 1������ 
						�ι�° : ù��°+3
						����° : ù����+6
				�밢�� �ε������� ����� ��� �����ϸ� 
				048 246
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] ������ = {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		String �̱䵹 = "";
		int ���Ӽ� = 0;
		
		while(true) {
			
			for (int i = 0 ; i < 9 ; i++) {
				System.out.print(������[i]);
				if(i%3==2) System.out.println();
				
			}
				
			while(true) {
				System.out.println(" ���� ��ġ ���� : "); int ���� = scanner.nextInt();
				
				if(������[����].equals("[ ]")) {
					������[����]= "[O]";
					���Ӽ�++;
					break;
				}
				else {System.out.println(" �� ��ġ���� ���� �� �����ϴ�.");}
				
			}
			while(true) {
				Random random= new Random();
				int ��ǻ�� = random.nextInt(9);
				
				if(������[��ǻ��].equals("[ ]")) {
					������[��ǻ��] = "[X]";
					���Ӽ�++;
					break;
				}
			    if(���Ӽ�==9) { break;}
			}
//			
//			012
//			345
//			678
//			
			
			
			for(int i=0;i<9;i+=3) {
				if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2]) ) {
					�̱䵹 = ������[i]; 
				}
			}
			for(int i=0;i<=2;i++) {
				if(������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6]) ) {
					�̱䵹 = ������[i]; 
				}	
			}
			if(������[0].equals(������[4])&& ������[4].equals(������[8]) ) {
				�̱䵹 = ������[0];
				
			}
			if(������[2].equals(������[4])&& ������[4].equals(������[6]) ) {
				�̱䵹 = ������[2];
				
			}	
			
			if(�̱䵹.equals("[O]")) {
				System.out.println(" �÷��̾� �¸�");
			}
			if(�̱䵹.equals("[X]")) {
				System.out.println(" ��ǻ�� �¸�");
			}
			if(���Ӽ� == 9) {
				System.out.println("���º�");
			}
			
			
		
		}
	}
}
