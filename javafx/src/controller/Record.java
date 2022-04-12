package controller;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Record implements Initializable {
	
	
	@FXML
	private Label lblmtotal;
	
	@FXML
	private Label lblptotal;
	
	@FXML
	private Label lblbtotal;
	
	@FXML
	private BarChart mbc;
	
	@FXML
	private BarChart bbc;
	
	
	@FXML
	private BarChart pbc;
	
    @FXML
    private PieChart ppc;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ��ü ȸ����
		int mtotal = MemberDao.memberDao.counttotal("member");
		lblmtotal.setText(mtotal + "��") ;
		// ��ü ��ǰ��
		int ptotal = MemberDao.memberDao.counttotal("product");
		lblptotal.setText(ptotal + "��") ;
		// ��ü �Խù� ��
		int btotal = MemberDao.memberDao.counttotal("board");
		lblbtotal.setText(btotal + "��") ;
		
		
		
		// ��¥ �� ȸ�� ���� ��
		// 1. xy�� �迭 ����
		XYChart.Series series = new XYChart.Series<>(); // 1. xy�� �迭 ����
			// XYChart.Series : �迭 Ŭ���� 
				// XYChart.Data : �迭 ������ Ŭ���� [ X���� ��, Y���� �� ]
					// series.getData().add(data);
		
		
		
		// ��¥ ���� ȸ������ �� üũ [ 2022-04-11 , 3 ]
			// Map �÷��� => Ű(��¥), ��(���� �ο� ��)���� �ϳ��� ��Ʈ�� ����
				//
		// 2. DB���� ������ ��������
		Map<String, Integer> map = MemberDao.memberDao.datetotal("member","msince");
		
		
		// 3. �����͸� �迭�� �߰� 
			// �ݺ���
		for(String key : map.keySet()) {
			// 3-1 : ������ �迭 ����(������ : key = ��¥ , value = ������ ��)
			XYChart.Data data = new XYChart.Data<>(key,map.get(key) );
			// 3-2 : �ش� ������ ��ü�� �迭�� �߰�
			series.getData().add(data);			
		}
		// 4. �ش� �迭�� ������Ʈ�� �߰�
		// ������Ʈ
		mbc.getData().add(series);
		
		
		// 1. �迭 ����
		XYChart.Series series2 = new XYChart.Series<>();
		Map<String, Integer> map2 = MemberDao.memberDao.datetotal("board","bdate");
		// 
		for(String key : map2.keySet()) {
			//2. ������ ����
			XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
			// 3. �迭�� ������ �߰�
			series2.getData().add(data);
			
		}
		
		// 4. ��Ʈ�� �迭 �߰�
		bbc.getData().add(series2);
		
		
		
		
		
		// 1. �迭 ����
		XYChart.Series series3 = new XYChart.Series<>();
			// 2. data ����
			XYChart.Data data = new XYChart.Data("x��",10);
			series3.getData().add(data);
			XYChart.Data data2 = new XYChart.Data("y��",20);
			series3.getData().add(data2);
			XYChart.Data data3 = new XYChart.Data("z��",30);
			series3.getData().add(data3);
			// 3. �迭�� ������ �߰�
		
		
			pbc.getData().add(series3);
			
			
		// ���� ��Ʈ : ī�װ��� ����	
			// * ObservableList ��� ���� : ���� ��Ʈ�� ����Ʈ�� �߰� �� 
		// 1. ObservableList<������Ʈ ������ �ڷ��� > ����Ʈ�� ����
		ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
			
		// 2. db���� ī�װ��� ����
		Map<String,Integer> map3= MemberDao.memberDao.countcategory();
		
		// 3. ���� ��Ʈ
		for(String key : map3.keySet()) {
			PieChart.Data temp = new PieChart.Data(key, map3.get(key));
			list.add(temp);
		}
		
		// 4. ����Ʈ�� ���� ��Ʈ�� �߰�
		ppc.setData(list);
		
		
	}

}
