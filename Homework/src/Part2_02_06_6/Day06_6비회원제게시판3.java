package Part2_02_06_6;

import java.util.Scanner;

public class Day06_6��ȸ�����Խ���3 {
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
	// time : 30:20
	// ������ : �����Է� �Ǽ� //for temp �Ǽ�
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board3[] boardlist = new Board3[100];
		
				// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
		while(true) {
			
			System.out.println("��ȣ\t�ۼ���\t����");
			int index=0;
			for(Board3 temp : boardlist) {
				if(temp!=null) {
				System.out.printf("%d\t%s\t%s\n",index+1,temp.title,temp.writter);
				}
				index++;
			}
			// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
			
			System.out.println("===============");
			System.out.println("1.�۾��� 2.�ۺ���");  int ch=scanner.nextInt();
			
			if(ch==1 ) {
				System.out.println("�� �ۼ� �޴�");
				System.out.println("���� : "); String title=scanner.next();
				System.out.println("���� : "); String contents=scanner.next();
				System.out.println("�ۼ��� : "); String writter=scanner.next();
				System.out.println("��й�ȣ : "); String password=scanner.next();
				
				Board3 board = new Board3(title, contents, writter, password);
				int i = 0;
				for (Board3 temp :boardlist) {
					if(temp==null) {
						boardlist[i] = board;
						break;
					}
					i++;
				}
				
			}
			else if(ch==2) {
				System.out.println(" �� �� ���� ");  int view = scanner.nextInt();
				System.out.printf("%d\t%s\t%s\t\n%s\n",view,boardlist[view-1].title,boardlist[view-1].writter,
								boardlist[view-1].contents);
				System.out.println("====================");
				System.out.println("1.��Ϻ��� 2.���� 3.����"); int ch2=scanner.nextInt();
				// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
				if(ch2==1) {}
				else if(ch2==2) {
					System.out.println(" ��й�ȣ�Է�"); String password =scanner.next();
					if(boardlist[view-1].password.equals(password)) {
						System.out.println("���� �Ϸ�");
						boardlist[view-1] = null;
						
						for (int i=view-1;i<boardlist.length;i++) {
							if(i==boardlist.length-1) {
								boardlist[boardlist.length-1] = null;
							}
							else { boardlist[i] = boardlist[i+1];}
						}
					}
					else System.out.println(" ��й�ȣ���ٸ��ϴ�.");
				}
				else if (ch2==3) {
					System.out.println(" ��й�ȣ�Է�"); String password =scanner.next();
					if(boardlist[view-1].password.equals(password)) {
						System.out.println(" ���� ������");
						System.out.println(" ���� : "); String title=scanner.next();
						System.out.println(" ���� : "); String contents=scanner.next();
						boardlist[view-1].contents=contents;
						boardlist[view-1].title=title;
						System.out.println("�����Ϸ�");
					}
					
					else System.out.println(" ��й�ȣ���ٸ��ϴ�.");
				}
			}
			
		}
		
	}
	
}
