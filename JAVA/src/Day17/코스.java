package Day17;

public class 内胶<T> {
	
	private String name;
	private T[] student;
	
	
	
	public 内胶(String name, int capacity) {
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
	public void add(切积 切积) {
		for(int i = 0; i<student.length;i++) {
			if( students[i]==null) {
				students[i]=切积;
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
