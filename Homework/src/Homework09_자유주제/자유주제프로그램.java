package Homework09_��������;

import java.util.Random;
import java.util.Scanner;

/* 1���� �迭 ��ġ ǥ�� �ֻ�������
	1. ���� �迭 ĭ �Է�=> ������ ũ�� ����
	2. �ֻ��� ���� (Random) 
	3. ���� ��ŸƮ �� ����, ��ǻ�� �� ��ġ ǥ�� '����:[O], ��ǻ��:[X]'
		3-1 ���� ���� �� �� ���� ��ġ ����
	4. ���� ��ġ �� ���������� ���� ���� 
		4-1 ���� �¸��� ���� ��ġ�� [O] ǥ��
		4-2 ��ǻ�� �¸��� ���� ��ġ�� [X] ǥ��
	5. ������ ��ġ ���� ������ ���ӹ迭 �� �̻� Ȥ�� ������ �¸�  

*/
public class �����������α׷� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		
		
		System.out.println(" mini �η縶�� ");
		System.out.println("���� �� ũ�� ����"); int round=scanner.nextInt();
		System.out.println("�ֻ��� �� ����"); int eyes=scanner.nextInt();
		String[] ������ = new String[round];
		String[] ������_play = new String[round];
		String[] ������_com = new String[round];
		
		for(int i=0;i<������.length;i++) {
			������[i]="[ ]";
//			������_play[i]="[ ]";
//			������_com[i]="[ ]";
		}
		int saveposi_P=-1;
		int saveposi_C=-1;
		int ���Ӽ�=0;
		while(true) {
//			System.out.println("=================");
			
			int dice1 = random.nextInt(eyes)+1;
			int dice2 = random.nextInt(eyes)+1;
	
			int sumDice = dice1+dice2;
			for(int i =0 ;i<������.length;i++) {
//				System.out.println("=================");
				System.out.print(������[i]);
//				if(i/10==0) System.out.println();
//				System.out.println("=================");				
			}
			
			System.out.println(" \n======User Turn! �ֻ����� �����ϴ�.====== ");
			System.out.println(" �ƹ�Ű�� �Է��ϼ���"); String el=scanner.next();
			System.out.println("=====���� "+sumDice+"�� ���Խ��ϴ�.=====");
			
			
			
			
			saveposi_P = saveposi_P+sumDice;
			if(���Ӽ�>0&&saveposi_C<������.length&&saveposi_P>=������.length) {
				saveposi_P = round;
	
				System.out.println("�����¸�!");
				System.out.println("�ȳ������ʽÿ�");
				break;
			}
			if(������[saveposi_P].equals("[ ]")) {
				
				������[saveposi_P] ="[O]";
				if(���Ӽ�>0) {
//					
						������[saveposi_P-sumDice] = "[ ]";
//					}
				}
			}
			
			
			else if(������[saveposi_P].equals("[X]")){
				System.err.println("��ǻ�Ϳ� ������ġ!");
				System.out.println("==��������������!==");
				while(true) {
					int com =random.nextInt(2);
					System.out.println("0.���� 1.����. 2.�� "); // 0.���� 1.����. 2.�� 3.���� ���� ���
					System.out.print("���� : "); int ���� = scanner.nextInt();
					if(����==0&&com==2 || ����==1&&com==0 || ����==2 && com==1) { 
						System.out.println(" ���� �¸�!");
						 
						������[saveposi_C] ="[ ]"; 
						������[saveposi_P] ="[O]";
						saveposi_C=-1;
						for(int i=0;i<������.length;i++) {
							if(������[i].equals("[X]")) {
								������[i] = "[ ]";
									
							}
						}
						break;
					}
					else if(����==0&&com==0||����==1&&com==1||����==2&&com==2) {
						System.out.println("���º�! �ٽ�!");
					}
					else {System.out.println("�й��Ͽ����ϴ�.");
						������[saveposi_P] ="[ ]"; 
						������[saveposi_C] ="[X]"; 
						saveposi_P=-1;
						for(int i=0;i<������.length;i++) {
							if(������[i].equals("[O]")) {
								������[i] = "[ ]";
								
							}
						}
						break;
					}
				}
			}
			for(int i =0 ;i<������.length;i++) {
				System.out.print(������[i]);
//				if(i/10==0) System.out.println();
			}
			System.out.println("\n======��ǻ�� Turn======");
			int com_dice1 =random.nextInt(eyes)+1;
			int com_dice2 =random.nextInt(eyes)+1;
			int com_dice = com_dice1+com_dice2;
			System.out.println("���� "+com_dice+"�� ���Խ��ϴ�.");
			
			saveposi_C = saveposi_C+com_dice;
			if(saveposi_P<������.length&&saveposi_C>=������.length) {
				saveposi_C = round;
				System.out.println("��ǻ�ͽ¸�!");
				System.out.println("������?");
				break;
			}
			if(������[saveposi_C].equals("[ ]")) {
				������[saveposi_C] = "[X]";
				if(���Ӽ�>0) {
					������[saveposi_C-com_dice] = "[ ]";
				}
			}
			else if(������[saveposi_C].equals("[O]")){
				System.out.println("������ ������ġ!");
				System.out.println("==��������������!==");
				while(true) {
					int com =random.nextInt(2);
					System.out.println("0.���� 1.����. 2.�� "); // 0.���� 1.����. 2.�� 3.���� ���� ���
					System.out.print("���� : "); int ���� = scanner.nextInt();
					if(����==0&&com==2 || ����==1&&com==0 || ����==2 && com==1) { 
						System.out.println("���� �¸�!");
						������[saveposi_C] ="[ ]"; 
						������[saveposi_P] ="[O]"; 
						saveposi_C =-1;
						for(int i=0;i<������.length;i++) {
							if(������[i].equals("[X]")) {
								������[i] = "[ ]";
							}
						}
						break;
					}
					else if(����==0&&com==0||����==1&&com==1||����==2&&com==2) {
						System.out.println("���º�! �ٽ�!");
					}
					else {System.out.println("��ǻ�� �¸�!");
						������[saveposi_P] ="[ ]";
						������[saveposi_C] ="[X]"; 
						saveposi_P=-1;
						for(int i=0;i<������.length;i++) {
							if(������[i].equals("[O]")) {
								������[i] = "[ ]";
							}
						}
						break;
					}
				}
			}
			���Ӽ�++;
		}
	}
}
