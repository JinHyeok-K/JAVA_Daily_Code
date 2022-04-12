package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server { // fxml 사용하지 않는 클래스 [ 서버 컨트롤 사용 ] 
	
	// 중첩 클래스 [ 클래스 안에 클래스가 선언되면 ]
	
	public class Client {
		// 서버에 접속된 클라이언트의 클래스
		
		// 1. 필드 [소켓]
		public Socket socket;
		// 2. 생성자
		public Client (Socket socket) {
			this.socket =socket;
			recive();  // 서버와 연결된 클라이언트 객체가 생성 될 때 받기 메소드 (무한루프)
		}
		// 3. 서버로 메시지 받는 메소드 [실행 조건 : 서버와 클라이언트가 연결되어을 때
		public void recive() { 
			// 멀티 스레드 [ Thread 클래스 vs Runnable 인터페이스
				// run 메소드를 필수적으로 구현해야 함.
			// 인터페이스는 추상메소드가 존재하기 때문에 구현 필수 [ 클래스에서 implement 하거나 Anonymous ] 
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() { // 추상메소드 구현
					// 계속적으로 메시지 받는 상태
					while(true) {
						try {		
							InputStream inputStream = socket.getInputStream(); // 1. 입력스트림
							byte[] bytes = new byte[1000]; 	// 2. 바이트 배열 선언
							inputStream.read(bytes); 		// 3. 입력스트림으로 바이트 읽어오기 
							String msg = new String(bytes); // 4. 바이트열 -> 문자열 변환
							// * 서버가 받은 메시지를 현재 서버에 접속된 모든 클라이언트에게 받은 메시지 보내기
							
							for ( Client client : clientlist) {
								client.send(msg);
							}
	
						}catch (Exception e) {
							System.out.println("서버가 메시지 받기 실패:"+e);	}
						}
				}
			}; //멀티스레드 구현 끝
			
			// 해당 멀티 스레드를 스레드 풀에 넣어주기
			threadpool.submit(runnable);
			
			
			
		}
		
		public void send(String msg) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); 	// 1. 출력 스트림
						outputStream.write(msg.getBytes());						// 2. 내보내기
						
					}catch (Exception e) {
					System.out.println("서버가 메시지 보내기 실패:"+e);		}
					
				}
			};
			threadpool.submit(runnable); // 해당 멀티스레드를 스레드풀에 넣어주기 
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	

    
    // * 서버에 연결된 클라이언트를 저장하는 리스트
    public Vector<Client> clientlist = new Vector<>();
    // * 멀티 스레드를 관리해 주는 스레드 풀
    public ExecutorService threadpool;
    	// ExecutorService : 스레드풀 지원 인터페이스 [ 구현클래스(implement) vs 직접구현(익명) ]
    
    // 1. 서버소켓 선언
    ServerSocket serverSocket;
    // 2. 서버실행 메소드 [ 인수로 ip와 port를 받아서 받은 ip와 port로 서버소켓 바인딩(생성) ]
    public void serverstart(String ip, int port) { 
    	try {
    		// 1. 서버 소켓 메모리 할당
    		serverSocket = new ServerSocket();
    	
    		// 2. 서버 소켓 바인딩 [ ip 와 port 설정 ]
    		serverSocket.bind(new InetSocketAddress(ip,port));
    		
    		
    	}catch (Exception e) {
    		//serverstop();
    	System.out.println("서버 생성 실패:"+e);}
    		// 3. 클라이언트의 요청 대기 [ 멀티 스레드 사용하는 이유 : 클라이언트 1. 연결, 2. 보내기 , 3.받기 ]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Socket socket = serverSocket.accept(); // 1. 요청 수락후에 수락된 소켓을 저장
						clientlist.add(new Client(socket)); // 2. 연결된 클라이언트(연결된 소켓) 생성후에 리스트에 저장
					}	
				}catch (Exception e) {
				System.out.println("서버가 클라이언트 연결 실패:"+e);	}
				
			}
		}; // 멀티 스레드 구현 끝
		// 스레드 풀에 메모리 초기화
		threadpool = Executors.newCachedThreadPool();
		threadpool.submit(runnable);
    }
    // 3. 서버종료 메소드
    
    public void serverstop() {
    	try {
    	// 1. 접속된 모든 클라이언트들의 소켓 닫기
    	for ( Client client : clientlist) {
    		client.socket.close();
    	}
    	// 2. 서버소켓 닫기
    	serverSocket.close();
    	// 3. 스레드풀 닫기
    	threadpool.shutdown();
    	
    	}catch (Exception e) {System.out.println(e); }
    }
    
	
}
