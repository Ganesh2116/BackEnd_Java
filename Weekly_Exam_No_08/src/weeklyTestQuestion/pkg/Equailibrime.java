package weeklyTestQuestion.pkg;

public class Equailibrime {
	
	void equal()
	{
		int arr[] = {1,3,5,8};
		
		for (int i=0;i<arr.length;i++)
		{
			int lsum=0; int rsum=0;
			
			for (int j=0;j<i;j++)
			{
				arr[j]+=lsum;
				
			}
			for (int j=i+1;j<arr.length;j++)
			{
				arr[j]+=lsum;
				
			}
			
			if (lsum == rsum)
			{
				System.out.println("this is Equailibrime element  "+arr[i]);
				System.out.println("this is Equailibrime index  "+i);
				System.out.println("this is Equailibrime position is "+(i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		Equailibrime obj = new Equailibrime();
		obj.equal();
	}

}
