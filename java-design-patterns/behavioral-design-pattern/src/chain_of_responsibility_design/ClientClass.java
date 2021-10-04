package chain_of_responsibility_design;

import java.util.Scanner;

import chain_of_responsibility_design.chein.Currency;
import chain_of_responsibility_design.impl.ATMMachineDispenseChain;

public class ClientClass {
	public static void main(String[] args) {

		ATMMachineDispenseChain atmMachineDispenseChain = new ATMMachineDispenseChain();

		Scanner sc = null;
		while (true) {
			int ammount = 0;
			try {
				sc = new Scanner(System.in);
				System.out.println("Please enter amount of despense: ");
				ammount = sc.nextInt();
				if (ammount % 100 != 0) {
					System.err.println("ammount should be in multiple of 100");
					break;
				} else {
					atmMachineDispenseChain.getChain().dispense(new Currency(ammount));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		sc.close();
		
	}
}
