package Questions.pkg;

// 16. The scroll had unnecessary blank spaces at the beginning and end. Remove them.  


public class Question16 {
	
	void trim(String str)
	{
		System.out.println("start end remove space "+str.trim());
	}
	
	public static void main(String[] args) {
		Question16 obj = new Question16();
		String str = "    this is java program    ";
		obj.trim(str);
	}

}
