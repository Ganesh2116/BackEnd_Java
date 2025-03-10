package String;

//15. Split a CSV line and store the values in an array.  


public class Question15 {
	
	String csvStr =  "Apple,Banana,Cherry,Mango,Orange";
	
	void csvLine()
	{
		String s[] = csvStr.split(",");
		
		for (int i =0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		obj.csvLine();
	}
}
