package StringQuestionReturnType.pkg;

//9.Write a Java program to find the occurence of first word in the string.


public class Question09 {
	
	int occurenceFirstWord(String str)
	{
		String word[] = str.split(" ");
		int count = 0;
		for (int i=1;i<word.length;i++)
		{
			if (word[i].trim().equals(word[0]) )
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		String str = "this is this java program code";
		int result = obj.occurenceFirstWord(str);
		
		System.out.println("Ocuurence of array first word is:"+result);
	}

}
