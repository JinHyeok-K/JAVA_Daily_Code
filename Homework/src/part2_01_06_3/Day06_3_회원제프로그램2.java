package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�2 {
	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
	// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
		// 1. �ʵ� 
			// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
	// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		// 1. ȸ�����Խ� �Է¹޾� ���� 
		// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
		// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
		// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 
	
	// time : 29.37 // 4
	// ������ : Ŭ������ �迭 �ۼ� �Ǽ�
	//		  �迭 ���� �Ǽ�
	//        Ŭ���� ��� �̼�	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member2[] memberlist = new Member2[100];
	
		while(true) {
		System.out.println("=============");
		System.out.println("1.ȸ������ 2.�α��� 3.IDã�� 4.��й�ȣ ã��"); int ch =scanner.nextInt();
		
			if(ch==1) {
				System.out.println("ȸ������ ������");
				System.out.println("id : "); String id =scanner.next();
				System.out.println("pw : "); String pw =scanner.next();
				System.out.println("name : "); String name = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				
				Member2 member = new Member2();
				member.id=id;
				member.password=pw;
				member.name=name;
				member.phone=phone;
				
				boolean check = true;
				for(Member2 temp : memberlist) {
					if(temp!=null&& temp.id.equals(id)) {
						System.out.println(" ���ǰ��ִ� ���̵��Դϴ�. ");
						break;
					}
				}
				if (check==true) {
					int i =0;
					for (Member2 temp : memberlist) {
						if(temp==null) {
						 memberlist[i] = member ;
							System.out.println(" ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
							break;
						}
						i++;
					}
				}
			}	
			else if(ch==2) {
				System.out.println("�α��� ������");
				System.out.println(" id :"); String id = scanner.next();
				System.out.println(" pw :"); String pw = scanner.next();
				
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null&& temp.id.equals(id)&&temp.password.equals(pw)) {
						System.out.println( "�α��� ����");
						check = true;
						break;
					}
					
				}if(check ==false) {
					System.out.println("������ ������ �����ϴ�.");
				}
			}
			else if(ch==3) {
				System.out.println("idã��");
				System.out.println(" �̸� "); String name = scanner.next();
				System.out.println(" ��ȭ��ȣ "); String phone = scanner.next();
				
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
						System.out.println( " ID ã�� ����");
						System.out.println("ID :"+temp.id);
						check= true;
						break;
					}
				}if (check=false) {
					System.out.println("��ġ�ϴ� ������ �����ϴ�.");
				}
			}
			else if(ch==4) {
				
				System.out.println("pw ã��");
				System.out.println(" id : "); String id= scanner.next();
				System.out.println(" phone : "); String phone= scanner.next();
				boolean check = false;
				for (Member2 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
						System.out.println(" ��й�ȣ ã�� ����");
						System.out.println("��й�ȣ : "+temp.password);
						check = true;
						break;
					}
				}if (check = false) {
					System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");
				}
				
			}
			else {System.out.println(" �߸��� �Է��Դϴ�.");}
		}
			
	}
}
