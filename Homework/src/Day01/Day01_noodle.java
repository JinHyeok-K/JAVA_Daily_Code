package Day01;

import java.util.Scanner;

public class Day01_noodle { // class start

	public static void main(String[] args) { // main start
		
		// ��鷹���� [ ����� / �ݺ��� / ��� ] 
		/* if�� �������� ���
		 * ==> 1. ������� ��, �� ����
		 * ==> 2. ��� ���� ���� ��, �� ����
		 * 	   ==> 2-1 ���� ����(300,550,800ml) ����
		 *     ==> 2-2 ���� �߰� ����
		 *     end 	
		 *   
		 */
		Scanner scanner = new Scanner(System.in); // �Է� ��ü ����
		int time = 90; // ���� �ð��� ���� ����
		
		
		// ��� ��, ��
//		while(true) { // ��� ���̱� while start 
		// ���� �޴� on	
		System.out.println(" =======================================");
		System.out.println(" =========== ��� ������! ===========");
		System.out.println(" �������� ����� �ֽ��ϱ�?");
		System.out.println(" 1. ��   | 	2. �ƴϿ� ");
		System.out.println(" ���� : >");	int ��麸�� = scanner.nextInt();
			if(��麸��==1) { // 
				System.out.println(" ����� ���� �Ͻðڽ��ϱ�? ");
				System.out.println(" 1. ��   | 	2. �ƴϿ� ");	
				System.out.println(" ���� : >");	int ������� = scanner.nextInt();
				
				
				boolean waterok = true;
				while(waterok) {
					if(������� == 1) { 
						System.out.println(" ��� ���� ���� ");
						System.out.println(" ���� ���� ���� �� �ּ��� ");
						System.out.println(" 1.300ml 2.550ml 3.800ml ");
						System.out.println(" ���� : >");	int ���� = scanner.nextInt();
						if(���� == 1) { // �� �� ���� R3
							System.out.println(" �������� ���� �� ���� 550ml�Դϴ� �׷��� ���� �Ͻðڽ��ϱ�? ");
							System.out.println(" 1.�� 2.�ƴϿ� ");
							System.out.println(" ���� : >");	int ����330 = scanner.nextInt();
							if(����330==1) { //��� ���� ���� R3_1 
								System.out.println(" ========= ������ ���� ========= ");
								System.out.println(" 1. ������ ���� ���� �ְ� ���̱� 2. ������ ���� ��� �� �ְ� ���̱� 3. �� ���� ���� �� �ְ� ���̱�");
								System.out.println(" ���� : >");	int ������1 = scanner.nextInt();
									if(������1==1) { 
										System.out.println(" ���� �� ���� ���� �ְ� ���Դϴ�.");
										for (int i=1;i<=time;i++) { // time check
											System.out.println("�� ���� �� :" +(i*3)+"s");
										}
										System.out.println(" ���� �������ϴ�  ���� �����ðڽ��ϱ�? ");
										System.out.println(" 1. �� 		2. �ƴϿ�	");
										System.out.println(" ���� : >");	int ������1_1 = scanner.nextInt();
										if(������1_1==1) { 
											System.out.println(" ���� �־����ϴ�. ");
											for (int i=1;i<=time;i++) {
												System.out.println("��� ���� �� :" +(i*2)+"s");
											}
											System.out.println(" ������ �����ðڽ��ϱ�?");
											System.out.println(" 1. �� 		2. �ƴϿ�	");
											System.out.println(" ���� : >");	int ������1_���� = scanner.nextInt();
											if(������1_����==1) { 
												System.out.println(" ���� ������ ������ �ּ���");
												System.out.println(" 1. ��� 2.ġ�� ");
												System.out.println(" ���� : >");	int ������1_����_���� = scanner.nextInt();
												if(������1_����_����==1) {
													for (int i=1;i<=time;i++) {
														System.out.println("��� ���� �� :" +(i)+"s");
													}
													System.out.println(" ��� ����� �ϼ��߽��ϴ�.");
													break;
												}
												else {
													for (int i=1;i<=time;i++) {
														System.out.println("��� ���� �� :" +(i)+"s");
													}
													System.out.println(" ġ�� ����� �ϼ��߽��ϴ�.");
													break;
												}
											}
											else 
												for (int i=1;i<=time;i++) {
												System.out.println("��� ���� �� :" +(i)+"s");
												}
												System.out.println(" ����� �ϼ��߽��ϴ�.");
												break;
										}
										else System.out.println(" ���� �� �̾Ƽ� ����� ���� �� �����ϴ� ������ �� �� ������");
										break;
									}
									else if( ������1==2) {
										System.out.println(" 2. ������ ���� ��� �� �ְ� ���Դϴ�.");
										for (int i=1;i<=time;i++) {
											System.out.println("��� ���� �� :" +(i*2)+"s");
											}
										
										System.out.println(" ������ �����ðڽ��ϱ�?");
										System.out.println(" 1. �� 		2. �ƴϿ�	");
										System.out.println(" ���� : >");	int ������1_1 = scanner.nextInt();	
										if(������1_1==1) { 
											System.out.println(" ���� ������ ������ �ּ���");
											System.out.println(" 1. ��� 2.ġ�� ");
											System.out.println(" ���� : >");	int ������1_����_���� = scanner.nextInt();
											if(������1_����_����==1) {
												for (int i=1;i<=time;i++) {
													System.out.println("��� ���� �� :" +(i)+"s");
												}
												System.out.println(" ��� ����� �ϼ��߽��ϴ�.");
												break;
											}
											else {
												for (int i=1;i<=time;i++) {
													System.out.println("��� ���� �� :" +(i)+"s");
												}
												System.out.println(" ġ�� ����� �ϼ��߽��ϴ�.");
												break;
											}
										}
										else 
											for (int i=1;i<=time;i++) {
											System.out.println("��� ���� �� :" +(i)+"s");
											}
											System.out.println(" ����� �ϼ��߽��ϴ�.");
											break;
									}
									else {System.out.println(" ���� ���� �� �� ����� ���Դϴ�.");
										for (int i=1;i<=time;i++) {
										System.out.println("�� ���� �� :" +(i)+"s");
										}
										System.out.println(" ������ �����ðڽ��ϱ�?");
										System.out.println(" 1. �� 		2. �ƴϿ�	");
										System.out.println(" ���� : >");	int ������1_���� = scanner.nextInt();	
										if(������1_����==1) { 
											System.out.println(" ���� ������ ������ �ּ���");
											System.out.println(" 1. ��� 2.ġ�� ");
											System.out.println(" ���� : >");	int ������1_����_���� = scanner.nextInt();
											if(������1_����_����==1) {
												for (int i=1;i<=time;i++) {
													System.out.println("��� ���� �� :" +(i)+"s");
												}
												System.out.println(" ��� ����� �ϼ��߽��ϴ�.");
												break;
											}
											else {
												for (int i=1;i<=time;i++) {
													System.out.println("��� ���� �� :" +(i)+"s");
												}
												System.out.println(" ġ�� ����� �ϼ��߽��ϴ�.");
												break;
											}
										}
										else 
											for (int i=1;i<=time;i++) {
											System.out.println("��� ���� �� :" +(i)+"s");
											}
											System.out.println(" ����� �ϼ��߽��ϴ�.");
											break;
									
									}
							}
						}
						else if(����==2) {
							for (int i=1;i<=time;i++) {
								System.out.println("��� ���� �� :" +(i*2)+"s");
							}
							System.out.println(" ������ �����ðڽ��ϱ�?");
							System.out.println(" 1. �� 		2. �ƴϿ�	");
							System.out.println(" ���� : >");	int ������1_1 = scanner.nextInt();	
							if(������1_1==1) { 
								System.out.println(" ���� ������ ������ �ּ���");
								System.out.println(" 1. ��� 2.ġ�� ");
								System.out.println(" ���� : >");	int ������1_����_���� = scanner.nextInt();
								if(������1_����_����==1) {
									for (int i=1;i<=time;i++) {
										System.out.println("��� ���� �� :" +(i)+"s");
									}
									System.out.println(" ��� ����� �ϼ��߽��ϴ�.");
									break;
								}
								else {
									for (int i=1;i<=time;i++) {
										System.out.println("��� ���� �� :" +(i)+"s");
									}
									System.out.println(" ġ�� ����� �ϼ��߽��ϴ�.");
									break;
								}
							}
							else 
								for (int i=1;i<=time;i++) {
								System.out.println("��� ���� �� :" +(i)+"s");
								}
								System.out.println(" ����� �ϼ��߽��ϴ�.");
								break;
						}
						
						else //(����==3){
							System.out.println(" �������� ���� �� ���� 550ml�Դϴ� �׷��� ���� �Ͻðڽ��ϱ�? ");
							System.out.println(" 1.�� 2.�ƴϿ� ");
							System.out.println(" ���� : >");	int ����330 = scanner.nextInt();
							if(����330==1) { //��� ���� ���� R3_1 
								System.out.println(" ���� ���� �� �ְ� ���Դϴ�.");
								for (int i=1;i<=time;i++) { // time check
								System.out.println("�� ���� �� :" +(i*3)+"s");
								}
								
								System.out.println(" ���� �������ϴ�  ���� �����ðڽ��ϱ�? ");
								System.out.println(" 1. �� 		2. �ƴϿ�	");
								System.out.println(" ���� : >");	int ������1_1 = scanner.nextInt();
								if(������1_1==1) { 
									System.out.println(" ���� �־����ϴ�. ");
									for (int i=1;i<=time;i++) {
										System.out.println("��� ���� �� :" +(i*2)+"s");
									}
									System.out.println(" ������ �����ðڽ��ϱ�?");
									System.out.println(" 1. �� 		2. �ƴϿ�	");
									System.out.println(" ���� : >");	int ������1_���� = scanner.nextInt();
									if(������1_����==1) { 
										System.out.println(" ���� ������ ������ �ּ���");
										System.out.println(" 1. ��� 2.ġ�� ");
										System.out.println(" ���� : >");	int ������1_����_���� = scanner.nextInt();
										if(������1_����_����==1) {
											for (int i=1;i<=time;i++) {
												System.out.println("��� ���� �� :" +(i)+"s");
											}
											System.out.println(" ��� ����� �ϼ��߽��ϴ�.");
											break;
										}
										else {
											for (int i=1;i<=time;i++) {
												System.out.println("��� ���� �� :" +(i)+"s");
											}
											System.out.println(" ġ�� ����� �ϼ��߽��ϴ�.");
											break;
										}
									}
									else 
										for (int i=1;i<=time;i++) {
										System.out.println("��� ���� �� :" +(i)+"s");
										}
										System.out.println(" ����� �ϼ��߽��ϴ�.");
										break;
								}
								else System.out.println(" ���� �� �̾Ƽ� ����� ���� �� �����ϴ� ������ �� �� ������");
								break;
							}
						
					}	
					else if (�������==2) {
						waterok=false;
							if (waterok==false) {
								 { System.err.println(" ���߿� �����ϼ��� ");}	
							}
					break;}
				}
				
					
			}
			
			else {System.err.println(" ��鵵 ���µ� ��� ������ ��Ϳ�");}			
//		}// ��� ���̱� while end
	} // main end
	
}// class end
