package Homework07_Day04_ƽ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����7 { // time 09:07 | 0ȸ
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
	// ������ : ������ ��ȭ �����Ǽ� ������ ��ȭ������ �� �ۼ� ��
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String[] ������= {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		int ���Ӽ� = 0;
		String �¸��� ="";
		
		while(true) {
			for(int i =0 ;i<9;i++) {
				System.out.print(������[i]);
					if(i%3==2) System.out.println();				
			}
			
			while(true) {
				System.out.println("��ġ ���� : "); int ��ġ����=scanner.nextInt();
				if(������[��ġ����].equals("[ ]")) {
					������[��ġ����]= "[O]";
					���Ӽ�++;
					break;
				}
				else { System.out.println("�˸�) �̹� ������ �ڸ��Դϴ� �ٸ����� �����ּ���");}
			}
			while(true) {
				Random random = new Random();
				int ��ǻ�� = random.nextInt(9);
				if(������[��ǻ��].equals("[ ]")) {
					������[��ǻ��]= "[X]";
					���Ӽ�++;
					break;
				}
				if (���Ӽ�==9) { break;}
				
			}
			
			for(int i=0;i<9;i+=3) {
				if(������[i].equals(������[i+1])&&������[i+1].equals(������[i+2])) {
					�¸��� = ������[i];
				}
			}
			for(int i=0;i<=2;i++) {
				if(������[i].equals(������[i+3])&&������[i+3].equals(������[i+6])) {
					�¸��� = ������[i];
				}
			}
			
			if(������[0].equals(������[4])&&������[4].equals(������[8])) {
				�¸��� = ������[0];				
			}
			if(������[2].equals(������[4])&&������[4].equals(������[6])) {
				�¸��� = ������[2];				
			}
			if(�¸���== "[O]") {
				System.out.println("�÷��̾� �¸�!");
				break;
			}
			if(�¸���== "[X]") {
				System.out.println("��ǻ�� �¸�!");
				break;
			}
			if(���Ӽ�==9) { System.out.println(" ���º� !");}
			
		}
		for(int i =0 ;i<9;i++) {
			System.out.print(������[i]);
			if(i%3==2) System.out.println();				
		}
	}
}
