package String_2.pkg;

import java.util.Scanner;

// Q8.Wap enter a string and print most repeated character in string.


public class Question08 {
	
	
	 static char getMostRepeatedCharacter(String str) {
	        if (str.isEmpty()) return '\0'; 

	        int[] freq = new int[256];
	        char mostRepeated = '\0';
	        int maxCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            freq[ch]++; 

	            
	            if (freq[ch] > maxCount) {
	                maxCount = freq[ch];
	                mostRepeated = ch;
	            }
	        }

	        return mostRepeated;
	    }
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	       
	        char mostRepeatedChar = getMostRepeatedCharacter(str);

	        if (mostRepeatedChar != '\0') {
	            System.out.println("Most repeated character: " + mostRepeatedChar);
	        } else {
	            System.out.println("No repeating character found.");
	        }
	    }
}
