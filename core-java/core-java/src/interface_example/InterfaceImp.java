package interfaceExample;

interface ParentInterface {

	public void show();// public and abstract

}

public class InterfaceImp implements ParentInterface {

	public void show() {
		System.out.println("interface is implimented");
	}

	public static void main(String[] args) {

		InterfaceImp i1 = new InterfaceImp();
		i1.show();
	}

}
