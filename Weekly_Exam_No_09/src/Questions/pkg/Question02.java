package Questions.pkg;

//2. Mia wanted to check how many characters were in the scroll's first line. Find the length of the string.  


public class Question02 {
	
	void checkCharLength(String str)
	{
		System.out.println("String length is :"+str.length());
	}

	public static void main(String[] args) {
		Question02 obj = new Question02();
		String str = "Ryan forund the scroll mesg";
		obj.checkCharLength(str);
	}
}
