package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	// ��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ� ��
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
			// �������� : ��ǻ�ͳ���/��ǻ�� ���� ������ ��ȯ ����� �����ϴ� ��Ģ[ ü�� ]
				// SMTP : ���� ���� ��������
				// IP : ���ͳ� ��������
	// TCP/IP
		// TCP : Transmission Control Protocol : ��� ����
		// IP : Internet Protocol address : ��� �ν� ��ȣ [�ּ�-PC�ּ�-���ּ�] :0.0.0.0 ~ 255.255.255.255
			// �츮�� <--------- ���� -----------> ģ����
			//									ģ������ ���ּ�
			
			// ����ǻ�� <-------- ���� -----------> ���̹���ǻ��[Ȩ������]
			//									www.naver.com [�������ּ�: ���ڱ⶧���� ��� �� �ܿ�� ����]
			//									// �����ּ�(IP) ===> �����ּ�(DNS)
	public static void main(String[] args) {
		
		// 1. ���� PC �� IP �ּ� Ȯ��
			// �������ư -> cmd �˻� -> ���������Ʈ
			// ipconfig �Է� �� ��Ʈ��ũ(IP) ������ �� �� �ִ�.
		// 2. �ڹٿ��� IP �ּ� Ȯ��(Local)
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
				// InetAddress ��Ʈ��ũ ������ �����ϴ� Ŭ����
					// InetAddress.getLocalHost() // ����(��PC)�� ���� ȣ��
						// �ڹ� �� ����� ��� �Ϲݿ��� �߻�
			System.out.println("���� PC�� ��Ʈ��ũ ��ü : "+ inetAddress);
			System.out.println("���� PC�� �̸� : "+ inetAddress.getHostName());
			System.out.println("���� PC�� IP �ּ� : "+ inetAddress.getHostAddress());
		
		// 3. ���̹� ȸ���� IP �ּ� Ȯ��	
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� PC�� ���� ��ü : "+ inetAddress2);
			System.out.println("���̹� PC�� �̸� : "+ inetAddress2.getHostName());
			System.out.println("���̹� PC�� IP �ּ� : "+ inetAddress2.getHostAddress());
			
		}catch (Exception e) {		}
		
	}
	
	
}
