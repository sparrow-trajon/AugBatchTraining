package staticflow;

public class Student {
	
	String name;
	String schoolName;
	String hobbies;
	
	static {
		System.out.println("Executed before the main method..!!");
	}
	
	public Student(String nme, String sName) {
	
		name=nme;
		schoolName=sName;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Running main method.!");
		
		Student rupa= new Student("rupaVati", "DPS"); // created object 
		rupa.hobbies="reading";
		System.out.println("Rupa Name:-"+rupa.name);
		System.out.println("Rupa SchoolName :-"+rupa.schoolName);
		System.out.println("Rupa Hobbies :-"+rupa.hobbies);
		
		Student bhargav= new Student("bhargav v", "MVN");
		System.out.println("bhargav Name:-"+bhargav.name);
		System.out.println("bhargav SchoolName :-"+bhargav.schoolName);
		System.out.println("bhargav Hobbies :-"+bhargav.hobbies);
		
	}
}
