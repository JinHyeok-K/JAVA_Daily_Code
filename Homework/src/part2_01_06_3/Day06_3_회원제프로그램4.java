package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�4 {
	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
	// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
		// 1. �ʵ� 
			// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
	// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		// 1. ȸ�����Խ� �Է¹޾� ���� 
		// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
		// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
		// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 
	// time : 14:37
	// ������ : Ŭ���� ����,��� �̼�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member4[] memberlist = new Member4[100];
		
		while(true) {
			
			System.out.println("----------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch =scanner.nextInt();
			
			if(ch==1) {
				System.out.println(" ȸ������ ������ ");
				System.out.println(" id : "); String id=scanner.next();
				System.out.println(" pw : "); String pw=scanner.next();
				System.out.println(" name : "); String name=scanner.next();
				System.out.println(" phone : "); String phone=scanner.next();
				
				Member4 member = new Member4();
				
				member.id =id;
				member.name=name;
				member.phone=phone;
				member.pw=pw;
				
				
				boolean check=true;
				for(Member4 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println(" ������� ���̵� �Դϴ�.");
						check= false;
						break;
					}
				}
				
				if(check==true) {
					int i =0;
					for(Member4 temp: memberlist) {
						if(temp==null){
							memberlist[i] = member;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break;
						}
						i++;
					}
				}
				
				
			}
			else if(ch==2) {
				System.out.println("�α��� ������ ");
				System.out.println(" id : "); String id = scanner.next();
				System.out.println(" pw : "); String pw = scanner.next();
				
				boolean check = false;
				
				for(Member4 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.pw.equals(pw)) {
						System.out.println(" �α��� �Ϸ�");
						check=true;
						break;
					}
				}if(check==false) {
					System.out.println("������ �����������ϴ�.");
				}
			}
			else if(ch==3) {
				System.out.println("ID ã��");
				System.out.println("�̸� : "); String name = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				
				boolean check =false;
				for(Member4 temp : memberlist) {
					if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
						System.out.println(" ID ã�� �Ϸ� ");
						System.out.println("ID :"+temp.id);
						check= true;
						break;
					}
				}if (check==false) {System.out.println("��ġ�ϴ� ������ �����ϴ�.");}
			}
			else if(ch==4) {
				System.out.println("PW ã��");
				System.out.println("ID: "); String id =scanner.next();
				System.out.println("phone: "); String phone =scanner.next();
				
				boolean check=false;
				for(Member4 temp : memberlist) {
					if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.out.println(" PW ã�� �Ϸ� ");
						System.out.println("PW :"+temp.pw);
						check= true;
						break;
					}
				}if (check==false) {System.out.println("��ġ�ϴ� ������ �����ϴ�.");}
			}
			else {System.out.println("�߸��� �Է��Դϴ�.");}
			
			
			
		}
	}
}
