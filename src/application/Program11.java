package application;

import java.util.ArrayList;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		for (String s: list) {
			System.out.println(s);
		}
		
		System.out.println(list.size());
		System.out.println(list.indexOf("Alex"));
	}

}
