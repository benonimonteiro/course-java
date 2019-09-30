package application;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Number to find: ");
		int number = sc.nextInt();
		
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.printf("%nPosition %d,%d:%n", i, j);
					
					if (j > 0) {
						System.out.printf("Left: %d%n", matrix[i][j-1]);
					}
					
					if (j < m - 1) {
						System.out.printf("Right: %d%n", matrix[i][j+1]);
					}
					
					if (i > 0) {
						System.out.printf("Up: %d%n", matrix[i-1][j]);
					}
					
					if (i < n - 1) {
						System.out.printf("Down: %d%n", matrix[i+1][j]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
