package StringQuestions.pkg;

// Write a program to swap the first and last character of a string.

public class Question26 {
	
	void swapFirstLast(String str)
	{
		char nstr[] = str.toCharArray(); 
	
		char temp = nstr[0];
		nstr[0] = nstr[str.length()-1];
		nstr[str.length()-1] = temp;
		
		String nnstr = new String(nstr);
		System.out.println("swap char String is:"+nnstr);
	}
	
	public static void main(String[] args) {
		Question26 obj = new Question26();
		obj.swapFirstLast("ganesh bharti");
	}

}



