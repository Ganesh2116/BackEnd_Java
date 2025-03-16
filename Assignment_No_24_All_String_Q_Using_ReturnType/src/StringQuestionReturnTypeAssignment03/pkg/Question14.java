package StringQuestionReturnTypeAssignment03.pkg;

//Q14.Wap enter a string and find the occurence of first word, first character, last word, last character in string by using class and object.


public class Question14 {
	
	String str = "this is java program this java code and java problems";
	
	void occurenceOfChar()
	{
		String str1[] = str.split(" ");
		System.out.println("occurence of first word :"+str.indexOf(str1[0]));
		System.out.println("occurence of first char :"+str.indexOf(str.charAt(0)));
		
		System.out.println("occurence of last word :"+str.lastIndexOf(str1[str1.length-1]));
		System.out.println("occurence of last char :"+str.lastIndexOf(str.charAt(str.length()-1)));
		
	}
	
		public static void main(String[] args) {
			Question14 obj =new Question14();
			obj.occurenceOfChar();
		}
}
