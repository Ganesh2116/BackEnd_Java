package String_2.pkg;

//Q11.Wap enter a string and find the percentage of uppercase, lowercase, digits and special characters in a string.


public class Question11 {
	
	String str = "ganesBHharti728@gamil.com";
	void percentageUpperLowerDigitSpecial()
	{
		int len = str.length();
		int upperCount =0;
		int lowerCount = 0;
		int digitCount =0;
		int specialCount =0;
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
			{
				upperCount++;
			}
			else if (Character.isLowerCase(ch))
			{
				lowerCount++;
				
			}
			else if (Character.isDigit(ch))
			{
				digitCount++;
			}
			else
			{
				specialCount++;	
			}
		}
		
		double upperPer = upperCount*100/len;
		double lowerPer = lowerCount*100/len;
		double digitPer = digitCount*100/len;
		double specialPer = specialCount*100/len;
		
		System.out.println("uppercase percentag:"+upperPer);
		System.out.println("lowercase percentag:"+lowerPer);
		System.out.println("digitcase percentag:"+digitPer);
		System.out.println("spicalcase percentag:"+specialPer);
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.percentageUpperLowerDigitSpecial();
	}

}
