package Day19;

import java.util.HashMap;

public class Day19_03 {

	public static void main(String[] args) {
		
		// 1. Map �÷��� = json
			// * Ű(��ü), ��(��ü) = ��Ʈ��   ==> vector?
			// Ű : set �÷���(�ߺ� �Ұ���) �� : list�÷���(�ߺ�����)
			// HashMap Ŭ����
				// 1. map��ü��.put(Ű��ü, �� ��ü) == > [�ϳ���] ��Ʈ��(Ű,��) �߰�
				// 2. map��ü��.size() : ��Ʈ�� ����
				// 3. map��ü��.get(Ű��ü) : �ش� Ű�� �� ȣ��
				// 4. map��ü��.keyset() : map ��ü �� ��� Ű ȣ��
		 		// 5. map��ü��.values() : map ��ü �� ��� �� ȣ��
					// * Ű(�ߺ�X)�� �˰� ������ ���� �� �� �ִ�.
					// for(�ӽð�ü�� : map��ü��.keySet() ) { }
				// 6. map��ü��.remove ( Ű ��ü ) : �ش� Ű��  ��Ʈ�� ����
				// 7. map��ü��.clear() : ��� ��Ʈ�� ����
		
			// * List�÷��� : ����(index) ���� : �迭 ����
			// * SetĿ���� : ���� ���� ���� = �ߺ� �Ұ���
			// * Map�÷��� : Ű(set)�� ��(list)���� �̷���� ��Ʈ�� ����[����X] 
		
		
		
		
		
		// 1. HashMap Ŭ������ ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
		//HashMap :�÷��� �����ӿ�ũ map Ŭ����
			// <���׸�,���׸�> : key ,value �� ������ ���׸�
				// map : map ��ü�� (�ƹ��ų�)
					// new : ��ü ���� �� �޸� �Ҵ�
						// HashMap<>() : ������
		
		// 2. map ��ü�� �߰�
		map.put("�ſ뱸", 86) ; System.out.println("Ȯ�� : "+map);
			// ����Ʈ = [��ü,��ü ]
			// ��Ʈ = [��ü,��ü ]
			// �� = {Ű = ��}
		map.put("�찣��", 69);  System.out.println("Ȯ�� : "+map);
		map.put("�ɿ�", 55);  System.out.println("Ȯ�� : "+map);
		map.put("�찣��", 86);  System.out.println("Ȯ�� : "+map);
		// * Key �� �ߺ��Ұ��� [ ���� key�� �������� ���ο� Ű�� ��ġ ]
		// value �� �ߺ�����
		
		// 3. map��ü��.size() : map ��ü �� ��Ʈ��(Ű=��) ����
		System.out.println("�� ��ü �� ��Ʈ�� �� :"+ map.size());
		
		// 4. map��ü��.get(Ű) : map ��ü �� Ű -> �� ȣ��
		System.out.println(" �� ��ü �� �� ȣ��(Ű ȣ�� �� -> �� ȣ��) : "+map.get("�ɿ�"));
		
		// 5. ��� key ȣ��
		System.out.println("�� ��ü �� ��� Ű ȣ�� "+ map.keySet());
		
		//6 ��� value ȣ��
		System.out.println("�� ��ü �� ��� �� ȣ�� "+ map.values());;
		
		
		// 7. �ݺ��� [ key���� �ݺ����� �̿��ؼ� ��� value ȣ�� ���� ]
		
		for(String temp : map.keySet()) {
			System.out.println(temp+"   :   "+map.get(temp));
		}
		
		// 8. ����
		map.remove("�ſ뱸"	); System.out.println("Ȯ�� : "+map);
		
		// 9. ��� ����
		map.clear(); System.out.println("Ȯ�� : "+ map);
		
	}
}
