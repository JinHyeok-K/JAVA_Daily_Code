package part2_04_08_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_total_controller {
	static Scanner scanner =new Scanner(System.in);
	static ArrayList<Account> account = new ArrayList<>(); //ȸ�� ������Ͽ� ����Ʈ
	static ArrayList<Loan_List> loanlist = new ArrayList<>(); // ���� ��ǰ ����� ����Ʈ
	//ȸ���޴� 
	// 1. ȸ������ 
		// Bank_account Controller  ȸ������
	// 2. �α��� �޴�
		// Bank account controller �α���
	// 3. ���̵�ã�� 
		// Bank account Controller  ���̵�ã�� 
	// 4. ��й�ȣ ã��  
		// Bank account Controller ��й�ȣã��   
	
	//��Ʈ�� �޴�
	
	// 1. ���»��� 
		// Bank account Controller  ���»���
	// 2. �Ա�
		// Bank total Controller  �Ա�
	// 3. ���
		// Bank total Controller 
	// 4. ��ü
		// Bank total Controller 
	// 5. ����
		// Bank total Controller 
	// 6. �� ���¸��
		// Bank total Controller 
	Bank_account_controller account_controller = new Bank_account_controller();
	
	public void startMenu() {
		while(true) {
			
			System.out.println("=========================================");
			System.out.print("1.�α��� , 2.���̵�ã�� , 3.��й�ȣã��"); //����â ��� 
			int ch1=scanner.nextInt();
			if(ch1==1) {
				String result =account_controller.�α���();
				if(result==null)
					System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
				else if(result=="admin") {
					System.out.println("\n ����������"); //�����ڿ� �ȳ� ���
					�����ڸ޴�(); 
				}
				else 
					System.out.println("����ʽÿ�");
					ȸ���޴�(result);
			}
			else if(ch1==2) {
					account_controller.���̵�ã��();
					
			}
			else if(ch1==3) {
					account_controller.��й�ȣã��();
			}
			else System.err.println(" �߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}
	void ȸ���޴�(String loginid) {
		// ���� �ֿ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸��
		System.out.print("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸�� :");
		int ch1 = scanner.nextInt();
		if(ch1==1) {
			account_controller.���»���();
			
		}
		
	}
	
	//������ �޴�
	void �����ڸ޴�() {
		
		
	}
}
