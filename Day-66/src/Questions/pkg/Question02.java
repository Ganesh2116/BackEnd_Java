package Questions.pkg;

// create a class Student with private fields name and marks. Provide getter and setter methods.

class Student
{
	private String name = "ganesh";
	private int markes = 77;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.markes = markes;
	}
	public String getName()
	{
		return name;
	}
	
	public int getMarkes()
	{
		return markes;
	}
}


public class Question02 {
	
	public static void main(String[] args) {
		Student obj = new Student();
		String name = obj.getName();
		int markes = obj.getMarkes();
		
		System.out.println("this name :"+name);
		System.out.println("this is markes:"+markes);
	}

}
