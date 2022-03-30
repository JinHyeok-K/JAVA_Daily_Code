package Test_p2;

import java.util.ArrayList;



public class Main_Controller {

	public static ArrayList<회원가입정보> memberlist = new ArrayList<>();
	public static ArrayList<예약정보> bookinginfo = new ArrayList<>();

	

	
	public static boolean 회원가입(String id, String pw, String name, String phone) { //회원가입 메소드
		
		if(id.equals("admin")) {
			return false;
		}
		for(회원가입정보 temp : memberlist) {	//아이디중복체크
			if(temp.getId().equals(id))  {
				return false;
			}
		}//아이디중복체크 끝
		
		
		
		회원가입정보 가입정보 = new 회원가입정보(id, pw, name, phone);
		
		memberlist.add(가입정보);
		
		
		return true;
	}// 회원가입메소드 끝
	
	public static int 로그인(String id, String pw) {//로그인 메소드
		if( id.equals("admin") && pw.equals("1234") ) {
			return 2;//관리자로그인
		}
		for(회원가입정보 temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw) ) {
				
				return 1;//일반로그인
			}
		}
		return 3;//로그인실패
		
		
		
		
	}//로그인메소드 끝

	
	
	
	
	
	
	
	
	
	
	
	
	
}//class end
