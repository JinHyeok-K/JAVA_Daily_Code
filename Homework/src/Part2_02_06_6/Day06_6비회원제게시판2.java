package Part2_02_06_6;

import java.util.Scanner;

public class Day06_6��ȸ�����Խ���2 {
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
	// 0. �Խù� ���� => Ŭ���� ���� 
		// �ʵ� : ���� , ���� , �ۼ��� , ��й�ȣ
		// ������ : ������� ����
	// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
	// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
		// 1. �۾��� [ ���� , ���� , �ۼ��� , ��й�ȣ => 4������ -> ��üȭ ]
		// 2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
			// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
			// �ۺ��� �޴� 
	// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
		// 1. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����
		// 2. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
	// time 44:10
	// ������ : ��ȣ �Ǽ�
	// 		  �ݺ��� ���� �Ǽ�
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Board2[] boardlist = new Board2[100];
		// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
		while(true) {
					System.out.println("��ȣ\t����\t�ۼ���");
			int index=0;
			for(Board2 temp : boardlist) {
				if(temp!=null) {
					
					System.out.printf("%d\t%s\t%s\n",index+1,temp.title,temp.writter);
				}
				index++;
			}
			
			
			
			// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
			System.out.println("1.�۾��� 2.�ۺ���");  int ch1=scanner.nextInt();
			
			if(ch1==1) {
				System.out.println("�� ���� �޴� ");
				System.out.println("���� :"); String title=scanner.next();
				System.out.println("���� :"); String contents=scanner.next();
				System.out.println("�ۼ��� :"); String writter=scanner.next();
				System.out.println("��й�ȣ :"); String password=scanner.next();
				
				Board2 board = new Board2(title, contents, writter, password);
				int i=0;
				for(Board2 temp : boardlist) {
					if(temp==null) {
						boardlist[i]= board;
						System.out.println("�Խñ� ��� �Ϸ�");
						break;
					}
					i++;
				}
						
			}
			else if(ch1==2) {
				System.out.println("==========�ۺ���==========");
				// 2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
				// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
				// 1. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
				System.out.println("�� �� ��ȣ�� �Է��ϼ���"); int view=scanner.nextInt();
				System.out.printf("%d\t%s\t%s\n%s\n",view,boardlist[view-1].title,boardlist[view-1].writter,
									boardlist[view-1].contents);
				System.out.println("1.��Ϻ��� 2.���� 3.����"); int ch2 = scanner.nextInt();
				if(ch2==1) {}
				else if(ch2==2) {
					System.out.println("��й�ȣ�� �Է��ϼ���"); String password=scanner.next();
					if(boardlist[view-1].password.equals(password)) {
						boardlist[view-1] = null;
						System.out.println("���� �Ϸ�");
						
						for (int i=view-1;i<boardlist.length;i++) {
							if(i==boardlist.length-1) {
								boardlist[boardlist.length-1] = null;
								
							}
							else {
								boardlist[i] = boardlist[i+1];
							}
						}
					}
					else {System.out.println("��й�ȣ�� Ʋ���ϴ�.");}	
				}
				else if(ch2==3) {
					System.out.println(" ��й�ȣ�� �Է��ϼ��� "); String password1 =scanner.next();
					if(boardlist[view-1].password.equals(password1)) {
						System.out.println(" �����մϴ�.");
						System.out.println(" ���� : "); String ���� =scanner.next();
						System.out.println(" ���� : "); String ����=scanner.next();
						System.out.println(" �ۼ��� : "); String �ۼ���=scanner.next();
						
						boardlist[view-1].title=����;
						boardlist[view-1].contents=����;
						boardlist[view-1].writter=�ۼ���;
					}
				}
			}
		}
	}
}


