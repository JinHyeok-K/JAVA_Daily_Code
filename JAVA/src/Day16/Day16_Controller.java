package Day16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

import Day15.Car;
import Day15.Controller;

public class Day16_Controller {


	public static ArrayList<Car> carlist = new ArrayList<>(); 
	static Scanner scanner = new Scanner(System.in);
	static LocalDate ���������� = LocalDate.now();
	static LocalTime ������ =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
	
	// ���� �޼ҵ� 
	public static boolean ����(  ) {
		
		System.out.print(" ���� ��ȣ �Է� :  "); String ������ȣ�Է� = scanner.next();
		
		for(Car temp: Day16_Controller.carlist) {
			if(temp!=null && temp.get������ȣ().equals(������ȣ�Է�)) {
				System.out.println(" �̹� ��ϵǾ��ִ� �����Դϴ�.");
				return false;
			}
		}
		
		Car car = new Car(����������, ������ȣ�Է�, ������, null, 0);
		Day16_Controller.carlist.add(car);
		return true;
		// ���� �ڵ� �ۼ� 
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// * ������ȣ �ߺ�üũ
			// 2. ������¥(���糯¥) �� ���Ѵ�( ????? : )
			// 3. �����ð�(����ð�) �� ���Ѵ�( ????? : )
			// * �����ð� , �ݾ��� ������ x 
			// 4. ������ȣ,������¥,�����ð� => 3������ -> 1��üȭ
			// 5. ������ü�� �迭�̳� ����Ʈ �� ���� 
		
	}
	// ���� �޼ҵ� 
	public static boolean ����( ) {
		// ���� �ڵ� �ۼ�
		System.out.print(" ���� ��ȣ �Է� :  "); String ������ȣ�Է� = scanner.next();
		for(Car temp : Day16_Controller.carlist) {
			if(temp!=null && temp.get������ȣ().equals(������ȣ�Է�)) {
				LocalDate ���������� = LocalDate.now();
				LocalTime ������ =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
				int �������_������ = (int) ����������.until(����������, ChronoUnit.DAYS);
				int �������_�ú� = (int) ������.until(������, ChronoUnit.MINUTES);
				int �������ð� = (�������_������*24*60)+�������_�ú�; // �д����� ��� => �� ���� �м�
				int ������� = 0;
				
				if(�������ð�<30) {
					������� = 0;
				}
				else {
					������� =((�������ð�-30)/10)*1000; 
				}
				
				temp.set�ݾ�(�������);
				temp.set�����ð�(������);
				System.out.println("  �� ���� ��� : "+�������+ " ���Դϴ�.");
				return true;
				
			}
		}
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ� 
			// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
			// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
			// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
		System.err.println(" ������ ������ �ƴմϴ�.");
		return false;
	}
	
}
