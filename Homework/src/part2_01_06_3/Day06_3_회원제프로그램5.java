package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�5 {
	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
	// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
		// 1. �ʵ� 
			// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
	// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		// 1. ȸ�����Խ� �Է¹޾� ���� 
		// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
		// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
		// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 
	// time : 17:25
	// ������ : ��ȣ ��ġ �Ǽ� �� ���� �ڵ� ��ġ �߸� �Է�
	public static void main(String[] args) {
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		
		Scanner scanner = new Scanner(System.in);
		Member5[] memberlist = new Member5[100];
		
		while(true) {
			
			System.out.println("------------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch=scanner.nextInt();
			
			if(ch==1) {
				System.out.println(" ȸ������ ");
				System.out.println(" ID : "); String id =scanner.next();
				System.out.println(" Password : "); String pw =scanner.next();
				System.out.println(" Name : "); String name =scanner.next();
				System.out.println(" Phone : "); String phone =scanner.next();
				
				//�迭 
				Member5 member = new Member5();
				member.id=id;
				member.name=name;
				member.phone=phone;
				member.pw=pw;
				
				//���̵� ���
				boolean check=true;
				for(Member5 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println("�ߺ��� ���̵� �Դϴ�.");
						check= false;
						break;
					}
				}if(check==true) {
					int i =0;
					for(Member5 temp : memberlist) {
						if(temp==null) {
							System.out.println("���� �Ϸ�");
							memberlist[i] = member;
							break;
						}
						i++;
					}
				}
			}
			else if(ch==2) {
				System.out.println(" �α��� ������ ");
				System.out.println(" ID : ");  String id = scanner.next();
				System.out.println(" Password : ");  String pw = scanner.next();
				
				boolean check = false;
				for (Member5 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&&temp.pw.equals(pw)) {
						System.out.println(" �α��� ���� ");
						check = true;
						break;
					}
				}if (check== false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�. "); break;}
			}
			else if(ch==3) {
				boolean check = false;
				System.out.println(" ID ã��");
				System.out.println(" Name : "); String logname = scanner.next();
				System.out.println(" Phone : "); String logPhone = scanner.next();
				for(Member5 temp: memberlist) {
					if(temp!=null &&temp.name.equals(logname) && temp.phone.equals(logPhone)) {
						System.out.println(" ID ã�� ���� ");
						System.out.println(" ID : "+ temp.id);
						check = true;
						break;
						
					}
				}
					if( check == false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");}
					
				
			}
			else if(ch==4) {
				boolean check = false;
				System.out.println(" Password ã��");
				System.out.println(" ID : "); String logid = scanner.next();
				System.out.println(" Phone : "); String loginPhone = scanner.next();
				for(Member5 temp: memberlist) {
					if(temp!=null &&temp.id.equals(logid) && temp.phone.equals(loginPhone)) {
						System.out.println(" ID ã�� ���� ");
						System.out.println(" ID : "+ temp.pw);
						check = true;
						break;
						
					}
				}
					if( check == false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");}
					
				
			}
			else {System.out.println(" �߸��� �Է��Դϴ�.");}
		}
	}
}
