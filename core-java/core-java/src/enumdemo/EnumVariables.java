package enumaration;

enum Vegetable
{
	TOMATO(100),POTATO(200),ONION;
	int price;
	Vegetable()
	{
		this.price =300;//this for TO constant;
	}
	
	Vegetable(int price)
	{
		this.price = price;
	}
	public int getValue()
	{
		return price;
	}
}
public class EnumVariables {
public static void main(String[] args) {
	
	//we can't like Beer b =new Beer(100);
	Vegetable[] vegetable = Vegetable.values();
	for(Vegetable v : vegetable)
	{
		System.out.println(v.name()+"-"+v.getValue());
	}
	
}
}
