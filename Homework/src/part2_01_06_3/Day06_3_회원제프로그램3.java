package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�3 {
	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
	// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
		// 1. �ʵ� 
			// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
	// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		// 1. ȸ�����Խ� �Է¹޾� ���� 
		// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
		// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
		// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 
	// 1. �ʵ� 
				// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
		//time [24:00] / 4
	//  ������ : Ŭ���� ��� �Ǽ� 
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Member3[] memberlist = new Member3[100];
		
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		while(true) {
			
		System.out.println(" =========================");
		System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch=scanner.nextInt();
		
		//1. ȸ������
			if(ch==1 ) {
				System.out.println("ȸ������ ������");
				System.out.println(" id: "); String id = scanner.next();
				System.out.println(" pw: "); String pw = scanner.next();
				System.out.println(" name: "); String name = scanner.next();
				System.out.println(" phone: "); String phone = scanner.next();
				
				Member3 member = new Member3();
				
				member.id =id;
				member.name =name;
				member.pw =pw;
				member.phone=phone;
				
				// ȸ������ ���� 
				// id �ߺ�üũ
				boolean check = true;
				for(Member3 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println("������� id �Դϴ�.");
						check = false;
						break;					
					}
				}
				
				if(check==true) {
					int i= 0;
					for (Member3 temp: memberlist) {
						if(temp==null ) {
							System.out.println("ȸ������ �Ϸ�");
							memberlist[i] = member;
							break;
						}
						i++;
					}
				}
			}
			else if(ch==2 ) {//2. �α���
				System.out.println(" �α��� ������ ");
				System.out.println(" id : ");  String id = scanner.next();
				System.out.println(" pw : ");  String pw = scanner.next();
				
				boolean check = false;
				for(Member3 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.pw.equals(pw)) {
						System.out.println(" �α��� ����");{
						check= true;
						break;
						}
					}				
				}if (check == false) {
					System.out.println(" ��ġ�ϴ� ������ �����ϴ�. ");
				}
			}
			else if(ch==3 ) {
				System.out.println(" id ã�� ");
				System.out.println("name : "); String name = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				boolean check= false;
				for (Member3 temp :memberlist) {
					if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
						System.out.println("  id �� ã�ҽ��ϴ�.");
						System.out.println("id :"+temp.id);
						check=true;
						break;
					}
				}if (check==false)
					{System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");}
				
			}
			else if(ch==4 ) {
				System.out.println(" pw ã�� ");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("phone : "); String phone = scanner.next();
				boolean check= false;
				for (Member3 temp :memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.phone.equals(phone)) {
						System.out.println("  pw �� ã�ҽ��ϴ�.");
						System.out.println("pw :"+temp.pw);
						check=true;
						break;
					}
				}if (check==false) {
					System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");
				}
			}	
			else {System.out.println(" �߸��� �Է��Դϴ�. ");
			
			}
		}
	}
}
