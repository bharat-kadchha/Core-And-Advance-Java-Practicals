package com.tight_coupling;

class Calculate
{
	
	//here,control of method is depended.
	public void add()
	{
		System.out.println(2+4+6);
	}
	
}
public class AddNumberDependency {

	public static void main(String[] args) {
		
		Calculate cal=new Calculate();
		
		cal.add();
	}
	
}
