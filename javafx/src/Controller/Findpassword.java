package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Findpassword implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	
	   @FXML
	    private TextField txtid;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private Button btnfindpassword;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    void back(ActionEvent event) {
	    	System.out.println("비번찾기에서 뒤로가기");
	    	Login.instance.loadpage("/View/login/loginpane.fxml");
	    }

	    @FXML
	    void findpassword(ActionEvent event) {
	    	System.out.println(" 븨흴버노 차자츄세효"); 
	    }
	
}
