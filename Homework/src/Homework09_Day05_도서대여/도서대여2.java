package Homework09_Day05_�����뿩;

import java.util.Random;
import java.util.Scanner;

public class �����뿩2 {
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
		2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	2. �ʱ�޴�
		1.ȸ������ 2.�α��� 
			1.ȸ�����Խ� ���̵� �ߺ�üũ 
			2.�α��� ������ �α��θ޴� , �α��� ���н� �α��ν��� ��� 
	3. �α��ν� �޴� 
		1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
 			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
			2. ������Ͻ� ��� ������ ��� 
			3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
			4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
			5. �α׾ƿ� �ʱ�޴��� 
	4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
		1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
			1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
			2. ������Ͻ� ��� ������ ��� 
			3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
			4. �α׾ƿ��� �ʱ�޴��� 
	*/ //13.08 | pause 13:17 | re 18:17 | pause 18:43 | re 19:00 | pause 19:40 |re 19:50
	// end 21:12
	public static void main(String[] args) {
//		1. �迭 ����
//		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
		String[][] ȸ�� = new String[3][3];
		String[][] ���� = new String[3][3];
		
		//�ʱ�ȭ
		for (int i = 0 ; i<ȸ��.length;i++) {
			ȸ��[i][2] = null;
		}
//		
//		// admin ���� (������ ������ �迭�� admin ��� )
//		Random random = new Random();
//		int admin_address = random.nextInt(ȸ��.length);
//		String admin_ID ="admin";
//		String admin_PW ="admin";
//		ȸ��[admin_address][0] = admin_ID; ȸ��[admin_address][1] = admin_PW;
//		// admin ��� Ȯ��
//		System.out.println(admin_address);
//		System.out.println(ȸ��[admin_address][0]);
//		System.out.println(ȸ��[admin_address][1]);
//		
		// �迭 ���� ���� �Ϸ�
//		2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
		while(true) { //master while start
			// �Է� ��ü Ȱ��ȭ
			Scanner scanner = new Scanner(System.in);
//			2. �ʱ�޴�
//			1.ȸ������ 2.�α��� 
//				1.ȸ�����Խ� ���̵� �ߺ�üũ 
//				2.�α��� ������ �α��θ޴� , �α��� ���н� �α��ν��� ��� 
			System.out.println("===========");
			System.out.println("���� �뿩 �ý���");
			System.out.print("1.ȸ�� ���� 2.�α��� | ���� :>"); int �ʱ⼱�� = scanner.nextInt();
			// �ʱ�޴� �Է� 
			// ȸ������ �޴� ����
			// 1-1 ȸ������
			// 1-2 ȸ��id �ߺ� üũ
			
			
			// 
			
			if(�ʱ⼱��==1) {
				// id,pw  �Է�
				System.out.print(" ID : "); String id=scanner.next();
				System.out.print(" PW : "); String pw=scanner.next();
				
				// id �ߺ� üũ
				boolean check =true;
				for (int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
						System.out.println("�̹� ����ϰ��ִ� id�Դϴ�.");
						check=false;
						break;
					}
				}
				if(check == true) {
					for (int i=0;i<ȸ��.length;i++) {
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = id; ȸ��[i][1] = pw; // ȸ�� id pw ����
							System.out.println("ȸ������ �Ϸ�");
							break;
						}
					}
				}	 
			}
			else if(�ʱ⼱��==2) {
				System.out.println("ID : "); String id= scanner.next();
				System.out.println("pw : "); String pw= scanner.next();
				boolean check = false;
				for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ���� | pw check
					
					if( ȸ��[i][0] !=null && ȸ��[i][0].equals(id) &&	 // null �� �ƴϴ� = ȸ���� �ִ�. 
							ȸ��[i][1].equals(pw)) {
						System.err.println(" �˸�)) �α��� ����");
						check = true; // �α��� ���� �� ����
						
					}
				}
					
					
					
					
					if(check==true) {
						while(true) {
//							. �α��ν� ���̵� admin �̸� �����ڸ޴�
								if("admin".equals(id)) {
									
									System.out.println(" ====������ �޴�====");
									System.out.print("1.������� 2.������� 3.�������� 4.�α׾ƿ� | ���� :>"); int ad=scanner.nextInt();
								
										if(ad==1) { //1 ������� ����  1. ������Ͻ� �������� �Է¹޾� ���� ���ó�� 
													//���������� ��� => : ������ / ���� �뿩 ���� / �뿩��
											System.out.print(" ����� ���� �� : "); String ������= scanner.next();
	//										������ �Է� �Ϸ�
	//										 ������ ���� �迭 �Է� ���� 
											for (int i=0;i<����.length;i++) {
												if(����[i][0]==null) {
													����[i][0] = ������; ����[i][1] = "����"; ����[i][2] = "-";// ����ִ� �迭�� ������ ���
													System.out.println(" ���� ��� �Ϸ�");
													break;
												}
											}
										}else if(ad==2) { // ���� ��� 
											
											System.out.println("===================================");	
											System.out.println("��ȣ\t ������ \t�뿩���ɿ���\t �뿩��");
											for (int i =0 ; i<����.length;i++) {
												if(����[i][0]!=null&&����[i][1]!=null&&����[i][2]!=null) {
												System.out.printf("%d\t%s\t%s\t%s \n",i+1,����[i][0],����[i][1],����[i][2]);
												}
											}
										}
										else if(ad==3) { //���� ���� 
											System.out.print("������ ������(��ȣ) �����ϼ��� : "); int ����=scanner.nextInt(); //���� = ������ ���� �ε���
											System.out.print("�����Ͻ� ������ �����մϴ�. ");
											����[����-1][0] =null;  ����[����-1][1] =null; ����[����-1][2] =null;
	//												����[����-1] = null; //�Է¹��� ���� index null ó��
											int i =����-1; // �ε��� �����
											for(int j=i;j<����.length;j++) {
												if(j==����.length-1) {
													����[����.length-1][0]=null;
													����[����.length-1][1]=null;
													����[����.length-1][2]=null;
													break;
												}
											����[j] = ����[j+1];
											}
//											}
											}
										else if(ad==4) {
											System.out.println(" �α׾ƿ� �մϴ�.");
											break;
											}
												
										else {System.out.println(" �߸��� �Է� ");}
									
									
								}
									
								
									System.out.println("=========================");
									System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�"); int ȸ������=scanner.nextInt();
									
									if(ȸ������==1 ) {
										System.out.println("�˻� �� ����"); String �˻����� = scanner.next();
										for(int i = 0 ; i<����.length;i++) {
											if(����[i][0]!=null&&����[i][0].equals(�˻�����)) {
												System.out.println("=======================");
												System.out.println("������\t ���⿩��\t ������");
												System.out.printf("%s\t%s\t%s\n",����[i][0],����[i][1],����[i][2]);
											}
											
										}
										
									}
									else if(ȸ������==2) {
										System.out.println("===================================");	
										System.out.println("��ȣ\t ������ \t�뿩���ɿ���\t �뿩��");
										for (int i =0 ; i<����.length;i++) {
											if(����[i][0]!=null&&����[i][1]!=null&&����[i][2]!=null) {
											System.out.printf("%d\t%s\t%s\t%s \n",i+1,����[i][0],����[i][1],����[i][2]);
											}
										}
									}
									else if(ȸ������==3) { //3.�����뿩
										System.out.print("�뿩�Ͻ� å?"); String �뿩����=scanner.next();
										
										for (int i =0 ; i<����.length;i++) {
											System.out.println(ȸ��[i][2]);
											if(ȸ��[i][2]!=null) {
												System.out.println("�ִ� �뿩 ������ �Ǽ��� �ʰ��Ͽ����ϴ�.");
												System.out.println(ȸ��[i][2]);
												break;
											}
											else if(����[i][0]!=null&&����[i][0].equals(�뿩����)){										
											System.out.println("�뿩 �Ϸ�");
											
											����[i][1]="�뿩�� "; ����[i][2]=id;  ȸ��[i][2] = ����[i][0];
											System.out.println(����[i][2]);
											}
										}
									}
									else if(ȸ������==4) {
										System.out.println(" �뿩�� å�� �ݳ��մϴ�.");
										for (int i =0 ; i<����.length;i++) {
											if(����[i][2]!=null&&����[i][2].equals(id)) {
												����[i][1]="���� "; ����[i][2]="-";
											}
										}
											
									}
									else if(ȸ������==5) {
										System.out.println("�α׾ƿ�");
										break;
									}
									else {}
								
								
								
						
								
								
								
							
//						1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
//							1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
//							2. ������Ͻ� ��� ������ ��� 
//							3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
//							4. �α׾ƿ��� �ʱ�޴��� 
						
						
						
						
						
						
						
						
	//					3. �α��ν� �޴� 
	//					1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
	//			 			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
	//						2. ������Ͻ� ��� ������ ��� 
	//						3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
	//						4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
	//						5. �α׾ƿ� �ʱ�޴���
//						System.out.println("=========================");
//						System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�"); int ȸ������=scanner.nextInt();
						
						}
						}
						
					
					
					
						
			}//if 2 end		
		}// while end
//			else { System.out.println(" �߸��� �Է��Դϴ�. ");}
		
	}//main end
}//class end