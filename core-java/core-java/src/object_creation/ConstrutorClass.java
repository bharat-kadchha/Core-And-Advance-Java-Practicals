package objectcreation;

import java.lang.reflect.Constructor;

public class ConstrutorClass {

	ConstrutorClass() {

	}

	String msg = "object created..";

	public static void main(String[] args) {

		try {
			Constructor<ConstrutorClass> class1 = ConstrutorClass.class.getDeclaredConstructor();
			ConstrutorClass obj = class1.newInstance();

			System.out.println(obj.msg);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
