package application.Day26;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day26_client {
	
	
	public static void main(String[] args) {
		
		// 1. ���� �����
		
		Socket socket = new Socket();
		
		// 2. �������� ���ε� 
		
		
		while(true) { // 2. ���� �������� �����ϱ� [���� ������ ip�� port ��ȣ �־��ֱ� ] 
			
			try {
				socket.connect(new InetSocketAddress("127.168.102.50",5000));
				System.out.println("[[������ ���� ���� ]]");
				
				Scanner scanner = new Scanner(System.in);
				// 3. �������� ������ �۽��ϱ� [ ������ ] : ��Ʈ�� �̿��� �ܺ� ��Ʈ��ũ ���
					// 1. ������ �Է��ϱ�
				System.out.println("�������� ���� �޽��� : " ); String msg= scanner.nextLine();
					// 2. ������ ��� ��Ʈ�� ��������
				OutputStream outputStream = socket.getOutputStream();
					// 3. �������� [ ���ڿ� -> ����Ʈ�� ]
				outputStream.write(msg.getBytes());
				
				// 4. �������� ������ ����[�ޱ�]�ϱ�
					// 1. ������ �Է� ��Ʈ��
				InputStream inputStream = socket.getInputStream();
					// 2. ����Ʈ �迭 ����
				byte[] bytes = new byte[1000];
					// 3. �Է� ��Ʈ�����κ��� ����Ʈ ��������
				inputStream.read(bytes);
				System.out.println(" ������ ���� �޽��� :"+new String(bytes));
				
			} catch (Exception e) {}
			
			
			
			
		}
		
		
		
	}
	
	
}
