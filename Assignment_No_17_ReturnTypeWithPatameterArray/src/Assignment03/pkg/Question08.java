package Assignment03.pkg;

/*
 Q8. WAP input 10 name and print with index
    Index       name
 */

public class Question08 {
	
	void namePrint(String name[])
	{
		System.out.println("index  Name" );
		for (int i=0;i<name.length;i++)
		{
			System.out.println(i+" "+name[i]);
		}
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		String name[] = {"ganesh","pandurang","ravi","aarati","rushi","nanu","ajay","sumit","laxmi","kundlik"};
		obj.namePrint(name);
		
	}

}
