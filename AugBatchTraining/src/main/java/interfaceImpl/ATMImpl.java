package interfaceImpl;

import abst.ATM;

public class ATMImpl implements ATM{

	public int withdrawMoney(int amount) {
		System.out.println(amount+" Rupees are withdrawn..");
		return amount;
	}

	public boolean depodit(int money) {
		
		System.out.println(money+"ruppes have been depositied..!");
		return true;
	}

}
