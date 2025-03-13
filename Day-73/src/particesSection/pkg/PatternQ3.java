package particesSection.pkg;

import java.util.Scanner;

public class PatternQ3 {

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        int[] g = new int[n];

	        for (int i = 0; i < n; i++) 
	        {
	            g[i] = sc.nextInt();
	        }

	        int b = 1; 
	        int cc = 0; 

	        for (int i = 0; i < n; i++) 
	        {
	            if (cc + g[i] <= m)
	            {
	                cc += g[i];
	            }
	            else
	            {
	                b++;      
	                cc = g[i];
	            }
	        }

	        System.out.println(b); 
	       
	    }

}
