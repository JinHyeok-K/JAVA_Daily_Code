package Day16;

import java.util.ArrayList;

import Day15.Car;

public class Day16_Parkapp {
	
	public static void main(String[] args) {
	
		Day16_Parkapp app = new Day16_Parkapp();
		app.menu();
	}
	
	void menu() {
		
		Day16_Controller Controller = new Day16_Controller();
		ArrayList<Car> carlist = new ArrayList<>();
		while(true) {
			
			System.out.println("-------------------------- ���� ��Ȳ ǥ -----------------------------------");
			System.out.println("\t\t���� �ð�: "+Controller.����������+" "+Controller.������);
			System.out.println("   ��¥\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");
			
			
			for(Car temp : Controller.carlist) {
				if(temp!=null&& temp.get�����ð�()==null) {
					System.out.printf("\n%s\t%s\t%s\t",temp.get��¥(),temp.get������ȣ(),
							temp.get�����ð�()+     "\t\t���� ��"+"\t\t���� ��");
				}
				if(temp!=null&& temp.get�����ð�()!=null) {
					System.out.printf("\n%s\t%s\t%s\t\t%s\t\t%s",temp.get��¥(),temp.get������ȣ(),
							temp.get�����ð�(),temp.get�����ð�(),temp.get�ݾ�());
				}
			}
				
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println("\t\t\t1.����\t\t2.����"); int ch =Controller.scanner.nextInt();
				
			if( ch == 1) {
				boolean result = Controller.����();
					if(result)
						System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
					else
						System.err.println("���� ����");
			}
			else if(ch ==2) {
				boolean result = Controller.����();
				if(result)
					System.out.println("�ȳ��� ���ʽÿ�\n");
				else
					System.err.println("���� ����");
			}
		}
	}
		
}
