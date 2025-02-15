package weeklyTest.pkg;

/*
 5. Create a class Counter with a static variable count that increments 
 whenever an object is created. Display the value of count after creating multiple objects.  
 */

class Counter 
{
	static int count = 0;
	
	Counter()
	{
		count ++;
		System.out.println("increments "+count);
	}
}
public class Question05 {
	public static void main(String[] args) {
		Counter obj = new Counter();
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		
	}

}
