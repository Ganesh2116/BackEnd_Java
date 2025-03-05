package String_1.pkg;

// Q17.Wap enter a string and check any particular string are present in it or not using contains().

public class Question17 {
	
	void strPersentOrNot()
	{
		String str = "hello this java class Questions";
		boolean st = str.contains("hello");
		
		System.out.println("This is String :  "+str);
		System.out.println("Find char or string is : hello");
		if (st)
		{
			System.out.println("char found...");
		}
		else
		{
			System.out.println("char not found..");
		}
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		obj.strPersentOrNot();
	}

}
