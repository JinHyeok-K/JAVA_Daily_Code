package application.Day22;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DB�׽�Ʈ��Ʈ�ѷ� implements Initializable{
							// Initializable : fxml �� ���ο������� �ʱⰪ[ó����]���� �޼ҵ� ����
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Day22_02 DB���� = new Day22_02();
		
	}

	@FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnget;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontentlist;

   

    @FXML
    void write(ActionEvent event) {
    	System.out.println(" DB �� �����͸� �����մϴ�");
    	
    	//fxid��.getText() : �ش� ��Ʈ�ѿ� �Էµ� ���� ��������
    	String �ۼ��� = txtwriter.getText();
    	String ���� = txtcontent.getText();
    	// 1. DB ���� ��ü �����
    	Day22_02 db���� = new Day22_02();
    	// 2. db ���� ��ü������ ����[write] �޼ҵ� ȣ��
    	boolean result = db����.write(�ۼ���, ����);
    	// 3. ��� Ȯ��
    	if (result == true) {
    		System.out.println("[DB�� ������ ���� ����]");
    		
    		// ���� �� ��Ʈ�ѿ� �Էµ� ������ �����ֱ�
    			// fxid��.setText() : �ش� ��Ʈ�ѿ� �� �ֱ�(����)
    		txtwriter.setText("");
    		txtcontent.setText("");
    		
    	}else {
    		System.out.println("[DB�� ������ ���� ����]");
    	}    	    	
    }

    @FXML
    void get(ActionEvent event) {
    	System.out.println(" DB �� �����͸� ȣ���մϴ�.");
    	
    	// 1. db ���� ��ü �����
    	Day22_02 db���� = new Day22_02();
    	// 2. db ��ü �� �޼ҵ� ȣ�� �� ����� ����Ʈ�� �ޱ�
    	ArrayList<������> �����͸��=  db����.get();
    	// 3. ����Ʈ�� ��Ʈ�ѿ� �־��ֱ�
    	for (������ temp: �����͸��) {
    	
    		// txtcontentlist.appendText : �ش� ��Ʈ�ѿ� ���� �߰�
    		// fxid.appendText : �ش�  ��Ʈ�ѿ� ���� �߰�
    		txtcontentlist.appendText(

    				
    				"��ȣ:"+temp.get��ȣ()+". "+
    				"�ۼ���:"+temp.get�ۼ���()+":"+
    				"����:"+temp.get����()+"\n"
    				
    				);
    		
    	}
    	
    }
	
	
}
