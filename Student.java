package prj;

public class Student {

	String name;
	int studentnum;
	
	public static void main(String[] args){
		Student s= new Student();
		
		s.name = "컴퓨터정보공학과";
		s.studentnum = 20161854;
		
		System.out.println("학과 : "+s.name+"\n학번: "+s.studentnum);
	}

}
