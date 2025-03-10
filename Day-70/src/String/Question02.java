package String;

// Split a comma-separated string into an array of strings and print the elements.

public class Question02 {
	
	void commaSeparat(String str)
	{
		String word[] = str.split(",");
		
		for (int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		String str = "this is java program,javascript,reactjs and css ,tailwindcss useing lanuages ui,ux";
		obj.commaSeparat(str);
	}

}
