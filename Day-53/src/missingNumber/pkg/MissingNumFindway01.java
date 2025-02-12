package missingNumber.pkg;

class MissingNumberArray
{
	void number()
	{
		int[] a = {1,2,4,5,3,7,8,9,10,11,12,13}; // 8
	    
		int n = a.length + 1;   

	    int totalSum = (n * (n + 1)) / 2; 
	    
	    
	    
	    System.out.println(totalSum);
	    
	    
	    int arraySum = 0;
	    
	    for (int i=0;i<a.length;i++) 
	    {
	        arraySum =arraySum+ a[i];
	    }
	    
	    System.out.println(arraySum);// 18
	    
	    int missingNumber = totalSum - arraySum; 

	    System.out.println("The missing number is: " + missingNumber);
	}
	
}

public class MissingNumFindway01 {
	public static void main(String[] args) {
		MissingNumberArray obj = new MissingNumberArray();
		obj.number();
	}

}
