package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server { // fxml ������� �ʴ� Ŭ���� [ ���� ��Ʈ�� ��� ] 
	
	// ��ø Ŭ���� [ Ŭ���� �ȿ� Ŭ������ ����Ǹ� ]
	
	public class Client {
		// ������ ���ӵ� Ŭ���̾�Ʈ�� Ŭ����
		
		// 1. �ʵ� [����]
		public Socket socket;
		// 2. ������
		public Client (Socket socket) {
			this.socket =socket;
			recive();  // ������ ����� Ŭ���̾�Ʈ ��ü�� ���� �� �� �ޱ� �޼ҵ� (���ѷ���)
		}
		// 3. ������ �޽��� �޴� �޼ҵ� [���� ���� : ������ Ŭ���̾�Ʈ�� ����Ǿ��� ��
		public void recive() { 
			// ��Ƽ ������ [ Thread Ŭ���� vs Runnable �������̽�
				// run �޼ҵ带 �ʼ������� �����ؾ� ��.
			// �������̽��� �߻�޼ҵ尡 �����ϱ� ������ ���� �ʼ� [ Ŭ�������� implement �ϰų� Anonymous ] 
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() { // �߻�޼ҵ� ����
					// ��������� �޽��� �޴� ����
					while(true) {
						try {		
							InputStream inputStream = socket.getInputStream(); // 1. �Է½�Ʈ��
							byte[] bytes = new byte[1000]; 	// 2. ����Ʈ �迭 ����
							inputStream.read(bytes); 		// 3. �Է½�Ʈ������ ����Ʈ �о���� 
							String msg = new String(bytes); // 4. ����Ʈ�� -> ���ڿ� ��ȯ
							// * ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
							
							for ( Client client : clientlist) {
								client.send(msg);
							}
	
						}catch (Exception e) {
							System.out.println("������ �޽��� �ޱ� ����:"+e);	}
						}
				}
			}; //��Ƽ������ ���� ��
			
			// �ش� ��Ƽ �����带 ������ Ǯ�� �־��ֱ�
			threadpool.submit(runnable);
			
			
			
		}
		
		public void send(String msg) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); 	// 1. ��� ��Ʈ��
						outputStream.write(msg.getBytes());						// 2. ��������
						
					}catch (Exception e) {
					System.out.println("������ �޽��� ������ ����:"+e);		}
					
				}
			};
			threadpool.submit(runnable); // �ش� ��Ƽ�����带 ������Ǯ�� �־��ֱ� 
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	

    
    // * ������ ����� Ŭ���̾�Ʈ�� �����ϴ� ����Ʈ
    public Vector<Client> clientlist = new Vector<>();
    // * ��Ƽ �����带 ������ �ִ� ������ Ǯ
    public ExecutorService threadpool;
    	// ExecutorService : ������Ǯ ���� �������̽� [ ����Ŭ����(implement) vs ��������(�͸�) ]
    
    // 1. �������� ����
    ServerSocket serverSocket;
    // 2. �������� �޼ҵ� [ �μ��� ip�� port�� �޾Ƽ� ���� ip�� port�� �������� ���ε�(����) ]
    public void serverstart(String ip, int port) { 
    	try {
    		// 1. ���� ���� �޸� �Ҵ�
    		serverSocket = new ServerSocket();
    	
    		// 2. ���� ���� ���ε� [ ip �� port ���� ]
    		serverSocket.bind(new InetSocketAddress(ip,port));
    		
    		
    	}catch (Exception e) {
    		//serverstop();
    	System.out.println("���� ���� ����:"+e);}
    		// 3. Ŭ���̾�Ʈ�� ��û ��� [ ��Ƽ ������ ����ϴ� ���� : Ŭ���̾�Ʈ 1. ����, 2. ������ , 3.�ޱ� ]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Socket socket = serverSocket.accept(); // 1. ��û �����Ŀ� ������ ������ ����
						clientlist.add(new Client(socket)); // 2. ����� Ŭ���̾�Ʈ(����� ����) �����Ŀ� ����Ʈ�� ����
					}	
				}catch (Exception e) {
				System.out.println("������ Ŭ���̾�Ʈ ���� ����:"+e);	}
				
			}
		}; // ��Ƽ ������ ���� ��
		// ������ Ǯ�� �޸� �ʱ�ȭ
		threadpool = Executors.newCachedThreadPool();
		threadpool.submit(runnable);
    }
    // 3. �������� �޼ҵ�
    
    public void serverstop() {
    	try {
    	// 1. ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �ݱ�
    	for ( Client client : clientlist) {
    		client.socket.close();
    	}
    	// 2. �������� �ݱ�
    	serverSocket.close();
    	// 3. ������Ǯ �ݱ�
    	threadpool.shutdown();
    	
    	}catch (Exception e) {System.out.println(e); }
    }
    
	
}
