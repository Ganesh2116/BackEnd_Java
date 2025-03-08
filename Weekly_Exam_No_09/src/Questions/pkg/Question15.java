package Questions.pkg;

// 15. Some words were misspelled. Replace all occurrences of 'e' with 'a'.  


public class Question15 {
	
	
	void replace(String str)
	{
		System.out.println("replace is string words "+str.replace('e', 'a'));
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		String str = "this is java program elements";
		obj.replace(str);
	}

}
