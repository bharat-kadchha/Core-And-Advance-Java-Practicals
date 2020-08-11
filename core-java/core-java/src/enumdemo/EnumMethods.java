package enumaration;


enum Name
{


	SURESH,RAMESH,MAHESH ;
}
public class EnumMethods {

	
	public static void main(String[] args) {
		
		System.out.println(Name.valueOf("RAMESH"));
		
		Name[] names =  Name.values();
		
		System.out.println("-------");
		for(Name name : names)
		{
			System.out.println(name+" = "+name.ordinal());
		}
		System.out.println("-------");
		
	
	}
}
