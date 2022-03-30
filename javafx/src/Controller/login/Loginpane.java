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
    	System.out.println("�Ƶ�ã���Ƶ���������");
    	Login.instance.loadpage("/view/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("������ã��ã��");
    	Login.instance.loadpage("/view/findpassword.fxml");
    }

    @FXML
    void acclogin(ActionEvent event) {
//    	System.out.println("�α�α�");
    	System.out.println(txtid.getText()+"�� ���̵�� �Է���");
    	System.out.println(txtpassword.getText()+"�� �н��ͺ� �Է���");
    	String id = txtid.getText();
    	String password =txtpassword.getText();
    	if(id.equals("admin")&&password.equals("1234")) {
    		lblconfirm.setText("��վӤ�");
    	}
    	else {lblconfirm.setText("��������������");}
    	
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("ȸ������");
    	// login ��Ʈ�ѿ� �����ϴ� borderpane ��ü �� ���� ����
    		// * ���� : borderpane ��ü�� �ٸ� ��Ʈ�ѿ� �ִ�. 
    		// * new : ���ο� �޸��Ҵ� [ ���� borderpane �ƴ� ���ο� borderpane ]
    		// * ���� login Ŭ�������� ������� borderpane;
    	Login.instance.loadpage("/view/signuppane.fxml");
    }

	
	
	
	
	
	
	
}
