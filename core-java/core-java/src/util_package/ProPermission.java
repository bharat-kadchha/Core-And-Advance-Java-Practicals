package utilPackageExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.PropertyPermission;

public class ProPermission {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("src/java_util_string/prop.properties");
		Properties properties = new Properties();

		properties.load(is);

		System.out.println(properties.get("os.name"));

		PropertyPermission propermission = new PropertyPermission("user.pass", "read");

		System.out.println(propermission.getName() + " has " + propermission.getActions() + " permission");

	}

}
