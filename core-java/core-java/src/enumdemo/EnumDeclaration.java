package enumaration;


//enum convert in to Class and constant is a object of enum type;
//outside class
enum Company{
	
	
	//every variables are static and final
	//semicolon is optional
	SUZUKI,HUNDAI,TATA
	
}
public class EnumDeclaration {

	//inside class
	 enum Grade{
		A,B,C;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Company.HUNDAI);
		
		System.out.println(Grade.B);
		
	}
	
}
