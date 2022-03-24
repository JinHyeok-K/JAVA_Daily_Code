package Day05;

import java.util.Random;
import java.util.Scanner;

// 
//	1. 입,출력 
//  2. 변수/자료형/연산
//  3. 제어/반복
//	4. 제어/반복
//	5. 배열


/*
도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ ID(중복X), PW ]
		2. 도서 [ 도서명(중복X), 도서대여여부(대여 가능 OR 대여중), 대여인(로그인 시 아이디)]
	2. 초기메뉴
		1. 회원가입 2.로그인
			1. 회원가입 시 아이디 중복체크
			2. 로그인 성공 시 로그인 메뉴, 로그인 실패시 로그인 실패 출력
	3. 로그인 시 메뉴
		1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5. 로그아웃
			1.도서 검색 시 도서명이 일치하면 도서명과 도서 대여여부 출력
			2.도서 목록 시 모든 도서명 출력
			3.도서 대여시 도서 대여여부가 가능할 때 도서 대여 처리
			4.도서 반납 시  본인이 대여한 도서만 반납 처리
			5.로그아웃
			
	4. 로그인 시 아이디가 admin 이면 관리자 메뉴
		1. 도서 등록 2. 도서 목록 3. 도서 삭제 4. 로그아웃 
			1. 도서 등록 시 도서명을 입력 받아 도서 등록처리
			2. 도서 목록 시 모든 도서명 출력
			3. 도서 삭제 시 삭제 할 도서명을 입력받아 동일한 도서명 삭제 [null]
			4. 로그아웃 시 초기메뉴로
			====================================================================
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열

	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ]
		2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	2. 초기메뉴
		1.회원가입 2.로그인 
			1.회원가입시 아이디 중복체크 
			2.로그인 성공시 로그인메뉴 , 로그인 실패시 로그인실패 출력 
	3. 로그인시 메뉴 
		1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
 			1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
			2. 도서목록시 모든 도서명 출력 
			3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
			4. 도서반납시 본인이 대여한 도서만 반납 처리 
			5. 로그아웃 초기메뉴로 

	4. 로그인시 아이디가 admin 이면 관리자메뉴 
		1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
			1. 도서등록시 도서명을 입력받아 도서 등록처리
			2. 도서목록시 모든 도서명 출력 
			3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
			4. 로그아웃시 초기메뉴로 
	*/
		
			
			
			
			

public class Day05_04_도서대여프로그램 { // c.s
	
	public static void main(String[] args) { // m s
	// 1. 배열 변수	
		// 입력 객체 start
		Scanner scanner = new Scanner(System.in);
		String[][] 회원 = new String[101][3]; 	// 회원 배열 선언 : total 100명
			// ID /PW / 대여중 도서
		String[][] 도서목록 = new String[100][3]; 		// 도서 배열 선언 : total 100개 장서
			// 도서명 /대출중 or 대출가능 / 대여인(id)
		Random random = new Random();
		int admin_address = random.nextInt(회원.length);
		String admin_ID ="admin";
		String admin_PW ="admin";
		회원[admin_address][0] = admin_ID; 회원[admin_address][1] = admin_PW;
		// admin 등록 확인
		System.out.println(admin_address);
		System.out.println(회원[admin_address][0]);
		System.out.println(회원[admin_address][1]); 
		
	// 2. 초기메뉴
//		1. 회원가입 2.로그인
//		1. 회원가입 시 아이디 중복체크
//		2. 로그인 성공 시 로그인 메뉴, 로그인 실패시 로그인 실패 출력
		
		while(true) {
		
		System.out.println(" ======================= ");
		System.out.println(" ======= 도서 대여  프로그램 ======= ");
		System.out.println(" ======================= ");
		System.out.println(" 1. 회원 가입 2. 로그인 ");
		System.out.println(" 선택 : "); 
		//* admin 계정 등록
		
//		회원[100][0] = "admin";
//		회원[100][1] = "admin";
//		
		
		int realcount = 0;
		int nullcount = 0;
//		System.out.println(회원[100][0]);
//		System.out.println(회원[100][1]);
		// 1. 회원가입
			// 1. ID | PW |
		
//================================================================================================
		int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.println("==== 회원가입 페이지 ====");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				System.out.print(" Member Name : ");		String name = scanner.next();
				
				// 2. ID 중복 체크
				
				boolean idcheck = true;
				for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행
					
					if (회원[i][0]!=null && 회원[i][0].equals(id)) {
						System.err.println(" 알림)) 이미 사용하고 있는 ID 입니다.");
						idcheck = false;
						break;
					}// 회원 ID check if 문 end
				}// 중복 체크 for 문 end
				// select 1 ==> 저장 부분
				if (idcheck == true) { // idcheck 가 true 인 경우에만 회원가입 처리
					for(int i=0;i<회원.length;i++) {
						if( 회원[i][0] == null ) {	
							
							회원[i][0]= id; 	
							회원[i][1]= password;
							회원[i][2]= name;  // i 번째 각 열에 데이터 저장
							System.err.println(" 알림)) 회원가입이 되었습니다. ");
							break; 
						} // 회원 총 길이 (100) 만큼 반복 시행 'for 문 end' ==> 저장
					} // 회원 정보 저장 'for 문 end'
				} // idcheck 후 회원 가입내용 저장 'if 문 end'
			}// select ==1 일때  'if 문 end
//    메뉴 1 ================================================================================================ 
			
		// 2. 로그인
			
			 if(selectNo==2) { // 로그인 시작
				System.out.println(" 로그인 할 ID :"); 	String id= scanner.next();
				System.out.println(" 비밀 번호 :"); 		String password= scanner.next();
				
				
				boolean logincheck = false;
				for(int i=0;i<회원.length;i++){ // 회원 ID 길이만큼 반복 수행 | pw check
					
					if(  회원[i][0] !=null &&회원[i][0].equals(id) &&	 // null 이 아니다 = 회원이 있다. 
							회원[i][1].equals(password)) {
						System.err.println(" 알림)) 로그인 성공");
						logincheck = true; // 로그인 성공 값 저장
					
				//==========================
				
					if(logincheck == false) System.err.println("알림 )) 회원 정보가 없거나 다릅니다.");
			
				
			 if ("admin".equals(id)) {
						System.out.println(" ==================== ");
						System.out.println(" ===== 관리자 메뉴 ===== ");
						System.out.println(" 1. 도서 등록 2. 도서 목록 3. 도서 삭제 4. 로그아웃  ");
						System.out.println(" 선택 : "); 
						int selectadmin =scanner.nextInt();
						if(selectadmin == 1) { // 도서 등록
							System.out.println(" 등록할 도서 수 :"); int booknum= scanner.nextInt();
								for (int q=0;q<booknum;q++) {
									System.out.println(" 등록하는 도서 :"); String book= scanner.next();
										도서목록[q][0]= book;
								}
						}
						else if (selectadmin ==2 ) {
								System.out.println("도서 명" +"\t"+"대출여부"+"\t"+"대출인");
								for (int q =0;q<도서목록.length;q++) {
//							
									if (도서목록[q][0]!=null) {
//										System.out.println(도서목록[q][0]);
//										System.out.println("도서 명" +"\t"+"대출여부"+"\t"+"대출인");
										System.out.println(도서목록[q][0]+"\t"+도서목록[q][1]+"\t"+도서목록[q][2]);
									}
								}
								 								
//								}
								
						}
							
							else if (selectadmin == 3) {
								System.out.println(" ==================== ");
								System.out.println(" 삭제할 도서를 선택하세요 : ");	 int del_book= scanner.nextInt();
								for (int q=0;q<도서목록.length;q++) {
									도서목록[q][del_book-1] = null;
								}
							}
							
							else if (selectadmin == 4) {
									System.out.println(" 메인으로 돌아갑니다. ");
									break;
							}
							     
							
								
								
					}
						
					
					else if(logincheck =true) {
						System.out.println(" ================= ");
						System.out.println(" 1.대출 현황 2. 도서 메뉴  ");
						System.out.println(" 선택 : "); 
						int selectNo2 = scanner.nextInt();
				
				// 회원 정보(대여중인지 아닌지) 
		
					if (selectNo2==1) { // 대출 여부 확인
						for (int j=0;j<회원.length;j++) {
							if (회원[j][2] == null) {
								nullcount++;
								
							}
						}	
						if (nullcount>회원.length) {
							System.err.println(" 알림)) 대출 중인 도서가 없습니다.");
						}
						System.err.println(회원[i][2]);
						System.out.println(nullcount);
							
							
						
					} //System.out.println(회원[i][2]);
				
		
					if (selectNo2==2) { // 도서 메뉴 
						System.out.println(" ================= ");
						System.out.println(" 1.도서 목록 2. 도서 대출 3. 도서 반납 4. 뒤로  ");
						System.out.println(" 선택 : "); 
						int selectNo3 = scanner.nextInt();
							if(selectNo3==1) {
								System.out.println("도서 명" +"\t"+"대출여부"+"\t"+"대출인");
								for (int q =0;q<도서목록.length;q++) {
										if (도서목록[q][0]!=null) {
											
											System.out.println(도서목록[q][0]+"\t"+도서목록[q][1]+"\t"+도서목록[q][2]);
											}
										}
							}
							if(selectNo3==2) {
								System.out.println(" ================= ");
								System.out.println(" ====== 대출할 도서를 선택하세요 ====== ");
								System.out.println("도서 명" +"\t"+"대출여부"+"\t"+"대출인");
								for (int q =0;q<도서목록.length;q++) {
									if (도서목록[q][0]!=null) {
										
										System.out.println(도서목록[q][0]+"\t"+도서목록[q][1]+"\t"+도서목록[q][2]);
										}
									}
								System.out.println(" ================= ");
								System.out.println(" 선택 : ");
								int sel = scanner.nextInt();
//								for (int q=0; q<도서목록.length;q++) {
//								회원[i][sel-1] = 도서목록[q][sel-1];
//								}
								회원[i][2]= 도서목록[sel-1][0];
//								
								
							}System.out.println(회원[i][2]);
					}
					
					
				}
			}
			
				
		
				}// 회원 pw check if 문 end
				if(logincheck == false) System.err.println("알림 )) 회원 정보가 없거나 다릅니다.");
			}// 중복 체크 for 문 end
			
			
//			} // 로그인 후 초기화 방지 while 문 end
			
		} // 도서 프로그램 while end
	}//main end
}// class end
