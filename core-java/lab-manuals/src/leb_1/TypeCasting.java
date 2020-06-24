package leb_1;

public class TypeCasting {

	public static void main(String[] args) {
		byte byteValue = 10;
		System.out.println("byte value =" + byteValue);
		
		int intValue = byteValue;
		System.out.println("byte to int =" + intValue);
		
		short stringValue = byteValue;
		System.out.println("byte to short =" + stringValue);
		
		int intValue2 = stringValue;
		System.out.println("short to int =" + intValue2);

		int intValue3 = 1234;
		System.out.println("int value =" + intValue3);
		
		float floatValue = intValue3;
		System.out.println("int to float =" + floatValue);

		byteValue = (byte) intValue3;
		System.out.println("int to byte " + byteValue);
		
		stringValue = (short) intValue3;
		System.out.println("int to short " + stringValue);

		floatValue = 12.45f;
		System.out.println("float value " + floatValue);
		
		intValue3 = (int) floatValue;
		System.out.println("float to int " + intValue3);
		
		stringValue = (short) floatValue;
		System.out.println("flaot to short " + stringValue);

	}

}
