package part2_03_07_5;

import java.util.Scanner;

public class ȸ�����������α׷�_Ŭ��������2 {
	// BookApplication Ŭ���� : ����� �����ڵ�
		// Book Ŭ���� : ���� ���� �ڵ� 
		// Member Ŭ���� : ȸ�� ���� �ڵ� 
		
		// * ���� �뿩 console ���α׷�[ Ŭ�������� ]
			// 1. Ŭ���� ���� 
				// 1. book
					// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
					// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
				// 2. member
					// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
					// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
			// 2. ȭ�� ���� 
				// 1. �ʱ� �޴� [ 1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��  ]
				// 2. �Ϲ�ȸ���޴� [ 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]
				// 3. �����ڸ޴�  [ 1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�
		
		// * main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ� 
			// ��������  :  { �������� } ��ȣ������ ����� ������ { } ���� ������
				// ���� �ٸ� { } ��ȣ ������ ���� -> �������� 
			// static  : ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ����� �޸� �ʱ�ȭ
				// ���α׷� ���������� ������ ���Ǵ� �޸�[����]
		
		// Time 51:00
		// ������
	static Scanner scanner = new Scanner(System.in);
	static Member2[] member2 = new Member2[100];
	static Book2[] book2= new Book2[100];
	
	public static void main(String[] args) {
		
		ȸ�����������α׷�_Ŭ��������2 app = new ȸ�����������α׷�_Ŭ��������2();
		app.menu();
	}
	
	void menu() {
		while(true) {
	
			System.out.println("���� �뿩 ���α׷�");
			System.out.println(" [ 1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��  ]");
			int ch =scanner.nextInt();
			Member2 member2 = new Member2();
			if(ch==1) {
				
				boolean result = member2.ȸ������();
				if(result)
					System.out.println("ȸ������ ����");
				else
					System.out.println("ȸ������ ����");
			}	
			else if(ch==2) {
				String result = member2.�α���();
				if(result == null) {
					System.out.println("�α��� ����");
				}
				else if(result.equals("admin")) {
					System.out.println("������ ����");
					adminmenu();
				}
				else
					System.out.println("�������");
					membermenu(result);
			}
			else if(ch==3) {
				member2.���̵�ã��();
			}	
			else if(ch==4) {
				member2.��й�ȣã��();
			}
			else {System.out.println("�� ����?");}
			
		}
	}
	
	
	void membermenu(String loginid) {
		while(true) {
			System.out.println("ȸ���޴�");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ");
			int ch= scanner.nextInt();
			Book2 book2 = new Book2();
			if(ch==1) {book2.�����˻�();}
			else if(ch==2) {book2.�������(); }
			else if(ch==3) { book2.�����뿩(loginid);}
			else if(ch==4) { book2.�����ݳ�(loginid);}
			else if(ch==5) { return;}
			else {System.out.println("�� �����ž�?");}
		}
	}
	void adminmenu() {
		while(true) {
			System.out.println("�����ڸ޴�");
			System.out.println("1.������� 2.������� 3.�������� 4.�α׾ƿ� ");
			int ch= scanner.nextInt();
			Book2 book2 = new Book2();
			if(ch==1) {book2.�������();}
			else if(ch==2) {book2.�������(); }
			else if(ch==3) { book2.��������();}
			else if(ch==4) { return;}
			
			else {System.out.println("�� �����ž�?");}
		}
	}
	
	
	
	
	
	
	
	
}
