package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
////////////// main.fxml 불러와서 stage 실행 => 끝
public class Start extends Application {

	public void start(Stage stage) throws Exception {
		
		// 5. 컨테이너 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		// 6. 씬 객체 -> 컨테이너							// 패키지명/파일명.확장자
		Scene scene = new Scene(parent);
		// 7. 씬 - > 스테이지
		stage.setScene(scene);
		
		
			// 3. 스테이지로고 설정

			Image image = new Image("img/logo.jpg"); // 1. 이미지 불러오기
//			Image image2 = new Image("C:/Users/504/git/JAVA_Daily_Code/javafx/src/img/logo.jpg"); // 1. 이미지 불러오기
				// 절대경로  vs 상대 경로
				// 절대경로 : 모든 경로
					// C:\Users\504\git\JAVA_Daily_Code\javafx\src\img\logo.jpg
				// 상대경로 : 현 위치 [ 프로젝트 기준 src ] 기준 경로
					// 생략 [ src 폴더부터 ]  /img/파일명.확장자
		stage.setResizable(false); // 4. 스테이지 크기변경 불가
		stage.getIcons().add(image);  // 3. 스테이지 아이콘 설정
		stage.setTitle("화화하"); // 2. 스테이지 창 이름
		stage.show(); // 1. 스테이지 열기
		
	
	}
	
	public static void main(String[] args) { 
		
		launch(args); 
		
	}
	
	
}
