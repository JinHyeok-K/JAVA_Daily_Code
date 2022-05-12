package dto;

public class Product {

	private int pno; //*제품 번호*/
    private String pname; //*제품명*/
    private int pprice; //*제품 가격*/
    private float pdiscount;  //*제품 할인율 = float = 실수 자료형 */
    private int pactive; //*제품 */
    private String pimg; //*제품 이미지*/
    private int cno; //*제품 카테고리*/
    
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pno, String pname, int pprice, float pdiscount, int pactive, String pimg, int cno) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pdiscount = pdiscount;
		this.pactive = pactive;
		this.pimg = pimg;
		this.cno = cno;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public float getPdiscount() {
		return pdiscount;
	}

	public void setPdiscount(float pdiscount) {
		this.pdiscount = pdiscount;
	}

	public int getPactive() {
		return pactive;
	}

	public void setPactive(int pactive) {
		this.pactive = pactive;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", pprice=" + pprice + ", pdiscount=" + pdiscount
				+ ", pactive=" + pactive + ", pimg=" + pimg + ", cno=" + cno + "]";
	}
	
	
}
