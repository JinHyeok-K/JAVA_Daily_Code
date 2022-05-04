package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;



public class MemberDao1 extends Dao {
	// 자식 클래스로 객체 생성시 (부모 클래스의 생성자 호출 )
	
	public MemberDao1() {
		super(); // 부모 클래스 생성자 호출
	}
	
	public static MemberDao1 memberDao = new MemberDao1(); // Dao 호출 시 반복되는 new 연산자 제거
	public static MemberDao1 getMemberDao() {return memberDao;}
	
	
	
	//회원가입
		public boolean signup(Member member) {
			
			//1.sql 작성
			String sql = "insert into member(mid,mpassword,mname,mphone,memail,maddress,mpoint,mdate) values(?,?,?,?,?,?,?,?)";
				// insert into 테이블(필드명1,필드명2,필드명3) values(값1,값2,값3);
				// insert into 테이블 values(값1,값2,값3,값4);
			//2. 연결된 DB SQL 연결
			try {
				ps = con.prepareStatement(sql);
				// 3. 각 ? 에 데이터 대입
				ps.setString(1, member.getMid()); // mid
				ps.setString(2, member.getMpassword()); // mpassword
				ps.setString(3, member.getMname()); // mname
				ps.setString(4, member.getMphone()); // mphone
				ps.setString(5, member.getMemail()); // memail
				ps.setString(6, member.getMaddress()); // maddress
				ps.setInt(7, member.getMpoint()); // mpoint
				ps.setString(8, member.getMdate()); // mdate
				// 4. sql 실행 
				ps.executeUpdate();
				return true;
				
			}catch (Exception e) {System.out.println("singup 오류발생"+e);

			}
			return false;
		}
	
		
//		public boolean idcheck(String id) {
//			String sql = "select * from jspweb.member where mid=?";
//			
//			try {
//				ps =con.prepareStatement(sql);
//				rs = ps.executeQuery();
//				// 동일한 아이디가 존재하면
//				if(rs.next()) {	return true;}
//				
//					
//				
//			}catch (Exception e) {System.out.println("id중복체크 [sql오류]"+e);	}
//			
//			return false;
//		}
//		
		public boolean idcheck(String id) {
			String sql = "select * from jspweb.member where mid=?";
			
			try {
				ps =con.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				if(rs.next()) {
					return false;
				
				}else {
					return true;
				}
					
				
			}catch (Exception e) {System.out.println("id중복체크 [sql오류]"+e);	}
			
			return false;
		}
		
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
		
		
		
	
}
