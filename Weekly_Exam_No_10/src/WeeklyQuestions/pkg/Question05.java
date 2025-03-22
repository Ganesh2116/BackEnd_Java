package WeeklyQuestions.pkg;

// Q.5. Write a Java program to reverse a given integer number.

public class Question05 {
	
	void reverseNum(int num)
	{
		System.out.println("Reverse Number is:");
		for (int i=num ;i>0;i=i/10)
		{
			int rem = i%10;
			System.out.print(rem);
		}
	}

	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.reverseNum(123456789);
	}
}
