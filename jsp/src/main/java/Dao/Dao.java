package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.Board;
import Dto.Member;


public class Dao {
	
	private Connection con;		 // db 연결 클래스
	private PreparedStatement ps;	 // db 조작 interface
	private ResultSet rs;				// db 결과 인터페이스
	
	
	public Dao() {
		// jdbc(java db connection) : java db 연동
			// 1. project 내 build path 에 mysqljdbc.jar 추가
			// 2. project 내 webapp => WEB-INF-lib -> mysqljdbc.jar 추가
		
		// 1. 드라이브 연결
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest?serverTimezone=UTC","root","1234");
		System.out.println("연동 성공");
		}catch (Exception e) { System.out.println("연동 실패"+ e);

		}
	}
	//회원가입
	public boolean signup(Member member) {
		
		//1.sql 작성
		String sql = "insert into member(mid,mpassword,mname) values(?,?,?)";
			// insert into 테이블(필드명1,필드명2,필드명3) values(값1,값2,값3);
			// insert into 테이블 values(값1,값2,값3,값4);
		//2. 연결된 DB SQL 연결
		try {
			ps = con.prepareStatement(sql);
			// 3. 각 ? 에 데이터 대입
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			// 4. sql 실행 
			ps.executeUpdate();
			return true;
			
		}catch (Exception e) {System.out.println("singup 오류발생"+e);

		}
		return false;
	}
	
	//로그인
	public boolean login(String id , String password ) {
		
		String sql = "select * from member where mid=? and mpassword=?";
		
		
		
			try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);		 
			ps.setString(2, password);
 			rs = ps.executeQuery();
			if( rs.next() ) { 
				return true;  
			}
		}catch(Exception e ) { System.out.println( "login[SQL 오류]"+e  ); }
		return false; 
		
	}
	//삭제
	public boolean delete( String id ) {
		try {
			String sql1 = "delete from member where mid=?";	
			
			
			//String sql2 = "delete from member where mnum = ?"; 
			
			ps = con.prepareStatement(sql1); // 2.SQL ����
			ps.setString(1, id);
			ps.executeUpdate(); 
			return true;
				
		}catch(Exception e ) { System.out.println( "delete[SQL 오류]"+e  ); }
		return false;
	}
	//글쓰기
	public boolean write(Board board) {
		
		String sql = "insert into board(btitle,bcontent,bwriter,bdate)values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getTitle());
			ps.setString(2, board.getContent());
			ps.setString(3, board.getWriter());
			ps.setString(4, board.getDate());
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("write 실패"+e);}
		return false;
		
	}
	// 모든 글 보기
	public ArrayList<Board> list( ){
		
		ArrayList<Board> boardlist = new ArrayList<Board>();
		
			String sql = "select * from board order by bno desc "; //  조건없는 모든 레코드 출력
		try {	
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) {
				Board board = new Board(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5));
				boardlist.add(board);
			}
			
			return boardlist;
			
		}catch(Exception e ) { System.out.println( "리스트담기[SQL 실패]"+e  ); }
			return null;
	}
	
	//개별 글 조회
	public Board get(int bno) {
		String sql = "select * from board where bno=?";
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5));
				return board;
			}
			
		}catch(Exception e) {System.out.println("조회오류"+e);}
		return null;
	}
	
	//게시물 삭제
	public boolean board_delete(int bno) {
		try {
			String sql = "delete from board where bno=?";	
			
			ps = con.prepareStatement(sql); // 2.SQL ����
			ps.setInt(1, bno);
			ps.executeUpdate(); 
			return true;
				
		}catch(Exception e ) { System.out.println( "delete[SQL 오류]"+e  ); }
		return false;
	}

	
	
	//글수정
	
public boolean update(int bno,String title, String content) {
	
	String sql = "update board set btitle=?,bcontent=? where bno=?";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setInt(3, bno);
		
		ps.executeUpdate();
		return true;
	}catch(Exception e) {System.out.println("수정 실패"+e);}
	return false;
	
}
	
}









