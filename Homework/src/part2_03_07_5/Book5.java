package part2_03_07_5;

public class Book5 {
	// 1. book
	// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ�� O
	// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����뿩��� 5.�����ݳ� 6.�������  7.��������
	
	
	
	String isbn; // �ʵ� ����
	String ������;
	String �۰�;
	boolean �����뿩����;
	String �뿩ȸ��;
	
	public Book5() {   //������ ����
	
	}

	public Book5(String isbn, String ������, String �۰�, boolean �����뿩����,String �뿩ȸ��) {
		super();
		this.isbn = isbn;
		this.������ = ������;
		this.�۰� = �۰�;
		this.�����뿩���� = �����뿩����;
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	
	void �����˻�() { //�����˻� �޼ҵ� ����
		System.out.println( "���� �˻�");
	}
	void �������() { //������� �޼ҵ� ����
		System.out.println("���� ���");  //������� �� ������� �ε����� ���
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book5 temp : ȸ�����������α׷�_Ŭ��������5.books) { // �迭 ���̸�ŭ �ݺ�������
			if(temp!=null) {//temp ���� null �� �ƴҶ�
				System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩����"); // �� ������ isbn ������ �۰� �뿩���ɿ��� ���
			}else {
				System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
			}
			
		}
	}
	
	
	void �����뿩(String loginid) { //�α����� ��(����)�� ������ �����뿩 �޼ҵ� ����
		System.out.println("�����뿩������");
		//�����뿩������ ���
		System.out.println(" ISBN : "); String ISBN = ȸ�����������α׷�_Ŭ��������4.scanner.next();
		//isbn �Է�
		
		int i = 0;//�ε��� ����
		for (Book5 temp :ȸ�����������α׷�_Ŭ��������5.books) { //0~ å �迭 ���� �ݺ�
			if(temp!=null && temp.isbn.equals(ISBN)) { // �Է��� isbn �� �迭 �� isbn�� ����
				if(temp.�����뿩����) { 
					System.out.println("�ش� ���� �뿩");
					ȸ�����������α׷�_Ŭ��������5.books[i].�����뿩���� =false;  // i��° �����뿩���δ� �뿩�� ����
					ȸ�����������α׷�_Ŭ��������5.books[i].�뿩ȸ�� = loginid; // i��° ������ �뿩ȸ���� �α����� id
					return;//��ȯ
				}
				else {
					System.out.println("�뿩��"); // �뿩�� ���
					return;
				}
			}
			i++;
		}
		
		System.out.println("������ ISBN �� �����ϴ�.");// ������ �� ������
	}
	
	
	void �����뿩���(String loginid) {//loginid ���ڸ� ����ϴ� �����뿩��� �޼ҵ� ����
		
		System.out.println("�������������");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book5 temp : ȸ�����������α׷�_Ŭ��������5.books) {// �ݺ��� ����
			if(temp!=null && temp.�뿩ȸ��.equals(loginid)) {// �뿩�� ȸ���� �α����� id �� ���� ������
				System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
				//�ϱ�� ����.(isbn/������/�۰�/�뿩��
			}
		}
		
		
		
	}
	
	
	
	
	
	void �����ݳ�(String loginid) { //�α��� ���̵� ���� ��� �����ݳ� �޼ҵ� ����
		System.out.println("----- �����ݳ� ������------");
		�����뿩���(loginid); //�α��� ���̵� ����� �����뿩��� �޼ҵ� ����
		System.out.println(" ISBN"); String isbn = ȸ�����������α׷�_Ŭ��������5.scanner.next(); //isbn �Է�
		int i =0; // index ����
		for(Book5 temp : ȸ�����������α׷�_Ŭ��������5.books) { //�迭 ũ�⸸ŭ �ݺ��� ����
			if(temp!=null && temp.isbn.equals(isbn)) { // null�� �ƴϰ� isbn,�Է��� isbn�� ������
				if(temp.�뿩ȸ��.equals(isbn)){ //�뿩ȸ���� isbn��
					if(temp.�����뿩����) { //���� ������ false ��
						System.out.println("���� ���� �뿩���� �ƴ�"); // �뿩�� �ƴѰ� ���
					}
					else {
						System.out.println("�ݳ��Ϸ�"); // �뿩���� �� �ݳ��Ϸ� 
						ȸ�����������α׷�_Ŭ��������5.books[i].�����뿩���� = true; //i��° �迭�� (�뿩���̾���) �����뿩���ο� �뿩����
						ȸ�����������α׷�_Ŭ��������5.books[i].�뿩ȸ��= null; // �뿩ȸ���� �ƹ��� �Ⱥ��������� ����
						return; // ��ȯ
					}
						
				}
				else {
					System.out.println(" �뿩�� ������ �ƴ�"); //�� ���� ������ ���
				}
			}
			i++;
		}
		System.out.println("��ġ�ϴ� isbn ����"); //�Է� isbn�� �迭�� isbn �� ������ ���
		
	
		
		
	}
	
	
	
	
	
	void �������() {
		
		System.out.println("�������������");  //������� ������ ����
		System.out.print("isbn: "); String isbn = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print("������ :"); String ������ = ȸ�����������α׷�_Ŭ��������5.scanner.next();
		System.out.print("�۰� :"); String �۰� = ȸ�����������α׷�_Ŭ��������5.scanner.next();
						
		//isbn ,������,�۰� �Է°� �Է�
		for(Book5 temp : ȸ�����������α׷�_Ŭ��������5.books) { //�迭ũ�⸸ŭ ����
			if(temp !=null && temp.isbn.equals(isbn));// �迭 ��  isbn �� �Է� isbn�� ������
			System.out.println("�̹� ������� isbn"); //�̹� ���ǰ� �ִ� isbn ��� 
			return; //���� 
		}
		
		Book5 book5 = new Book5(isbn, ������, �۰�, true, null); //�迭 ������ ����
		int i =0;  //�ε��� ����
		for(Book5 temp : ȸ�����������α׷�_Ŭ��������5.books) { //�迭 ũ�⸸ŭ �ݺ��� ����
			if(temp==null) {//temp���� null �̸� å i��° �迭�� ������ �迭 �� ����
				ȸ�����������α׷�_Ŭ��������5.books[i] =book5;
				System.out.println("������� �Ϸ�"); //������� �Ϸ� 
				return;
			}
			i++;
		}
		
		
	}
	
	
	
	void ��������() { //�������� ������ ����
		System.out.println("���� ���� ������");
	}
	
}
