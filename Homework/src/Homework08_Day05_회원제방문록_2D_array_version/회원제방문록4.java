package Homework08_Day05_ȸ�����湮��_2D_array_version;

import java.util.Scanner;

public class ȸ�����湮��4 { //time [27:30]
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
		//������ break; �Ǽ� 
	public static void main(String[] args) { //���� ����
		// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
		//�迭
		String[][] ȸ�� = new String[10][3];
		String[][] �Խ��� = new String[10][3];
		
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ]
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("==========");
			System.out.println("ȸ���� �湮�� ");
			System.out.println("==========");
			System.out.print("1.ȸ������ 2.�α��� | ���� :>"); int �ʱ⼱�� = scanner.nextInt();
			
			
			if(�ʱ⼱�� == 1) {
				
				System.out.println("========");
				System.out.println(" ȸ������ ");
				System.out.println("========");
				System.out.print(" id : "); 	String id = scanner.next();
				System.out.print(" pw : ");		 String pw = scanner.next();
				System.out.print(" name : "); 	String name = scanner.next();
				
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				//ȸ�����̵� �ߺ� üũ
				boolean check = true;
				for(int i=0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
						System.out.println("�ߺ��� id �� �ֽ��ϴ�.");
						break;
					}
				}
				// ȸ������ 
				if(check==true) {
					for(int i=0; i<ȸ��.length;i++) {
						if(ȸ��[i][0]==null) {
							ȸ��[i][0] = id; ȸ��[i][1] = pw; ȸ��[i][2] = name;   
						}
					}
				}
				//ȸ������ �Ϸ�
			}// �ʱ⼱�� if end
			if(�ʱ⼱�� == 2) {
				
				
				
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
					System.out.println("=========");
					System.out.print(" id : "); String id = scanner.next();
					System.out.print(" pw : "); String pw = scanner.next();
					boolean check = false;
					for(int i = 0 ; i < ȸ��.length ; i++) {
						if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][1].equals(pw)) {
							System.out.println("�α��� �Ϸ�");
							check = true;
							break;
						}
						else { 
						System.out.println("��ġ�ϴ� ������ �����ϴ�.");
						
						}break;
					}
					
					//�α��� ó�� �Ϸ�
					
					if(check==true) { //�α��� ���� �� �޴� ����
						while(true) {	
						System.out.println("========================");
						System.out.println("��ȣ\t����\t����\t�ۼ���");
						
						for (int i=0;i<�Խ���.length;i++) {
							if(�Խ���[i][0]!=null) {
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,�Խ���[i][0],�Խ���[i][1],�Խ���[i][2]);
							}
						}
//						// �α��ν� �湮�� ����
//						
						System.out.println("=========================");
						System.out.print("1.�湮�� ���� 2. �α׾ƿ� | ���� :>"); int ���� = scanner.nextInt();
						if(���� ==1 ) {
							//�� �ۼ�
							System.out.print(" ���� : "); String ���� = scanner.next();
							System.out.print(" ���� : "); String ���� = scanner.next();
							for(int i=0;i<�Խ���.length;i++) {
								if(�Խ���[i][0]==null) {
									�Խ���[i][0] = ����; �Խ���[i][1] = ����; �Խ���[i][2] = id;
									System.out.println(" �ۼ� �Ϸ� ");
									break;
								}
							}
						}
						else if(���� ==2) {
							System.out.println("�α׾ƿ� �մϴ�");
							break;
							
						}
						
						
//						��ȣ ���� ���� �ۼ��� 
						
					}
					
					// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
					// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
					// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
				}
			}
			
			
			
		

		// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]

		
		} //main while end
	}// main end
}// class end
