package Controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable{
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	
	
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println("아디찾깇아디지ㅏㅈ기");
    	Login.instance.loadpage("/view/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("비번비번찾기찾기");
    	Login.instance.loadpage("/view/findpassword.fxml");
    }

    @FXML
    void acclogin(ActionEvent event) {
//    	System.out.println("로긴로긴");
    	System.out.println(txtid.getText()+"에 아이디로 입려쿠");
    	System.out.println(txtpassword.getText()+"에 패스와브 입려쿠");
    	String id = txtid.getText();
    	String password =txtpassword.getText();
    	if(id.equals("admin")&&password.equals("1234")) {
    		lblconfirm.setText("우왕앙ㅇ");
    	}
    	else {lblconfirm.setText("ㅇㅁㄹㅇㅁㄹㅇ");}
    	
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("회원가입");
    	// login 컨트롤에 존재하는 borderpane 객체 내 센터 변경
    		// * 문제 : borderpane 객체가 다른 컨트롤에 있다. 
    		// * new : 새로운 메모리할당 [ 기존 borderpane 아닌 새로운 borderpane ]
    		// * 기존 login 클래스에서 사용중인 borderpane;
    	Login.instance.loadpage("/view/signuppane.fxml");
    }

	
	
	
	
	
	
	
}
