package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.MemberDao;
import dao.ProductDao;
import dto.Order;

/**
 * Servlet implementation class saveorder
 */
@WebServlet("/product/saveorder")
public class saveorder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveorder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mid = 
		(String)request.getSession().getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);

		String json = request.getParameter("orderjson");
		
		try {
			JSONObject jo = new JSONObject(json);
			
			String ordername = jo.get("ordername").toString();
			String orderphone =	 jo.get("orderphone").toString();			
			String orderaddress =  jo.get("orderaddress").toString();
			int ordertotalpay = jo.getInt("ordertotalpay"); 
			String orderrequest=  jo.get("orderrequest").toString();
			
			Order order = new Order(0, null, 
					ordername, orderphone, orderaddress, 
					ordertotalpay, 0, orderrequest, 0, mno);
			
			System.out.println(order.toString());
			// 1. 주문 DB처리 [ PK ]	
			boolean resutl = ProductDao.getProductDao().saveoder(order);
			// 2. js로 응답처리 | 주문상세 DB처리 [  cart -> ordertail ] 
			response.getWriter().print(resutl);
			
		} catch (Exception e) { System.out.println("saveorder json error : "+e);}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
