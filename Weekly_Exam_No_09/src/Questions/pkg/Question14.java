package Questions.pkg;

// 14. Mia was looking for the last appearance of the letter 'T'. Find it.  


public class Question14 {
	
	void lastOccurrenc(String str)
	{
		System.out.println("occurrence of word is :"+str.lastIndexOf("T"));
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		String str = "string Two word  They here";
		obj.lastOccurrenc(str);
		
	}

}
