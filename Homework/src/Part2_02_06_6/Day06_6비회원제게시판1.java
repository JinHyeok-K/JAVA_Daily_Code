package Part2_02_06_6;

import java.util.Scanner;

public class Day06_6��ȸ�����Խ���1 {
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
	// time 73:15
	// ������ : �ڷ��� �Ǽ� 
	//			�ε��� ���� �Ǽ�
	//		������ ��� �̼�
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Board1[] boardlist = new Board1[100];
		
		while(true) {
			
			
			
			
			// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
			System.out.println("----- �Խ��� -----");
			
			
			int index =0;
			for(Board1 temp : boardlist) {
				if(temp!=null) {System.out.printf("%d\t%s\t%s\n", index+1,temp.writter,temp.title);}
				index++;
			}
			
			System.out.println("1.�۾��� 2.�ۺ���"); int ch1=scanner.nextInt();
			
			if(ch1==1) {
				System.out.println("=========�۾���޴�=========");
				System.out.println(" ���� : "); String title =scanner.next();
				System.out.println(" ���� : "); String contents =scanner.next();
				System.out.println(" �ۼ��� : "); String writter =scanner.next();
				System.out.println(" ��й�ȣ : "); String pw=scanner.next();
				
				Board1 board = new Board1(title, contents, writter, pw);
				
				int i = 0;
				for(Board1 temp : boardlist) {
				
					if(temp==null) {
						boardlist[i] = board;
						System.out.println("�Խù���ϿϷ�");
						break;
					}
					i++;
				}
			}
			
			else if(ch1==2) {
				System.out.println("�� ���� : �� ���� �����ϼ���"); int ind=scanner.nextInt();
				System.out.printf("%s\t\t\t%s\t\n%s\n",boardlist[ind-1].title,boardlist[ind-1].writter,boardlist[ind-1].contents);
				
				
				System.out.println("---------------------\n");
				System.out.println("1.��Ϻ��� 2.���� 3.����"); int ch2= scanner.nextInt();
				// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
				if(ch2==1) {}
				else if(ch2==2) {
					System.out.println(" ��� ��ȣ�� �Է��ϼ���");  String del=scanner.next();
					if(boardlist[ind-1].pw.equals(del)) {
						System.out.println(" ���� �Ϸ�");
						boardlist[ind-1]= null;
					
					// �ε�������� 
					//
						for(int i=ind-1;i<boardlist.length;i++) {
							if (i == boardlist.length-1) {
								boardlist[boardlist.length-1]=null;
							}
							else {boardlist[i]  = boardlist[i+1];}
						}
					}
					else {System.out.println("��� �޶�");}
				}
				else if(ch2==3) {
					
					System.out.println(" ��� ��ȣ�� �Է��ϼ���");  String pw2=scanner.next();
					
					for(Board1 temp:boardlist) {
						if(temp!=null && temp.pw.equals(pw2)) {
							System.out.println(" ���� : "); String ti = scanner.next();
							System.out.println(" ���� : "); String cont = scanner.next();
							
							boardlist[ind-1].title = ti;
							boardlist[ind-1].contents = cont;
							break;
						}
					}
					
					
				}
				else {System.out.println(" �߸��� �Է��Դϴ�.");}
			}
			else {System.out.println(" �߸��� �Է��Դϴ�.");}
			
			
			
			
		}
	}
}
