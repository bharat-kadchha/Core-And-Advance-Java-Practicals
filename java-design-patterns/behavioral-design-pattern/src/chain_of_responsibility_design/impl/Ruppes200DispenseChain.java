package chain_of_responsibility_design.impl;

import chain_of_responsibility_design.chein.Currency;
import chain_of_responsibility_design.chein.MoneyDispenseChain;

public class Ruppes200DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;

	@Override
	public void setNextChain(MoneyDispenseChain chain) {
		this.moneyDispenseChain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmmount()>=200) {
			int numberOfNotes = currency.getAmmount()/200;
			int remainder = currency.getAmmount()%200;
			System.out.println("Dispensing " + numberOfNotes + " notes of Rs 200");
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
