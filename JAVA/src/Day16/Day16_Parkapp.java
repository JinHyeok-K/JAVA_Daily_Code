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
			
			System.out.println("-------------------------- 주차 현황 표 -----------------------------------");
			System.out.println("\t\t현재 시간: "+Controller.입차연월일+" "+Controller.입차시);
			System.out.println("   날짜\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");
			
			
			for(Car temp : Controller.carlist) {
				if(temp!=null&& temp.get출차시간()==null) {
					System.out.printf("\n%s\t%s\t%s\t",temp.get날짜(),temp.get차량번호(),
							temp.get입차시간()+     "\t\t주차 중"+"\t\t정산 전");
				}
				if(temp!=null&& temp.get출차시간()!=null) {
					System.out.printf("\n%s\t%s\t%s\t\t%s\t\t%s",temp.get날짜(),temp.get차량번호(),
							temp.get입차시간(),temp.get출차시간(),temp.get금액());
				}
			}
				
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println("\t\t\t1.입차\t\t2.출차"); int ch =Controller.scanner.nextInt();
				
			if( ch == 1) {
				boolean result = Controller.입차();
					if(result)
						System.out.println("주차 완료 되었습니다.");
					else
						System.err.println("주차 실패");
			}
			else if(ch ==2) {
				boolean result = Controller.출차();
				if(result)
					System.out.println("안녕히 가십시오\n");
				else
					System.err.println("출차 실패");
			}
		}
	}
		
}
