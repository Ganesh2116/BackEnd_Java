package Assignment03.pkg;
import java.util.Scanner;

/*
 * Q12. Wap to input an array and find its average of first 5 element.
 */

public class Question12 {
	
	int inputArray(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		System.out.println("Enter the element of array :");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum +=arr[i];
		}
		int avg =sum/5;
		return avg;
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		int arr[] = new int[10];
		
		int result = obj.inputArray(arr);
		System.out.println("array fist 5 elements is:"+result);
	}

}
