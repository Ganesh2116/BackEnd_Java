package Questions.pkg;

//1. Ryan found the first sentence on the scroll but couldn't read it. Print the message.  

public class Question01 {
	
	void foundMsg(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		String str = "Ryan found the Scroll message.";
		obj.foundMsg(str);
	}

}
