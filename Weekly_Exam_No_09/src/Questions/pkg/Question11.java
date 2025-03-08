package Questions.pkg;

// 11. It also had a phrase that might end with "Scroll." Verify this.  


public class Question11 {
	
	void end(String str)
	{
		System.out.println(str.endsWith("Scroll"));
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		String str = "word id Scroll";
		obj.end(str);
	}


}
