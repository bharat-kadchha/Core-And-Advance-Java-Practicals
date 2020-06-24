package array;

public class ArrayClassName {

	public static void main(String[] args) {

		int value[] = { 12, 34, 32 };

		Class<? extends int[]> class1 = value.getClass();
		String name = class1.getName();
		System.out.println(name);

		float f[] = { 13, 21, 34 };
		Class<? extends float[]> class2 = f.getClass();
		String name2 = class2.getName();
		System.out.println(name2);
	}
}
