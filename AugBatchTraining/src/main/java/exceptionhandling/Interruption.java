package exceptionhandling;

public class Interruption {

	public static void main(String[] args) {

		// System.out.println(10/0);
		System.out.println("First liine");
		System.out.println("Second liine");
		System.out.println("Third liine");
		System.out.println("Fifth liine");

		m1();

		System.out.println("main executed.");
	}

	private static void m1() {
		// TODO Auto-generated method stub

		m2();

		System.out.println("m1 executed");
	}

	private static void m2() {
		// TODO Auto-generated method stub
		try {
		m3();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("exception is handled");
		}

		System.out.println("M2 executed");
	}

	private static void m3() throws Exception{

		throw new MyOwnException();
		
	}

}
