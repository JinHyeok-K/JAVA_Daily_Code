package part2_03_07_5;

public class Member5 {
	// 1. Ŭ���� ���� 
	
	// 2. member
		// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
		// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	
	int ��ȣ;    //�ʵ� ����
	String id;
	String password;
	String name;
	String phone;
	
	public Member5() {    //������ ����
		// TODO Auto-generated constructor stub
	}

	public Member5(int ��ȣ, String id, String password, String name, String phone) {
		super();
		this.��ȣ = ��ȣ;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	
	boolean ȸ������() { //ȸ������ ����
		System.out.println("  ȸ������ ������");
		System.out.print(" ���̵� : ");	String id = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" ��й�ȣ : ");	String password = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" �̸� : ");	String name = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" ����ó : ");	String phone = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		//���̵� ��й�ȣ �̸� ��ȣ  �Է�
		for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members) { //�迭 ũ�⸸ŭ �ݺ�����
			if( temp != null && temp.id.equals(id)) {   //�迭�� ������ id �� �Է� id�� ������
				System.out.println(" ���� ������� ���̵� "); //����� ���̵� �ȳ��� ���
				return false; // ���Խ��� ��ȯ
			}
		} 
		int index = 0;  //�ε��� ����
		int i = 0;  //���� ����
		for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members ) { //�迭 ũ�⸸ŭ �ݺ��� ����
			if( temp == null ) { //temp�� null �϶�
				if( i == 0 ) {  // i �� 0�� �� 
					index = 1; break;  //�ε����� 1����, Ż��
				}
				else {  //�� �� 
					index = ȸ�����������α׷�_Ŭ��������5.members[ i-1 ].��ȣ + 1 ;//�ε��� ���� �迭�� ��ȣ+1 ���� 
					break;
				}
			}
			i++;  //�ε��� ����
		}

		Member5 member = new Member5( index , id, password, name, phone ); 	 //�迭 �ε�(������)
	int j = 0 ; //j =0 ;
	for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members ) {//�迭 ũ�⸸ŭ �ݺ�
		if( temp == null ) {  //temp ��  null �϶� 
			ȸ�����������α׷�_Ŭ��������5.members[j] = member;// �迭�� j��° ���� �迭�� �� ����
			System.out.println(" �˸�)) ȸ������ ȸ����ȣ : " + index); //ȸ����ȣ ���
			return true; // ���� �Ϸ� ����
		}
		j++;
	}
	return false; 
	}
	
	String �α���() {
		System.out.println("  �α��� ������");
		System.out.print(" ���̵� : ");		String id = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" ��й�ȣ : ");	String password = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		//���̵� ��й�ȣ �Է�
	for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members ) { //�迭 ���̸�ŭ �ݺ�
			if(  temp != null && temp.id.equals(id)  // ����� id�� ��й�ȣ�� �Է��� ���� ���� ������   id��ȯ
					&& temp.password.equals(password) ) {
				return temp.id; 
			}
		}
		return null;
	}
	
	void ���̵�ã��() {
		System.out.println("���̵�ã�� ������"); //�迭 ���̸�ŭ �ݺ�
		System.out.print(" �̸� : "); String name = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" ����ó : "); String phone = ȸ�����������α׷�_Ŭ��������5.scanner.next(); 
		// ����� �̸��� ����ó�� �Է��� ���� ���� ������   id��ȯ
		for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members) {
			if( temp !=null && temp.name.equals(name) && 
					temp.phone.equals(phone) ) {
				// ����� �̸��� ����ó�� �Է��� ���� ���� ������   id��ȯ
				System.out.println("  ȸ�� ���̵� : " + temp.id); 
				return; 
			}
		}
		System.out.println(" ������ ȸ������ ���� ");
	}
	void ��й�ȣã��() {
		System.out.println(" ��й�ȣã�� ");
		System.out.print(" ���̵� : ");	String id = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print(" ����ó : ");	String phone = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		for( Member5 temp : ȸ�����������α׷�_Ŭ��������5.members ) 
			if( temp != null && temp.id.equals(id) &&
					temp.phone.equals(phone) ) {
				System.out.println(" ȸ�� ��й�ȣ : " + temp.password );
				return;// ����� ���̵�� ����ó�� �Է��� ���� ���� ������  ��й�ȣ��ȯ
				}
			
			
		System.out.println(" ������ ȸ������ ���� "); // �� ���� �Ҹ��� �� ���
	}
	
	
	
	
	
	
	
}
