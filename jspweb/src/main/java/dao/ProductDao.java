package dao;

import java.util.ArrayList;

import dto.Category;
import dto.Product;
import dto.Stock;

public class ProductDao extends Dao {
	
	public ProductDao() {
	 super(); //부모 클래스의 생성자 호출 -> DB연결
	}

	
	// 외부 클래스에서 버금 객체
	private static ProductDao productdao = new ProductDao();
	public static ProductDao getProductDao(){
			return productdao;}
	
	// 메소드는 반환타입에 따른 return 값 설정
			// 반환타입이 클래스 => null, 객체명
			// 반환타입이 기본자료형 => false, 0

	
/////////////////////////////// 카테고리 //////////////////////////	
	// 1. 카테고리 등록 [ C ]
	public boolean csave(String cname) {
		
		String sql = "insert into category (cname) values(?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cname );
			ps.executeUpdate(); 
			return true;
			
		}catch (Exception e) {System.out.println("카테고리등록sql실패: "+e);}
		
		
		
		return false;}
	
	// 2. 카테고리 호출 [ R ]
	public ArrayList<Category> getcategorylist(){
		ArrayList<Category> list = new ArrayList<Category>();
		String sql = "select * from category";
		try {
			ps= con.prepareStatement(sql);
			rs  = ps.executeQuery();
			while(rs.next()) {// 1개 호출 시  if // 여러개 호출 시 while
				Category category = new Category(rs.getInt(1), rs.getString(2));
				list.add(category);
			}
			return list;
		}catch (Exception e) {System.out.println("카테고리호출sql오류 :"+e);}
		return null;}
	// 3. 카테고리 수정 [ U ]
	
	// 4. 카테고리 삭제 [ D ]

/////////////////////////////// 제품 //////////////////////////
	// 1. 제품 등록 [ C ]
	public boolean psave(Product product) {
		
		String sql = "insert into product(pname,pprice,pdiscount,pimg,cno) values(?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setInt(2, product.getPprice());
			ps.setFloat(3, product.getPdiscount());
			ps.setString(4, product.getPimg());
			ps.setInt(5, product.getCno());
			ps.executeUpdate();
			return true;
		}catch (Exception e) { System.out.println("제품등록sql 오류 :"+e);}
		return false;}
	// 2. 제품 모든 호출 [ R ]
	public ArrayList<Product> getproductlist(){
		ArrayList<Product> productlist = new ArrayList<Product>();
		String sql = "select * from product";
		try {
			ps= con.prepareStatement(sql);
			rs  = ps.executeQuery();
			while(rs.next()) {// 1개 호출 시  if // 여러개 호출 시 while
				Product  product = new Product(
						rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getFloat(4), 
						rs.getInt(5), rs.getString(6), 
						rs.getInt(7));
				productlist.add(product);
			}
			return productlist;
		}catch (Exception e) {System.out.println("카테고리호출sql오류 :"+e);}
		return null;}
		
		
		
	// 3. 제품 개별 호출 [ R ]
	public Product getProduct() {return null;}
	// 4. 제품 수정 [ U ]
	// 5. 제품 삭제 [ D ]
	
/////////////////////////////// 재고 //////////////////////////
	// 1. 제품의 재고 등록 [ C ]
	public boolean ssave() {return false;}
	// 2. 제품의 재고 호출 [ R ]
	public Stock getStock() {return null;}
	// 3. 제품의 재고 수정 [ U ]
	// 5. 제품의 재고 삭제 [ D ]
		
	
	
	
}











