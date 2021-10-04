package tamplate_design;

import tamplate_design.template.ClothesOrder;
import tamplate_design.template.OrderTemplate;

public class ClientClass {

	public static void main(String[] args) {
		
		OrderTemplate orderTemplate = new ClothesOrder();
		orderTemplate.prepareOrder();
	}
}
