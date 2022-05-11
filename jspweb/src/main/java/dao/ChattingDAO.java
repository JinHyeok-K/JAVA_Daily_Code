package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dto.Board;
import dto.Chatting;

public class ChattingDAO extends Dao {

	public ChattingDAO() {
		super();
	}
	public static ChattingDAO chattingDAO = new ChattingDAO();
	public static ChattingDAO getChattingDAO() {return chattingDAO;}
	
	
	// 1. 입력 채팅 저장	
		public boolean write( Chatting chatting) { 
			
			String sql = "insert into chatting(  nickname , chatting )values(?,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString( 1 ,chatting.getNickname());
				ps.setString( 2 ,chatting.getChatting());
				
				ps.executeUpdate(); return true;
			}catch (Exception e) { System.out.println( e ); }	return false; 
		}
		
		
		// 2 채팅목록 출력 
		public ArrayList<Chatting> getchattinglist() { 
			ArrayList<Chatting> chattinglist = new ArrayList<Chatting>();
//					
			String sql = "select * from chatting ";			
			try {	
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {			
					Chatting chatting = new Chatting(
							rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getString(4));
					chattinglist.add(chatting);
	
				}
				return chattinglist;
			}catch (Exception e) {System.out.println("chattinglist 출력 sql 오류"+e);		}
			return null; }	
		
		
		
		
}
