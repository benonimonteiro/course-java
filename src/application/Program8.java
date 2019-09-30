package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("SUM : %.2f%n", sum);
		System.out.printf("AVERAGE : %.2f", avg);
		
		sc.close();
	}

}
