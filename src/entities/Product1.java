package entities;

public class Product1 {
	
	public String name;
	public Double price;
	public Integer quantity;
	
	public Product1() {
		
	}
	
	public Product1(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity =  quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ " 
			+ String.format("%.2f", price)
			+ ", " 
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
