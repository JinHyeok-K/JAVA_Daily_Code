
/*
package Test_p2;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class ȣ�ڿ���_Controller {

	public static boolean ��¥üũ(String ��¥) {
//		ȣ�ڿ��� ȣ�ڿ������� = new ȣ�ڿ���();
//		ȣ�ڿ�������.
		
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
	
	public static void ������() {
		for(ȣ�ڿ���_Room temp : Main.roomlist) {
			if(temp != null) {
				System.out.println(temp.getDate()+"\t"+temp.getRname()+"\t\t"+temp.getName());
			} // if e
		} // for e
	} // ������ e

	public static int ����(String ��¥, String name, int ch) {
		
		ȣ�ڿ���_Room room1 = new ȣ�ڿ���_Room("Ʈ����", "10,000��","����Ұ�", name, ��¥);
		ȣ�ڿ���_Room room2 = new ȣ�ڿ���_Room("�����", "20,000��","����Ұ�", name, ��¥);
		ȣ�ڿ���_Room room3 = new ȣ�ڿ���_Room("�ٴٺ�Ʈ����", "30,000��","����Ұ�", name, ��¥);
		ȣ�ڿ���_Room room4 = new ȣ�ڿ���_Room("�ٴٺ�����", "40,000��","����Ұ�", name, ��¥);
		ȣ�ڿ���_Room room5 = new ȣ�ڿ���_Room("����Ʈ��", "50,000��","����Ұ�", name, ��¥);
		
		for(int i = 0; i<Main.roomlist.length; i++) {
			if(Main.roomlist[i]==null) {
					if(ch==1) {
						Main.roomlist[i]=room1;
						return 1;
					} // if e
					else if(ch==2) {
						Main.roomlist[i]=room2;
						return 2;
					} // else if e
					else if(ch==3) {
						Main.roomlist[i]=room3;
						return 3;
					} // else if e
					else if(ch==4) {
						Main.roomlist[i]=room4;
						return 4;
					} // else if e
					else if(ch==5) {
						Main.roomlist[i]=room5;
						return 5;
					} // else if e
				
			
			} // if e
		} // for e	
	return 6;
	} // ���� e

	public static int ����(int �ݾ�) {
		for(ȣ�ڿ���_Room temp : Main.roomlist) {
			if(temp.getRname().equals("Ʈ����")) {
				if(�ݾ�<10000) {
					return 1;
				}
				else {
					return 2;
				} // else e
			} // if e
			else if(temp.getRname().equals("�����")) {
				
			} // else if
		} // for e
		
	return 10;
	} // ���� e
	
} // ce


*/