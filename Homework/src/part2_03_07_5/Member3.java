package part2_03_07_5;

public class Member3 {
	// 1. Ŭ���� ���� 
	
	// 2. member
		// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
		// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	int ��ȣ;
	String id;
	String password;
	String name;
	String phone;
	
	public Member3() {
	
	}

	public Member3(int ��ȣ, String id, String password, String name, String phone) {
	
		this.��ȣ = ��ȣ;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	boolean ȸ������() {
		System.out.println("ȸ������ ������");
		System.out.print("id"); String id = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print("pw"); String pw = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print("name"); String name = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		System.out.print("phone"); String phone = ȸ�����������α׷�_Ŭ��������2.scanner.next();
		
			for(Member3 temp :ȸ�����������α׷�_Ŭ��������3.member3) {
				if(temp!=null && temp.id.equals(id)) {
					System.out.println(" ���� ������� ���̵� ");
					return false;
				}
			}
			
			int index=0;
			int i = 0;
			for(Member3 temp : ȸ�����������α׷�_Ŭ��������3.member3) {
				if(temp==null) {
					if( i == 0) {
						index=1; break;
					}
					else {
						index= ȸ�����������α׷�_Ŭ��������3.member3[i-1].��ȣ +1 ;
						break;
					}
				}
				i++;
			}
		
		Member3 member3 = new Member3(��ȣ, id, pw, name, phone);
		int j =0;
		for(Member3 temp : ȸ�����������α׷�_Ŭ��������3.member3) {
			if(temp== null) {
				ȸ�����������α׷�_Ŭ��������3.member3[j] = member3;
				System.out.println("����ȸ�� ȸ����ȣ : "+��ȣ);
			}
			i++;
		}
			
			
		return false;
	}
	String �α���() {
		System.out.println("�α��� ������");
		System.out.print("id"); String id=ȸ�����������α׷�_Ŭ��������3.scanner.next();
		System.out.print("pw"); String pw=ȸ�����������α׷�_Ŭ��������3.scanner.next();
		for(Member3 temp : ȸ�����������α׷�_Ŭ��������3.member3) {
			if(temp!=null && temp.id.equals(id) &&temp.password.equals(pw)) {
				return temp.id;
			}
		}
		return null;
	}
	void ���̴�ã��() {
		System.out.println("���̵� ã�� ������");
		System.out.print("name"); String name = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		System.out.print("phone"); String phone = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		for(Member3 temp : ȸ�����������α׷�_Ŭ��������3.member3) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ���̵� :"+ temp.id);
				return;
			}
		}
		System.out.println("������ ������ �����ϴ�.");
	}
	void ��й�ȣã��() {
		System.out.println("���̵� ã�� ������");
		System.out.print("id"); String id = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		System.out.print("phone"); String phone = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		for(Member3 temp : ȸ�����������α׷�_Ŭ��������3.member3) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ���̵� :"+ temp.password);
				return;
			}
		}
		System.out.println("������ ������ �����ϴ�.");
		
		
	}
}
