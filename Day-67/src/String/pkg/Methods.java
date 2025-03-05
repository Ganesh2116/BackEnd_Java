package String.pkg;

public class Methods {
	
	static void stringPrint()
	{
		String s = "I am invisable";
		String str = "     this is trim   ";
		
		System.out.println(s.length());// length
		System.out.println(s.charAt(5));//charAt
		System.out.println(s.substring(5));//substring start
		System.out.println(s.substring(5,10));//substring start to end
		
		// concat
		String s1 = " this is not.";
		String s2 = s.concat(s1);
		System.out.println(s2);
		
		//Lowercase
		System.out.println(s.toLowerCase());
		
		// Uppercase
		System.out.println(s.toUpperCase());
		
		// trim
		System.out.println(str.trim());
		
		// replace
		System.out.println(s.replace("a", "A"));
		
		// starts with 
		System.out.println(s.startsWith("I"));
		
		// ends with
		System.out.println(s.endsWith("e"));
		
		//String convert to char
		char ch [] = s.toCharArray();
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
		stringPrint();
	}

}
