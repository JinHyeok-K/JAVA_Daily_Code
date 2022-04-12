package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Room;
import dto.Roomlive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;


public class RoomDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static RoomDao roomDao= new RoomDao();
	
	
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}
	
	// 1. 방 저장 메소드
	public boolean roomadd(Room room) {
		try {
		String sql = "insert into javafx.room(roname,roip) values(?,?)";
			// 테이블에 레코드 추가 문법 : insert into 테이블명(필드명1,필드명2,필드명n)value(값,값,...,값);
		ps = con.prepareStatement(sql);
		ps.setString(1, room.getRoname());
		ps.setString(2, room.getRoip());
		ps.executeUpdate();
		return true;
		}catch (Exception e) {System.out.println("[sql오류]:"+e);	}
		return false;
	}
	
	// 2. 방 번호 호출 메소드 [ 방 번호 = 포트번호로 사용할 예정 ]
	
	public int getroomnum() {
		try {	//  max(필드명) : 해당 필드의 가장 큰 값 
			String sql = "select max(ronum) from room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
				
			}
			
			
			
		}catch (Exception e) {System.out.println("[sql오류]:"+e);	}
		return 0;
	}
	// 3. 모든 방 호출 메소드[ tableview -> ObservableList 만 지원 ] 
	public ObservableList<Room> roomlist(){
		
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		try {
			String sql =  "select * from javafx.room order by ronum desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// rs = Resultset 인터페이스 객체 : select의 결과 조회
				// resultset
				// rs.next() : select결과의 레코드 1개 가져오기
				// rs(null) -> rs.next() -> rs(결과의 첫번째 레코드 ) -> rs.next()
			while(rs.next()) {
				String sql2 = "select count(*) from roomlive where ronum = "+ rs.getInt(1);
				ps = con.prepareStatement(sql2);
				ResultSet rs2  = ps.executeQuery();
				int count = 0 ;
				if( rs2.next() ) {  count = rs2.getInt(1); }
				Room room = new Room(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						0 );
				roomlist.add(room);
				
				
			}
			return roomlist;
		}catch (Exception e) {System.out.println("[sql오류]:"+e);	}
		
		
		return null;
	}
	
	// 4. 채팅방 접속 명단 추가
	public boolean addroomlive(Roomlive roomlive) {
		
		String sql = "insert into javafx.roomlive(ronum,mid)values(?,?)";
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, roomlive.getRonum());
			ps.setString(2, roomlive.getMid());
			ps.executeUpdate();
			
			return true;
			
			
		}catch (Exception e) {System.out.println("[sql error :"+e);	}
		
		
		return false;
	}
	
	// 5. 채팅방 접속된 모든 명단 호출
	
	public ArrayList<Roomlive> getRoomlivelist(int ronum){
		
		ArrayList<Roomlive> roomlivelist = new ArrayList<>();
		try {
			
			String sql = "select * from javafx.roomlive where ronum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs=ps.executeQuery();
			while(rs.next()) {
				
				Roomlive roomlive = new Roomlive(
						
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
				
				roomlivelist.add(roomlive);		
			}
			return roomlivelist;
			
			
			
		}catch (Exception e) {System.out.println("[sql error :"+e);	}
		
		return null;
	}
	
	// 6. 채팅방 접속 명단 삭제
	
	public boolean roomlivedelete(String mid) {
		
		String sql = "delete from javafx.roomlive where mid =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.executeUpdate();
			return true;
			
			
		}catch (Exception e) {System.out.println("[sql 삭제 error :"+e);	}
		return false;
	}
	
	// 7. 채팅방 삭제 [ 조건 : 해당 채팅방에 접속명단이 0이면 ]
	
	public boolean roomdelete(int ronum) {
		
		String sql = "select * from javafx.roomlive where ronum=?";
		try {
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs=ps.executeQuery();
			if(rs.next()) {
				return false;
			}else {
				String sql2 = "delete from javafx.room where ronum =? ";
				ps =con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true;
			}
			
			
		}catch (Exception e) {System.out.println("[sql  error :"+e);	}
		
		return false;
	}
	
	
	
	
	
}




































