package test;

import java.util.Scanner;

public class test {
	
//	public static void main(String[] args) {
//		
//		// �迭 
//		�л�[] �л��迭 = new �л�[100];
//		Scanner scanner = new Scanner(System.in);
//		
//		while( true ) {
//			try {
//				System.out.println(" **** �л� ��� ****");
//				// �л��� ���� ��� [ ��� �迭 ���  ]
//				
//				System.out.print(" 1. �л���� 2.�л����� : ");
//				int ch = scanner.nextInt();
//				if( ch==1 ) {   } // �л� ��� 
//				else if( ch== 2 ) {   } // �л� ���� 
//				else {   }
//			}
//			catch( Exception e ) {     }
//		}
//	}
	
//			1. ����ǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//			2. �޴����� 1�� ���ý� �л������� �߰� �մϴ�. [ 5�� ]
//			3. �޴����� 2�� ���ý� �л������� ���� �մϴ�. [ 5�� ]
//			4. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ�. [ 5�� ]
//			5. ���� �Է��� 5������ �ϵ�, �ִ� 100�� �� �����ϵ��� �ۼ��մϴ�. [ 5�� ]
//			6. ��ȣ �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�. [ 5�� ]
//			7. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�. [ 5�� ]
//			8. ������ �̿��Ͽ� ������ ���մϴ�. [ 5�� ]
//			9. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]

	
	
	
	public static void main(String[] args) {
		
		�л�[] �л���� = new �л�[100];
		int[] ����= new int[�л����.length];
		while(true) {
//			Student[] student = new Student[100];
//			int[] rank = new int[100];
			
			//�⺻ ���
			System.out.println("---------------------------------------");
			System.out.println("\t��\t��\tǥ\t");
			System.out.println("---------------------------------------");
			System.out.println("��ȣ  �̸�  ����  ����  ����  ����    ���    ����");
			System.out.println("---------------------------------------");
			
			Scanner scanner =new Scanner(System.in);
//			int[] ����=new int[�л����.length];
//			
//			for(int i=0;i<�л����.length;i++) {
//				����[i]=1;
//			}
			for(int i=0; i<����.length;i++) {	// ���� ���� �迭 �ʱ�ȭ
				����[i]=1;
			}
			for(int i=0; i<�л����.length-1;i++) {
				for(int j=i+1;j<�л����.length;j++) {
					if(�л����[j]!=null && �л����[i].get���() < �л����[j].get���()){
						����[i]++;
					}
					else if(�л����[j]!=null && �л����[i].get���() > �л����[j].get���()){
						����[j]++;
					}
				}
			}
			
			
			
			int index =0;
			for(�л� temp:�л����) {
				if (temp!=null){
					System.out.printf("1%d%5s%5d%5d%5d%5.0f%8.2f%5d\n",
							(index+1),temp.get�̸�(),temp.get����(),temp.get����(),
							temp.get����(),temp.get����(),temp.get���(),����[i]);
				}
				index++;
			}
			
			System.out.println("-------------------------------------");
			System.out.println(" ��� �޴�");
			System.out.println("1.�л����� ��� 2. �л����� ����"); 
			int ���� = scanner.nextInt();
		
			
			if(���� == 1) {
				System.out.print("�л� �̸� : "); String �̸�=scanner.next();
				System.out.print("���� : "); int ����=scanner.nextInt();
				System.out.print("���� : "); int ����=scanner.nextInt();
				System.out.print("���� : "); int ����=scanner.nextInt();
				double ���� = ����+����+���� ;
				double ��� = (double)����/3;
				
				System.out.println(����);
				System.out.println(���);
				
				�л� �л��� = new �л�(�̸�,����,����,����,����,���);
//				
				int i = 0;
				for(�л� temp1:�л����) {
					if(temp1==null) {
						�л����[i] =�л���;
						break;
					}i++;
				}
//				int j = 0;
//				for(�л� temp : �л����) {
//					if(temp == null) {
//						�л����[j] = �л���;
//						int h = 0;
//						for(�л� temp2 : �л����) {
//							if(temp.get����() > temp2.get����()) 
//							{		
////									rank[] temp3 = �л����[j];
//									�л����[j] = �л����[h];
//									�л����[h] = temp3;
//							}	
//							h++;
//						}
//
//					}
//					j++;
//				}
			
			
				
				
			}
			else if(����==2) {
				
			}
		
		}//while end
	}//main end
}//class end

