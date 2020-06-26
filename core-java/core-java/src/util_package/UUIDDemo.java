package util_package;

import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {

		// universally unique identifier

		UUID id = UUID.randomUUID();
		System.out.println(id.getLeastSignificantBits() + "--" + id.getMostSignificantBits());
		System.out.println(id.variant());
		System.out.println(id.version());

		UUID id1 = UUID.fromString("e52232e1-0ded-4587-999f-4dd135a4a94f");
		System.out.println(id1.toString());

	}

}
