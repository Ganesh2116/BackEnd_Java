package StringQuestionReturnTypeAssignment02.pkg;

//12.Wap to show 1-1 example of these string methods:
//charAt
//CompareTo
//CompareToignore
//Concat
//Contains
//trim

public class Question12 {
	
	void stringMethods(String str,String st)
	{
		System.out.println("charAt method :"+str.charAt(0));
		System.out.println("compareto method :"+str.compareTo(st));
		System.out.println("compare To ignore :"+str.compareToIgnoreCase(st));
		System.out.println("concat method :"+str.concat(st));
		System.out.println("contains method :"+str.contains(st));
		
		String s = " hello world   ";
		System.out.println("trim method :"+s.trim());
		
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.stringMethods("hello", "HeLLo");
		
	}

}
