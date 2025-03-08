package Questions.pkg;

// 9. There were mysterious gaps between words. Count the number of spaces.

public class Question09 {
	
	void spaces(String str)
	{
		int count = 0;
		for (int i =0 ;i<str.length();i++)
		{
			if (str.charAt(i) ==  ' ')
			{
				count++;
			}
		}
		
		System.out.println("Count of space is:"+count);
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		String str ="this is java program";
		obj.spaces(str);
	}

}
