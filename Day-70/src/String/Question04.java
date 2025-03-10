package String;

// 4. Split an email address (e.g., "user@example.com") into username and domain.  


public class Question04 {
	
	void splitEmail(String str)
	{
		String st[] = str.split("@");
		
		for (int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		String str ="ganeshbharti@gmail.com";
		obj.splitEmail(str);
	}

}
