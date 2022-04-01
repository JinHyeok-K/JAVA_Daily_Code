package application.Day22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// javafx 사용설정
		// 1. 

public class Day22_01 extends Application{
						// Application 상속 받기
	
	
	// 1. 오버라이딩 [ start : javafx 실행 ]
	
	@Override
	public void start(Stage 스테이지) throws Exception {
					// 스테이지 이름 정하기[아무거나]
		// 1. 씬빌더에서 작성한 파일[FXML]을 객체로 가져오기
		Parent parent = FXMLLoader.load(getClass().getResource("DB테스트.fxml"));
		// 2. 씬 객체를 만들어서
		Scene scene = new Scene(parent);
		// 3. 씬 주체를 스테이지에 연결
		스테이지.setScene(scene);
		
		
		
		스테이지.show();
		
	}
	
	// 2. main 메소드 선언
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
}
