package String;

//10. Split a full name (first, middle, last) and print each part separately

public class Question10 {
	
	void fullNameSplit(String fullName)
	{
		String str[] = fullName.split(" ");
		
		System.out.println("first Name:"+str[0]);
		System.out.println("middle Name:"+str[1]);
		System.out.println("last Name:"+str[2]);
	}

	public static void main(String[] args) {
		Question10 obj = new Question10();
		String str ="ganesh kundlik bharti";
		obj.fullNameSplit(str);
		
	}
}
