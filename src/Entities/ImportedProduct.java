package Entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct () {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice(Double price) {
		return price + customsFee;
		
		
	}
	@Override
	public void setPrice(Double price) {
		this.price = price + customsFee; 
	}
	
	@Override
	public String priceTag() {
		return name +" " + "$" + " " + price + " " + "(Customs fee: $ " + customsFee + ")";
	}
	 
}
