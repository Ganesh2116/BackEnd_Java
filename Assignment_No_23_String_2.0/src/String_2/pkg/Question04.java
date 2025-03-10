package String_2.pkg;

public class Question04 {
    
    void accendingDecendingOrder(String str) {
        String words[] = str.split(" ");
        
       
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Words sorted by length in ascending order: " + String.join(" ", words));
        
      
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() < words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Words sorted by length in descending order: " + String.join(" ", words));
    }
    
    public static void main(String[] args) {
        Question04 obj = new Question04();
        obj.accendingDecendingOrder("this is java program learn string and array");
    }
}
