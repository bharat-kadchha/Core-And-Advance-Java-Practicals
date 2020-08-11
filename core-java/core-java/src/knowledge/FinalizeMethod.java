package extra;

public class FinalizeMethod {

	public static void main(String[] args) {
		System.out.println("main runing...");
		FinalClass class1 =new FinalClass();
		System.out.println(class1.hashCode());
		class1=null;
		System.gc();
		System.out.println("end program.");
		
	}
	@Override
	protected void finalize() {
		System.out.println("cleaning ..");
	}
	
}
