package application;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
			
		}
		
		int count = 0;
		
		System.out.println();
		System.out.println("Maint diagonal:");
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
				
				if (matrix[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.print("Negative numbers = " + count);
		
		sc.close();
		
	}

}
