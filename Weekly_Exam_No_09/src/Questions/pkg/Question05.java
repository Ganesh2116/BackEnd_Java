package Questions.pkg;


// 5. Some words were written in lowercase letters. Convert the entire text to uppercase. 

public class Question05 {
	
	void UpperCase(String str)
	{
		System.out.println("Uppercase String :"+str.toUpperCase());
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		String str = "java program";
		obj.UpperCase(str);
		
	}

}
