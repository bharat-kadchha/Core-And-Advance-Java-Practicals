package enumaration;

public class EnumComparation {

	public static void main(String[] args) {
		
		System.out.println(Beer.KF.equals(Beer.KO));
		
		System.out.println(Beer.KF == Beer.RC);
		
		System.out.println(Beer.KF.hashCode() == Beer.RC.hashCode());
		
		System.out.println(Beer.RC.ordinal() > Beer.KF.ordinal());
	}
}
