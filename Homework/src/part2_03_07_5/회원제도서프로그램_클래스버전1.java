package part2_03_07_5;

import java.util.Scanner;

public class ȸ�����������α׷�_Ŭ��������1 {
	// BookApplication Ŭ���� : ����� �����ڵ�
	// Book Ŭ���� : ���� ���� �ڵ� 
	// Member Ŭ���� : ȸ�� ���� �ڵ� 
	//2
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
	
	// Time  1:40:10
	// ������  �迭 ��� ��ġ �򰥸�, �޼ҵ� ���� �򰥸�, �޼ҵ� ���� �� ����� �򰥸�
	static Scanner scanner = new Scanner(System.in); 
	static Member1[] members = new Member1[100];
	static Book1[] books 	= new Book1[100];
	
	
	public static void main(String[] args) {
		
		ȸ�����������α׷�_Ŭ��������1 app = new ȸ�����������α׷�_Ŭ��������1();
		app.menu();}
		
		void menu() {
			while(true) {
				System.out.println("--------------");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣ ã��"); int ch = scanner.nextInt();
				Member1 member1 = new Member1();
				if(ch==1) {
					boolean result = member1.ȸ������();
					if(result)
						System.out.println(" ȸ������ ����");
					else
						System.out.println("ȸ������ ����");
				}
				else if (ch==2) {
					String result = member1.�α���();
					if(result==null) {
						System.out.println("������ id or ��й�ȣ�� ����");
					}
					else if(result.equals("admin")) {
						System.out.println("�������"+result+"��");
						adminmenu();
					}
					else {
					System.out.println("�������"+result+"��");
					membermenu(result);
					}
				
				
				}
				else if(ch==3) {
					member1.���̵�ã��();					
				}
				else if(ch==4) {
					member1.��й�ȣã��();					
				}
				else System.out.println("�˼����� ��ȣ�Դϴ�.");
				
		
		
			}
		
	}
		
		void membermenu(String loginid) {
			while(true) {
				System.out.println(" --------------- ȸ�� �޴� ------------------");
				System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ���� : ");
				int ch=scanner.nextInt();
				Book1 book1 = new Book1();
				if(ch==1) {book1.�����˻�();}
				else if(ch==2) {book1.�������();}
				else if(ch==3) {book1.�����뿩(loginid);}
				else if(ch==4) {book1.�����ݳ�(loginid);}
				else if(ch==5) {return;}
				else {System.out.println("�˼����� �Է�");}
				
			}
		}
		
		void adminmenu() {
			while(true) {
				System.out.println(" --------------- ������ �޴� ------------------");
				System.out.print("1.������� 2.������� 3.�������� 4.�α׾ƿ� ���� : ");
				int ch=scanner.nextInt();
				Book1 book1 = new Book1();
				if(ch==1) {book1.�������();}
				else if(ch==2) {book1.�������();}
				else if(ch==3) {book1.��������();}
				else if(ch==4) {return;}
				else {System.out.println("�˼����� �Է�");}
				
			}
			
		}
		
		
		
}

	