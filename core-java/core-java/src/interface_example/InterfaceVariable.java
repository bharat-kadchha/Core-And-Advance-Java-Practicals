package interfaceExample;

interface FristInterface {
	int x = 100; // every variable public,static,final
}

public class InterfaceVariable implements FristInterface{

	public static void main(String[] args) {

		x = 12;// it is not possible but,,
		int x = 12;// it is possible
	}

}
