package construtors;

public class Animal {

	String name;
	String foodHabbit;

	Animal(String nm, String food) {
		this(100);
		name=nm;
		foodHabbit=food;
		
		System.out.println("Constructor is invoked..!!");
	}
	
	Animal(int num){
		
		System.out.println("Constructor is invoked with num"+ num);
	}

	/**
	 * Main method is the first entry poin in any java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main method is started..!");
		
		Animal animal = new Animal("lion","carni"); // created the object

		System.out.println(animal);

		System.out.println("Main method is executed..!!");
		
		Animal animal2= new Animal("Human", "anything");
		
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", foodHabbit=" + foodHabbit + "]";
	}

}
