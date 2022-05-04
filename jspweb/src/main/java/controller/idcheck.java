package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;


@WebServlet("/idcheck")
public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public idcheck() {
        super();
    }

	protected void 
	doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		
		// 1. DAO 이용하여(통신해서) 해당  id 가 있는지 체크
		// 2. 만약 해당 아이디가 존재하면 1, 존재하지 않으면 2
		
		
		
		// 요청할 때 request
		
		boolean idcheck_result = MemberDao.getMemberDao().idcheck(mid);
		
		if(idcheck_result) {
			response.getWriter().print(2);
		}else {
			response.getWriter().print(1);
		}
	
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
