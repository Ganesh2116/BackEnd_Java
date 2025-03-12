package StringQ.pkg;

// 8. Create a class that takes an array of strings and removes duplicate words using StringBuffer and OOP principles.  


public class Question08 {
	
	void removeDuplicate(String str[]) {
        StringBuffer str1 = new StringBuffer();

        for (int i = 0; i < str.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (str[i].equals(str[j])) { 
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                str1.append(str[i]).append(" ");
            }
        }

        System.out.println("String without duplicates: " + str1.toString().trim());
    }

	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		String str[] = {"java" , "program","is","java","most","populer","programming","is"};
		obj.removeDuplicate(str);
		
	}

}
