package part2_03_07_5;

public class Member4 {
	// 1. Ŭ���� ���� 
	
	// 2. member
		// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
		// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	int ��ȣ;
	String id;
	String password;
	String name;
	String phone;
	
	
	
	public Member4() {
	
	}



	public Member4(int ��ȣ, String id, String password, String name, String phone) {
		super();
		this.��ȣ = ��ȣ;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	boolean ȸ������() {
		System.out.println("ȸ������������");
		System.out.print("ID: "); String id = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print("��й�ȣ: "); String password = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print("�̸�: "); String name= ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print("����ó: "); String phone = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		
			for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
				if(temp!=null&&temp.id.equals(id)) {
					System.out.println("���Ͼ��̵� �����");
					return false;
				}
			}
			
			int index = 0;
			int i =0;
			for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
				if(temp==null) {
					if(i==0) {
						index= 1; break;
					}
					else {
						index = ȸ�����������α׷�_Ŭ��������4.member4[i-1].��ȣ +1;
						break;
					}
				}
				i++;
			}
		Member4 member4 = new Member4(��ȣ, id, password, name, phone);
		
		int j=0;
		for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
			if(temp== null) {
				ȸ�����������α׷�_Ŭ��������4.member4[i] =member4;
				System.out.println("ȸ����ȣ :"+index);
				return true;				
			}
			i++;
		}
		return false;	
	}
	String �α���() {
		System.out.println("�α���������");
		System.out.print(" id : "); String id = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print(" password : "); String password = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		
		for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
			if(temp!= null && temp.id.equals(id) && temp.password.equals(password)) {
				return temp.id;
			}
		}
		return null;
	}
	void ���̵�ã��() {
		System.out.println("���̵� ã��");
		System.out.print("�̸�:"); String name = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print("phone:"); String phone = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		
		for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("id :"+temp.id);
				return;
			}
		}
		System.out.println("��ġ�ϴ� ���� ����");
	}
	void ��й�ȣã��() {
		System.out.println("��� ã��");
		System.out.print("id:"); String id = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		System.out.print("phone:"); String phone = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		
		for(Member4 temp : ȸ�����������α׷�_Ŭ��������4.member4) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("id :"+temp.password);
				return;
			}
		}
		System.out.println("��ġ�ϴ� ���� ����");
	}
	
	
	
	
	
	
	
	
	
}
