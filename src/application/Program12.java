package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee2(id, name, salary));
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increased: ");
		int id = sc.nextInt();
		
		int employeeIndex = -1;
		
		for (Employee2 employee: list) {
			if (employee.getId() == id) {
				employeeIndex = list.indexOf(employee);
				break;
			}			
		}
		
		if (employeeIndex != -1) {
			System.out.print("Enter percentage: ");
			double percentage = sc.nextDouble();
			list.get(employeeIndex).increaseSalary(percentage);
			
		} else {
			System.out.println("This id does not exist!");
		}
		
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee2 employee: list) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
