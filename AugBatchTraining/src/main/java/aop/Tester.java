package aop;

public class Tester {

	
	public static void main(String[] args) {
		
		Car car;
		String company="mahindra";
		car=CarFactory.getCarManuf(company);
		
		car.manuCar();
		
		
	}
}
