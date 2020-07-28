package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest2 {

	
	public static void main(String[] args) {
		
		
		List<Student> students =new ArrayList<>();
		
		students.add(new Student("Bharat", 11, 9));
		students.add(new Student("jemin",10,4));
		students.add(new Student("akash",12,8));
		
		
		//we haven't specific parameter for the sorting. sort method takes those class which implement comparable.
		//and Student class haven't implementation of Comparable interface.so we have to implement comparable.
		Collections.sort(students);
		for(Student std :students)
		{
			System.out.println(std);
		}
	}
	
}
