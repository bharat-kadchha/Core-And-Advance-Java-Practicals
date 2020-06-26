package garbage_collector;

public class DemoClass {
	DemoClass demo;

	public static void main(String[] args) {

	

		DemoClass demo1 = new DemoClass(); // 0
		DemoClass demo2 = new DemoClass(); // 0
		DemoClass demo3 = new DemoClass(); // 0

		demo1.demo = demo2;			 
		demo2.demo = demo3; 			
		demo3.demo = demo1; 			

		// null means remove reference from class and obj eligible for GC

		demo1 = null; 				
		demo2 = null; 				
		demo3 = null; 				 
		
		//and remove all three obj references it is called "nullifying object approach"

	}

}
