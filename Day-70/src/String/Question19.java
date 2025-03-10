package String;

//19. Split a hexadecimal color code (e.g., "#FF5733") into its red, green, and blue components.  


public class Question19 {
	
	String hexCode ="#FF5733";
	
	void hexdecimalConvert()
	{
		if (hexCode.startsWith("#") && hexCode.length() == 7)
		{
			String red = hexCode.substring(1,3);
			String green = hexCode.substring(3,5);
			String blue = hexCode.substring(5,7);
			
			int r = Integer.parseInt(red,16);
			int g = Integer.parseInt(green,16);
			int b = Integer.parseInt(blue,16);
			
			
			System.out.println("red :"+r);
			System.out.println("green :"+g);
			System.out.println("blue :"+b);	
		}
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		obj.hexdecimalConvert();
	}

}
