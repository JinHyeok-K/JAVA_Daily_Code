package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_02 {
	public static void main(String[] args) {
		//�ζ� ���α׷�
			//set �÷���
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		
		while(true ) { 
			
			System.out.println(" 1~45 ���� ���� (�ߺ� �Ұ�) : ");
			int num = scanner.nextInt() ;
			if( num <1 || num >45 ) {
				System.err.println("������ �� ���� ��ȣ");
			}else {
				set.add(num);
				System.out.println(" Ȯ�� "+set);
				
			}
			if(set.size()==6) {System.out.println("��!"); break;}
		}
		
	}
}
