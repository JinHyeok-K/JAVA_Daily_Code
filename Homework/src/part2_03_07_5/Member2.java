package part2_03_07_5;

public class Member2 {
	// 1. Ŭ���� ���� 
	
	// 2. member
		// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
		// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	int ��ȣ;
	String id;
	String password;
	String name;
	String phone;
	
	public Member2() {
		// TODO Auto-generated constructor stub
	}

	public Member2(int ��ȣ, String id, String password, String name, String phone) {
		super();
		this.��ȣ = ��ȣ;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	boolean ȸ������() {
		System.out.println("--------- ȸ�� ���� ---------");
		System.out.print(" ID : ");  String id=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print(" Password : ");  String password=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print(" Name : ");  String name=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print(" Phone : ");  String phone=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		
			for(Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
				if(temp!=null && temp.id.equals(id)) {
					System.out.println(" ����ϰ� �ִ� ���̵� �Դϴ�.");
					return false;
				}
			}
			
			int index_num= 0;
			int i=0;
			for (Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
				if(temp==null) {
					if(i==0) {
						index_num=1; 
						break;
					}
					else {
						index_num = ȸ�����������α׷�_Ŭ��������2.member2[i-1].��ȣ +1;
						break;
					}
				}
				i++;
			}
			
			Member2 member2 = new Member2(��ȣ, id, password, name, phone);
			
			int j=0;
			for(Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
				if(temp==null) {
					ȸ�����������α׷�_Ŭ��������2.member2[i] = member2;
					System.out.println(" ȸ������ ȸ����ȣ�� :"+index_num);
					return true;
				}
			}
		return false;
	}
	
	String �α���() {
		System.out.println( "----- �α��� ������ ------");
		System.out.print(" ID : "); String id=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print(" Password : "); String pw=ȸ�����������α׷�_Ŭ��������2.scanner.next();
		
		for(Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
			if(temp!=null && temp.id.equals(id)&&temp.password.equals(pw)) {
				return temp.id;
			}
		}
		return null;
	}
	void ���̵�ã��() {
		System.out.println( "----- ���̵� ã�� ������ -----");
		System.out.print("Name : "); String name = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print("Phone : "); String phone = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		
		for(Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
			if(temp!=null && temp.name.equals(name)&& temp.phone.equals(phone)) {
				System.out.println(" ȸ������ ID�� : "+ temp.id);
			}
				
		}
		System.out.println("������ ������ �����ϴ�.");
	}
	void ��й�ȣã��() {
		System.out.println("---- ��й�ȣ ã�� ������ -----");
		System.out.print(" ID : "); String id = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print(" Password : "); String password = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		for(Member2 temp : ȸ�����������α׷�_Ŭ��������2.member2) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println(" ȸ������ ��й�ȣ�� : "+temp.password);
				return;
			}
		}
		System.out.println("������ ������ �����ϴ�.");
	}
	
}
