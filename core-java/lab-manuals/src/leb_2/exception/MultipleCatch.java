package leb_2.exception;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			int v = 1 / 0;
			System.out.println("v=" + v);
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		} 
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("final block always execute");
		}
	}
}
