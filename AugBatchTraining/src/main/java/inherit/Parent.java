package inherit;

public class Parent {
	
	public int netWorth=10;
	
	public int  displayNetWorth() {
		
		System.out.println("Net Worth is :->>"+ netWorth);
		
		return netWorth;
	}
	
	private void hiddenProperty() {
		System.out.println(" Billions $ in swiss bank");
	}

}
