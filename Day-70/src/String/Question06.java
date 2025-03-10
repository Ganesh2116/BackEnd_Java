package String;

// 6. Split a string containing numbers separated by commas and find the sum of those numbers.  


public class Question06 {
	
	void stringNumCount(String str)
	{
		String num[] = str.split(",");
		int sum = 0;
		for (int i=0;i<num.length;i++)
		{
			sum += Integer.parseInt(num[i]);
		}
		
		System.out.println("Sum of those number is:"+sum);
	}

	public static void main(String[] args) {
		Question06 obj = new Question06();
		String str ="12,2,5,6";
		obj.stringNumCount(str);
	}
}
