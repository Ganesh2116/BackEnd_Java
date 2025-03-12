package StringQ.pkg;

//. 7. Implement a Java program where an array of full names is shortened to initials using StringBuffer and OOP concepts.  


public class Question07 {
	
	void fullName(String str[])
	{
		StringBuffer fullName = new StringBuffer();
		
		for ( int i=0;i<str.length;i++)
		{
			fullName.append(str[i]+" ");
		}
		
		System.out.println("Now StingBuffer is :"+fullName);
	}
	
	public static void main(String[] args) {
		String name[] = {"ganesh","kundlik","bharti"};
		Question07 obj = new Question07();
		obj.fullName(name);
		
	}

}
