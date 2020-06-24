package knowledge;

//There may be times when you want to restrict the types that can be used as type argument.
class Calculate<T extends Number> {
	T[] n1;

	public Calculate(T[] n0) {
		this.n1 = n0;
	}

	double avg() {

		double sum = 0.0;
		for (int i = 0; i < n1.length; i++) {
			sum += n1[i].doubleValue();
		}
		return sum / n1.length;
	}
}

public class BoundTypeParameter {

	public static void main(String[] args) {

		Integer[] n1 = { 123, 543, 113, 5, 66, 134 };

		Calculate<Number> cal = new Calculate<Number>(n1);
		System.out.println(cal.avg());

	}
}
