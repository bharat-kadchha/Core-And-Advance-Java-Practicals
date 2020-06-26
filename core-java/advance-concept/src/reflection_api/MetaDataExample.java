package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MetaDataExample {
	public static void main(String[] args) throws Exception {
		Class<Sample> myClass = Sample.class;

		System.out.println("Fields........");
		
		Field[] fields = myClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++)
			System.out.println(fields[i]);

		System.out.println("Constructors........");
		
		Constructor[] con = myClass.getDeclaredConstructors();
		for (int i = 0; i < con.length; i++)
			System.out.println(con[i]);

		System.out.println("Methods........");
		
		Method[] m = myClass.getDeclaredMethods();
		for (int i = 0; i < m.length; i++)
			System.out.println(m[i]);
	}
}