package String.pkg;

// 7.Write a Java program to compare two strings using equalignore case.

public class Question07 {
	
	void equalignoreStr(String str,String str1)
	{
		System.out.println(str.equals(str1));
		System.out.println(str == str1);
		System.out.println(str.equalsIgnoreCase(str1));
	}
	
	public static void main(String[] args) {
		String str = new String("ganesh bharti");
		String str1 = new String("ganesh bharti");
		String str2 = "Ganesh bharti";
		String str3 = "ganesh bharti";
		Question07 obj = new Question07();
		obj.equalignoreStr(str, str1);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		obj.equalignoreStr(str2, str3);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		obj.equalignoreStr(str, str3);
		
		
		
	}

}
