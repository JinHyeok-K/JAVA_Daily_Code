package Homework08_Day05_ȸ�����湮��_2D_array_version;

import java.util.Scanner;

public class ȸ�����湮��2 { // time [28:00] | 1ȸ
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
//	20:46 21:14
	// ������  ��ȣó�� �̽� / break ���� �̽�
	public static void main(String[] args) {
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
		// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
		// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		String[][] ȸ�� = new String[10][3];
		String[][] �Խ��� = new String[10][3];
		
		while(true) {//while start
			//ȸ������ ���� 
			Scanner scanner=new Scanner(System.in); //�Է�
			
			System.out.println("===========");
			System.out.println(" ȸ���� �湮��");
			System.out.println("===========");
			System.out.print("1.ȸ������ 2.�α���  ����:>"); int �ʱ⼱��=scanner.nextInt();
			if(�ʱ⼱�� ==1 ) {//�ʱ⼱�� if ==1 start
				//1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				
				
				// 1-1 ȸ������
				System.out.print("id :"); 		String id=scanner.next(); 
				System.out.print("pw :");		String pw=scanner.next();
				System.out.print("name :");		String name=scanner.next();
				
				
				//id�ߺ�üũ
				boolean check = true;
				for(int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
						System.out.println("������ id�� �����մϴ�.");
						check = false;
						break;
					}
				}
				
				if(check==true) {
					for (int i =0 ; i<ȸ��.length;i++) { // ȸ������ for ����
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = id; ȸ��[i][1] = id; ȸ��[i][2] = name;
							System.out.println("ȸ������ �Ϸ�");
							break;
						}
						else {
							System.out.println("ȸ������ ����");
						}
				}
					}//ȸ������ for end 
				
			} //�ʱ⼱�� if ==1 end
			
			if(�ʱ⼱�� ==2 ) { // 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
				System.out.print(" id : ");  String id =scanner.next();
				System.out.print(" pw : ");  String pw =scanner.next();
				
				// cüũ
				boolean check = false;
				for(int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][1].equals(pw)) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						check= true;
						break;
					}
					else {
						System.out.println("��ġ�ϴ� ������ �����ϴ�.");
						break;
					}
				}
				// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
				if (check==true) {
					while(true) {
					System.out.println("=================");
					System.out.println("��ȣ\t����\t����\t�ۼ���");
						for(int i =0 ; i<�Խ���.length;i++) {
							if(�Խ���[i][0]!=null) {
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,�Խ���[i][0],�Խ���[i][1],�Խ���[i][2]);		
							}
							
						}
					System.out.println("=================");
					System.out.print("1.�湮�� ���� 2. �α׾ƿ� | ���� :>" ); int �۸޴� = scanner.nextInt();
						if(�۸޴�==1 ) {
							System.out.print("���� :\n"); String ����=scanner.next();
							System.out.print("���� :\n"); String ����=scanner.next();
							
							 for (int i=0;i<�Խ���.length;i++) {
								 if(�Խ���[i][0]==null) {
									 �Խ���[i][0] = ����; �Խ���[i][1] = ����; �Խ���[i][2] =id;
									 System.out.println("�ۼ��Ϸ�");
									 break;
								 }
								 
								 }
							 }
						else if(�۸޴�==2) {
							System.out.println("�α׾ƿ� �մϴ�.");
							break;		 

						}
					
					}
					
					
					
					
					
				}
			}
			
			
			
			
			
			
		}//while 1 end
	}//me	
}//ce
