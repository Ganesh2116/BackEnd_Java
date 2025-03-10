package String;

// 11. Split a string of words and count the frequency of each unique word.  


public class Question11 {
	
	String str ="I conver the java program in java code and in this code";
	
	void uniqueWordFrq()
	{
		String s[] = str.split(" ");
		
		for (int i=0;i<s.length;i++)
		{
			int frq = 1;
			for(int j=i+1;j<s.length;j++)
			{
				if (s[i].equals(s[j]))
				{
					frq++;
					s[j] = "-1";
				}
			}
			
			if (s[i] != "-1")
			{
				System.out.println("frq word is:"+s[i]+" is :"+frq);
			}
		}
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.uniqueWordFrq();
		
	}

}
