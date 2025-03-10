package String;

// 20. Split a list of items where some items may have multiple words (e.g., "apple, orange juice, banana, mango shake") and correctly separate them.

public class Question20 {
	
	String str = "apple, orange juice, banana, mango shake";
	
	void itemSplit()
	{
		String s[] = str.split(",");
		
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i].trim());
		}
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		obj.itemSplit();
	}

}
