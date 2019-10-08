package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program31 {

	public static void main(String[] args) {
		
		File file = new File("b:\\eclipse\\file.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String s;
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
