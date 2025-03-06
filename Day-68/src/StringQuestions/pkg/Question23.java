package StringQuestions.pkg;

//Write a program to print each character of a string separately.

public class Question23 {
	
	void separatPrint(String str)
	{
		System.out.println("separaterly char print :");
		for (int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		Question23 obj = new Question23();
		obj.separatPrint("ganesh bharti");
		
	}

}
