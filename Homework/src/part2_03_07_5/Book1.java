package part2_03_07_5;

public class Book1 {
	// 1. Ŭ���� ���� 
				// 1. book
					// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ�� O
					// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
	String ISBN;
	String ������;
	String �۰�;
	boolean �����뿩����;
	String �뿩ȸ��;
	
	public Book1() {
	}

	public Book1(String iSBN, String ������, String �۰�, boolean �����뿩����, String �뿩ȸ��) {
		super();
		ISBN = iSBN;
		this.������ = ������;
		this.�۰� = �۰�;
		this.�����뿩���� = �����뿩����;
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	
	void �����˻�() {
		System.out.println("------------���� �˻�-------------");
		
	}
	//Q ) temp.boolean => true? ) 
	void �������() {
		System.out.println("------------���� ���-------------");
		System.out.println("ISBN\t������\t�۰�\t�����뿩����");
		for(Book1 temp : ȸ�����������α׷�_Ŭ��������1.books) {
			if(temp!=null) {
				if(temp.�����뿩����) {
					System.out.println(temp.ISBN+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩����");
				}else
					System.out.println(temp.ISBN+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
					//Q ) "�뿩���� , �뿩���� temp.�����뿩����(boolean)���� ?
			}
		}
	}
	
	void �����뿩(String loginid) {
		System.out.println("----------���� �뿩 --------");
		System.out.println("���� ISBN "); String isbn = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		int i =0;
		for(Book1 temp : ȸ�����������α׷�_Ŭ��������1.books) {
			if(temp!=null && temp.ISBN.equals(isbn)) {
				if(temp.�����뿩����) {
					System.out.println( " �ش� ���� �뿩 �մϴ�.");
					ȸ�����������α׷�_Ŭ��������1.books[i].�����뿩���� = false;
					ȸ�����������α׷�_Ŭ��������1.books[i].�뿩ȸ�� = loginid;
					break;
				}
				else System.out.println(" �ش� ������ �뿩�Ҽ� �����ϴ�."); break;
				
			}i++;
		}
		System.out.println(" ������ ��ȣ�� ������ ����");
	}
	
	
	
	void �����ݳ�(String loginid) {
		 �����뿩���(loginid);
		 System.out.println("ISBN : "); String isbn=ȸ�����������α׷�_Ŭ��������1.scanner.next();
		 int i =0;
		 for(Book1 temp : ȸ�����������α׷�_Ŭ��������1.books) {
			 if(temp!=null && temp.ISBN.equals(isbn)) {
				 if(temp.�뿩ȸ��.equals(loginid)) {
					 if(temp.�����뿩����) {
						 System.out.println(" �뿩���� �ƴմϴ�.");
					 }
					 else {
						 System.out.println("�ݳ��Ϸ�");
						 ȸ�����������α׷�_Ŭ��������1.books[i].�����뿩����=true;
						 ȸ�����������α׷�_Ŭ��������1.books[i].�뿩ȸ��=null;
						 break;
					 }
				 }
				 else System.out.println("ȣ������ �뿩�� ������ �ƴԹ̴�");
			 }
			 i++;
		 }
		 System.out.println(" ���� ������ �����̴�");
	}
	void �����뿩���(String loginid) {
		System.out.println("---------- ���� �ݳ� ----------");
		System.out.println("ISBN\t������\t�۰�\t�����뿩����");
		for(Book1 temp : ȸ�����������α׷�_Ŭ��������1.books) {
			if(temp!=null && temp.�뿩ȸ��.equals(loginid)) {
				System.out.println(temp.ISBN+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�뿩��");
			}
		}
	}
	void �������() {
		System.out.println("---------- ���� ��� ------------");
		System.out.println("ISBN :"); String isbn = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.println("������ :"); String ������ = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		System.out.println("�۰� :"); String �۰� = ȸ�����������α׷�_Ŭ��������1.scanner.next();
		
		for(Book1 temp : ȸ�����������α׷�_Ŭ��������1.books) {
			if(temp!=null && temp.ISBN.equals(isbn)) {
				System.out.println("��ϵ� ISBN �Դϴ�.");
				break;
			}
		}
		Book1 book = new Book1(isbn, ������, �۰�, true, null);
		int i =0;
		for(Book1 temp: ȸ�����������α׷�_Ŭ��������1.books) {
			if(temp== null) {
				ȸ�����������α׷�_Ŭ��������1.books[i] = book;
				System.out.println("���� ��� �Ϸ�");
				break;
				
			}
			i++;
		}
	}
	
	void ��������() {
		System.out.println("------- ���� ���� -----------");
		
	}
}
