package polymor;

public class Controller {

	public static void main(String[] args) {

		Parent parent = new Parent();
		 parent.car();

		Child child = new Child();
		child.car();

		Parent c = new Child();
		c.car();

	}

	public static int sum(int a, int b) {

		return a + b;

	}

	public static int sum(int a, int b, int c) {

		return a + b + c;

	}

	public static int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}
