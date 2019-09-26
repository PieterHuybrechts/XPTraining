package replacetempwithquery;

public class ProductPrice {

	private double quantity;
	private double itemPrice;

	public ProductPrice(double quantity, double itemPrice) {
		super();
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	double getPrice() {
		double basePrice = quantity * itemPrice;
		double discountFactor;
		if (basePrice > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return basePrice * discountFactor;
	}

}
