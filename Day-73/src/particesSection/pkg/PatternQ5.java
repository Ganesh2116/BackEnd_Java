package particesSection.pkg;

import java.util.Scanner;


public class PatternQ5 {
    
    private static boolean checkUpperTriangularMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { 
                if (matrix[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

    
        boolean isUpperTriangular = checkUpperTriangularMatrix(matrix, n);

   
        if (isUpperTriangular) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Non-upper triangular matrix");
        }

      
    }
}

