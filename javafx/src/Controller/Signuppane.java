package Controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

import Controller.login.Login;
import Dao.MemberDao;
import Dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Signuppane implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	 @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private PasswordField txtpasswordconfirm;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtaddress;

	    @FXML
	    void back(ActionEvent event) {
	    	System.out.println("뒤로가기");
	    	Login.instance.loadpage("/View/login/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	// *컨트롤에 입력된 데이터 가져오기 [ fxid명.getText() ]
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	String passwordconfirm = txtpasswordconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// 현재 날짜 가져오기 [SimpleDateFormat : 날짜 모양(형식) 변환 클래스]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	    	String cince = format.format(new Date()); // 현재 날짜를 형식 변환
	    	
	    	// 유*효성 검사
	    		// 1. id 중복체크
	    		// 2. id 형식체크
	    		if(id.length()<4 || id.length()>10) {
	    			lblconfirm.setText("멍충멍충 4~10자");
	    			return;
	    		}
	    		// 3. 비밀번호 형식 체크
	    		if(password.length()<4||password.length()>10 ||
	    				passwordconfirm.length()<4||passwordconfirm.length()>10) 
	    		{
	    			lblconfirm.setText("멍충멍충4~10사이");
	    			return;
	    		}
	    		// 4. 비밀번호 일치 체크
	    		if(!password.equals(passwordconfirm)) {
	    			lblconfirm.setText("비번일치안해");
	    			return;
	    		}
    			// 5. 이메일 체크 [문자열.indexOf("문자") : 해당 문자열 내 문자가 존재하면 해당 문자의 인덱스 호출 /만일 없으면 -1
	    		if(email.indexOf("@")== -1)
	    		{ lblconfirm.setText("@이거는 어디다바꿔뭇나?");
	    			return;
	    		}
	    		
	    		// 6. 주소체크 [문자열.contains("문자"): 해당 문자열내 문자가 존재하면 true / 없으면 false]
	    		if(! (address.contains("시")&&address.contains("구")&& address.contains("동")) ) {
	    			lblconfirm.setText("길에서 살아?");
	    		}
	    	//* 모든 유효성 검사 통과시 DB에 저장                                                               
	    		// 1. 객체화 [ 회원번호 없음=0,  id, passwordconfirm, email, address, 포인트없음=0, cine)
	    		Member member = new Member(0, id, password, email, address, 0, cince);
	    		// 2. DB 객체 내 메소드 호출
	    		boolean result = MemberDao.memberDao.signup(member); 
	    		// 3. 확인
	    		if (result) {
	    			lblconfirm.setText("와썹!");
	    			System.out.println("가입쇵굉");
	    		}else {
	    			lblconfirm.setText("");
	    			System.out.println("가입시일패에");
	    		}
	    
	    		//
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

	    }
	
	
}
