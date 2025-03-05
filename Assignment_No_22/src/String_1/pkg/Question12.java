package String_1.pkg;

/*
12.Wap to show 1-1 example of these string methods:
charAt
CompareTo
CompareToignore
Concat
Contains
trim
*/

public class Question12 {
	
	void  methodsEx()
	{
		String str = "hello world";
		String str1 = "Hello world";
		String str2 = "     hello world        ";
		
		System.out.println("This is String :"+str);
		
		System.out.println("\nThis is charAt method :"+str.charAt(6));
		System.out.println("This is CompateTo method :"+str.compareTo(str1));
		System.out.println("This is compareToignore method :"+str1.compareToIgnoreCase(str));
		System.out.println("This is concat method :"+str.concat(" "+str1));
		System.out.println("This is contains method :"+str.contains(str1));
		System.out.println("This is trim method: "+str2.trim());
	}
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.methodsEx();
		
	}

}
