package String_2.pkg;

// Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case.

public class Question05 {
	
	String str = "this is java program";
	
	void firstUppercase()
	{
		String word[] = str.split(" ");
		
		for (int i=0;i<word.length;i++)
		{
			char temp = Character.toUpperCase(word[i].charAt(0));
			word[i] = temp + word[i].substring(1);
			
		}
		
		System.out.println("first UpperCase: ");
		for (int i=0;i<word.length;i++)
		{
			System.out.print(word[i]+" ");
			
		}
		
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.firstUppercase();
		
	}

}
