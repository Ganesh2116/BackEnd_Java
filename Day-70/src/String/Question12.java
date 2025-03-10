package String;

//12. Extract numbers from a string using split() and find their average.  


public class Question12 {
	
	String str ="1,2,3,4,5,6,7,8,9,10";
	
	void avgEleStr()
	{
		String s[] = str.split(",");
		int sum = 0;
		for (int i=0;i<s.length;i++)
		{
			sum += Integer.parseInt(s[i]);
		}
		int avg = sum/s.length;
		
		System.out.println("Average of word ele is:"+avg);
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.avgEleStr();
		
	}

}
