package Test_p2;


import java.util.Calendar;
import java.util.Scanner;




public class ȣ�ڿ��� {

//	public static Room[] roomlist = new Room[100];
	
///////////////////////// ��¥�Է¿���üũ(4�ڸ� �Է�) //////////////////////////////////
	public static boolean ��¥üũ(String ��¥) {
		Calendar calendar = Calendar.getInstance(); // �Է¹��� ���� ������ ���� ���ϱ� ����
		int month = Integer.parseInt(��¥) / 100; // �Է¹��� ��¥ 4�ڸ����Ŀ��� ���� 2�ڸ��� '��'�� ����
		int day = Integer.parseInt(��¥) % 100; // �Է¹��� ��¥ 4�ڸ����Ŀ��� ���� 2�ڸ��� '��'�� ����
		calendar.set(2022, month-1, 1); // �Է¹��� ���� ���������ڸ� ���ϱ� ���� �� 1�Ϸ� ����
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // �Է¹��� ���� ���������� ����
		if(month>=1 && month<=12 && day>=1 && day<=eday) {
			return true;
		} // if e
		return false;
	} // ��¥üũ e

/////////////////////////////////// ������ /////////////////////////////////////////		
	public static void ������() { //////////////////////////////////////////////////////////////////////////////// ������ ���ڿ����� ����
		for(ȣ�ڿ���_Room temp : Main.roomlist) {
			if(temp != null) {
				System.out.printf("%3s\t%10s\t%7s\n",temp.getDate(),temp.getRname(),temp.getName());
			} // if e
		} // for e
	
	} // ������ e
/////////////////////////////////// ���� /////////////////////////////////////////
	
//	public static void ����() {
		public void main() {
			
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("************** ȣ�� ���� ���α׷� **************");
				System.out.println("1.���� 2.������"); int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("��¥�Է�(mmdd) :");	String ��¥ = scanner.next();
				
					boolean result = ��¥üũ(��¥);
					
					if(result==true) {
						boolean[] ���డ�� = new boolean[5];
						for(ȣ�ڿ���_Room temp : Main.roomlist) {
							if(temp != null) {
						 // ��¥�� MM(��)dd(��)�� String ������ ��ü����
								if(temp.getDate().equals(��¥)) { // temp���� ��¥�� �Է¹��� ��¥�� �����ϰ�
									if(temp.getRname().equals("Ʈ����")) { // temp���� ���̸��� Ʈ����� �����ϸ�
										���డ��[0] = true;				// ���డ�� = true -> "����Ұ�"
									} // if e
									if(temp.getRname().equals("�����")) {
										���డ��[1] = true;
									} // if e
									if(temp.getRname().equals("�ٴٺ�Ʈ����")) {
										���డ��[2] = true;
									} // if e
									if(temp.getRname().equals("�ٴٺ�����")) {
										���డ��[3] = true;
									} // if e
									if(temp.getRname().equals("����Ʈ��")) {
										���డ��[4] = true;
									} // if e
								} // if e
							} // if e
						} // for e
					
						System.out.println("************** �� ���� ��Ȳǥ **************");
						System.out.println("��ȣ\t���̸�\t\t�ݾ�\t\t���࿩��");
						System.out.println("1"+".\t"+"Ʈ����\t\t"+"10,000��\t\t"+((���డ��[0])?"����Ұ�":"���డ��")); // ���ǿ�����[���ǽ�? �� : ����]
						System.out.println("2"+".\t"+"�����\t\t"+"20,000��\t\t"+((���డ��[1])?"����Ұ�":"���డ��"));
						System.out.println("3"+".\t"+"�ٴٺ�Ʈ����\t"+"30,000��\t\t"+((���డ��[2])?"����Ұ�":"���డ��"));
						System.out.println("4"+".\t"+"�ٴٺ�����\t"+"40,000��\t\t"+((���డ��[3])?"����Ұ�":"���డ��"));
						System.out.println("5"+".\t"+"����Ʈ��\t\t"+"50,000��\t\t"+((���డ��[4])?"����Ұ�":"���డ��"));
						
						System.out.println("�� ��ȣ ���� : ");	int ch2 = scanner.nextInt();
						System.out.println("������ �̸� : ");	String name = scanner.next();
						
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
						ȣ�ڿ���_Room room1 = new ȣ�ڿ���_Room("Ʈ����", "10,000��","����Ұ�", name, ��¥);
						ȣ�ڿ���_Room room2 = new ȣ�ڿ���_Room("�����", "20,000��","����Ұ�", name, ��¥);
						ȣ�ڿ���_Room room3 = new ȣ�ڿ���_Room("�ٴٺ�Ʈ����", "30,000��","����Ұ�", name, ��¥);
						ȣ�ڿ���_Room room4 = new ȣ�ڿ���_Room("�ٴٺ�����", "40,000��","����Ұ�", name, ��¥);
						ȣ�ڿ���_Room room5 = new ȣ�ڿ���_Room("����Ʈ��", "50,000��","����Ұ�", name, ��¥);
						
						for(int i = 0; i<Main.roomlist.length; i++) { ////////////////////////////////////////////////////////////////////////// �ߺ�ó�� ����
							if(Main.roomlist[i]==null) {
									if(ch2==1) {	
										if(���డ��[ch2-1]) {
											System.out.println("�˸�)�ش糯¥�� Ʈ���� ����Ұ��մϴ�.");
											break;
										} // if e
										else {
											Main.roomlist[i]=room1;
											System.out.println("1���� Ʈ������ ����Ǿ����ϴ�.");
//											�߰��ü�(i);
											break;
										} // else e
									} // if e
									else if(ch2==2) {
										if(���డ��[ch2-1]) {
											System.out.println("�˸�)�ش糯¥�� ����� ����Ұ��մϴ�.");
											break;
										} // if e
										else {
											Main.roomlist[i]=room2;
											System.out.println("2���� ������� ����Ǿ����ϴ�.");
//											�߰��ü�(i);
											break;
										} // else e
									} // else if e
									else if(ch2==3) {
										if(���డ��[ch2-1]) {
											System.out.println("�˸�)�ش糯¥�� �ٴٺ�Ʈ���� ����Ұ��մϴ�.");
											break;
										} // if e
										else {
											Main.roomlist[i]=room3;
											System.out.println("3���� �ٴٺ�Ʈ������ ����Ǿ����ϴ�.");
//											�߰��ü�(i);
											break;
										} // else e
									} // else if e
									else if(ch2==4) {
										if(���డ��[ch2-1]) {
											System.out.println("�˸�)�ش糯¥�� �ٴٺ����� ����Ұ��մϴ�.");
											break;
										} // if e
										else {
											Main.roomlist[i]=room4;
											System.out.println("4���� �ٴٺ������� ����Ǿ����ϴ�.");
//											�߰��ü�(i);
											break;
										} // else e
									} // else if e
									else if(ch2==5) {
										if(���డ��[ch2-1]) {
											System.out.println("�˸�)�ش糯¥�� ����Ʈ�� ����Ұ��մϴ�.");
											break;
										} // if e
										else {
											Main.roomlist[i]=room5;
											System.out.println("5���� ����Ʈ���� ����Ǿ����ϴ�.");
//											�߰��ü�(i);
											break;
										} // else e
									} // else if e
							} // if e		
						} // for e	

						
					} // if e
					else {
						System.out.println("�˸�))��¥�� �߸��Է��Ͽ����ϴ�.");
					} // else e

				} // if e
				else if(ch==2) {
					System.out.printf("%3s\t%10s\t%7s\n","��¥","���̸�","������");
					������();
				} // else if e
				
				
			}catch(Exception e) {
				System.out.println("�˸�))�����Դϴ�(�����ڿ��Թ���)");
			} // catch e

		} // while e

	} // ���� e
		
//		public static void �߰��ü�( int i) {
//			System.out.print("�߰� �̿� �ü��� �������ּ���.(�� 1ȸ�� ������ �����մϴ�.)"
//					+ "\n1.���ĺ���(30,000)\n2.������(20,000)\n3.�ｺ��(10,000)\n4.����"); int ch = scanner.nextInt();
//				if(ch==1) { System.out.println("���ĺ��並 �̿��մϴ�.");
//				roomlist[i].get�߰��̿�().add("���ĺ���");
//				
//				} else if (ch ==2) { System.out.println("�������� �̿��մϴ�.");
//				roomlist[i].get�߰��̿�().add("������");
//				
//				} else if(ch == 3) { System.out.println("�ｺ���� �̿��մϴ�.");
//				roomlist[i].get�߰��̿�().add("�ｺ��");
//				
//				} else {break;} //�ڷΰ���
//				
//		} // �߰��ü� e
		
	
} // ce
