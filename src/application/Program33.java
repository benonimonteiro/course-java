package application;

import java.io.File;

public class Program33 {

	public static void main(String[] args) {

		File path = new File("b:\\eclipse");

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		for (File f: folders) {
			System.out.println(f);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File f: files) {
			System.out.println(f);
		}
		
		boolean b = new File("b:\\eclipse\\subdir").mkdir();
		System.out.println("subdir created: " + b);
	}

}
