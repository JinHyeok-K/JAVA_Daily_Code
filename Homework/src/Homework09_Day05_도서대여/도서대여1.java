package Homework09_Day05_�����뿩;

import java.util.Random;
import java.util.Scanner;

public class �����뿩1 {
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
		String[][] ���� = new String[10][3];
		
		// admin ���� (������ ������ �迭�� admin ��� )
//		Random random = new Random();
//		int admin_address = random.nextInt(ȸ��.length);
//		String admin_ID ="admin";
//		String admin_PW ="admin";
//		ȸ��[admin_address][0] = admin_ID; ȸ��[admin_address][1] = admin_PW;
////		// admin ��� Ȯ�� code
//		System.out.println(admin_address);
//		System.out.println(ȸ��[admin_address][0]);
//		System.out.println(ȸ��[admin_address][1]);
//		
		// �迭 ���� ���� �Ϸ�
//		2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
		while(true) { //master while start
			// �Է� ��ü Ȱ��ȭ
			try {
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
							break;
						}
	//					}else if( ȸ��[i][0] !=null && ȸ��[i][0].equals(id) &&	 // null �� �ƴϴ� = ȸ���� �ִ�. 
	//							ȸ��[i][1].equals(pw)&&ȸ��[i][0].equals(admin_ID)){
	//						System.err.println(" �˸�)) ������ �α��� ����");
	//						check = true; // �α��� ���� �� ����
	//						break;
	//					}
						
					}
						if(check==true) {
							while(check) {
	//						 �α��ν� ���̵� admin �̸� �����ڸ޴�
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
										boolean del= true;
										for(int i=0;i<����.length;i++) {
											if(����[i][1]=="�뿩��") {
												System.out.println(" �뿩���� ���� �Դϴ�.");
												del = false;
												break;
											}
										}
										if(del=true) {
											System.out.print("�����Ͻ� ������ �����մϴ�. ");
											����[����-1][0] =null;  ����[����-1][1] =null; ����[����-1][2] =null;
	//												����[����-1] = null; //�Է¹��� ���� index null ó��
											int i1 =����-1; // �ε��� �����
											for(int j=i1;j<����.length;j++) {
												if(j==����.length-1) {
													����[����.length-1][0]=null;
													����[����.length-1][1]=null;
													����[����.length-1][2]=null;
													break;
												}
											����[j] = ����[j+1];
											}
										}
											
		//											
									}
									else if(ad==4) {
										System.out.println(" �α׾ƿ� �մϴ�.");
										break;
										}
									else {System.out.println("�� �� ���� ���� �Է��Ͽ����ϴ�. ");}
								}
									if(!"admin".equals(id)) {	
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
											boolean borrow=true;
											for (int i=0;i<����.length;i++) {
												if(����[i][1]=="�뿩��") {
													System.out.println(" �뿩���� å �Դϴ�.");
													borrow =false;
													break;
												}
											}
											if (borrow==true) {
												for (int i =0 ; i<����.length;i++) {
													if(����[i][0]!=null&&����[i][0].equals(�뿩����)){
		//											if(����[i][0]!=null&&����[i][1]!=null&&����[i][2]!=null) 
													System.out.println("�뿩 �Ϸ�");
													����[i][1]="�뿩��"; ����[i][2]=id; ȸ��[i][2]=����[i][0];  
													}
												}
											}
										}
										else if(ȸ������==4) {
											for (int i =0 ; i<ȸ��.length;i++) {
												if(ȸ��[i][0]!=null&&ȸ��[i][2]==null) {
													System.out.println(" �뿩�Ͻ� å�� �����ϴ�.");
													break;
												}
												else {
//												for(int j =0 ; j<ȸ��.length;j++) {
													if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][2]!=null) {
													System.out.println(" �뿩�� å�� �ݳ��մϴ�.");
													if(����[i][2]!=null&&����[i][2].equals(id)) {
														����[i][1]="���� "; ����[i][2]="-";
														
//													}
												}
													}break;
												}
											}
										}
										else if(ȸ������==5) {
											System.out.println("�α׾ƿ�");
											break;
										}
										else {}
									}
							
							}
						}
				}//if 2 end		
				else { System.out.println("�߸��� �Է��Դϴ�.");}
			}catch(Exception e) {
				System.out.println("���� �߻�");
				System.out.println(e);
			}
		}// while end
//			else { System.out.println(" �߸��� �Է��Դϴ�. ");}
		
	}//main end
}//class end
