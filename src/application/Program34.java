package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product1;

public class Program34 {

	public static void main(String[] args) {

		File inFile = new File("b:\\eclipse\\products.csv");
		String inFolder = inFile.getParent();
		String outFolder = inFolder + "\\out";
		boolean outFolderCreated = new File(outFolder).mkdir();
		File outFile = null;
		
		if (outFolderCreated) {
			outFile = new File(outFolder + "\\summary.csv");
		} else {
			System.out.println("Error creating output");
		}
		
		List<Product1> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				Product1 product = new Product1(name, price, quantity);
				list.add(product);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
			
			for (Product1 p: list) {
				bw.write(p.name + "," + String.format("%.2f", p.totalValueInStock()));
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
