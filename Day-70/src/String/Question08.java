package String;

// 8. Split a string containing multiple delimiters (e.g., comma, semicolon, space).  


public class Question08 {

	void mutil(String str)
	{
		String st[] = str.split("[,;\\s]+");
		
		for (int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		String str = "this is;java and many lanuages,javascript,css";
		obj.mutil(str);
	}
}
