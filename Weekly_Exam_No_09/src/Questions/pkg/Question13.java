package Questions.pkg;

// 13. Ryan wanted to find the first occurrence of the letter 'S'. Locate it.  


public class Question13 {
	
	void occurrenc(String str)
	{
		System.out.println("occurrence of word is :"+str.indexOf("S"));
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		String str = "this is Strong word";
		obj.occurrenc(str);
	}

}
