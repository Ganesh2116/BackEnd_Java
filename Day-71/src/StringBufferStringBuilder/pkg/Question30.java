package StringBufferStringBuilder.pkg;

// 30. Swap the first and last characters of a StringBuffer and print the modified string.

public class Question30 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("java program");
		String str1 = "";
		char a  = str.charAt(0);
		char b = str.charAt(str.length()-1);
		 str.setCharAt(0, b);
		 str.setCharAt(str.length()-1, a);
		 System.out.println(str);
		
//		char temp = a;
//		a= b ;
//		b = temp;
//		
//		str1 = a+str.substring(1,str.length()-1) + b ;
//		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		Question30 obj = new Question30();
		obj.print();
	}

}
