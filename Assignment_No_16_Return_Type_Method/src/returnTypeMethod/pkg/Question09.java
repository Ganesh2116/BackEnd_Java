package returnTypeMethod.pkg;

// Write a method to find the greatest of three numbers.

public class Question09 {
    
    String greatestNum(int num, int num1, int num2) {
        if (num > num1 && num > num2) 
        {
            return "1st number is the greatest.";
        } 
        else if (num1 > num && num1 > num2) 
        {
            return "2nd number is the greatest.";
        }
        else if (num2 > num && num2 > num1) 
        {
            return "3rd number is the greatest.";
        }
        else
        {
            return "There is a tie between two or more numbers.";
        }
    }
    
    public static void main(String[] args) {
        Question09 obj = new Question09();
        String result = obj.greatestNum(12, 15, 25);
        
        System.out.println(result);
    }
}

