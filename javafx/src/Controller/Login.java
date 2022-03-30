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
	
	// * 해당 클래스의 메모리를 반환해주는 메소드 제작
	public static Login instance;
	// * 생성자
	public Login() {
		instance = this; // super : 슈퍼클래스(상속)  this : 현 클래스(본인 클래스)
		// this : 현재 클래스 자체 메모리 호출
	}
//	public static Login get본인객체() {
//		return instance;
//	}
	
	
	@FXML
    private MediaView mediaview;
	
	 @FXML
	    private BorderPane borderpane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		// 1. 동영상 삽입하기
			// 1. 동영상 파일 객체화
		Media media = new Media(getClass().getResource("/img/login.mp4").toString());
			// 2. 미디어 플레이어 객체에 동영상 넣기
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			// 3. 미디어 뷰에 미디어 플레이어 넣기
			mediaview.setMediaPlayer(mediaPlayer);
			// 4. 미디어플레이어 시작
			mediaPlayer.play();
			
			
			
			loadpage("/View/loginpane.fxml");
			
		
	}
	
	public void loadpage(String page) {
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch (Exception e) {System.out.println("파일없음"+ e);}
		
	}
	
	
	
	
	
	
}
