package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus;

public class Program20 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");		
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("E-mail: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirth = sc.nextLine();
		Client client = new Client(clientName, clientEmail, sdf.parse(clientBirth));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(0, new Date(), OrderStatus.valueOf(orderStatus), client);
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product2 product = new Product2(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productQuantity * productPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println(order);
				
		sc.close();
	}

}
