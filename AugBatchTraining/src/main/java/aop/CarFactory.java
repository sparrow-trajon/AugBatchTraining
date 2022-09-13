package aop;

public class CarFactory {
	
	public static Car getCarManuf(String carCompany){
		
		if(carCompany.equalsIgnoreCase("Tata")) {
			return new Tata();
		}
		else {
			return new Mahindra();
			
		}
		
	}
}
