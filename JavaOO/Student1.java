package prj;

public class Student1 {

	private String name;
	private int studentnum;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setStudentnum(int studentnum){
		this.studentnum=studentnum;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getStudentnum(){
		return this.studentnum;
	}
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		
		s.setName("��ǻ���������а�");
		s.setStudentnum(20161854);
		
		System.out.println("�а� : "+s.getName());
		System.out.println("�й� : "+s.getStudentnum());
	}
	
	
}
	



