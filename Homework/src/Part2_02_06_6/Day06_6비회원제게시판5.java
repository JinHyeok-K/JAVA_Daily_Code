package Part2_02_06_6;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Day06_6��ȸ�����Խ���5 {
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
	// time [29"16]
	// ������ :��ȣ�̼� // ���鼭�ڵ�
	
	// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in); //�Է°�ü �ε�
		Board5[] boardlist = new Board5[100]; // �迭 ���� 100��
		
		while(true) { //���ѷ��� ����
			
			System.out.println("��ȣ\t����\t�ۼ���"); // ��ȣ/����/�ۼ��� ���
			int index = 0; //���� �ε��� ����
			for(Board5 temp : boardlist) { // �迭 ũ�⸸ŭ �ݺ��� ����
				if(temp!=null) { // temp �� null�� �ƴҶ�
					System.out.printf("%d\t%s\t%s\n",index+1,temp.title,temp.writter); // �ε���, temp��° Ÿ��Ʋ, temp��° ���� ��
				}
				index++; //�ε��� 1 ����
				
			}
			// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
			System.out.println("1.�۾��� 2�ۺ���"); int ch=scanner.nextInt(); //���� �޴� ��� / �� ����
			if(ch==1) { //�۾��� ����
				System.out.println("�� ���� �޴�"); 
				System.out.println(" ���� :"); String title = scanner.next();
				System.out.println(" ���� :"); String contents = scanner.next();
				System.out.println(" �ۼ��� :"); String writter = scanner.next();
				System.out.println(" ��й�ȣ :"); String password= scanner.next();
				//�۾��� �޴��� �ش�Ǵ� ��ü�� �Է� : ����,����,����,��й�ȣ
				Board5 board = new Board5(title, contents, writter, password);
				// board  �迭�� �Է°� ����
				int i=0; // ���� i 0���� �ʱ�ȭ
				for(Board5 temp : boardlist) { //�迭���̸�ŭ �ݺ��� ����
					if(temp==null) { // �迭�� temp��°  �� null�̶��
						boardlist[i] = board; //i��° �迭�� (���� 0) board �迭�� ���� 
						System.out.println("��� �Ϸ�");//��ϿϷ� ���
						break;//�迭 ���� �Ϸ� �Ŀ� �ݺ��� Ż��
					}
					i++; // i�� 1������ (������)
				}
			}
			else if(ch==2) { // �� �� �Է�
				System.out.println("���� �� ��ȣ�� �Է� "); int view=scanner.nextInt(); // �Խù� ����
				System.out.printf("%d\t%s\t%s\t%s\n",view,boardlist[view-1].title,boardlist[view-1].writter,
						boardlist[view-1].contents);  // ������ �Խù� ���
				System.out.println("1.��Ϻ��� 2.����. 3����"); int ch2 =scanner.nextInt(); //�Խù� ��� �� ���� �޴� �� ����
				if(ch2 ==1) {} //��Ϻ���� �ڷ�
				else if(ch2 ==2){ // ���� ����
					System.out.println("��й�ȣ �Է�"); String password= scanner.next(); //��й�ȣ �Է�
					if(boardlist[view-1].password.equals(password)) { // ������ �Խñ��� ��й�ȣ�� �Է��� ��й�ȣ�� ������ �Խù� ����
						boardlist[view-1] =null;
						System.out.println("�����Ǿ����ϴ�."); //�Խù� ���� �ȳ� �޼���
					
						for(int i = view-1;i<boardlist.length;i++) {// �ε��� ����� | ������ �Խù���ȣ�������� �迭���̱��� 1������  
							if(i==boardlist.length-1) { // i�� �ִ�迭����-1 �� ������
								boardlist[boardlist.length-1] = null; //�迭�� �ִ�迭-1 �� ����null ó��
							}
							else boardlist[i] = boardlist[i+1]; // �� �� i��° �迭�� i+1 �迭�� �� ����
						}
					
					}else System.out.println("��й�ȣ�� �ٸ��ϴ�."); // ��й�ȣ �̽���Ī�� ���
				}
				else if(ch2 ==3){ //���� �޴� ����
					System.out.println("��й�ȣ �Է�"); String password= scanner.next(); //��й�ȣ �Է� �ȳ� �� �Է�
					if(boardlist[view-1].password.equals(password)) { //������ �Խñ��� ��й�ȣ�� �Է��� ��й�ȣ�� ������
						
						System.out.println("�����մϴ�."); //���� �޼��� ���
						System.out.println(" ���� : "); String title= scanner.next(); //����,����,�ۼ��� �Է�
						System.out.println(" ���� : "); String contents= scanner.next();
						System.out.println(" �ۼ��� : "); String writter= scanner.next();
						boardlist[view-1].title=title; //�Էµ� ���� �ش� �迭��(�ش�Խù�) ������
						boardlist[view-1].contents=contents;
						boardlist[view-1].writter=writter;
					}
					else System.out.println("��й�ȣ�� �ٸ��ϴ�."); //��й�ȣ�� �ٸ� �� ���
				}
			}
		}
	}
}
