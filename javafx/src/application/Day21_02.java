package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_02 extends Application{ // 1. Application 클래스로부터 상속
	
	@Override
	public void start(Stage stage) throws Exception { // 2. start 메소드 구현
						// 스테이지이름
		// 1. FXML 파일 불러오기 : 컨테이너
		Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
			// Parent : fxml(씬빌더파일) 파일을 객체화 [
				// FXMLLoader.load(getClass().getResource("경로/파일명.fxml")) ;
		// 2. 씬 객체 생성 : 씬에 컨테이너 넣기
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬 넣기
		stage.setScene(scene);
		// 4. 스테이지 시작
		stage.show(); // stage 열기
	}
	
	public static void main(String[] args) {  // 3. 메인스레드 => start 메소드 호출
		launch(args);// start 메소드 호출
	}
	
	
}
