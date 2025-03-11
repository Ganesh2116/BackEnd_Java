package StringBufferStringBuilder.pkg;

// 21. Create a StringBuffer with a long sentence and replace all spaces with '-'.  


public class Question21 {
	
	void print()
	{
		StringBuffer sb = new StringBuffer("this is java code");
		
		for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
            	sb.setCharAt(i, '-');
            }
        }
		
		System.out.println(sb);
	}
	
	
	
	public static void main(String[] args) {
		Question21 obj = new Question21();
		obj.print();
	}

}
