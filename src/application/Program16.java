package application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program16 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
		
		System.out.println(sdf.format(d));

		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println(sdf.format(c.getTime()));
		
		c.add(Calendar.HOUR_OF_DAY, 4);
		System.out.println(sdf.format(c.getTime()));
		
		int minutes = c.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		
		int month = 1 + c.get(Calendar.MONTH);
		System.out.println("Month: " + month);
	}

}
