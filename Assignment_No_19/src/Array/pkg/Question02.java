package Array.pkg;

//Q 2 .Wap intialise an array and print it

import java.util.Arrays;

public class Question02 {
	
	void display()
	{
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Array is:"+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		obj.display();
	}

}
