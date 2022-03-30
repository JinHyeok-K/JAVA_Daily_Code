package Test_p2;

import java.util.Scanner;

public class Main {
	
	
	static 호텔예매_Room[] roomlist = new 호텔예매_Room[100];	
	public static void main(String[] args) {//ms
//		static 호텔예매_Room[] roomlist = new 호텔예매_Room[100];	
//		호텔예매_Room[] roomlist = new 호텔예매_Room[100];	
		호텔예매 호텔예매시작 = new 호텔예매();	
		Scanner scanner = new Scanner(System.in);
	
		
		while(true) {//초기메뉴반복문 시작
			
			System.out.println("----------------호텔 예약 프로그램----------------");
			System.out.println("\t\t1.회원가입 2.로그인"); int ch = scanner.nextInt();
			if(ch==1) {//1.회원가입
				System.out.println("아이디를 입력하세요"); String id = scanner.next();
				System.out.println("비밀번호를 입력하세요"); String pw = scanner.next();
				System.out.println("이름을 입력하세요");	String name = scanner.next();
				System.out.println("전화번호를 입력하세요"); String phone = scanner.next();
				
				boolean 결과 = Main_Controller.회원가입(id, pw, name, phone);
				if(결과) {
					System.out.println("회원가입완료!!");
				}else {
					System.out.println("회원가입실패!!동일한아이디가 있습니다.");
				}
				
			}// 회원가입 end
			else if(ch==2) {//2.로그인
				System.out.println("로그인페이지 입니다");
				System.out.println("아이디를 입력하세요"); String id = scanner.next();
				System.out.println("비밀번호를 입력하세요"); String pw =scanner.next();
				
				int 결과 = Main_Controller.로그인(id, pw);
				if(결과 == 1) {
					System.out.println("로그인성공");
					// 일반회원 메뉴 호출 
					호텔예매시작.main();
				}else if( 결과 == 2) {
					System.out.println("관리자로그인성공");
					// 관리자회원 메뉴 호출 
				}else {
					// 실패 메시지 
					System.out.println("로그인실패");
					
				}
		
				
			}//로그인 end
			
			
			
			
			
			
		}//while end 초기메뉴반복문 끝
		
		
	}//main end
	
}//class end
