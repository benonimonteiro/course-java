package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i +" data: ");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();
			
			if (resp == 'i') {
				System.out.print("Health spending: ");
				Double healthSpending = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthSpending));
				
			} else if (resp == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double totalTaxesPaid = 0.0;
		
		for (TaxPayer taxpayer: list) {						
			System.out.println(taxpayer);
			totalTaxesPaid += taxpayer.taxesToPaid();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxesPaid));
		
		sc.close();
	}

}
