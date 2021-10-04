package chain_of_responsibility_design.impl;

import chain_of_responsibility_design.chein.Currency;
import chain_of_responsibility_design.chein.MoneyDispenseChain;

public class Ruppes2000DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;

	@Override
	public void setNextChain(MoneyDispenseChain chain) {
		this.moneyDispenseChain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmmount()>=2000) {
			int numberOfNotes = currency.getAmmount()/2000;
			int remainder = currency.getAmmount()%2000;
			System.out.println("Dispensing " + numberOfNotes + " notes of Rs 2000");
			if(remainder!=0) {
				moneyDispenseChain.dispense(new Currency(remainder));
			}
		}
		else {
			//forward request to next processor
			moneyDispenseChain.dispense(currency);
		}
	}

}
