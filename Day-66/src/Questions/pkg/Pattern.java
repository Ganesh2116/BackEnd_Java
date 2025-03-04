package Questions.pkg;

/*
 1        5
 1 2   4  5
 1 2 3 4  5
 */

public class Pattern {
    public static void main(String[] args) {
    	
    	int x = 4;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            for (int j=i;j<=3;j++)
            {
            	if (j == 3)
            	{
            		continue;
            	}
            	else
            	{
            		System.out.print("  ");
            	}
            	
            }
            

            for (int j = 1;j<=i;j++)
            {
            	if (i == 3 && j == 1)
            	{
            		continue;
            	}
            	else
            	{
            		System.out.print(x+j+" ");
            		
            	}
            }
            x--;
 
            System.out.println();
        }
    }
}
