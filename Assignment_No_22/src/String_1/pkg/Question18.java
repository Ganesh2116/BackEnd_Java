package String_1.pkg;

// Q18.Wap enter a string and use endwith() and startwith() method.

public class Question18 {

	
	void startEndUse()
	{
		String str = "hello this is java programs";
		
		System.out.println(str);
		
		System.out.println("Start with :"+str.startsWith("he"));
		System.out.println("Ends  with :"+str.endsWith("ms"));
	}
	public static void main(String[] args) {
		Question18 obj = new Question18();
		obj.startEndUse();
	}
}
