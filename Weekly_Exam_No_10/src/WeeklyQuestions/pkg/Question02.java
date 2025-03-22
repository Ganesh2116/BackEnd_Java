package WeeklyQuestions.pkg;


//Q.2.Write a Java method to count the number of vowels (a, e, i, o, u) in a given string.
//
//Java Test Paper(Dec 24)
//
//public static int countVowels(String str)
//use inbuilt Method toCharArray();

public class Question02 {

	static int countVowels(String str)
	{
		char ch[] = str.toCharArray();
		int countVowels = 0;
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u')
			{
				countVowels++;
			}
		}
		return countVowels;
	}
	public static void main(String[] args) {
		String str = "Java Test Paper(Dec 24)";
		int result = countVowels(str);
		
		System.out.println("String vowel count is :"+result);
	}
}
