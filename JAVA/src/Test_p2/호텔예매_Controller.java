
/*
package Test_p2;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class 호텔예매_Controller {

	public static boolean 날짜체크(String 날짜) {
//		호텔예매 호텔예매정보 = new 호텔예매();
//		호텔예매정보.
		
		Calendar calendar = Calendar.getInstance(); // 입력받은 월의 마지막 일을 구하기 위함
		int month = Integer.parseInt(날짜) / 100; // 입력받은 날짜 4자리형식에서 앞의 2자리를 '월'로 구분
		int day = Integer.parseInt(날짜) % 100; // 입력받은 날짜 4자리형식에서 뒤의 2자리를 '일'로 구분
		calendar.set(2022, month-1, 1); // 입력받은 월의 마지막일자를 구하기 위해 월 1일로 정의
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 입력받은 월의 마지막일을 구함
		if(month>=1 && month<=12 && day>=1 && day<=eday) {
			return true;
		} // if e
		return false;
	} // 날짜체크 e
	
	public static void 예약목록() {
		for(호텔예매_Room temp : Main.roomlist) {
			if(temp != null) {
				System.out.println(temp.getDate()+"\t"+temp.getRname()+"\t\t"+temp.getName());
			} // if e
		} // for e
	} // 예약목록 e

	public static int 예약(String 날짜, String name, int ch) {
		
		호텔예매_Room room1 = new 호텔예매_Room("트윈룸", "10,000원","예약불가", name, 날짜);
		호텔예매_Room room2 = new 호텔예매_Room("더블룸", "20,000원","예약불가", name, 날짜);
		호텔예매_Room room3 = new 호텔예매_Room("바다뷰트윈룸", "30,000원","예약불가", name, 날짜);
		호텔예매_Room room4 = new 호텔예매_Room("바다뷰더블룸", "40,000원","예약불가", name, 날짜);
		호텔예매_Room room5 = new 호텔예매_Room("스위트룸", "50,000원","예약불가", name, 날짜);
		
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
	} // 예약 e

	public static int 결제(int 금액) {
		for(호텔예매_Room temp : Main.roomlist) {
			if(temp.getRname().equals("트윈룸")) {
				if(금액<10000) {
					return 1;
				}
				else {
					return 2;
				} // else e
			} // if e
			else if(temp.getRname().equals("더블룸")) {
				
			} // else if
		} // for e
		
	return 10;
	} // 결제 e
	
} // ce


*/