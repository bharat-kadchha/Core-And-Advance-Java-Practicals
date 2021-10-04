package tamplate_design.template;

public class ClothesOrder extends OrderTemplate {

	@Override
	public void selectItem() {
		System.out.println("i want to buy 2 Shirts.");
	}

	@Override
	public void addToCart() {
		System.out.println("i added shirts into Cart.");

	}

	@Override
	public void makePayment() {
		System.out.println("i choose Case On Delivery option.");
	}

}
