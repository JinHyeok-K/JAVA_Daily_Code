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
		
		Scanner scanner = new Scanner(System.in); //�Է°�ü �ε�
		Member5[] memberlist = new Member5[100]; // �迭 ���� 100��
		
		while(true) {//���ѷ��� ����
			
			System.out.println("------------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch=scanner.nextInt();
			// �޴� ���� ��� �� ����
			if(ch==1) {//ȸ������ ����
				System.out.println(" ȸ������ ");
				System.out.println(" ID : "); String id =scanner.next();
				System.out.println(" Password : "); String pw =scanner.next();
				System.out.println(" Name : "); String name =scanner.next();
				System.out.println(" Phone : "); String phone =scanner.next();
				// id,pw,name,phone �Է�
				//�迭 
				Member5 member = new Member5(); // �迭 ���(�ҷ�����)
				member.id=id; // �迭 member�� �ʵ尪 id�� id ����
				member.name=name;//�迭 member�� �ʵ尪 name�� name ����
				member.phone=phone;//�迭 member�� �ʵ尪 phone�� phone ����
				member.pw=pw;//�迭 member�� �ʵ尪 pw�� pw ����
				
				//���̵� ���
				boolean check=true; // ture,false ����
				for(Member5 temp : memberlist) { // �迭 ���̸�ŭ �ݺ�������
					if(temp!=null && temp.id.equals(id)) { // �迭 ���� null�� �ƴϰ� �Է��� id���� �迭�� id���� ������
						System.out.println("�ߺ��� ���̵� �Դϴ�."); //�ߺ� id �ȳ��� ���
						check= false; // �� ���� ������ check �� false �� ����,
						break; //�����ǽ� �ݺ��� Ż��
					}
				}if(check==true) { //check �� true �� �� ����
					int i =0; //  �ε�����ȣ i ����
					for(Member5 temp : memberlist) { // memberlist ���̸�ŭ �ݺ�������
						if(temp==null) { // temp ��° ���� null�̶��
							System.out.println("���� �Ϸ�"); // ���ԿϷ� ���
							memberlist[i] = member; // memberlist �� i��° ���� member (id,name,phone,pw) ����
							break; //����Ϸ� �� �ݺ��� Ż��
						}
						i++; // index��ȣ �߰� (+1)
					}
				}
			}
			else if(ch==2) { //�α��� ������
				System.out.println(" �α��� ������ ");
				System.out.println(" ID : ");  String id = scanner.next();
				System.out.println(" Password : ");  String pw = scanner.next();
				//�α��� ������ ���� id, pw �Է�
				boolean check = false; //true,false ����
				for (Member5 temp : memberlist) { // �������Ʈũ����� �ݺ��� ����
					if(temp!=null && temp.id.equals(id)&&temp.pw.equals(pw)) { //temp��° ���� null�� �ƴϰ� �Է���id,pw�� �����ϸ� 
						System.out.println(" �α��� ���� "); //�α��μ��� ���
						check = true; // check = true ����
						break;// �α��� Ȯ�ο� �ݺ��� Ż��
					}
				}if (check== false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�. "); break;} //id�� pw �� �� ��ġ�� �α��� ���� ���
			}
			else if(ch==3) { // id ã�� ����
				boolean check = false;//true,false ����
				System.out.println(" ID ã��");// id ã�� �޴�, �Է�id,��ȭ��ȣ�� id ã��
				System.out.println(" Name : "); String logname = scanner.next();
				System.out.println(" Phone : "); String logPhone = scanner.next();
				for(Member5 temp: memberlist) {//�迭 ���̸�ŭ �ݺ��� ����
					if(temp!=null &&temp.name.equals(logname) && temp.phone.equals(logPhone)) {
						// temp��° ���� null�� �ƴϰ� temp° �̸�,��ȭ��ȣ�� �Է°��� ���� �ϴٸ�
						System.out.println(" ID ã�� ���� "); //  id ã�� ���� ��� 
						System.out.println(" ID : "+ temp.id); // id ���
						check = true; //check true ����
						break; //ã��� �ݺ��� Ż��
						
					}
				}
					if( check == false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");} // �̸�or ��ȭ��ȣ ����ġ �� ���� ���
					
				
			}
			else if(ch==4) {//��й�ȣ ã�� ����
				boolean check = false; // check false ����
				System.out.println(" Password ã��"); //��й�ȣ ã�� �޴� ���& id�� ��ȭ��ȣ �Է�
				System.out.println(" ID : "); String logid = scanner.next();
				System.out.println(" Phone : "); String loginPhone = scanner.next();
				for(Member5 temp: memberlist) {//�迭���̱��� �ݺ��� ����
					if(temp!=null &&temp.id.equals(logid) && temp.phone.equals(loginPhone)) {
						// temp��° ���� null�� �ƴϰ� temp° id,��ȭ��ȣ�� �Է°��� ���� �ϴٸ�
						System.out.println(" PW ã�� ���� ");  // pw ã�� ���� ��� 
						System.out.println(" PW : "+ temp.pw); // pw ���
						check = true; //check true ����
						break; //�ݺ��� Ż��
						
					}
				}
					if( check == false) { System.out.println(" ��ġ�ϴ� ������ �����ϴ�.");} // id or ��ȭ��ȣ �� ��ġ �� ���� ���
					
				
			}
			else {System.out.println(" �߸��� �Է��Դϴ�.");} // 1~4���� �� �Է½� ��� 
		}
	}
}
