package chain_of_responsibility_design.impl;

import chain_of_responsibility_design.chein.MoneyDispenseChain;

 //here,we are taking very good example of ATMDispenseMoney for the rupees of 2000,500,200,100;

public class ATMMachineDispenseChain {

	private MoneyDispenseChain chain;
	
	public ATMMachineDispenseChain() {
		this.chain = new Ruppes2000DispenseChain();
		MoneyDispenseChain chain2 = new Ruppes500DispenseChain();
		MoneyDispenseChain chain3 = new Ruppes200DispenseChain();
		MoneyDispenseChain chain4 = new Ruppes100DispenseChain();

		chain.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
	}

	public MoneyDispenseChain getChain() {
		return chain;
	}
	
	
}
