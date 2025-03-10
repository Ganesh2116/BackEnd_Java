package String_2.pkg;

//Q12. Write a Java program to read a given string and if the first or last characters are same
//return the string without those characters otherwise return the string unchanged.
//Sample Output:
//The given strings is: testcricket
//The new string is: estcricke
public class Question12 {
	String str = "testcricket";
	
	void sameChar()
	{
		if (str.charAt(0) == str.charAt(str.length()-1))
		{
			System.out.println(str.substring(1,str.length()-1));
		}
		else
		{
			 System.out.println(str.substring(0,str.length()));
		}
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.sameChar();
	}

}
