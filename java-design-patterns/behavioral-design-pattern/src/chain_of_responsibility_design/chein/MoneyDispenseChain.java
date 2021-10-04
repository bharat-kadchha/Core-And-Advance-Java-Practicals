package chain_of_responsibility_design.chein;

public interface MoneyDispenseChain {

	void setNextChain(MoneyDispenseChain chain);

	void dispense(Currency currency);
}
