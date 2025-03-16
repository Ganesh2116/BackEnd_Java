package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// Q21. Wap enter a string and print all duplicate character.


public class Question21 {
	
	void printAllDuplicateEle(String str)
	{
		int[] count = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            
        }

        System.out.print("Duplicate characters: ");
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.print((char) i + " ");
            }
        }
	}
	
	public static void main(String[] args) {
		Question21 obj = new Question21();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
		
		obj.printAllDuplicateEle(str);
	}

}
