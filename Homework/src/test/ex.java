package test;

import java.util.Scanner;

public class ex {
	
	public static void main(String[] args) {
		
		�л�[] �л���� = new �л�[100];
		int[] ���� = new int[�л����.length];
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("===========================");
				System.out.println("qmfqkqmffk");
				System.out.println("===========================");
				
				//���� �ʱ�ȭ
				for (int i=0; i<�л����.length;i++) {
					����[i] = 1;
				}
				for(int i =0;i<�л����.length-1;i++) {
					for(int j=i+1;j<�л����.length;j++) {
						if(�л����[j]!=null&& �л����[i].get���() < �л����[j].get���() ) {
							����[i]++;
						}
						else if(�л����[j]!=null&& �л����[i].get���() > �л����[j].get���() ) {
							����[j]++;
						}
					}
				}
				
				for (int i = 0; i<�л����.length;i++) {
					if(�л����[i]!=null)
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),�л����[i].get�̸�(),�л����[i].get����(),�л����[i].get����(),
							�л����[i].get����(),�л����[i].get����(),�л����[i].get���(i),����[i]);
				}
				
					
				
				
				
				
				
				
			}catch(Exception e) {
				
			}
		}
	}
}
