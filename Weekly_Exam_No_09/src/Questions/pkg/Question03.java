package Questions.pkg;

// The scroll was torn in half. Combine two separate parts into one message.

public class Question03 {
	
	 void separateParts(String str,String str1)
	 {
		 System.out.println(str.concat(" "+str1));
	 }
	
	public static void main(String[] args) {
	Question03 obj = new Question03();
	String str = "java" ;
	String str1 = "programming";
	obj.separateParts(str,str1);
	}

}
