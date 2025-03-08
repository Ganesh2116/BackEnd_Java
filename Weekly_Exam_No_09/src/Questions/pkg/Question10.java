package Questions.pkg;

// 10. The scroll had a phrase that might start with "Eldoria." Check if it does.


public class Question10 {

	void start(String str)
	{
		System.out.println(str.startsWith("Eldoria"));
	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		String str = "Eldoria is word";
		obj.start(str);
	}

}
