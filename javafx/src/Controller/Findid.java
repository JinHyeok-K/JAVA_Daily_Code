package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Findid implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

	
    @FXML
    private TextField txtemail;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("아디찾기에서 뒤로가기");
    	Login.instance.loadpage("/View/loginpane.fxml");
    }

    @FXML
    void findid(ActionEvent event) {
    	System.out.println("아이디찾아주세효");
    }
	
}
