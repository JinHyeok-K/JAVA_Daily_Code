package Homework07_Day05_ȸ�����湮��_2D_array_version;

import java.util.Scanner;

public class ȸ�����湮��5 { //time : [19:04]
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
		public static void main(String[] args) {
			// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
						// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
							// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
							// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
				
			
			//������ : break ;��ġ �Ǽ�
			String[][] ȸ�� = new String[10][3];
			String[][] �Խ��� = new String[10][3];
			
			// �迭 ���� �Ϸ�
			
			while(true) { // master while start
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("================");
				System.out.print("1.ȸ������ 2. �α���"); int �ʱ⼱�� = scanner.nextInt();
				
				if(�ʱ⼱�� == 1) {
					// ȸ������
					// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
					
					//1-1 ȸ������
					//1-2 id �ߺ� üũ
					// ȸ�����Կ� ���� �Է�
					
					System.out.print("id : "); String id=scanner.next();
					System.out.print("pw : "); String pw=scanner.next();
					System.out.print("name : "); String name=scanner.next();
					//1-2 �ߺ�üũ
					
					boolean check = true;
					for(int i =0; i<ȸ��.length;i++) {
						if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
							System.out.println("�̹� ����ϰ� �ִ� id�Դϴ�.");
							check = false;
							break;
						}
					}//�ߺ�üũ �Ϸ�
					
					if(check== true) {
					//�Է� �Ϸ�
						for (int i = 0 ; i < ȸ��.length ; i++) {
							if(ȸ��[i][0]==null) {
								ȸ��[i][0] = id; ȸ��[i][1] = pw;ȸ��[i][2] = name;
								System.out.println("ȸ������ �Ϸ�");
								break;
							}//ȸ������ �Ϸ� 1-1
						}
					}
					
				}
				else if(�ʱ⼱�� == 2) {
					//	// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
					System.out.println("================");
					System.out.print(" id :"); String id=scanner.next();
					System.out.print(" pw :"); String pw=scanner.next();
					//�Է¿Ϸ�
					//id ��� ���Ͻ� �α� üũ
					boolean check = false; //�α��� �Ϸ�� true => �α��� �޴� �����
					for (int i=0;i<ȸ��.length;i++) {
						if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][1].equals(pw)) {
							System.out.println("�α��� �Ϸ�");
							check = true;
							break;
						}
						else {
							System.out.println("��ġ�ϴ� ������ �����ϴ�.");
						}break;
					}
					
					if(check==true) { //�α��� ������ ����
						//�α��ν� ���� ������
						while(true) {
						System.out.println("==================");
						System.out.println("��ȣ\t����\t����\t�ۼ���");
						for (int i = 0 ; i<�Խ���.length;i++) {
							if(�Խ���[i][0]!=null) { //�ϳ��� ������ �Խñ� ����
								System.out.printf("%d\t%s\t%s\t%s\n",i+1,�Խ���[i][0],�Խ���[i][1],�Խ���[i][2]); //
							}							
						}// �α��ν� �ٷ� �� ��Ÿ��
						
						// �ۼ��� �޴� 
						System.out.println("==================");
						System.out.print("1.�湮�� ���� 2. �α׾ƿ� | ����:>"); int ����=scanner.nextInt();
						//���� �Է�
						if(���� == 1) {
							//�� �ۼ� �Է�
							System.out.print("���� : "); String ���� =scanner.next();
							System.out.print("���� : "); String ���� =scanner.next();
							// ������� �Է°� ���� ����
							for(int i = 0 ; i<�Խ���.length;i++) {
								if(�Խ���[i][0]==null) {
								�Խ���[i][0] = ����; �Խ���[i][1] = ����; �Խ���[i][2] = id;  
								System.out.println("�ۼ� �Ϸ�");
								break;
								}
							}
							
						}
						else if(���� ==2) {
							System.out.println("�α׾ƿ� �մϴ�.");
							break;
						}
						
						
						
						// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
						// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
						// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]	
						}//sub while end
					}
					
					
				}
				
				
			} // master while end
			
		}
}
