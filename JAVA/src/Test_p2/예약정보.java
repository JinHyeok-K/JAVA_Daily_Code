package Test_p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class �������� {
	
	
	static ArrayList<��������> ���� = new ArrayList<��������>();

	
	//�ʵ� ��¥, ����, �����ݾ�, ���ĺ���, �ｺ��, ������
	private LocalDate ��¥;
	private String ����;
	private int �����ݾ�;

	//������
	public ��������() {

	}

	public ��������(LocalDate ��¥, String ����, int �����ݾ�) {
		this.��¥ = ��¥;
		this.���� = ����;
		this.�����ݾ� = �����ݾ�;
	}

	public static ArrayList<��������> get����() {
		return ����;
	}

	public static void set����(ArrayList<��������> ����) {
		��������.���� = ����;
	}

	public LocalDate get��¥() {
		return ��¥;
	}

	public void set��¥(LocalDate ��¥) {
		this.��¥ = ��¥;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public int get�����ݾ�() {
		return �����ݾ�;
	}

	public void set�����ݾ�(int �����ݾ�) {
		this.�����ݾ� = �����ݾ�;
	}



	
	




	//�޼ҵ�

}
