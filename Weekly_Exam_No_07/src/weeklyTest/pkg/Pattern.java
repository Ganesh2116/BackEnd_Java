package weeklyTest.pkg;
/*
 *****
*1*2*
*3*4*
*5*6*
*****
 */
public class Pattern {
public static void main(String[] args) {
	int x =1;
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=5;j++)
		{
			if (i == 1 || i ==5)
			{
				System.out.print("*");
			}
			else
			{
				if (j%2 == 0)
				{
					System.out.print("*"+x);
					x++;
				}
				else if (j== 5)
				{
				System.out.print("*");	
				}
			}
		}
		System.out.println();
	}
}
}
