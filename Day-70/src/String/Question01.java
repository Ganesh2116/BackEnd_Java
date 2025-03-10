package String;

//1. Split a given sentence into words and print each word on a new line.  


public class Question01 {
	
	void printWords(String str)
	{
		String word[] = str.split(" ");
		
		for (int i =0;i<word.length;i++) {
			System.out.println(word[i]);
		}
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		String str = "This java program and String question";
		obj.printWords(str);
		
	}

}
