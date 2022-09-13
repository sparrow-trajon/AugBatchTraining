package multithreading;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * MultiThreadTest multiThreadTest= new MultiThreadTest();
		 * 
		 * MultiThreadTest multiThreadTest2= new MultiThreadTest();
		 * 
		 * multiThreadTest.start(); multiThreadTest2.start();
		 */
		for(int i=0;i<10;i++) {
			MultiThreadTest multiThreadTest= new MultiThreadTest();
			multiThreadTest.start();
		}
	}
}
