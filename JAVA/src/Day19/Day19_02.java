package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_02 {
	public static void main(String[] args) {
		//로또 프로그램
			//set 컬렉션
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		
		while(true ) { 
			
			System.out.println(" 1~45 숫자 선택 (중복 불가) : ");
			int num = scanner.nextInt() ;
			if( num <1 || num >45 ) {
				System.err.println("선택할 수 없는 번호");
			}else {
				set.add(num);
				System.out.println(" 확인 "+set);
				
			}
			if(set.size()==6) {System.out.println("끝!"); break;}
		}
		
	}
}
