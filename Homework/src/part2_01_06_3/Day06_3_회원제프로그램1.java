package part2_01_06_3;

import java.util.Scanner;

public class Day06_3_ȸ�������α׷�1 {
	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
	// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
		// 1. �ʵ� 
			// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
	// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
		// 1. ȸ�����Խ� �Է¹޾� ���� 
		// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
		// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
		// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 

	// time : [28:12   ]  // 7
	// ������ : Ŭ������ �迭 �ۼ� �Ǽ�
	//		  �迭 ���� �Ǽ�
	//        Ŭ���� ��� �̼�		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member1[] memberlist = new Member1[100];
		
		while(true) {
			
			System.out.println("============== ȸ���� [Ŭ���� ���� ]  ===============");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if(ch==1) {
			
				System.out.println("ȸ������ ������");
				System.out.print(" id : "); String id = scanner.next();
				System.err.print(" password :"); String password =scanner.next();
				System.out.print(" name :"); String name = scanner.next();
				System.out.print(" phone num : "); String phone = scanner.next();
				
				Member1 member = new Member1();
				member.id=id;
				member.password=password;
				member.name=name;
				member.phone=phone;
				
				boolean check = true;
				for (Member1 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)) {
						System.out.println(" ���� id �����");
						check = false; 
						break;
					}
				}
		
				if(check== true) {
					int i =0;
					for (Member1 temp : memberlist) {
						if (temp == null ) {
							memberlist[i] = member;
							System.out.println(" ȸ������ �Ϸ� ");
							break;
						}
					}
					
				}
			}
			
			else if(ch==2 ) {
				System.out.println("�α��� ������");
				System.out.println(" id "); String id =scanner.next();
				System.out.println(" pw " );String pw = scanner.next();
				
				boolean check  = false ;
				for (Member1 temp : memberlist ) {
					if (temp!=null && temp.id.equals(id) && temp.password.equals(pw)) {
						System.out.println(" �α��� �Ϸ� ");
						check = true;
					}
				}
				if (check == false ) {
					System.out.println(" Ȯ�ε��� �ʴ� ���� �Դϴ�.");
				}
			}
			else if(ch==3 ) { //�̸��� ����ó
				System.out.println(" ���̵� ã�� ������");
				System.out.println(" �̸� : "); String name = scanner.next();
				System.out.println(" ����ó : "); String phone= scanner.next();
				
				boolean check = false ;
				for(Member1 temp : memberlist) {
					if (temp!=null&& temp.name.equals(name)&&temp.phone.equals(phone)) {
						System.out.println(" id Ȯ�� �Ϸ�");
						System.out.println("id :"+temp.id);
						check = true;
						break;
					}
				}
				if (check==false) {
					System.out.println("��ġ �ϴ� ������ �����ϴ�.");
				}
			}
			else if(ch==4 ) {
				System.out.println("��й�ȣ ã�� ������");
				System.out.println(" id :"); String id =scanner.next();
				System.out.println(" ����ó "); String phone =scanner.next();
				
				boolean check = false;
				for(Member1 temp : memberlist) {
					if(temp!=null && temp.id.equals(id)&& temp.phone.equals(phone)) {
						System.out.println(" pw Ȯ�� �Ϸ�");
						System.out.println(" pw :"+temp.password);
						check= true;
						break;
					}
				}if (check == false) {
					System.out.println("��ġ�ϴ� ���� �����ϴ�.[ã�����]");
				}
			}
			else {System.out.println(" �߸��� �Է� ");}
		}// while start
	} // main end	
}// class end
