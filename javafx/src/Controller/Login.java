package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Login implements Initializable{
	
	// * �ش� Ŭ������ �޸𸮸� ��ȯ���ִ� �޼ҵ� ����
	public static Login instance;
	// * ������
	public Login() {
		instance = this; // super : ����Ŭ����(���)  this : �� Ŭ����(���� Ŭ����)
		// this : ���� Ŭ���� ��ü �޸� ȣ��
	}
//	public static Login get���ΰ�ü() {
//		return instance;
//	}
	
	
	@FXML
    private MediaView mediaview;
	
	 @FXML
	    private BorderPane borderpane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		// 1. ������ �����ϱ�
			// 1. ������ ���� ��üȭ
		Media media = new Media(getClass().getResource("/img/login.mp4").toString());
			// 2. �̵�� �÷��̾� ��ü�� ������ �ֱ�
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			// 3. �̵�� �信 �̵�� �÷��̾� �ֱ�
			mediaview.setMediaPlayer(mediaPlayer);
			// 4. �̵���÷��̾� ����
			mediaPlayer.play();
			
			
			
			loadpage("/View/loginpane.fxml");
			
		
	}
	
	public void loadpage(String page) {
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch (Exception e) {System.out.println("���Ͼ���"+ e);}
		
	}
	
	
	
	
	
	
}
