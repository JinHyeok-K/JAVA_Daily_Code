package controller.board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class board_delete
 */
@WebServlet("/board/board_delete")
public class board_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public board_delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bno = Integer.parseInt( request.getParameter("bno"));
		// * DB 삭제 전에 파일명 불러오기
		Board board = BoardDao.getBoardDao().getboard(bno);
		String bfile = board.getBfile();
		
		// System.out.println("요청:"+bno);
			boolean result = BoardDao.getBoardDao().delete(bno);
		
		
		response.setCharacterEncoding("UTF-8");// 응답 인코딩 타입 = 한글
		response.setContentType("text/html; charset=UTF-8"); // 응답 파일타입 = HTML
		PrintWriter out =  response.getWriter(); // HTML 내보내기 메소드 사용
		
		
		if(result) {
			
			// * 삭제 성공 시 해당 파일도 서버에서 지우기
			
			String uploadpath =request.getSession().getServletContext().getRealPath("/board/upload/"+bfile);
			File file = new File(uploadpath); // 해당 파일 객체화
			file.delete(); //파일 삭제하기 ( file 클래스 내 제공되는 delete()) 메소드 = 파일삭제 시 사용)
			// 1. HTML 내보내기
//			out.println("<html>");
//			out.println("<body>");
//			
//			out.println("</body>");
//			out.println("</html>");
			// 2. JS 내보내기
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 되었읍니다.')");
			out.println("location.href='boardlist.jsp'"); //  [location.href="경로"] : js에서 하이퍼링크
			out.println("</script>");
			
		}else {
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 실패[관리자문의].')");
			out.println("history.back();"); // history.back() : 이전 페이지로가기 메소드
			out.println("</script>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
