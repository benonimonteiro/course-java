package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program32 {

	public static void main(String[] args) {

		String[] str = new String[] {"one", "two", "three"};
		File file = new File("b:\\eclipse\\output.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			
			for (String s: str) {
				bw.write(s);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
