package reflection_api;

public class NewInstanceDemo {
	public static void main(String[] args) {
		try {
			Class<Sample> c = Sample.class;

			Sample s = (Sample) c.newInstance();

			s.put();

		} catch (Exception e) {
		}
	}

}
