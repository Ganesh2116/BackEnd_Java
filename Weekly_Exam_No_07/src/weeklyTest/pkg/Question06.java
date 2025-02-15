package weeklyTest.pkg;

/*
6. Create a final class ImmutableData with a final variable PI = 3.14. Try modifying PI and observe the result.
 Also, try extending ImmutableData in another class.
 */

final class ImmutableData
{
	final double variable = 3.14;
	
	void pi()
	{
		System.out.println("PI vlaues is "+variable);
		System.out.println("modifying values is "+(variable+1.5));
	}
}

public class Question06 {
	public static void main(String[] args) {
		ImmutableData obj = new ImmutableData();
		obj.pi();
		
		
	}

}
