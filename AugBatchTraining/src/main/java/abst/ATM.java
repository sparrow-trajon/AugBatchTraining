package abst;

public interface ATM {
	
	public int withdrawMoney(int amount);
	boolean depodit(int money);
	
	default void disp() {
		
		System.out.println("Interface default method");
	}
	
	/**
	 * Each and every method inside is by default 
	 * public 
	 * abstract
	 * 
	 * public abstract boolean deposit();
	 * 
	 */

}
