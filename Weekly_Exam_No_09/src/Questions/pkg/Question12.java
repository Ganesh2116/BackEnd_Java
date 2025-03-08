package Questions.pkg;

//12. Mia needed to check if the scroll contained the letter 'Q'. Find out. 


public class Question12 {
	
	void contain(String str)
	{
		System.out.println("Contanined Q letter is "+str.contains("Q"));
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		String str = "this is  Queen";
		obj.contain(str);
	}

}
