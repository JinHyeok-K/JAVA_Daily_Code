package dto;

public class Category {
	
	
	private int cno; //*카테고리번호*/
    private String cname; //*카테고리 이름*/
	
    public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Category [cno=" + cno + ", cname=" + cname + "]";
	}
    
    
}
