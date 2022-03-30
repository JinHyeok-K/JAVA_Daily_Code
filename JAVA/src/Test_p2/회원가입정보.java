package Test_p2;

public class 회원가입정보 {

	//필드 아이디, 비밀번호, 이름, 전화번호
	private String id;
	private String pw;
	private String name;
	private String phone;
	

	//생성자
	public 회원가입정보() {
		
	}

	





	public 회원가입정보(String id, String pw, String name, String phone) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	
	}

	//메소드

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	




	
	
}
