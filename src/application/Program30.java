package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program30 {

	public static void main(String[] args) {

		File file = new File("b:\\eclipse\\file.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String s = br.readLine();
			
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
