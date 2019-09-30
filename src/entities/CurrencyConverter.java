package entities;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double valueToPaid(double dollarPrice, double amount) {
		return (dollarPrice * amount) + ((dollarPrice * amount) * IOF / 100); 
	}
}
