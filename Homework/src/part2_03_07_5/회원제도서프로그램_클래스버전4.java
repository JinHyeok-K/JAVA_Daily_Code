package part2_03_07_5;

import java.awt.print.Book;
import java.util.Scanner;

public class ȸ�����������α׷�_Ŭ��������4 {
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
		
		// Time  :42:20
		// ������
	static Scanner scanner = new Scanner(System.in);
	static Member4[] member4 = new Member4[100];
	static Book4[] book4 = new Book4[100];
	
	public static void main(String[] args) {
	
		ȸ�����������α׷�_Ŭ��������4 app =new ȸ�����������α׷�_Ŭ��������4();
		
		
		app.menu();
		
		
		
		
		
		
		
	}
	
	void membermenu(String loginid) {
		while(true){
			
			System.out.println("ȸ���޴�");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5�α׾ƿ� ����:>");
			int ch = scanner.nextInt();
			Book4 book4 = new Book4();
			if(ch ==1 ) {book4.�����˻�();}
			else if(ch ==2 ) {book4.�������();}
			else if(ch ==3 ) {book4.�����뿩(loginid);}
			else if(ch ==4 ) {book4.�����ݳ�(loginid);}
			else if(ch ==5 ) {break;}
			else  {System.out.println("�˼����� ��ȣ");}
			
			
		}
	}
	void adminmenu() {
while(true){
			
			System.out.println("ȸ���޴�");
			System.out.println("1.������� 2.������� 3.�������� 4.�α׾ƿ� ����:>");
			int ch = scanner.nextInt();
			Book4 book4 = new Book4();
			if(ch ==1 ) {book4.�������();}
			else if(ch ==2 ) {book4.�������();}
			else if(ch ==3 ) {book4.��������();}
			else if(ch ==4 ) {break;}
			else  {System.out.println("�˼����� ��ȣ");}
			
			
		}
	}
	
	
	void menu() {
		while(true) {
			System.err.println("�����뿩 ���α׷�");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4��й�ȣã�� : ");
			int ch = scanner.nextInt();
			Member4 member4 = new Member4();
			if(ch==1) {
				
				boolean result = member4.ȸ������();
				if(result)
					System.out.println("ȸ������ ����");
				else
					System.out.println("ȸ������ ����");				
			}
			else if (ch==2) {
				String result = member4.�α���();
				if(result == null) {
					System.err.println("������ ������ ����");
					
				}else if(result.equals("admin")) {
					System.out.println("����������");
					adminmenu();
				}
				else {System.out.println("�������");
				 	membermenu(result);
				}
			}
			else if (ch==3) {
				member4.���̵�ã��();
			}
			else if (ch==4) {
				member4.��й�ȣã��();
			}
			else System.out.println("�˼����� ��ȣ");
			
		}
	}
	
	
}
