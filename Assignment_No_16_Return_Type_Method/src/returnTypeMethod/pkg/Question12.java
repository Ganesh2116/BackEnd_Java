package returnTypeMethod.pkg;

// Write a method to check whether a character is an alphabet or not

public class Question12 {
	
	String character(char ch)
	{
		 if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
		 {
	            return "This is an alphabet.";
	     } 
		 else 
	      {
	        	 return "This is not alphabet.";
	      }
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		String result = obj.character('1');
		
		System.out.println(result);
	}

}
