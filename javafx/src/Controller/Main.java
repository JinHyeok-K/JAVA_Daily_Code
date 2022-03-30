package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable{
				// Initializable : view(fxml) �� (����) ������ �� �ʱⰪ ���� �޼ҵ� ����
	
	
	@FXML
    private BorderPane boarderPane; //
	
	// fxml ���� �� �ۼ� => ����
	// fx:contorller = "Controller.Main" [��Ű����.Ŭ������]
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(" Main view ��Ÿ�� (");
		// 1.
		loadpage("/View/login/login.fxml"); // ��Ű����/���ϸ�   | // loadpage �޼ҵ� ȣ���(���ϰ��)
		
	}
	
	public void loadpage(String page) { // loadpage(���ϰ��)
		try {	 // �����ǿ���ó��		
			//������(fxml)��üȭ
			Parent parent = FXMLLoader.load(getClass().getResource(page)); 
			
			//Parent parent = FXMLLoader.load(getClass().getResource(page)); // �̷��� ����Ϸ���
			// loadpage("/View/login"); // ��Ű����/���ϸ� �ڿ� +".fxml" <- Ȯ���ڸ� �־���ߵ�  | loadpage("/View/login.fxml");
			boarderPane.setCenter(parent); // �����̳�(fxml) ����� ������ �ֱ�| main.fxml �� 
			//								�����ϴ� boarderPane ��ü �� center�� �ش� ���Ϸ� ����
		} catch (IOException e) {System.out.println("������ ���� ����");}
	}
	
	
	
	
	
}
