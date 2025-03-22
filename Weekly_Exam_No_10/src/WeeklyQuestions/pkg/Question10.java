package WeeklyQuestions.pkg;

import java.util.Scanner;

// Q.10. Java Program to determine whether two matrices are equal

public class Question10 {
	
	void checkMatriceEqualsOrNot()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int row = sc.nextInt();
		
		System.out.println("Enter the row size ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter the 1st array ele");
		for (int i=0;i<row;i++)
		{
			for ( int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Enter the row size ");
		int row1 = sc.nextInt();
		
		System.out.println("Enter the row size ");
		int col1 = sc.nextInt();
		
		int arr1[][] = new int[row1][col1];
		
		System.out.println("Enter the 2nd array ele");
		for (int i=0;i<row1;i++)
		{
			for ( int j=0;j<col1;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		boolean val = false;
		
		for (int i=0;i<row1;i++)
		{
			
			for ( int j=0;j<col1;j++)
			{
				if ( arr[i][j] != arr1[i][j])
				{
					val = true;
					break;
				}
			}
		}
		
		if (val)
		{
			System.out.println("matrix are not equals");
		}
		else
		{
			System.out.println("matrix are equals");
		}
		
		
	}
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.checkMatriceEqualsOrNot();
	}

}
