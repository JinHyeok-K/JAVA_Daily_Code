package controller.board;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;
import org.json.JSONObject;

//import javax.servlet.annotation.WebServlet;

// @ <- 어노테이션
// @WebServlet : URL 맵핑
// @WebServlet("HTTP 클래스 내로 들어오는 경로 정의");
	
// @ServerEndpoint("서버 소켓 클래스로 들어오는 경로 정의")
@ServerEndpoint("/chatting/{mid}") // {변수명} : URL 변수 받을 수 있다 ==> '?xx' 와 동일
public class Chatting { // 서버 소켓으로 사용할 클래스
	// 0. 접속자 명단
	//public static List<Session> clinets = new Vector<>(); //동기화 [한명 씩 처리
	public static Map<Session,String> clients = new Hashtable<>(); //동기화 [한명 씩 처리
	// 1. 소켓 오픈
	@OnOpen // 
	public void onOpen( Session session, @PathParam("mid") String mid) {
											//@PathParam : URL 경로상의 변수
			//clinets.add(session); // 해당 세션을 접속 명단에 추가
		clients.put(session, mid); // 해당 세션(키)과 접속된 아이디(ㅏ값)저장
		try {
		JSONArray array = new JSONArray();
		for(Session s : clients.keySet()) {
			JSONObject object = new JSONObject();
			object.put("type",2);
			object.put("mid", clients.get(s));
						
			array.put(object);
			}
		//2 전송
		for(Session s: clients.keySet()) {
			s.getBasicRemote().sendText(array.toString());
		}
		
		}catch (Exception e) {System.out.println("onOpen error :" +e);		}
		
	}
	
	
	
	
	@OnClose
	// 2. 소켓 닫기
	public void onClose( Session session ) {
		clients.remove(session); // 해당 세션 제거
		try {
			// 1. // 모든 세션의 접속된 아이디를 json형으로 변환
			JSONArray array = new JSONArray();
			for( Session s : clients.keySet() ) { 
				JSONObject object = new JSONObject();
				object.put("type", "2" );
				object.put("mid", clients.get( s ) );
							// Map객체.keyset() : map객체내 모든 키 호출 
							// Map객체.get( 키 )  : map객체내 해당 키 에 해당하는 값 호출 
				array.put(object);
			}
			// 2. 전송 
			for( Session s : clients.keySet() ) { // 리스트에 존재하는 세션들에게 메시지 보내기
				// map객체.keyset() : 모든 키 를 호출 
				s.getBasicRemote().sendText( array.toString() );
			}
		}catch (Exception e) { System.out.println(e); }
	}
	// 3. 소켓 메시지 받는다 -> 모든 유저에게 보내기
	@OnMessage
	public void onCMessage( String msg, Session session ) throws IOException{ 
		
		
		for(Session s : clients.keySet()) { // 현재 리스트에 존재하는 세션들에게 메시지 보내기
			s.getBasicRemote().sendText(msg);
			
		}
		
	}
	
	
}
