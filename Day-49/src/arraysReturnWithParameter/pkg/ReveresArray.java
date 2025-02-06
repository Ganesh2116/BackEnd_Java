package arraysReturnWithParameter.pkg;

public class ReveresArray {
	
	int [] rev(int a[])
	{
		int c[] = new int[a.length];
		int x =0;
		for(int i = a.length-1;i>=0;i--)
		{
			c[x] = a[i];
			x++;
		}
			
		return c;
	}
	
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		ReveresArray obj = new ReveresArray();
		int arr[] = obj.rev(num);
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
