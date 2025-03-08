package Questions.pkg;

// 6. The next section had only capital letters. Convert it all to lowercase. 

public class Question06 {
	void lowercase(String str)
	{
		System.out.println("lowerCase String is :"+str.toLowerCase());
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		String str = "JAVA PROGRAM";
		obj.lowercase(str);
	}
}
