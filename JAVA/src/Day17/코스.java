package Day17;

public class �ڽ�<T> {
	
	private String name;
	private T[] student;
	
	
	
	public �ڽ�(String name, int capacity) {
		super();
		this.name = name;
		this.student = (T[])new Object[capacity];
		
	}



	public String getName() {
		return name;
	}

	public T[] getStudent() {
	return student;
	}
	public void add(�л� �л�) {
		for(int i = 0; i<student.length;i++) {
			if( students[i]==null) {
				students[i]=�л�;
				break;
			}
		}
		
		
		
		
	}
//
//	
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//

//
//
//	public void setStudent(T[] student) {
//		this.student = student;
//	}
//	
//	
	
	
	
	
	
	
}
