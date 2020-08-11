package extra;

class Demo1
{
	private Demo1()
	{
		
	}
	static Demo1 get()
	{		
		return new Demo1();
	}
	void print()
	{
		System.out.println("print");
	}
}

public class Boxing {
	public static void main(String[] args) {

		
		Demo1 d=Demo1.get();
		d.print();
		
		Integer in =20,out = 200;//both value is different
		System.out.println(in == out);
		
		Integer x = 30,y = 30; //refer same object
		System.out.println(x == y);
		
		
		
		
		
}
}
