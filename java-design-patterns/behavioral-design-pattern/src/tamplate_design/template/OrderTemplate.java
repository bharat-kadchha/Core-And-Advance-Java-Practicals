package tamplate_design.template;


public abstract class OrderTemplate {

	//this method never override.its a order of execution.no one can change it.
	public final void prepareOrder() {
	
		selectItem();
		addToCart();
		makePayment();
		packaging();
		shipping();
		delivery();
	}
	
	public abstract void selectItem();
	public abstract void addToCart();
	public abstract void makePayment();
	public  void packaging() {
		System.out.println("your product will packaged in 20 minutes..");
	}
	public  void shipping() {
		System.out.println("your product will ship in 2 days..");

	}
	//subclass cant override.
	public final  void delivery() {
		System.out.println("your product will be delivered in 3 days..");

	}
	

	
	
	
}
