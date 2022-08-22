package abst;

public interface ATM {
	
	public int withdrawMoney(int amount);
	boolean depodit(int money);
	
	/**
	 * Each and every method inside is by default 
	 * public 
	 * abstract
	 * 
	 * public abstract boolean deposit();
	 * 
	 */

}
