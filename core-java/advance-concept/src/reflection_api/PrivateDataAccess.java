package reflection_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateDataAccess {
	public static void main(String[] args) {

		try {
			Class<PrivateMethodExample> myClass = PrivateMethodExample.class;

			Object myobj = myClass.newInstance();

			Method myMethod = myClass.getDeclaredMethod("message", null);
			myMethod.setAccessible(true);
			myMethod.invoke(myobj, null);
		} catch (Exception e) {
		}
	}

}
