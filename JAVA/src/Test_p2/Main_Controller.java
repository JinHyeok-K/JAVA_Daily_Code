package Test_p2;

import java.util.ArrayList;



public class Main_Controller {

	public static ArrayList<ȸ����������> memberlist = new ArrayList<>();
	public static ArrayList<��������> bookinginfo = new ArrayList<>();

	

	
	public static boolean ȸ������(String id, String pw, String name, String phone) { //ȸ������ �޼ҵ�
		
		if(id.equals("admin")) {
			return false;
		}
		for(ȸ���������� temp : memberlist) {	//���̵��ߺ�üũ
			if(temp.getId().equals(id))  {
				return false;
			}
		}//���̵��ߺ�üũ ��
		
		
		
		ȸ���������� �������� = new ȸ����������(id, pw, name, phone);
		
		memberlist.add(��������);
		
		
		return true;
	}// ȸ�����Ը޼ҵ� ��
	
	public static int �α���(String id, String pw) {//�α��� �޼ҵ�
		if( id.equals("admin") && pw.equals("1234") ) {
			return 2;//�����ڷα���
		}
		for(ȸ���������� temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw) ) {
				
				return 1;//�Ϲݷα���
			}
		}
		return 3;//�α��ν���
		
		
		
		
	}//�α��θ޼ҵ� ��

	
	
	
	
	
	
	
	
	
	
	
	
	
}//class end
