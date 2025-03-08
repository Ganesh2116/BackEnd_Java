package Questions.pkg;

// 4. The first task was to check whether the scroll was empty. Verify this.

public class Question04 {
	
	void emptyOrNot(String str)
	{
		if (" " == str)
		{
			System.out.println("String are empty");
		}
		else
		{
			System.out.println("String are not empty");
		}
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		String str = "java program";
		obj.emptyOrNot(str);
		
	}

}
