package Test_p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;


public class 예약정보_Controller { //취소
	static Scanner scanner = new Scanner(System.in);
	public static void main() {
		
//			달력
//		while(true) {
//			System.out.println();		
//			System.out.print("월 : ");  int month = scanner.nextInt();
//			//무한루프 추가
//				//1. 캘린더 클래스 내 현재 날짜/시간 객체 호출
//				Calendar calendar = Calendar.getInstance();
//					//2.연도, 월, 일
//				int day = calendar.get(Calendar.DAY_OF_MONTH);
//						calendar.set(month, 1);
//						int sweek = calendar.get(Calendar.DAY_OF_WEEK);
//						int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//					
//					//3. 출력
//				System.out.println("===== "+month+"월 =====");
//				System.out.println("일\t월\t화\t수\t목\t금\t토");
//				
//					for(int i = 1; i<sweek; i++);{ 	System.out.println("\t");}
//					for(int i = 1; i <= eday; i++ ) {
//						System.out.print(i+"\t");	if( sweek % 7 == 0)	//7의 배수 찾기
//								System.out.println(); //배수마다 줄바꿈
//							sweek++; } //하루씩 요일이 증가
//		
		//////////////////////////////////////////////////////

		HashSet<String> 추가이용 = new HashSet<String>();
		int 조식뷔페 = 0;
		int 수영장 = 0;
		int 헬스장 = 0;
		
	//	while(true) {
		System.out.println();
			System.out.print("\n날짜를 선택해주세요. : "); String 날짜 = scanner.next();
			//날짜 저장
			
			System.out.print("해당 날짜에 이용할 시설을 선택해주세요.\n1.객실 2.추가 이용 시설 3. 뒤로가기"); int ch = scanner.nextInt();
			System.out.println();
	
			while(true) {
				if(ch==1) { System.out.print("이용할 객실을 선택해주세요."); }
				else if (ch ==2) {
					
				
					System.out.print("추가 이용 시설을 선택해주세요.(각 1회만 선택이 가능합니다.)"
							+ "\n1.조식뷔페(30,000)\n2.수영장(20,000)\n3.헬스장(10,000)\n4.결제"); int ch2 = scanner.nextInt();
						if(ch2==1) { System.out.println("조식뷔페를 이용합니다.");
						추가이용.add("조식뷔페"); //매출액 증가
						조식뷔페++;
						
						} else if (ch2 ==2) { System.out.println("수영장을 이용합니다.");
						추가이용.add("수영장"); //매출액 증가
						수영장++;
						
						} else if(ch2 == 3) { System.out.println("헬스장을 이용합니다.");
						추가이용.add("헬스장"); //매출액 증가
						헬스장++;
						
						} else {break;} //뒤로가기
						
						
				} else if (ch ==3) {break;}
				else {System.err.println("올바르게 입력하여 주세요.");}
				
				}
			System.out.println();
			System.out.println(날짜+"일에 이용하는 추가 이용 시설 : "+추가이용);
			

			int 결제금액 = (조식뷔페*30000)+(수영장*20000)+(헬스장*10000);

			System.out.println("총 결제금액 :"+결제금액);

				while(true) { System.out.println("입금 금액 : "); int 입금액 = scanner.nextInt();
					if(입금액 < 결제금액) { System.out.println("금액이 부족합니다.");}
					else {System.out.println("구매가 완료되었습니다.");}
					
					조식뷔페 = 0; 수영장 = 0; 헬스장 =0;
					System.out.println("잔돈 : "+(입금액-결제금액)+"원");
					break;
				}
			
			// 날짜에 해당 값 저장 후 추가이용 비우기
			추가이용.remove(추가이용);
			
			
			} // while end


	//	} //while end
		
////////////////////////////////////////////////////////////////////	
	
	
}