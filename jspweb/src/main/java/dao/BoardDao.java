package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dto.Board;
import dto.Reply;

public class BoardDao extends Dao {
	
	public BoardDao() {
		super(); // 슈퍼클래스 호출 ( db연동 )
			// super.메소드()  super.필드명	   super() : 생성자
	}
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() { return boardDao; }
	
	// 1. 게시물 쓰기 메소드 	[ 인수 : 작성된 데이터들 = dto  ]
	public boolean write( Board board ) { 
		
		String sql = "insert into board( btitle , bcontent , mno , bfile )values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , board.getBtitle() );	ps.setString( 2 , board.getBcontent() );
			ps.setInt( 3 , board.getMno() );		ps.setString( 4 , board.getBfile() );
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println( e ); }	return false; 
	}
	
	
	//2-1 게시물 전체 개수 출력 메소드
	public int gettotalrow(String key, String keyword) {
		
		//만약에 작성자 요청이면
//		if(key.equals("mid")) {
//			key="mno"; 
//			keyword = MemberDao.getmemberDao().getmno(keyword)+"";			
//		}
//		
		System.out.println("2-1key: "+key);
		System.out.println("2-1keyword: "+keyword);
		String sql = null;
		if(key.equals("")&& keyword.equals("")) { sql =  "select count(bno) from board";	} // 검색이 없을 경우
		else { sql= "select count(bno) from board left join member on board.mno=member.mno where "+key+" like '%"+keyword+"%'";} // 검색이 있을 경우
						
		try{
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
				if(rs.next()) 
					System.out.println("2-1sql : "+rs.getInt(1));
					return rs.getInt(1);
				
		}catch (Exception e) {System.out.println("dao 2-1 errer : "+e);		}
		return 0 ;
	}
	
	// 2-2. 모든 게시물 출력 메소드 [ 인수 : x  // 추후기능 = 검색 : 조건 ]
	public ArrayList<Board> getboardlist(int startrow, int listsize,String key, String keyword) { 
		ArrayList<Board> boardlist = new ArrayList<Board>();
//		if(key.equals("mid")) {
//			key="mno"; 
//			keyword = MemberDao.getmemberDao().getmno(keyword)+"";			
//		}
		System.out.println("2-2key: "+key);
		System.out.println("2-2keyword: "+keyword);
		SimpleDateFormat sample_date = new SimpleDateFormat("yyyy-MM-dd");
		Date date= new Date(); 
		// 검색이 있을 경우
		String sql = null;
		if(key.equals("")&&keyword.equals("")) { //검색이 없을 경우
			 sql = "select board.*, member.mid from board left join member on board.mno=member.mno order by bno desc limit "+startrow+","+listsize; // limit 첫번째 레코드의 인덱스(시작인덱스), 표시갯수  -> x부터~y개*
		}else {
			 sql = "select board.*, member.mid from board left join member on board.mno=member.mno where "+key+" like '%"+keyword+"%'order by bno desc limit "+startrow+","+listsize;
		}
		try {	
			ps = con.prepareStatement(sql);
			ps.executeQuery();
			rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString(7).split(" ")[0].equals(sample_date.format(date))){
				Board board = new Board(
						rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getInt(4), 
						rs.getString(5), rs.getInt(6), 
						rs.getString(7).split(" ")[1], rs.getString(8));
				boardlist.add(board);
				}
				else {
					Board board = new Board(
							rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getInt(4), 
							rs.getString(5), rs.getInt(6), 
							rs.getString(7).split(" ")[0], rs.getString(8));
					boardlist.add(board);
				}
	
				
			}
			return boardlist;
		}catch (Exception e) {System.out.println("board dao 출력 sql 오류"+e);		}
		return null; }
	// 3. 개별 게시물 출력 메소드 [ 인수 : 게시물번호 ]
		public Board getboard( int bno ) { 
			String sql ="select * from board where bno="+bno;	// 1. SQL 작성 
			try {
				ps = con.prepareStatement(sql);	// 2.연결된DB( con ) 에 SQL문 설정  
				rs = ps.executeQuery(); 		// 3.조작된 SQL를 실행
				if( rs.next() ) { // 4. 검색 결과 [ rs.next() 할 때 마다 결과물에서 레코드 1개씩 호출 ]  
					Board board = new Board( 
						rs.getInt(1),rs.getString(2), 
						rs.getString(3),rs.getInt(4),
						rs.getString(5), rs.getInt(6),
						rs.getString(7) ,null 
					);
					return board;
				}
			}catch (Exception e) {} return null;
			
			
		}
	
		//3-2   
		//select board.*, member.mid from board left join member on board.mno=member.mno
	public ArrayList<Board> getmyboard( String mid ) { 
			
	
			ArrayList<Board> myboardlist = new ArrayList<Board>();
			String sql = " select board.*, member.mid from board left join member on board.mno=member.mno where member.mid=? order by bno desc";
			SimpleDateFormat sample_date = new SimpleDateFormat("yyyy-MM-dd");
			Date date= new Date();  
			
			try {
				
				ps = con.prepareStatement(sql);
				ps.setString(1, mid);
				ps.executeQuery();
				rs = ps.executeQuery();
				while(rs.next()) {
					if(rs.getString(7).split(" ")[0].equals(sample_date.format(date))){
					Board board = new Board(
							rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getInt(4), 
							rs.getString(5), rs.getInt(6), 
							rs.getString(7).split(" ")[1], rs.getString(8));
					myboardlist.add(board);
					}
				else {
					Board board = new Board(
							rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getInt(4), 
							rs.getString(5), rs.getInt(6), 
							rs.getString(7).split(" ")[0], rs.getString(8));
					myboardlist.add(board);
					
				}
					
					}
				return myboardlist;
			}catch (Exception e) {} 
			return null;
					
		}
			
		
	// 4. 게시물 수정 메소드 	[ 인수 : 수정할 게시물번호  / 수정된 내용 ]
	public boolean update( Board board ) { 
		
		String sql = "update board set btitle=?,bcontent=?,bfile=? where bno=?";
		
		try {
			
			
			
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBfile());
			ps.setInt(4, board.getBno());
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("수정 실패"+e);}
		return false;
	}
	
	// 5. 게시물 삭제 메소드 	[ 인수 : 삭제할 게시물번호 
	public boolean delete( int bno ) { 
	
		
			String sql = "delete from board where bno="+bno;	
		try {	
			ps = con.prepareStatement(sql);
			//ps.setInt(1, bno);
			ps.executeUpdate(); 
			return true;
				
		}catch(Exception e ) { System.out.println( "delete[SQL 오류]"+e  ); }
		return false;
	}
	
	// 5-2 첨부파일만 삭제(null 로 변경)
	public boolean file_delete(int bno) {
		String sql = "update board set bfile=null where bno="+bno;
		try {
			ps= con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println("첨푸파일삭제오류 : "+ e);}
		return false;
	}
	
	// 6. 게시물 조회 증가 메소드 	[ 인수 : 증가할 게시물번호 ]
	public boolean increview( int bno ) { 
		String sql = "update board set bview = bview+1 where bno="+bno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println("조회스증가메소드 에러 :"+e);}
		
		return false; }
	
	
	
	// 7. 댓글 작성 메소드 		[ 인수 : 작성된 데이터들 = dto ]
	public boolean replywrite(Reply reply) { 
		
		String sql = "insert into reply(rcontent,rindex,bno,mno)values(?,?,?,?)";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, reply.getRcontent());
			ps.setInt(2, reply.getRindex());
			ps.setInt(3, reply.getBno());
			ps.setInt(4, reply.getMno());
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println("댓글작성sql오류: "+e);}
		
		return false; 
		
	}
	// 8. 댓글 출력 메소드 		[ 인수 : 현재 게시물번호 ]
		public ArrayList<Reply> replylist( int bno ) { 
			ArrayList<Reply> replylist = new ArrayList<Reply>();
			String sql = "select * from reply where bno = "+bno+" and rindex = 0"; // rindex = 0  : 댓글만 출력 [ 대댓글 제외 ] 
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery(); 
				while( rs.next() ) { 
					Reply reply = new Reply( 
							rs.getInt(1) , rs.getString(2) , 
							rs.getString(3) , rs.getInt(4) , 
							rs.getInt(5), rs.getInt(6), null);
					replylist.add(reply);
				}
				return replylist;
			}catch (Exception e) { System.out.println( e ); } return null; 
		}
		// 8-2 대댓글 출력 메소드 
		public ArrayList<Reply> rereplylist( int bno , int  rno ){
			ArrayList<Reply> rereplylist = new ArrayList<Reply>();
			String sql = "select * from reply where bno = "+bno+" and rindex = "+rno;
			try { 
				ps = con.prepareStatement(sql); rs= ps.executeQuery();
				while( rs.next() ) {
					Reply reply = new Reply(
							rs.getInt(1) , rs.getString(2),
							rs.getString(3), rs.getInt(4), 
							rs.getInt(5), rs.getInt(6), null);
					rereplylist.add(reply);
				}
				return rereplylist;
			}catch (Exception e) { System.out.println(e); } return null;
			
		}
//		public ArrayList<Reply> replylist( int bno ) { 
//			ArrayList<Reply> replylist = new ArrayList<Reply>();
//			String sql = "select * from reply where bno = "+bno+" and rindex = 0"; // rindex = 0  : 댓글만 출력 [ 대댓글 제외 ] 
//			try {
//				ps = con.prepareStatement(sql);
//				rs = ps.executeQuery(); 
//				while( rs.next() ) { 
//					Reply reply = new Reply( 
//							rs.getInt(1) , rs.getString(2) , 
//							rs.getString(3) , rs.getInt(4) , 
//							rs.getInt(5), rs.getInt(6), null);
//					replylist.add(reply);
//				}
//				return replylist;
//			}catch (Exception e) { System.out.println( e ); } return null; 
//		}
	// 9. 댓글 수정 메소드 1 		[ 인수 : 수정할 댓글 번호 ]
	public boolean replyupdate(int rno,int bno, String content) { 
		
		String sql = "update reply set rcontent=? where rno=? and bno=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setInt(2, rno);
			ps.setInt(3, bno);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("댓글수정 실패"+e);}
	
		return false; }
	// 10. 댓글 삭제 메소드 		[ 인수 : 삭제할 댓글 번호 ] 
	public boolean replydelete(int rno) { 
		System.out.println(rno);
		String sql = "delete from reply where rno = "+rno+" or rindex = "+rno; 
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println("댓글삭제sql실패:"+e);}
		
		return false; }
}










