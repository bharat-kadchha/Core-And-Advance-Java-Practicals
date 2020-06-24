package constructor;

class box {
	float height, width, length;

	float volume() {
		return height * width * length;
	}

}

public class ClassExample {

	public static void main(String[] args) {

		box box1 = new box();
		box1.height = 10;
		box1.width = 10.2f;
		box1.length = 12;

		System.out.println("volume=" + box1.volume());

	}

}
