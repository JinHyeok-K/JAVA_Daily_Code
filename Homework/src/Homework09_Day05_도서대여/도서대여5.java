package Homework09_Day05_도서대여;

import java.util.Random;
import java.util.Scanner;
//22-03-17
public class 도서대여5 {
/*	===================================================
		문제점
			1. 로그인 실패 시 로그인 실패 메세지 설정 실패
			Q) 테스트 결과 로그인 실패 메세지 설정 시 로그인 실패 메세지 이후 break 가 없을 경우
			   관리자 로그인 성공 확인  ==> 왜 그런것인지?
			   ==> 관리자 로그인 방식이 잘못되었는지?
			2. 회원이 반납 메뉴 선택 시 대출 도서가 없을 경우 반납 불가능 코드 구현 실패
			   ==> 대출 도서 없을 경우 는 구현 했었으나 바로 반납 코드로 진입 ㅠㅠ... 
				
			
	*/
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
	*/ //13.08 | pause 13:17 | re 18:17 | pause 18:43 | re 19:00 | pause 19:40 |re 19:50
	// end 21:12
	public static void main(String[] args) {// 메인 시작 
//		1. 배열 변수
//		1. 회원 [ 아이디(중복x) , 비밀번호 ]
		String[][] 회원 = new String[100][3];  // 회원 정보 저장할  2차원 배열 설정
		String[][] 도서 = new String[10][3];   // 도서 정보 저장할 2창춴 배열 설정
		
//		 admin 설정 (난수로 랜덤한 배열에 admin 등록 ) 
		Random random = new Random();  // 랜덤 객체 로드
		int admin_address = random.nextInt(회원.length);  //회원 배열 길이내의 숫자 난수 발생
		String admin_ID ="admin"; // 관리자 id 설정
		String admin_PW ="admin"; // 관리자 pw 설정
		회원[admin_address][0] = admin_ID; 회원[admin_address][1] = admin_PW;  // 발생한 난수로 임의의 회원 배열 n번째 인덱스에 id와 비밀번호 저장
		// admin 등록 확인
//		System.out.println(admin_address);
//		System.out.println(회원[admin_address][0]);
//		System.out.println(회원[admin_address][1]);
//		
		
		
		// 배열 선언 완료
		
		while(true) { // master while start 무한루프 시작
			Scanner scanner = new Scanner(System.in);// 입력객체 로드 
			
			System.out.println("================"); 
			System.out.print("1.회원가입 2. 로그인"); int 초기선택 = scanner.nextInt(); // 회원가입 또는 로그인 선택용 변수 입력
			
			if(초기선택 == 1) {  //회원ㄱ 가입 선택 시
				// 회원가입
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				
				//1-1 회원가입
				//1-2 id 중복 체크
				// 회원가입용 내용 입력
				
				System.out.print("id : "); String id=scanner.next();  // id 와 비밀번호 입력
				System.out.print("pw : "); String pw=scanner.next();
				
				//1-2 중복체크
				
				boolean check = true;  // 스위치용  체크 변수  설정 (통과
				for(int i =0; i<회원.length;i++) {  // 0부터 회원 배열 크기만큼 반복문 시작 
					if(회원[i][0]!=null&&회원[i][0].equals(id)) {// 회원배열의 i번째 0의 배열이 null 이 아니고 입력한 id와 같으면
						System.out.println("이미 사용하고 있는 id입니다."); // 중복된 id 출력
						check = false; // 위 조건 만족 시 실패 
						break;  // 반복문(for_ 탈출
					}
				}//중복체크 완료
				
				if(check== true) { // 위 반복문 조건 만족 시 변수 check가 통과이므로 if문 시작
				//입력 완료
					for (int i = 0 ; i < 회원.length ; i++) { //  0부터 회원 배열 크기만큼 반복문 시작 
						if(회원[i][0]==null) { // 회원배열의 i번째 0의 배열이 null 이면
							회원[i][0] = id; 회원[i][1] = pw; // i번째 0에 id를, i번째 1에 비밀번호 대입
							System.out.println("회원가입 완료"); // 회원가입 완료 출력
							break;// 위 조건 만족 시 for문 종료
						}//회원가입 완료 1-1
					}
				}
				
			}
			else if(초기선택 == 2) { // 로그인 메뉴 선택
				//	// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
				System.out.println("================");
				System.out.print(" id :"); String id=scanner.next(); // id와 pw 입력 
				System.out.print(" pw :"); String pw=scanner.next();
				//입력완료
				//id 비번 동일시 로긴 체크
				boolean check = false; //로그인 완료시 true => 로그인 메뉴 진행용 
				for (int i=0;i<회원.length;i++) { //회원배열의 i번째 0의 배열이 null 이 아니고
					if(회원[i][0]!=null&&회원[i][0].equals(id)&&회원[i][1].equals(pw)) {//회원배열의 i번째 0의 배열이 null 이 아니고
						//i번째 0,i번째 1에 각각  입력한 id와 pw가 같으면
						System.out.println("로그인 완료"); //로그인 완료 출력
						check = true; // check 변수 true 설정
						
						
							while(check) { // sub 무한반복 시작 [ 종료조건 : 로그아웃 ]
							if(admin_ID.equals(id)) { // 입력한 id 와 관리자 id 와 같으면
								
								System.out.println(" ====관리자 메뉴===="); // 관리자 메뉴 호출
								System.out.print("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃 | 선택 :>"); int ad=scanner.nextInt(); // 관리자메뉴 선택
							
									if(ad==1) { //1 도서등록 시작  1. 도서등록시 도서명을 입력받아 도서 등록처리 
												//도서명으로 등록 => : 도서명 / 도서 대여 여부 / 대여자
										System.out.print(" 등록할 도서 명 : "); String 도서명= scanner.next();
//										도서명 입력 완료
//										 도서명 도서 배열 입력 시작 
										for (int j=0;j<도서.length;j++) {// 0부터 도서 크기 많큼 반복문 시작(1씩증가)
											if(도서[j][0]==null) { // 도서 배열의 j,0 번째 배열이 null 이면
												도서[j][0] = 도서명; 도서[j][1] = "가능"; 도서[j][2] = "-";// 비어있는 배열에 도서명, "도서대여가능여부 설정, 
												System.out.println(" 도서 등록 완료"); // 도서등록 완료 출력 
												break;// 등록 완료시 반복문 종료
											}
										}
									}else if(ad==2) { // 도서 목록  선택
										
										System.out.println("===================================");	
										System.out.println("번호\t 도서명 \t대여가능여부\t 대여자");  // 도서 목록 불러오기 번호 도서명 대여가능여부 대여자 출력
										for (int j =0 ; j<도서.length;j++) { // 0부터 도서 크기만큼 반복문 시행
											if(도서[j][0]!=null&&도서[j][1]!=null&&도서[j][2]!=null) { // 도서의 각 배열의 값이 null 이 아니면
											System.out.printf("%d\t%s\t%s\t\t%s \n",j+1,도서[j][0],도서[j][1],도서[j][2]);
											}// j+1(번호) , 도서명,도서대여가능여부,대여자 출력
										}
									}
									else if(ad==3) { //도서 삭제  선택
										System.out.print("삭제할 도서를(번호) 선택하세요 : "); // 도서삭제용  메세지 출력 
										int 삭제=scanner.nextInt(); //삭제 = 삭제할 도서 인덱스(번호)
										boolean del= true;; // del 변수에 true 설정
									
										if(도서[삭제-1][1]=="대여중") { // 입력한 인덱스의 도서배열의 인덱스-1,1에 대여중이라는 값이 있으면
											System.out.println(" 대여중인 도서 입니다."); // 대여중이라는 메세지 출력
											del=false; // 위 조건 시 도서 삭제 실패
											
										}
										else if(del==true) { // 대여중이 아닌 도서 선택 시 
											System.out.print("선택하신 도서를 삭제합니다. "); // 선택한 도서 삭제 안내 메시지
											도서[삭제-1][0] =null;  도서[삭제-1][1] =null; 도서[삭제-1][2] =null;
											//도서 배열의 선택한 위치의 배열의 값을 null로 설정 

											int k=삭제-1; // 인덱스 땡기기시작 // 입력한 값-1 로 k 설정
											for(int j=k;j<도서.length;j++) { // 입력한 값-1 부터 도서의 크기 만큼 1씩증가하면서 반복문 시행  
												if(j==도서.length-1) { // j의 값이 도서배열의 크기 -1 과 같아진다면
													도서[도서.length-1][0]=null; // 도서배열의 (도서 크기-1),0번째 값을 null로 처리
													도서[도서.length-1][1]=null;// 도서배열의 (도서 크기-1),1번째 값을 null로 처리
													도서[도서.length-1][2]=null;// 도서배열의 (도서 크기-1),2번째 값을 null로 처리
													break; // 조건 만족 시 for 문 종료
												}
											도서[j] = 도서[j+1]; // 도서 배열의j번째 인덱스를 j+1 번째 배열ㅇ로 대입   =>1번째까 2번째 배열로 
											}
										}
										}
										
									else if(ad==4) { // 4번 선택 )로그아웃)
										System.out.println(" 로그아웃 합니다."); //로그아웃 메세지 출력
										break; // 로그인용 메뉴 탈출(=관리자 메뉴 탈출) => 회원가입&로그인 메뉴로 이동
										}
											
									else {System.out.println("잘못된 입력입니다. ");} //1~4 외 입력시 출력 
								
							}
							else if (!"admin".equals(id)) {	 // 관리자 메뉴 외 회원로그인 시 표시되는 회원 메뉴 설정
									System.out.println("=========================");
									System.out.print("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃"); int 회원선택=scanner.nextInt();
									// 일반 회원용 메뉴 , 메뉴 선택 입력
									if(회원선택==1 ) { // 도서검색 선택 
										System.out.println("검색 할 도서"); String 검색도서 = scanner.next(); //도서검색용 입력객체 입력
										for(int j = 0 ; j<도서.length;j++) { // 0부터 도서배열의 크기만큼 1씩 증가하면서 반복문 시행
											if(도서[j][0]!=null&&도서[j][0].equals(검색도서)) { // 도서 배열의 j,0번째 값이null 아니고 검색도서와 일치하면
												System.out.println("=======================");// 검색도서에 관련된 내용 출력 
												System.out.println("도서명\t 대출여부\t 대출자"); // 내용은 도서명 대출여부 대출자 출력
												System.out.printf("%s\t%s\t%s\n",도서[j][0],도서[j][1],도서[j][2]);// 실제 내용 출력,도서명, 가능여부,누가빌ㄹ렸는지 
											}
										}
									}
									else if(회원선택==2) { // 도서 목록 호출
										System.out.println("==================================="); 	
										System.out.println("번호\t 도서명 \t대여가능여부\t 대여자"); // 등록된 도서의 번호(순서) 도서명 대여가능여부 대여자 색인 호출
										for (int j =0 ; j<도서.length;j++) { // 0부터 도서배열의 크기만큼 1씩 증가하면서 반복문 시행
											if(도서[j][0]!=null&&도서[j][1]!=null&&도서[j][2]!=null) { // 도서배열의 j,0번째 j,1번째, j,2번쨰 배열의 값이 null이 아닐때
											System.out.printf("%d\t%s\t%s\t%s \n",j+1,도서[j][0],도서[j][1],도서[j][2]);
											}// 색인에 관련된 내용 출력 (등록된 도서 모두 출력)
										}
									}
									else if(회원선택==3) { //3.도서대여 선택
										System.out.print("대여하실 책  입력하세요"); String 대여선택=scanner.next(); // 대여할 책 제목 입력
										for(int k=0;k<도서.length;k++) {// 0 부터 도서 크기만큼 1씩 증가하면서 반복문 시행
											if(도서[k][1]=="대여중") { // k,1번째 의 값이 대여중일 떄 
												System.out.println("대여중인 도서입니다 대여가 되지 않습니다."); //대여 불가능 메세지 출력
												break; // 대여 실패  반복문 종료
											}
										}
										
										//상기 조건에 비 만족시
										for (int j =0 ; j<도서.length;j++) {  //0 부터 도서 크기만큼 1씩 증가하면서 반복문 시행
											if(도서[j][0]!=null&&도서[j][0].equals(대여선택)){// j,0의 값이 null이 아니고 j,0의 값이 입력한 도서명과 같으면
											도서[j][1]="대여중"; 도서[j][2]=id; // j,1번째에 대여중 저장, 2번째 값엔 로그인한 id 값 저장 
											회원[j][2]=도서[j][0]; // 회원의 2엔 도서명 입력
											System.out.println("대여 완료"); // 위 조건 만족 시 대여 완료 메세지 출력
											break;// 도서 대여용 반복문 종료
											}
										}
									}
									else if(회원선택==4) {
										 // 도서 반납용 메뉴 선택
									
												System.out.println(" 대여한 책을 반납합니다."); // 반납 메세지 출력
												for (int k =0 ; k<도서.length;k++) {  //0 부터 도서 크기만큼 1씩 증가하면서 반복문 시행
													if(도서[k][2]!=null&&도서[k][2].equals(id)) {//도서 배열의 k행 의 id(저장된 회원 id) 가 null 이 아니고
														// 저장된 id와 로그인용 입력한 id가 같으면
														도서[k][1]="가능"; 도서[k][2]="-"; //도서는 대여 가능 처리/ 대여자 값 초기화
													}
											}
								
										}
									else if(회원선택==5) { // 로그아웃 메뉴 선택
										System.out.println("로그아웃");// 로그아웃 메세지 출력 
										break;//도서대여 프로그램 로그아웃 (sub while종료) => 회원가입&로그인 메뉴 이동
									}
									else {}
								}//else 
			
						}
					}
//					else {System.out.println("일치하는 정보가 없습니다.");break;}
				}
				
			}//if 2 end		
			else { System.out.println(" 잘못된 입력입니다. ");} // 잘못된 갑 입력 시 출력 메세지
		}// while end
			
		
	}//main end
}//class end