package knowledge;

public class StaticAndInstanceBlock {

	int a, b;

	{ // instance block call before constructor called.
		a = 10;
		System.out.println("instance block." + a);

	}
	{ // instance block call before constructor called.
		b = 20;
		System.out.println("instance block." + b);

	}
	static {
		System.out.println("static block.");
	}

	public static void main(String[] args) {

		StaticAndInstanceBlock stb = new StaticAndInstanceBlock();

		// first static block called then instance block.

	}

}
