package part2_03_07_5;

public class Book3 {
	// 1. book
	// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ�� O
	// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����뿩��� 5.�����ݳ� 6.�������  7.��������

	
	String isbn;
	String ������;
	String �۰�;
	boolean �����뿩����;
	String �뿩ȸ��;
	
	public Book3() {
	
	}

	public Book3(String isbn, String ������, String �۰�, boolean �����뿩����, String �뿩ȸ��) {
		super();
		this.isbn = isbn;
		this.������ = ������;
		this.�۰� = �۰�;
		this.�����뿩���� = �����뿩����;
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	
	void �����˻�() {
		System.out.println("�����˻� ������");
	}
	void �������() {
		System.out.println("������� ������");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book3 temp : ȸ�����������α׷�_Ŭ��������3.book3) {
			if(temp!=null) {
				if(temp.�����뿩����)
					System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩����");
				else
					System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
			}
		}
		
	}
	
	void �����뿩(String loginid) {
		System.out.println("�����뿩 ������");
		System.out.println("���� ISBN : ");  String isbn = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		
		int i =0;
		for(Book3 temp : ȸ�����������α׷�_Ŭ��������3.book3) {
			if (temp!=null && temp.isbn.equals(isbn)) {
				if(temp.�����뿩����) {
					System.out.println("�ش� ������ �뿩 �մϴ�.");
					ȸ�����������α׷�_Ŭ��������3.book3[i].�����뿩���� = false;
					ȸ�����������α׷�_Ŭ��������3.book3[i].�뿩ȸ�� = loginid;
					return;
				}
				else {
					System.out.println("�뿩���� ����");
					return;}
			}
		}
		System.out.println(" ��ġ�ϴ� isbn ����");
	}
	void �����뿩���(String loginid) {
		System.out.println("������� ������");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book3 temp: ȸ�����������α׷�_Ŭ��������3.book3) {
			if(temp !=null && temp.�뿩ȸ��.equals(loginid)) {
				System.out.println(temp.isbn+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
			}
		}
	}
	void �����ݳ�(String loginid) {
		System.out.println("�����ݳ� ������");
		�����뿩���(loginid);
		System.out.println(" ISBN "); String isbn = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		int i = 0;
		for(Book3 temp : ȸ�����������α׷�_Ŭ��������3.book3) {
			if(temp !=null && temp.isbn.equals(isbn)) {
				if(temp.�뿩ȸ��.equals(loginid)) {
					if(temp.�����뿩����) {
						System.out.println("�뿩�� �ƴ�");
					}
					else {
						System.out.println("�ݳ� �Ϸ�");
						ȸ�����������α׷�_Ŭ��������3.book3[i].�����뿩����= true;
						ȸ�����������α׷�_Ŭ��������3.book3[i].�뿩ȸ��= null;
					}
				}
			}
			i++;
		}
		System.out.println("������ isbn �� ����");
	}
	void �������() {
		System.out.println(" ������� ������");
		System.out.print(" ISBN"); String isbn = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		System.out.print(" ������"); String ������ = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		System.out.print(" �۰�"); String �۰� = ȸ�����������α׷�_Ŭ��������3.scanner.next();
		
		for (Book3 temp : ȸ�����������α׷�_Ŭ��������3.book3) {
			if(temp!=null && temp.isbn.equals(isbn)) {
				System.out.println("���� ������� ISBN");
				return;
			}
		}
		
		
		Book3 book3 = new Book3(isbn, ������, �۰�, true, null);
		
		int i = 0;
		for(Book3 temp : ȸ�����������α׷�_Ŭ��������3.book3) {
			if(temp ==null) {
				ȸ�����������α׷�_Ŭ��������3.book3[i]=book3;
				System.out.println("������� �Ϸ�");
				return;
			}
			i++;
		}
		
	}
	void ��������() {
		System.out.println( "���� ���� ������ ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
