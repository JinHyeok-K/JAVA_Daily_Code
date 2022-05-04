package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Member;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); // 요청시 사용되는 인코딩타입 [ 한글 포함 ] 
		// 패스워드 체크 [ 유효성 검사 ]
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		
		// 수정 내용물
		int mno = Integer.parseInt( request.getParameter("mno") ); // 수정 식별 대상 
		String mname =request.getParameter("mname");	
		String mphone =request.getParameter("mphone");
		String memail =request.getParameter("memail");
		String memailaddress =request.getParameter("memailaddress");
			String email = memail +"@"+memailaddress;
		String address1 =request.getParameter("address1");
		String address2 =request.getParameter("address2");
		String address3 =request.getParameter("address3");
		String address4 =request.getParameter("address4");
			String address = address1+"_"+address2+"_"+address3+"_"+address4;
				
			
		Member member = null;
			
		if(oldpassword.equals("")|| newpassword.equals("")) { // password 변경이 없을 때
			// 객체화 
			member = new Member(mno, null, null, mname, mphone, email , address, 0 , null);
		}else { // password 변경이 있을 때
			// 기존 패스워드 체크
			HttpSession session = request.getSession();
			String mid = (String)session.getAttribute("login");
		
			boolean result_pwcheck = MemberDao.getmemberDao().passwordcheck(mid, oldpassword);
			
			if(result_pwcheck) { // 기존 패스워드가 동일 시 
				member = new Member(mno, null, newpassword, mname, mphone, email , address, 0 , null);
			}else {
				response.sendRedirect("/jspweb/member/update.jsp?result=3");
				return;
			}
		}
			
			
		
		// 객체화
		
		// 테스트 // System.out.println( member.toString() );
		// DB처리 
		boolean result = MemberDao.getmemberDao().update(member);
		if( result ) { response.sendRedirect("/jspweb/member/update.jsp?result=1"); }
		else { response.sendRedirect("/jspweb/member/update.jsp?result=2"); }
		
		
		
		
		
		
		
		
		
	}

}







