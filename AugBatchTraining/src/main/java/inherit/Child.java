package inherit;

public class Child extends Parent {
	
	int capital=20;
	
	public void totalWorth(){
		
		System.out.println("Total worth :->"+ capital);
		
	}
	
	
	public static void main(String[] args) {
		
		Child child= new Child();
		
		child.totalWorth();
		
		child.displayNetWorth();
		
		// Aggregation and composition and generalization ?
		
		child.hiddenProperty();
		
	}
}
