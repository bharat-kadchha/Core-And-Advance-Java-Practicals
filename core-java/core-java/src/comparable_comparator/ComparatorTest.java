package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		

		List<Laptop> laptops =new ArrayList<>();
		
		laptops.add(new Laptop("sony",4, 45000));
		laptops.add(new Laptop("dell",4,35000));
		laptops.add(new Laptop("hp",8,36000));
		
	
		Comparator<Laptop> comparator= new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop l1, Laptop l2) {
				
				if(l1.getPrize() < l2.getPrize())
					return 1;
				else
					return -1;
			}
		};
		
		//if you use third party library then you can't implement comparable bcz its a class file not source file.
		//1 specifies login in sort method if class is not implement comparable
		//2 changes the sorting parameter
		Collections.sort(laptops,comparator);
		System.out.println(laptops);
		
		
	}
}
