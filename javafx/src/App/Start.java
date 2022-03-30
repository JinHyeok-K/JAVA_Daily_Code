package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
////////////// main.fxml �ҷ��ͼ� stage ���� => ��
public class Start extends Application {

	public void start(Stage stage) throws Exception {
		
		// 5. �����̳� �ҷ�����
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		// 6. �� ��ü -> �����̳�							// ��Ű����/���ϸ�.Ȯ����
		Scene scene = new Scene(parent);
		// 7. �� - > ��������
		stage.setScene(scene);
		
		
			// 3. ���������ΰ� ����

			Image image = new Image("img/logo.jpg"); // 1. �̹��� �ҷ�����
//			Image image2 = new Image("C:/Users/504/git/JAVA_Daily_Code/javafx/src/img/logo.jpg"); // 1. �̹��� �ҷ�����
				// ������  vs ��� ���
				// ������ : ��� ���
					// C:\Users\504\git\JAVA_Daily_Code\javafx\src\img\logo.jpg
				// ����� : �� ��ġ [ ������Ʈ ���� src ] ���� ���
					// ���� [ src �������� ]  /img/���ϸ�.Ȯ����
		stage.setResizable(false); // 4. �������� ũ�⺯�� �Ұ�
		stage.getIcons().add(image);  // 3. �������� ������ ����
		stage.setTitle("ȭȭ��"); // 2. �������� â �̸�
		stage.show(); // 1. �������� ����
		
	
	}
	
	public static void main(String[] args) { 
		
		launch(args); 
		
	}
	
	
}
