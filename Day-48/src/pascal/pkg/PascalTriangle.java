package pascal.pkg;

public class PascalTriangle {

	void trianglePyr()
	{
	int row = 5;
	
		for(int i=0;i<row;i++)
		{
			int num= 1;

			for(int j=0;j<row -i;j++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" "); 
				num = num*(i-j)/(j+1);
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		pt.trianglePyr();
	}
		

}
