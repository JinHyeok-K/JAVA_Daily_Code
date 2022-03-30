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
				// Initializable : view(fxml) 가 (새로) 열렸을 때 초기값 설정 메소드 제공
	
	
	@FXML
    private BorderPane boarderPane; //
	
	// fxml 파일 내 작성 => 연결
	// fx:contorller = "Controller.Main" [패키지명.클래스명]
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(" Main view 스타뜨 (");
		// 1.
		loadpage("/View/login/login.fxml"); // 패키지명/파일명   | // loadpage 메소드 호출시(파일경로)
		
	}
	
	public void loadpage(String page) { // loadpage(파일경로)
		try {	 // 무조건예외처리		
			//페이지(fxml)객체화
			Parent parent = FXMLLoader.load(getClass().getResource(page)); 
			
			//Parent parent = FXMLLoader.load(getClass().getResource(page)); // 이렇게 사용하려면
			// loadpage("/View/login"); // 패키지명/파일명 뒤에 +".fxml" <- 확장자명 넣어줘야됨  | loadpage("/View/login.fxml");
			boarderPane.setCenter(parent); // 컨테이너(fxml) 가운데에 페이지 넣기| main.fxml 에 
			//								존재하는 boarderPane 객체 내 center을 해당 파일로 변경
		} catch (IOException e) {System.out.println("페이지 연결 실패");}
	}
	
	
	
	
	
}
