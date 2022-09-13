package multithreading;

public class MultiThreadTest extends Thread{

	@Override
	public void run() {
		super.run();
		
		try {
			System.out.println("Printing from thread "+ Thread.currentThread().getId());

		}
		catch (Exception e) {
		System.out.println("Exception is handled..!!");
		}
	}
}

