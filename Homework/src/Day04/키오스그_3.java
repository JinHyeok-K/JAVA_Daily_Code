package Day04;

import java.util.Scanner;

public class 키오스그_3 { // [17:17]
	// 자판기 프로그램 [10min]
	// 1. 메뉴판 [ 1. 콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
	// 			// 1. 메뉴판에서 제품 선택하면 장바구니에 넣기
	//			// 2. 재고가 부족하면 알림( 재고 부족 )
	// 2. 초기 재고 [ 제품당 10개 씩 ]
	// 3. 결제 시 금액을 입력 받아 결제액 만큼 차감 후 잔돈 출력
			// 1. 투입한 금액보다 결제액(구매액)이 크면 결제 취소 [ 금액 부족 ]
	
	 // ==> 구매멘트 못적음 
	public static void main(String[] args) { // ms
		Scanner scanner = new Scanner(System.in);
		int 콜라구매=0;
		int 콜라재고 =10;
		int 콜라가격=300;
		
		int 사이다구매=0;
		int 사이다재고 =10;
		int 사이다가격= 200;
		
		int 환타구매=0;
		int 환타재고 =10;
		int 환타가격 =100;
		
		int 입금금액 = 0 ; int 결제금액= 0; int 잔액 = 0;
		
		while(true) {
		System.err.println(" === 자판기 == ");
		System.err.print(" 1.음료선택 2.결제"); int 선택= scanner.nextInt();
			while(true) {
				if( 선택 ==1 ) {
					System.out.println("1.콜라 2.사이다 3.환타 4.뒤로");
					System.out.print("선택 : "); int 음료선택 = scanner.nextInt();
					if (음료선택 == 1) {
						if(콜라재고==0) {
							System.out.println("재고가 없습니다.");
						}
						else {
							콜라재고--;
							콜라구매++;
						}
					}
				}
				else if( 선택 ==2 ) {
					if(사이다재고==0) {
						System.out.println("재고가 없습니다.");
						
					}
					else {
						사이다재고--;
						사이다구매++;
					}
				}
				else if( 선택 ==3 ) {
					if(환타재고==0) {
						System.out.println("재고가 없습니다.");
						
					}
					else {
						환타재고--;
						환타구매++;
					}
					
				}
				else if( 선택 ==4 ) {
					
				    break;
				}else System.out.println(" 잘못된 입력입니다.");
			}
				
			
				while(true) {
					if( 선택 ==2 ) { 
						System.out.println("결제 메뉴");
						System.out.print("1. 입금 2. 결제 3.취소"); int 결제선택 = scanner.nextInt();
						결제금액 = 콜라구매*콜라가격 + 사이다구매*사이다가격 + 환타구매*환타가격;
						if(결제선택 ==1 ) {
							System.out.print(" 입금 금액 : "); int 입금액 = scanner.nextInt();
							입금금액 = 입금액;
							System.out.println(" 입금 금액 "+입금금액+ "입니다.");
						}
						else if(결제선택 ==2){
							if (결제금액 ==0 ) {
								System.out.println(" 결제할 제품이 없습니다.");
							}
							else 
								잔액 = 입금금액- 결제금액;
							System.out.println(" 결제되엇습니다.");
							System.out.println(" 잔액은 "+잔액+"원입니다" );
							
							
						}
						
						else if(결제선택 ==3){
							System.out.println("결제 취소 되었습니다.");
							System.out.println("장바구니를 비웁니다.");
							콜라재고 = 콜라재고+콜라구매;
							환타재고 = 환타재고+환타구매;
							사이다재고 = 사이다재고+사이다구매;
							
						}
						else {break;}
						
					}
					
				}
			}
			
		
	}//me

}//ce


