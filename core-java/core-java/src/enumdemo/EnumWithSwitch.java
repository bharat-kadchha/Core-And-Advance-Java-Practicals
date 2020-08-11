package enumaration;

enum Day {
	MON, THS, WED, TUS, FRD, STU, SUN
}

public class EnumWithSwitch {

	public static void main(String[] args) {

		Day day = Day.MON;
		switch (day) {
		case MON:
			System.out.println("monday");
			break;
		case THS:
			System.out.println("thusday");
			break;
		case WED:
			System.out.println("webnesday");
			break;
		case TUS:
			System.out.println("tuesday");
			break;

		case FRD:
			System.out.println("friday");
			break;
		case STU:
		case SUN:
			System.out.println("holiday");
			break;
		default:
			break;
		}
	}
}
