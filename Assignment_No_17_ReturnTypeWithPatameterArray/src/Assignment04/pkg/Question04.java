package Assignment04.pkg;


/* Q4.Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side.
*/
public class Question04 {
	
	int leaders(int arr[])
	{
		int lead = 0;
		for (int i=1;i<arr.length;i++)
		{
			if (lead < arr[i])
			{
				lead = arr[i];
			}
		}
		
		return lead;
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		int arr[] = {1,2,3,432,45,6777,745,9};
		int num = obj.leaders(arr);
		
		System.out.println("greater number is: "+num);
		
		}
	}


