package application;
// javafx �� ��� [ awt , swing �� fx ���� ���� ]
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_01 extends Application{
				// extend : ��� [ Application : JAVA FX GUI ���� Ŭ���� => start �޼ҵ� ����]
					// ��ӹ����� ���� Ŭ���� �� ����� ����� �� �ִ�.
	@Override // ���� 
	public void start(Stage stage) throws Exception {
		// javafx �� �����ϴ� �޼ҵ� [�߻� -> ����]
			// start(Stage ���������̸�(�ƹ��ų�))
		
		// 1. �����̳� ����� [ ������ ��Ʈ���� ���η� ���� ]
		VBox box = new VBox();
		// 2. ��Ʈ�� �����
		Button button = new Button();
		button.setText("�ݱ�");
		button.setOnAction(e -> Platform.exit());
					//��  ->  �μ�       : ���ٽ�(�̸��� ���� �޼ҵ�)
		// 3. �����̳ʿ� ��Ʈ�� �ֱ�
		box.getChildren().add(button);
		// 4. �� ��ü ���� ��(�����̳� �ֱ�);
		Scene scene = new Scene(box,500,500); // box , ���α���, ���α���
		// 5. ���������� �� �ֱ�
		stage.setScene(scene);
		
		// * ���� : �������� -> �� -> �����̳� -> ����������Ʈ��(��ư,�Է»���,ǥ ��) 
		//        ��������.��(��) | new ��(�����̳�) | ��Ʈ��.add(��ư)
		
		stage.show(); // �������� ����
			
	}
	
	public static void main(String[] args) { // main thread �� ������ �ִ� �޼ҵ�
		launch(args); // start �޼ҵ� ȣ��  [��Ƽ ������ ��� �� ����]
	}
	
	
	
	
}
