// 내꺼
package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.Roomlive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Chatting implements Initializable {

	@FXML
    private Button btnconnect;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txtmsg;
    
    @FXML
    private TableView<Room> roomtable;
    
    @FXML
    private Button btnsend;
    
    @FXML	 
    private TextField txtroomname;

    @FXML
    private Button btnadd;

    @FXML
    private Label lblselect;
    
    @FXML
    private TextArea txtmidlist;

		 
							
    
//    @FXML
//    private TextField txtname;
//    ===========================================
    
    public Server server; // 서버 소켓 생성
    public static Room selectroom; // 테이블 뷰에서 선택된 방 객체
    
    public void show() {
    	// Table view를 사용하는 방법
    	
    	// 1.  DB에서 모든 방 목록 가져오기
    	ObservableList<Room> roomlist=
    			RoomDao.roomDao.roomlist();
    	// 2. 테이블 뷰의 첫 번째 필드를 가져와서 방 번호 필드로 설정
    	TableColumn tc = roomtable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
    	// 3. 테이블 뷰의 두 번째 필드를 가져와서 방 이름 필드로 설정    	
    	tc = roomtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
    	// 4. 테이블 뷰의 세 번째 필드를 가져와서 방 인원 필드로 설정
    	tc = roomtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
    	// 5. 테이블 뷰에 리스트 넣어주기
    	roomtable.setItems(roomlist);
    	// 6. 해당 테이블을 클릭했을 때    /람다식 e->{실행코드}
    	roomtable.setOnMouseClicked(e->{ 
//    		if(selectroom==null) {}    
//    		else{// 7. 클릭된 객체(방)  가져와서 객체(방)에 저장
    		
    		selectroom = roomtable.getSelectionModel().getSelectedItem();
    		// 8. 레이블 표시 방 이름 표시
    		lblselect.setText("현재 선택된 방 : "+selectroom.getRoname());
    		System.out.println(selectroom.getRoip()+selectroom.getRonum() );							  
    		btnconnect.setDisable(false);
//    		}
    		
    	});

    }
    
    @FXML
    void add(ActionEvent event) { // 방 개설 버튼을 눌렀을 때
    	// 1. 컨트롤에 입력된 방 이름 가져오기
    	String roomname =txtroomname.getText();
    	
    	if (roomname.length()<4) {
    		// 만약에 방 이름이 4글자 미만이면 방개설 실패
    		txtroomname.setText(""); // 개설 후 방 이름 입력창 공백 처리
    		
    		Alert alert = new Alert(AlertType.CONFIRMATION);
    		alert.setHeaderText("방 개설 실패, 4글자 이상으로 만들도록"	);
    		alert.showAndWait();
    		
    		return;
    		
    	}
    	// 2. 방 객체
    	Room room = new Room(0, roomname, "127.0.0.1", 0);
    	// 3. db 처리
    	RoomDao.roomDao.roomadd(room);
    	// 4-1. 해당 방 서버 실행
    	server = new Server();
    	// 4-2. 서버 실행 [인수로 ip와 port 넘기기 ]
    	server.serverstart(
    			room.getRoip(),
    			RoomDao.roomDao.getroomnum()
    			);
    	txtroomname.setText(""); // 개설 후 방 이름 입력창 공백 처리
    	show(); // 테이블 새로 고침
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    		alert.setHeaderText("방 개설이 되었읍니당 : "
    					+RoomDao.roomDao.getroomnum());
    		alert.showAndWait();
    	
    	
    }
    
    @FXML
    void msg(ActionEvent event) {
    	String msg = Login.member.getMid()+" : "+ txtmsg.getText()+"\n";
//    	send(txtmsg.getText()+"\n");
    	send( msg ); // 메세지 보내기
    	txtmsg.setText(""); 	// 보내기 후 메시지 입력창 지우기
    	txtmsg.requestFocus(); 	// 보내기 후 메시지 입력창으로 포커스(커서) 이동
    	
    	midshow();
    	
    	}
    	
									  
    	
    
  
																	  
										  
						  
	 

    Socket socket;// 1. 클라이언트 소켓 선언
    
    // 2. 클라이언트 실행 메소드
    public void clientstart(String ip, int port) {
    	//멀티 스레드
    	Thread thread = new Thread() { //멀티스레드 실행
    		@Override
    		public void run() {
    			try {
    				
    				socket = new Socket(ip,port); //서버의 ip 와 포트번호 넣어주기[서버와 연결]
    				
    				send(Login.member.getMid()+" 님 입장했습니다. \n");
    				receive(); // 접속과 동시에 받기 메소드는 무한루프
    			}catch (Exception e) {
														 
    			System.out.println("클라이언트실행메소드:"+e);}
    		}
    	}; // 멀티스레드 구현 끝
    	thread.start(); // 멀티스레드 실행 
    }
    // 3. 클라이언트 종료 메소드
    public void clientstop() {
    	try {
    		socket.close();
    	}catch (Exception e) {System.out.println("클라이언트종료오류"+e);}
    }
										   
																									   
	
    // 4. 서버에게 메시지 보내기 메소드
    public void send(String msg) {
    	Thread thread = new Thread() {
    		@Override
    		public void run() {
    			try {
    				OutputStream outputStream = socket.getOutputStream(); // 1. 출력 스트림
    				outputStream.write( msg.getBytes() ); // 2. 내보내기
    				outputStream.flush(); // 3. 스트림 초기화 [ 스트림 내 바이트 지우기 ]
				} catch (Exception e) {
					System.out.println("메세지 에러" + e);
				}	
    		}
    	};// 멀티스레드 구현
    	thread.start();
    }
    // 5. 서버에게 메시지 받기 메소드
    public void receive() {
    	while(true) {
    		try {
    		InputStream inputStream = socket.getInputStream(); // 입력 스트림
    		byte[] bytes = new byte[1000];
    		inputStream.read(bytes);
    		String msg = new String(bytes);
    		txtcontent.appendText(msg);//입력받은 내용을 채팅방에 추가하기
	   
    		}catch (Exception e) { 
    		System.out.println("서버받기 :"+e);
    		}
	   
    	}
    	
    }
    
	
    public void midshow() {
																						  
    	ArrayList<Roomlive> roomlivelist 
			= RoomDao.roomDao.getRoomlivelist( selectroom.getRonum() );
		txtmidlist.setText("");
		int i = 1; 
		for( Roomlive temp : roomlivelist ) {
			txtmidlist.appendText( i +"번 "+ temp.getMid() +"\n");
			i++;
		}
    }
    
    
    
				 
						
						   
			   
	 
		 
																   
																						 
										 
																	   
																							  
			   
	 
    
    @FXML
    void connect(ActionEvent event) {
	 
    	if(btnconnect.getText().equals("채팅방 입장")) {// 만약에 버튼의 텍스트가 "채팅방 입장" 이면
    		
    		clientstart(selectroom.getRoip(),selectroom.getRonum());
    			// 현재 방 접속 명단 추가
    		Roomlive roomlive = new Roomlive(0, 
    										selectroom.getRonum(), 
    										Login.member.getMid());
    			// DB 처리
    		RoomDao.roomDao.addroomlive(roomlive);
    		
    		txtcontent.appendText("---[채팅방 입장]---\n");
    		btnconnect.setText("채팅방 나가기");
    		
    		txtmsg.setText("");
    		txtmsg.setDisable(false);		// 채팅입력창 사용가능
    		
    		txtcontent.setDisable(false); 	// 채팅창 목록 사용가능
    		btnsend.setDisable(false);		// 전송 버튼 사용 가능
     		txtmsg.requestFocus();			// 채팅 입력창으로  포커스[커서] 이동
     		
     		txtroomname.setDisable(true); // 채팅 방 이름 입력창 사용 금지
     		btnadd.setDisable(true); // 채팅 개설 버튼 사용 금지
     		roomtable.setDisable(true);  // 채팅방 목록 사용금지
     		
     		
    	}else {
    		
    		clientstop();
    		txtmsg.setText("채팅방 입장 후 사용가능");
    		txtcontent.appendText("---[채팅방 퇴장]---\n");
    		btnconnect.setText("채팅방 입장");
    		txtmsg.setDisable(true);		// 채팅입력창 사용금지
    		txtcontent.setDisable(true); 	// 채팅창 목록 사용금지
    		btnsend.setDisable(true);		// 전송 버튼 사용 금지
    		btnconnect.setDisable(true);
//    		
    		txtroomname.setDisable(false);
    		btnadd.setDisable(false);
    		roomtable.setDisable(false);
    		
    		// 1. 방 접속 명단에서 제외[삭제] 하기
    		RoomDao.roomDao.roomlivedelete(Login.member.getMid());
    		// 2-1. 만약에 방 접속명단이 0명이면 방 삭제
    		boolean result = RoomDao.roomDao.roomdelete(selectroom.getRonum());
    		if(result) {server.serverstop();}
    			// 2-2. 만약에 방이 삭제 되면 서버소켓 종료
    		//* 테이블 뷰에서 선택된 방 객체 초기화
    		selectroom = null;
    		// * 선택된 방 레이블 초기화
    		lblselect.setText("현재 선택된 방 : ");
    		
    		
    		show();
   									
		 
    	}
    }

    @FXML
    void send(ActionEvent event) { // 전송 버튼을 눌렀을 때
    	String msg = Login.member.getMid()+" : "+ txtmsg.getText()+"\n";
//    	send(txtmsg.getText()+"\n");
    	send( msg ); // 메세지 보내기
    	txtmsg.setText(""); 	// 보내기 후 메시지 입력창 지우기
    	txtmsg.requestFocus(); 	// 보내기 후 메시지 입력창으로 포커스(커서) 이동 
    	midshow();
	
    }
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 채팅 fxml 열렸을 때 초기값 메소드
			//* 채팅방 입장 전에 아래 fxid를 사용 못하게 금지
		txtmsg.setText("채팅방 입장 후 사용 가능");
		txtmsg.setDisable(true);		// 채팅입력창 수정금지 상태
		txtcontent.setDisable(true); 	// 채팅창 목록 사용금지
		btnsend.setDisable(true);		// 전송 버튼 사용 금지
		btnconnect.setDisable(true);	// 입장 버튼 사용 금지
		txtmidlist.setDisable(true);	// 방 접속회원 목록 사용 금지
		Thread thread = new Thread() { // 채팅방 목록 실시간 화면 처리
			@Override
			public void run() {
				while( true ) { 
					try {
						show();
						Thread.sleep(1000);
					}catch( Exception e ) {} 
				}
			}
		}; 
		thread.start();
    	
    }
		
	
}













