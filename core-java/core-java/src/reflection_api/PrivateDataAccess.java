package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateDataAccess {
	public static void main(String[] args) {

		try {
			Class<PrivateMethodDemo> myClass = PrivateMethodDemo.class;

			Object myobj = myClass.newInstance();

			Method myMethod = myClass.getDeclaredMethod("message", null);
			myMethod.setAccessible(true);
			myMethod.invoke(myobj, null);
		} catch (Exception e) {
		}
	}

}
