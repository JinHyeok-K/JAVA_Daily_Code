package part2_03_07_5;

public class Member1 {
	// 1. Ŭ���� ���� 
			
				// 2. member
					// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
					// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	
	int ��ȣ;
	String ID;
	String Password;
	String Name;
	String Phone;
	public Member1() {
	
	}
	public Member1(int ��ȣ, String iD, String password, String name, String phone) {
		super();
		this.��ȣ = ��ȣ;
		ID = iD;
		Password = password;
		Name = name;
		Phone = phone;
	}
	
	boolean ȸ������() {
		System.out.println(" ȸ������ ������ ");
		System.out.print("ID : "); 			String id = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.print("password : "); 	String password = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.print("name : "); 		String name = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.print("phone : "); 		String phone = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		
		
		for(Member1 temp : ȸ�����������α׷�_Ŭ��������1.members ) {
			if(temp != null && temp.ID.equals(id)) {
				System.out.println(" �̹� ������� ���̵� �Դϴ�.");
				return false;
			}
		}
		// Q) ȸ����ȣ ���� �Ȱ�
		int CNum= 0;
		int j= 0;
		for(Member1 temp : ȸ�����������α׷�_Ŭ��������1.members) {
			if(temp==null) {
				if(j==0) {
					CNum=1;
					break;
				}
				else {CNum= ȸ�����������α׷�_Ŭ��������1.members[j-1].��ȣ +1;}
			}
			j++;
		}
		
		Member1 members = new Member1(CNum, id, password, name, phone);
		
		int i =0;
		for (Member1 temp : ȸ�����������α׷�_Ŭ��������1.members) {
			if(temp==null) {
				ȸ�����������α׷�_Ŭ��������1.members[i] = members;
				System.out.println("ȸ����ȣ : "+CNum);
				return true;
			}
			i++;
		}
		return false;
	}
	
	String �α���() {
		System.out.println(" ID : "); 		String id=ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.println(" Password : "); String password=ȸ�����������α׷�_Ŭ��������1.scanner.next();
		for (Member1 temp : ȸ�����������α׷�_Ŭ��������1.members) {
			if(temp!=null && temp.ID.equals(id) && temp.Password.equals(password)){
				System.out.println(" �α��� �Ϸ�");
				return temp.ID;
			}
			else System.out.println("�α��� ����"); break;
		}
		return null;
	}
	void ���̵�ã�� () {
			System.out.println(" name : ");		String name=ȸ�����������α׷�_Ŭ��������1.scanner.next();
			System.out.println(" phone : ");		String phone=ȸ�����������α׷�_Ŭ��������1.scanner.next();
			for(Member1 temp : ȸ�����������α׷�_Ŭ��������1.members) {
				if(temp!=null && temp.Name.equals(name) && temp.Phone.equals(phone)) {
					System.out.println(" ID �� ã�ҽ��ϴ� ");
					System.out.println(" ID : "+temp.ID);
					break;
				}
				else System.out.println(" ã�� ����"); break;
			}
		
	}
	void ��й�ȣã�� () {
			System.out.println(" ID : ");  String id = ȸ�����������α׷�_Ŭ��������1.scanner.next();
			System.out.println(" phone : ");  String phone = ȸ�����������α׷�_Ŭ��������1.scanner.next();
			for(Member1 temp : ȸ�����������α׷�_Ŭ��������1.members) {
				if(temp!=null && temp.ID.equals(id)&& temp.Phone.equals(phone)){
				System.out.println(" ��й�ȣ�� ã�ҽ��ϴ�.");
				System.out.println(" Password : "+temp.Password);
				break;
				}
				else {System.out.println("ã�� ����"); break;}
			}
			
	}
}
