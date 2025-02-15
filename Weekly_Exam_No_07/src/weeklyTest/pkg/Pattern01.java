package weeklyTest.pkg;


/*
 2) wap to print check whether the element is palindrome or not, if the element is palindrome
  find the sum of the element , if not then find the average of the element. 

int[] arr={121, 133, 131}
output: 
      121-> Palindrom->sum: 3
      133-> Not plaindrom-> Avg: 2
      131-> Palindrom-> sum: 5
 */

public class Pattern01 {
	public static void main(String[] args) {
		
		int[] arr={121, 133, 131};
		
		for (int j=0;j<arr.length;j++)
		{
		int count = 0;
		int sum = 0;
		int num = arr[j];
		int rem = 0;
		int rev = 0;
		for (int i=num;i>0;i= i/10)
		{
			rem  = i%10;
			rev = rev*10+rem;
			sum +=rem;
			count++;
		}
		int avg = sum/count;
		System.out.println(arr[j]);
		if (num == rev)
		{
			System.out.println("sum: "+sum);
			System.out.println("this is palindrome number ");
		}
		else
		{
			System.out.println("avg: "+avg);
			System.out.println("this is not palindrome number ");
		}
		}
	}

}
