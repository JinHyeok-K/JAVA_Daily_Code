package Homework09_Day05_�����뿩;

import java.util.Random;
import java.util.Scanner;
//22-03-17
public class �����뿩5 {
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
		String[][] ȸ�� = new String[100][3];
		String[][] ���� = new String[10][3];
		
//		 admin ���� (������ ������ �迭�� admin ��� )
		Random random = new Random();
		int admin_address = random.nextInt(ȸ��.length);
		String admin_ID ="admin";
		String admin_PW ="admin";
		ȸ��[admin_address][0] = admin_ID; ȸ��[admin_address][1] = admin_PW;
		// admin ��� Ȯ��
		System.out.println(admin_address);
		System.out.println(ȸ��[admin_address][0]);
		System.out.println(ȸ��[admin_address][1]);
//		
		
		
		// �迭 ���� �Ϸ�
		
		while(true) { // master while start
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("================");
			System.out.print("1.ȸ������ 2. �α���"); int �ʱ⼱�� = scanner.nextInt();
			
			if(�ʱ⼱�� == 1) {
				// ȸ������
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				
				//1-1 ȸ������
				//1-2 id �ߺ� üũ
				// ȸ�����Կ� ���� �Է�
				
				System.out.print("id : "); String id=scanner.next();
				System.out.print("pw : "); String pw=scanner.next();
				
				//1-2 �ߺ�üũ
				
				boolean check = true;
				for(int i =0; i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
						System.out.println("�̹� ����ϰ� �ִ� id�Դϴ�.");
						check = false;
						break;
					}
				}//�ߺ�üũ �Ϸ�
				
				if(check== true) {
				//�Է� �Ϸ�
					for (int i = 0 ; i < ȸ��.length ; i++) {
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = id; ȸ��[i][1] = pw;
							System.out.println("ȸ������ �Ϸ�");
							break;
						}//ȸ������ �Ϸ� 1-1
					}
				}
				
			}
			else if(�ʱ⼱�� == 2) {
				//	// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
				System.out.println("================");
				System.out.print(" id :"); String id=scanner.next();
				System.out.print(" pw :"); String pw=scanner.next();
				//�Է¿Ϸ�
				//id ��� ���Ͻ� �α� üũ
				boolean check = false; //�α��� �Ϸ�� true => �α��� �޴� �����
				for (int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][1].equals(pw)) {
						System.out.println("�α��� �Ϸ�");
						check = true;
						
						
							while(check) {
							if(admin_ID.equals(id)) {
								
								System.out.println(" ====������ �޴�====");
								System.out.print("1.������� 2.������� 3.�������� 4.�α׾ƿ� | ���� :>"); int ad=scanner.nextInt();
							
									if(ad==1) { //1 ������� ����  1. ������Ͻ� �������� �Է¹޾� ���� ���ó�� 
												//���������� ��� => : ������ / ���� �뿩 ���� / �뿩��
										System.out.print(" ����� ���� �� : "); String ������= scanner.next();
//										������ �Է� �Ϸ�
//										 ������ ���� �迭 �Է� ���� 
										for (int j=0;j<����.length;j++) {
											if(����[j][0]==null) {
												����[j][0] = ������; ����[j][1] = "����"; ����[j][2] = "-";// ����ִ� �迭�� ������ ���
												System.out.println(" ���� ��� �Ϸ�");
												break;
											}
										}
									}else if(ad==2) { // ���� ��� 
										
										System.out.println("===================================");	
										System.out.println("��ȣ\t ������ \t�뿩���ɿ���\t �뿩��");
										for (int j =0 ; j<����.length;j++) {
											if(����[j][0]!=null&&����[j][1]!=null&&����[j][2]!=null) {
											System.out.printf("%d\t%s\t%s\t\t%s \n",j+1,����[j][0],����[j][1],����[j][2]);
											}
										}
									}
									else if(ad==3) { //���� ���� 
										System.out.print("������ ������(��ȣ) �����ϼ��� : "); 
										int ����=scanner.nextInt(); //���� = ������ ���� �ε���
										boolean del= true;;
									
										if(����[����-1][1]=="�뿩��") {
											System.out.println(" �뿩���� ���� �Դϴ�.");
											del=false;
											
										}
										else if(del==true) {
											System.out.print("�����Ͻ� ������ �����մϴ�. ");
											����[����-1][0] =null;  ����[����-1][1] =null; ����[����-1][2] =null;

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
										}
										
									else if(ad==4) {
										System.out.println(" �α׾ƿ� �մϴ�.");
										break;
										}
											
									else {System.out.println("�߸��� �Է��Դϴ�. ");}
								
							}
							else if (!"admin".equals(id)) {	
									System.out.println("=========================");
									System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�"); int ȸ������=scanner.nextInt();
									
									if(ȸ������==1 ) {
										System.out.println("�˻� �� ����"); String �˻����� = scanner.next();
										for(int j = 0 ; j<����.length;j++) {
											if(����[j][0]!=null&&����[j][0].equals(�˻�����)) {
												System.out.println("=======================");
												System.out.println("������\t ���⿩��\t ������");
												System.out.printf("%s\t%s\t%s\n",����[j][0],����[j][1],����[j][2]);
											}
										}
									}
									else if(ȸ������==2) {
										System.out.println("===================================");	
										System.out.println("��ȣ\t ������ \t�뿩���ɿ���\t �뿩��");
										for (int j =0 ; j<����.length;j++) {
											if(����[j][0]!=null&&����[j][1]!=null&&����[j][2]!=null) {
											System.out.printf("%d\t%s\t%s\t%s \n",j+1,����[j][0],����[j][1],����[j][2]);
											}
										}
									}
									else if(ȸ������==3) { //3.�����뿩
										System.out.print("�뿩�Ͻ� å  �Է��ϼ���"); String �뿩����=scanner.next();
										for(int k=0;k<����.length;k++) {
											if(����[k][1]=="�뿩��") {
												System.out.println("�뿩���� �����Դϴ� �뿩�� ���� �ʽ��ϴ�.");
												break;
											}
										}
										
										
										for (int j =0 ; j<����.length;j++) {
											if(����[j][0]!=null&&����[j][0].equals(�뿩����)){
//											
											����[j][1]="�뿩��"; ����[j][2]=id; 
//											if()
											ȸ��[j][2]=����[j][0];
											System.out.println("�뿩 �Ϸ�");
											break;
											}
										}
									}
									else if(ȸ������==4) {
										
									
												System.out.println(" �뿩�� å�� �ݳ��մϴ�.");
												for (int k =0 ; k<����.length;k++) {
													if(����[k][2]!=null&&����[k][2].equals(id)) {
														����[k][1]="����"; ����[k][2]="-";
													}
											}
												
										
//										if(rebound=true) 
										{
//										System.out.println(" �뿩�� å�� �ݳ��մϴ�.");
//										for (int j =0 ; j<����.length;j++) {
//											if(����[j][2]!=null&&����[j][2].equals(id)) {
//												����[j][1]="����"; ����[j][2]="-";
											
										}
											
									}
										
										
										
									
									else if(ȸ������==5) {
										System.out.println("�α׾ƿ�");
										break;
									}
									else {}
								}//else 
			
						}
					}
//					else {System.out.println("��ġ�ϴ� ������ �����ϴ�.");break;}
				}
				
			}//if 2 end		
			else { System.out.println(" �߸��� �Է��Դϴ�. ");}
		}// while end
			
		
	}//main end
}//class end