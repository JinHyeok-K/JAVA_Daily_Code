package Homework08_Day05_ȸ�����湮��_2D_array_version;

import java.util.Scanner;

public class ȸ�����湮��3 {// time[27:00] 
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
//	21:15 start
	public static void main(String[] args) {
		
		String[][] ȸ�� = new String[10][3];
		String[][] �Խ��� = new String[10][3];
		
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
		// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
		// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		
		while(true) {// master while start
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
		Scanner scanner =new Scanner(System.in);
		System.out.println("============");
		System.out.println("ȸ���� �湮��");
		System.out.print("1.ȸ������ 2.�α��� "); int �ʱ⼱�� = scanner.nextInt();
		if(�ʱ⼱�� == 1) {
			
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 1-1 ȸ������ -> 1-2 ID �ߺ� üũ 
			
			System.out.println("=============");
			System.out.print("id : "); String id= scanner.next();
			System.out.print("pw : "); String pw= scanner.next();
			System.out.print("name : "); String name= scanner.next();
			
			
			// id �ߺ� üũ
			boolean check = true;
			for (int i = 0 ; i<ȸ��.length;i++) {
				if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)) {
					System.out.println(" �̹� ������� id�Դϴ�.");
					check = false;
					break;
				}
			}
			if(check==true) {
				for (int i =0;i<ȸ��.length;i++) {
					if(ȸ��[i][0]==null) {
						ȸ��[i][0]= id; ȸ��[i][1]= pw; ȸ��[i][2]= name;
						System.out.println("ȸ������ �Ϸ�");
						break;
					}
				}
			}
			// ȸ������ �Ϸ�
		}// �ʱ⼱�� if ==1 end
		if(�ʱ⼱�� ==2 ) {
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			//sub �ݺ��� ����
			
			System.out.println(" ================");
			System.out.println(" �α��� �޴�");
			System.out.print("id : "); String id =scanner.next();
			System.out.print("pw :"); String pw =scanner.next();
			// id pw �Է�
				boolean check=false;
				for (int i =0 ; i<ȸ��.length;i++) {
					if(ȸ��[i][0]!=null&&ȸ��[i][0].equals(id)&&ȸ��[i][1].equals(pw)) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						check= true;
						break;
					}
					// �� �ܴ� �α��� ����
					else {
						System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");
						
					}break;
				}
			
			// �α��� �޴� ����
				if(check==true) {
					while(true) {
					System.out.println("================"); // ���� �޴� ����
					System.out.println("��ȣ\t����\t����\t�ۼ���");
					// ���� ����    ��ȣ, ����, ����, �ۼ���
					for (int i=0;i<�Խ���.length;i++) {
						if(�Խ���[i][0]!=null) {
							System.out.printf("%d\t%s\t%s\t%s\n",i+1,�Խ���[i][0],�Խ���[i][1],�Խ���[i][2]);
							// �α��ν� �Խ��� �� ����
						}
					}
					System.out.println("================");
					// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
					System.out.print("1.�湮�� ���� 2.�α׾ƿ� | ���� :>"); int ���� =scanner.nextInt();
					if(���� ==1 ) {
						System.out.print("���� :"); String ����=scanner.next();
						System.out.print("���� :"); String ����=scanner.next();
						
						for (int i=0;i<�Խ���.length;i++) {
							if(�Խ���[i][0]==null) {
							�Խ���[i][0] = ����; �Խ���[i][1] = ����; �Խ���[i][2] = id;
							System.out.println("�ۼ��Ϸ�");
							break;
							}
						}
					}
					else if (���� ==2 ) {
						System.out.println("�α׾ƿ� �մϴ�.");
						break;
					}
					// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
					// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
					
				}
			
				}
			
			
		}
			
			
			
			
			
			
		} //master while end
	}// main end
}// class end
