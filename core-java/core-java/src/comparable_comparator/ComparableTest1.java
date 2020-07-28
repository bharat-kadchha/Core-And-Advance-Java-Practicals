package comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableTest1 {

	
	public static void main(String[] args) {
		
		
		List<Integer> number =new ArrayList<>();
		
		number.add(20);
		number.add(8);
		number.add(12);
		
		//here Integer Classes of java library are implement comparable interface.
		Collections.sort(number);
		System.out.println(number);
	}
	
}
