package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {public StreamDemo() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
	    List<Integer> number = Arrays.asList(2,3,4,5,2); 

	    System.out.println(number.stream().anyMatch(r->(r%2==0)));
	    System.out.println(number.stream().allMatch(g->g%1==0));
	    
	    System.out.println(number.stream().collect(Collectors.toList()));
	    System.out.println(number.stream().filter(r->(r%2==0)).collect(Collectors.toList()));
	    System.out.println(number.stream().limit(3).collect(Collectors.toList()));

	    System.out.println(number.stream().map(q->q*2).collect(Collectors.toList()));
	    System.out.println(number.stream().sorted().count());



	}

}
