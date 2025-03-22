package WeeklyQuestions.pkg;

import java.util.Scanner;

//Q.9. Write a Java program to find the transpose of a given matrix.


public class Question09 {
	
	void transpose()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int row = sc.nextInt();
		
		System.out.println("Enter the row size ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter the array ele");
		for (int i=0;i<row;i++)
		{
			for ( int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Transpose is :");
		for ( int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		obj.transpose();
	}

}
