package interfaceImpl;

import abst.ATM;
import abst.Bank;

public class Tester {
	
	public static void main(String[] args) {
		// We can not create any oject of the  interface, rather we can create object of the class which is implementing the interface.
		/*
		 * ATMImpl atmImpl= new ATMImpl();
		 * 
		 * ATM a= new ATMImpl();
		 * 
		 * a.depodit(100);
		 * 
		 * a.withdrawMoney(50);
		 */
		
		
		Bank bank= new Bank();
		
		 bank.getTotoalCapital();
		 
		
	}

}
