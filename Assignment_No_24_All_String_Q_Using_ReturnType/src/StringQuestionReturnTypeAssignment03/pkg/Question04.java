package StringQuestionReturnTypeAssignment03.pkg;


// Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word.


public class Question04 {
	
	
	void accendingDecendingOrder(String str) {
        String words[] = str.split(" ");
        
       
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i+1; j < words.length; j++) 
            {
                if (words[i].length() > words[j].length()) 
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
       
        System.out.println("Accending order :");
        for (int i = 0; i < words.length; i++) 
        {
            System.out.print(words[i]+" ");
        }
        
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i+1; j < words.length; j++) 
            {
                if (words[i].length() < words[j].length()) 
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
       
        System.out.println("\nDecending order :");
        for (int i = 0; i < words.length; i++) 
        {
            System.out.print(words[i]+" ");
        }
        }
	
	
	 public static void main(String[] args) {
	        Question04 obj = new Question04();
	        obj.accendingDecendingOrder("this is java program learn string and array");
	    }

}
