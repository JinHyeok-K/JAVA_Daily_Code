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
	    	System.out.println("�ڷΰ���");
	    	Login.instance.loadpage("/View/login/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	// *��Ʈ�ѿ� �Էµ� ������ �������� [ fxid��.getText() ]
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	String passwordconfirm = txtpasswordconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// ���� ��¥ �������� [SimpleDateFormat : ��¥ ���(����) ��ȯ Ŭ����]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	    	String cince = format.format(new Date()); // ���� ��¥�� ���� ��ȯ
	    	
	    	// ��*ȿ�� �˻�
	    		// 1. id �ߺ�üũ
	    		// 2. id ����üũ
	    		if(id.length()<4 || id.length()>10) {
	    			lblconfirm.setText("������� 4~10��");
	    			return;
	    		}
	    		// 3. ��й�ȣ ���� üũ
	    		if(password.length()<4||password.length()>10 ||
	    				passwordconfirm.length()<4||passwordconfirm.length()>10) 
	    		{
	    			lblconfirm.setText("�������4~10����");
	    			return;
	    		}
	    		// 4. ��й�ȣ ��ġ üũ
	    		if(!password.equals(passwordconfirm)) {
	    			lblconfirm.setText("�����ġ����");
	    			return;
	    		}
    			// 5. �̸��� üũ [���ڿ�.indexOf("����") : �ش� ���ڿ� �� ���ڰ� �����ϸ� �ش� ������ �ε��� ȣ�� /���� ������ -1
	    		if(email.indexOf("@")== -1)
	    		{ lblconfirm.setText("@�̰Ŵ� ���ٹٲ㹵��?");
	    			return;
	    		}
	    		
	    		// 6. �ּ�üũ [���ڿ�.contains("����"): �ش� ���ڿ��� ���ڰ� �����ϸ� true / ������ false]
	    		if(! (address.contains("��")&&address.contains("��")&& address.contains("��")) ) {
	    			lblconfirm.setText("�濡�� ���?");
	    		}
	    	//* ��� ��ȿ�� �˻� ����� DB�� ����                                                               
	    		// 1. ��üȭ [ ȸ����ȣ ����=0,  id, passwordconfirm, email, address, ����Ʈ����=0, cine)
	    		Member member = new Member(0, id, password, email, address, 0, cince);
	    		// 2. DB ��ü �� �޼ҵ� ȣ��
	    		boolean result = MemberDao.memberDao.signup(member); 
	    		// 3. Ȯ��
	    		if (result) {
	    			lblconfirm.setText("�ͽ�!");
	    			System.out.println("���ԙݱ�");
	    		}else {
	    			lblconfirm.setText("");
	    			System.out.println("���Խ����п�");
	    		}
	    
	    		//
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

	    }
	
	
}
