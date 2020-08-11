package enumaration;

enum Collage  {
	GTU,BHKNMU;
	
	
	//its execute for every separate value.
	private Collage()
	{
		System.out.println("constructor calling..");
	}
	
	
	public void show()
	{
		System.out.println(this.name());
	}
	
	
	
}


public class EnumConstructorAndMethod {
public static void main(String[] args) {
	Collage clg =Collage.GTU;
	System.out.print(clg.ordinal()+" - ");
	clg.show();

}
}
