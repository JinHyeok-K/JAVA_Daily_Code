package Test_p2;

import java.util.Scanner;

public class Main {
	
	
	static ȣ�ڿ���_Room[] roomlist = new ȣ�ڿ���_Room[100];	
	public static void main(String[] args) {//ms
//		static ȣ�ڿ���_Room[] roomlist = new ȣ�ڿ���_Room[100];	
//		ȣ�ڿ���_Room[] roomlist = new ȣ�ڿ���_Room[100];	
		ȣ�ڿ��� ȣ�ڿ��Ž��� = new ȣ�ڿ���();	
		Scanner scanner = new Scanner(System.in);
	
		
		while(true) {//�ʱ�޴��ݺ��� ����
			
			System.out.println("----------------ȣ�� ���� ���α׷�----------------");
			System.out.println("\t\t1.ȸ������ 2.�α���"); int ch = scanner.nextInt();
			if(ch==1) {//1.ȸ������
				System.out.println("���̵� �Է��ϼ���"); String id = scanner.next();
				System.out.println("��й�ȣ�� �Է��ϼ���"); String pw = scanner.next();
				System.out.println("�̸��� �Է��ϼ���");	String name = scanner.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���"); String phone = scanner.next();
				
				boolean ��� = Main_Controller.ȸ������(id, pw, name, phone);
				if(���) {
					System.out.println("ȸ�����ԿϷ�!!");
				}else {
					System.out.println("ȸ�����Խ���!!�����Ѿ��̵� �ֽ��ϴ�.");
				}
				
			}// ȸ������ end
			else if(ch==2) {//2.�α���
				System.out.println("�α��������� �Դϴ�");
				System.out.println("���̵� �Է��ϼ���"); String id = scanner.next();
				System.out.println("��й�ȣ�� �Է��ϼ���"); String pw =scanner.next();
				
				int ��� = Main_Controller.�α���(id, pw);
				if(��� == 1) {
					System.out.println("�α��μ���");
					// �Ϲ�ȸ�� �޴� ȣ�� 
					ȣ�ڿ��Ž���.main();
				}else if( ��� == 2) {
					System.out.println("�����ڷα��μ���");
					// ������ȸ�� �޴� ȣ�� 
				}else {
					// ���� �޽��� 
					System.out.println("�α��ν���");
					
				}
		
				
			}//�α��� end
			
			
			
			
			
			
		}//while end �ʱ�޴��ݺ��� ��
		
		
	}//main end
	
}//class end
