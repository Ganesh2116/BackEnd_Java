package StringQuestionReturnTypeAssignment03.pkg;

//Q9. Write a Java program to create a new string from a given string swapping the last two 
//characters of the given string. The length of the given string must be two or more.
//Sample Output:
//The given strings is: string 
//The string after swap last two characters are: string

public class Question09 {
	
	String str = "ganesh";
	
	void swapLastChar()
	{
		char a = str.charAt(str.length()-1);
		char b = str.charAt(str.length()-2);
		
		char temp = a;
		a= b;
		b= temp;
		str = str.substring(0,str.length()-2) +b+a;
	
		System.out.println("The string after swap last two charahterare "+str);
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		obj.swapLastChar();
	}

}
