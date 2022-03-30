package application;
// javafx 만 사용 [ awt , swing 은 fx 이전 버전 ]
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_01 extends Application{
				// extend : 상속 [ Application : JAVA FX GUI 관련 클래스 => start 메소드 제공]
					// 상속받으면 슈퍼 클래스 내 멤버를 사용할 수 있다.
	@Override // 구현 
	public void start(Stage stage) throws Exception {
		// javafx 를 실행하는 메소드 [추상 -> 구현]
			// start(Stage 스테이지이름(아무거나))
		
		// 1. 컨테이너 만들기 [ 여러개 컨트롤을 세로로 저장 ]
		VBox box = new VBox();
		// 2. 컨트롤 만들기
		Button button = new Button();
		button.setText("닫기");
		button.setOnAction(e -> Platform.exit());
					//값  ->  인수       : 람다식(이름이 없는 메소드)
		// 3. 컨테이너에 컨트롤 넣기
		box.getChildren().add(button);
		// 4. 씬 객체 만들어서 씬(컨테이너 넣기);
		Scene scene = new Scene(box,500,500); // box , 가로길이, 세로길이
		// 5. 스테이지에 씬 넣기
		stage.setScene(scene);
		
		// * 순서 : 스테이지 -> 씬 -> 컨테이너 -> 여러개의컨트롤(버튼,입력상자,표 등) 
		//        스테이지.씬(씬) | new 씬(컨테이너) | 컨트롤.add(버튼)
		
		stage.show(); // 스테이지 열기
			
	}
	
	public static void main(String[] args) { // main thread 를 가지고 있는 메소드
		launch(args); // start 메소드 호출  [멀티 스레드 사용 시 관리]
	}
	
	
	
	
}
