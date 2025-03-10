package String;

//16. Split a string containing a mathematical expression (e.g., "12+34-5") and identify the numbers and operators separately.  


public class Question16 {
	
	String strNum = "12+3-6/12*5%5";
	
	void numOpeSper()
	{
		String s[] = strNum.split("(?=[+\\-*/%])|(?<=[+\\-*/%])");
		
		System.out.println("Math num:");
		for (int i=0;i<s.length;i++)
		{
			if (!s[i].matches("[+\\-*/%]"))
			{
				System.out.print(s[i]+" ");
			}
		}
		
		System.out.println("\nMath opertors:");
		for (int i=0;i<s.length;i++)
		{
			if (s[i].matches("[+\\-*/%]"))
			{
				System.out.print(s[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Question16 obj = new Question16();
		obj.numOpeSper();
	}

}
