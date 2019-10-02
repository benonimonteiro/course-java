package entities;

public class Individual extends TaxPayer {
	
	private Double healthSpending;
		
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}
	
	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public Double taxesToPaid() {
		if (getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15 - healthSpending * 0.5;			
		} else {
			return getAnnualIncome() * 0.25 - healthSpending * 0.5;
		}
	}
	
	@Override
	public String toString() {
		return super.getName()
				+ ": $"
				+ String.format("%.2f", taxesToPaid());
	}
}
