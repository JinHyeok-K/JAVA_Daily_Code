package Controller;

import java.net.URL;
import java.util.ResourceBundle;

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
	    	Login.instance.loadpage("/View/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {

	    }
	
	
}
