package String;

//17. Validate a date format (e.g., "12-05-2023") by splitting and checking the values.  

public class Question17 {
	
	String str ="12-05-2023";
	
	void dateMothYear()
	{
		String s[] = str.split("-");
		
		int date = Integer.parseInt(s[0]);
		int month = Integer.parseInt(s[1]);
		int year = Integer.parseInt(s[2]);
		
		
		if (date >= 1 && date <= 31) 
		{
            System.out.println("Date: " + date);
        } 
		else {
            System.out.println("Invalid date");
        }

        if (month >= 1 && month <= 12) 
        {
            System.out.println("Month: " + month);
        } 
        else {
            System.out.println("Invalid month");
        }

       
        if (year >= 1900 && year <= 2025) 
        {
            System.out.println("Year: " + year);
        } 
        else {
            System.out.println("Invalid year");
        }
		
		
		
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		obj.dateMothYear();
		
	}

}
