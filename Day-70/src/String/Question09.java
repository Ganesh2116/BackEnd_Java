package String;

//9. Split a string based on uppercase letters (e.g., "HelloWorld" → ["Hello", "World"]).  


public class Question09 {
	
	void upperCaseSplit(String str)
	{
		String s[] = str.split("(?=[A-Z])");
		
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		String str ="HelloWordJavaProgram";
		obj.upperCaseSplit(str);
	}

}
