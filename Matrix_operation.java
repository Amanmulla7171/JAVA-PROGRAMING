package Experiment_no2;
import java.util.Scanner;

public class Matrix_operation {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];
	        int[][] sum = new int[rows][cols];
	        int[][] diff = new int[rows][cols];

	       
	        System.out.println("Enter elements of Matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix1[i][j] = sc.nextInt();
	            }
	        }

	        
	        System.out.println("Enter elements of Matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix2[i][j] = sc.nextInt();
	            }
	        }

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum[i][j] = matrix1[i][j] + matrix2[i][j];
	                diff[i][j] = matrix1[i][j] - matrix2[i][j];
	            }
	        }

	        
	        System.out.println("\nMatrix 1:");
	        displayMatrix(matrix1);

	        System.out.println("\nMatrix 2:");
	        displayMatrix(matrix2);

	        System.out.println("\nSum of matrices:");
	        displayMatrix(sum);

	        System.out.println("\nDifference of matrices:");
	        displayMatrix(diff);

	        sc.close();
	    }

	
	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + "\t");
	            }
	            System.out.println();
	        }
	    }
	}


