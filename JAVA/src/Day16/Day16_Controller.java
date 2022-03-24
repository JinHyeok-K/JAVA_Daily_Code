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
	static LocalDate 입차연월일 = LocalDate.now();
	static LocalTime 입차시 =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
	
	// 입차 메소드 
	public static boolean 입차(  ) {
		
		System.out.print(" 차량 번호 입력 :  "); String 차량번호입력 = scanner.next();
		
		for(Car temp: Day16_Controller.carlist) {
			if(temp!=null && temp.get차량번호().equals(차량번호입력)) {
				System.out.println(" 이미 등록되어있는 차량입니다.");
				return false;
			}
		}
		
		Car car = new Car(입차연월일, 차량번호입력, 입차시, null, 0);
		Day16_Controller.carlist.add(car);
		return true;
		// 입차 코드 작성 
			// 1. 입력받은 차량번호(인수) 가져온다.
			// * 차량번호 중복체크
			// 2. 입차날짜(현재날짜) 을 구한다( ????? : )
			// 3. 입차시간(현재시간) 을 구한다( ????? : )
			// * 출차시간 , 금액은 출차시 x 
			// 4. 차량번호,입차날짜,입차시간 => 3개변수 -> 1객체화
			// 5. 차량객체를 배열이나 리스트 에 저장 
		
	}
	// 출차 메소드 
	public static boolean 출차( ) {
		// 출차 코드 작성
		System.out.print(" 차량 번호 입력 :  "); String 차량번호입력 = scanner.next();
		for(Car temp : Day16_Controller.carlist) {
			if(temp!=null && temp.get차량번호().equals(차량번호입력)) {
				LocalDate 출차연월일 = LocalDate.now();
				LocalTime 출차시 =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
				int 주차계산_연월일 = (int) 출차연월일.until(입차연월일, ChronoUnit.DAYS);
				int 주차계산_시분 = (int) 출차시.until(입차시, ChronoUnit.MINUTES);
				int 총주차시간 = (주차계산_연월일*24*60)+주차계산_시분; // 분단위로 계산 => 총 주차 분수
				int 주차요금 = 0;
				
				if(총주차시간<30) {
					주차요금 = 0;
				}
				else {
					주차요금 =((총주차시간-30)/10)*1000; 
				}
				
				temp.set금액(주차요금);
				temp.set출차시간(출차시);
				System.out.println("  총 주차 요금 : "+주차요금+ " 원입니다.");
				return true;
				
			}
		}
			// 1. 입력받은 차량번호(인수) 가져온다.
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서 
			// 3. 출차시간(현재시간) 을 구한다 (????? : )
			// 4. 계산 [ 출차시간 - 입차시간 => (분-30)/10 *1000  ]
			// 5. (수정)찾은 객체내 출시간과 금액을 대입한다.
		System.err.println(" 주차된 차량이 아닙니다.");
		return false;
	}
	
}
