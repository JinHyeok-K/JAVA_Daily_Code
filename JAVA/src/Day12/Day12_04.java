package Day12;

import java.util.Random;
import java.util.Scanner;

import javax.swing.event.CaretListener;

public class Day12_04 {
	// ������ȣ �й� ���α׷�
		// ���� 
			// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ���� 
			// 2. ��� ���� ��ȣ�� �迭�� ���� 
			// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
			// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����  
			// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ���� 
			// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	public static void main(String[] args) {
//		Random random =new Random();
////		int CarNum = random.nextInt(10000);
////		byte[] bytes = new byte[CarNum];
//		
//		String[] Car = new String[10];
//		// 2. ����Ʈ �迭 => ���ڿ� ��ȯ [ new String(�迭��); ]
////		String str1 = new String(bytes);
//	
////		System.out.println(CarNum);
//		for (int i = 0;i<Car.length;i++) {
//			int CarNum = random.nextInt(10000);
//			byte[] bytes = new byte[CarNum];
////			String Car = new String(bytes);
//		}
//		System.out.println(Car);
		
		String[] carlist = new String[10];
		Scanner scanner =new Scanner(System.in);
		while(true) {
			
			System.out.println("\n�������� ��� ���� ��ȣ");
			for(String temp :carlist) {	if (temp!=null) System.out.println(temp+"  ");}
			
			System.out.println("�������� ��� Ȧ�� ��ȣ");
			int i=0;
			for(String temp :carlist) {	if (temp!=null&&temp[i]/2==0) System.out.println(temp);i++;}
			
			
			
			System.out.println("1.��������");  int ch =scanner.nextInt();
			if (ch == 1) {
				Random random = new Random();//������ü
				int intnum = random.nextInt(10000); // 0~9999 �� ���� �߻�
				String strnum = String.format("%04d", intnum);
											// ����
												// %d : ���� %f �Ǽ� %s ���ڿ� %c ����
												// %0����d: ���ڸ�ŭ �ڸ��� 
				boolean save=false;
				for(int i=0;i<carlist.length; i++) {
					if(carlist[i]==null) {carlist[i] =strnum;save=true;break;}
				}
				if (save==false)System.out.println("����] �����Ұ�");
					}
				}
				
			
		}
		
		
		
		
		
		
		
		
		
	
}
