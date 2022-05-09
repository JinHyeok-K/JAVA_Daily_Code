package controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dao.MemberDao;
import dto.Board;

@WebServlet("/board/board_update") // URL 정의 = 현재 클래스와 통신할 경로 설정
public class board_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public board_update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 저장 경로 [    \ : 제어문자  ->  경로 사용시 \\ , / ]
			// 1. 개발중인 프로젝트 경로
		//String uploadpath = "C:/Users/504/git/JAVA_Daily_Code/jspweb/src/main/webapp/board/upload";
			// 2. 서버 폴더 경로
				// 서버 경로 찾기 : request.getSession().getServletContext().getRealPath( 경로 ));
//		System.out.println("서버의 경로 찾기 : " + 
//				request.getSession().getServletContext().getRealPath("/board/upload"));
		System.out.println("통신보안");
		int bno = Integer.parseInt(request.getParameter("bno"));
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload"); 
		// 첨부파일 업로드 
		MultipartRequest multi = new MultipartRequest(
				request ,		// 요청방식 
				uploadpath , 	// 파일 저장 경로 
				1024*1024*10 ,	// 파일 최대 용량 허용 범위
				"UTF-8" ,		// 인코딩타입 
				new DefaultFileRenamePolicy() 	// 동일한 파일명이 있을경우 자동 이름 변환 
				);
		String btitle = multi.getParameter("btitle");
		String bcontent =multi.getParameter("bcontent");
		
		String bfile =multi.getFilesystemName("bfile");
		String bbfile =multi.getParameter("bbfile");
		
		
		Board board = new Board(bno, btitle, bcontent, 0, bfile, 0, null, null);
		if(bfile==null) {
			board.setBfile(bbfile);
			
		}else {
			String upload = request.getSession().getServletContext().getRealPath("/board/upload/"+bbfile);
			File file = new File(upload);
			file.delete();
		}
		
		
		boolean result = BoardDao.getBoardDao().update(board);
		if(result) { 
			response.sendRedirect("boardview.jsp?bno="+bno);
		}else { response.sendRedirect("boardview.jsp?bno="+bno);
		
		}
	
//		// DB 처리
//		boolean result = BoardDao.getBoardDao().update(board);
//		// 결과 
//		if( result ) { response.sendRedirect("/jspweb/board/boardlist.jsp"); }
//		else { response.sendRedirect("/jspweb/board/boardwrite.jsp"); }
//		
	}

}
