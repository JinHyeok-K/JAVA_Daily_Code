package Homework08_Day05_ȸ�����湮��_2D_array_version;

import java.util.Scanner;

public class ȸ�����湮��1 {//time [78:00]| 7  // ���赵��θ� ����
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
//	19:20 | 20:38
	// ������ : ���ѷ��� break �̽�
//			   �迭 ũ�� ���� => for �ݺ�Ƚ�� �̽�
	// 			���Ĺ��� �̽� / ������ �̽� ==��ߵǴµ� != ���
	public static void main(String[] args) {
		
		String[][] ȸ�� = new String[100][3];
		String[][] �Խ��� = new String[100][3];
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			System.out.println(" ȸ���� �湮�� ");
			System.out.print(" 1. ȸ������ 2.�α��� "); int �ʱ⼱��= scanner.nextInt();
			
			if(�ʱ⼱�� == 1) {
				
				
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				
				
				// 1-1 ȸ������ (���̵�, ��й�ȣ , �̸�)
				// 1-2 ���̵� �ߺ�üũ
				
				// 1-1 ȸ������ (���̵�, ��й�ȣ , �̸�)
				System.out.print(" id : "); String id= scanner.next();
				System.out.print(" pw : "); String pw= scanner.next();
				System.out.print(" name : "); String name= scanner.next();

				
				// 1-2 ���̵� �ߺ�üũ
				boolean check = true;
				for(int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� id�Դϴ�.");
						
						check = false;
						break;
					}
				}
				if(check == true) {
					for(int i =0 ; i <ȸ��.length;i++) {
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = id; ȸ��[i][1] = pw; ȸ��[i][2] = name;
						
						}
					}	System.out.println("ȸ������ �Ϸ�");
				// ȸ������ ���
				}
				
				
				}	
			else if(�ʱ⼱�� == 2) {
				
				System.out.println("�α��� ������");
				System.out.print(" id :"); String id = scanner.next();
				System.out.print(" pw :"); String pw = scanner.next();
				
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
//				ȸ�� id / pw ���� ��
				boolean check= false;
				for(int i = 0 ; i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&& ȸ��[i][0].equals(id)&&
							ȸ��[i][1].equals(pw)) { 
						System.out.println("�α��� �Ϸ�");
						
						check = true;
						break;
					}else{ 
						System.err.println("��ġ�ϴ� ������ �����ϴ�.");
						break;
					}
				}
				// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
				if(check==true) {
					while(true) {
				
						System.out.println("------------------------");
						System.out.println("--------- �湮�� ---------");
						System.out.println("��ȣ\t�ۼ���\t����\t����");
							// ��� �湮�� ��� 
							for( int j = 0 ; j<�Խ���.length ; j++  ) { // �Խù� �迭 �ݺ��� ó�� 
								if( �Խ���[j][0] != null ) { // �Խù��� ���� �ε����� ���� 
									System.out.printf("%d\t%s\t%s\t%s \n" , 
											j+1 , 
											�Խ���[j][2] , 
											�Խ���[j][0] , 
											�Խ���[j][1] );	
								}
							}
						
						
//					System.out.println("�湮�� �޴� ");
//					System.out.println("============================ ");
//					System.out.print("����\t����\t�ۼ���\n");
//					for (int i=0;i<�Խ���.length;i++) {
//						if(�Խ���[i][0]!=null) {
//						System.out.print(�Խ���[i][0]+"\t"); System.out.print(�Խ���[i][1]+"\t");
//						System.out.print(�Խ���[i][2]+"\n");
//						}
					
					
					
					System.out.print("\n1.�湮�� ���� 2.�α׾ƿ�"); int �۾��⼱�� = scanner.nextInt();
					if(�۾��⼱�� ==1 ) {
						System.out.print("���� :"); String ���� =scanner.next();
						System.out.print("���� :"); String ���� =scanner.next();
						
						for(int i=0;i<�Խ���.length;i++) {
							if(�Խ���[i][0]==null) {
								�Խ���[i][0] = ����; �Խ���[i][1] = ����;
								�Խ���[i][2] = id;
								System.out.println("�ۼ��Ϸ�");
								break;
							}
					
					}
						}
					else if(�۾��⼱�� ==2 ) {
						System.out.println(" �α׾ƿ�");
						break;
					}
					}
					
				}
				
				
				
				
				
			}
			
		
		
		
		}
			
		
	}
}
				
						
