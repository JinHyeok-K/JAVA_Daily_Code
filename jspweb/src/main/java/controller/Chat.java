package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dao.ChattingDAO;
import dao.MemberDao;
import dto.Chatting;
import dto.Reply;

/**
 * Servlet implementation class Chatting
 */
@WebServlet("/Chat")
public class Chat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Chat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String ninkname1 = request.getParameter("ninkname");
		String chatting1 = request.getParameter("chatting");
			// 회원은 세션
			//HttpSession
	
		// 객체화 [ 댓글 번호, 댓글 작성일, rindex, mid 제외 ]
		Chatting chatting = new Chatting(0, ninkname1, chatting1, null);
		
		// DB처리
		boolean result = ChattingDAO.getChattingDAO().write(chatting);
				
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}
		
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
