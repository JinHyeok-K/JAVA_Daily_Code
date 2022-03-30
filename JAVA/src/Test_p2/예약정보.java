package Test_p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class 예약정보 {
	
	
	static ArrayList<예약정보> 예약 = new ArrayList<예약정보>();

	
	//필드 날짜, 객실, 결제금액, 조식뷔페, 헬스장, 수영장
	private LocalDate 날짜;
	private String 객실;
	private int 결제금액;

	//생성자
	public 예약정보() {

	}

	public 예약정보(LocalDate 날짜, String 객실, int 결제금액) {
		this.날짜 = 날짜;
		this.객실 = 객실;
		this.결제금액 = 결제금액;
	}

	public static ArrayList<예약정보> get예약() {
		return 예약;
	}

	public static void set예약(ArrayList<예약정보> 예약) {
		예약정보.예약 = 예약;
	}

	public LocalDate get날짜() {
		return 날짜;
	}

	public void set날짜(LocalDate 날짜) {
		this.날짜 = 날짜;
	}

	public String get객실() {
		return 객실;
	}

	public void set객실(String 객실) {
		this.객실 = 객실;
	}

	public int get결제금액() {
		return 결제금액;
	}

	public void set결제금액(int 결제금액) {
		this.결제금액 = 결제금액;
	}



	
	




	//메소드

}
