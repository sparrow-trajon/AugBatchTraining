package operators;


/**
 * We will discuss all the operators in java..
 * 
 * @author Manish
 *
 */
public class Opt {	
	
	/**
	 * Arithmetic operators 
	 * 
	 */
	
	
	 
	 public static void main(String[] args) {
			/*
			 * int x=10; int y=20;
			 * 
			 * System.out.println(x+y); System.out.println(x-y); System.out.println(x*y);
			 * System.out.println(x/y); System.out.println(x%y);
			 */
		 	
			/*
			 * final int x=20; System.out.println(x++ );
			 * 
			 * System.out.println(x);
			 */
		 	
			/*
			 * byte b=100; System.out.println(b++); b=b+1; System.out.println(b);
			 */
		 
		 
		 int a=10;
		  int b=20;
		   String c="Hi";
		   
			/*
			 * System.out.println(a+b+c); System.out.println(a+c+b);
			 * System.out.println(c+b+a); System.out.println(b+c+a);
			 */
		   
			/*
			 * System.out.println(a<b); System.out.println(a>b); System.out.println(a>=b);
			 * System.out.println(a<=b); System.out.println(a==b);
			 */
		  
			/*
			 * System.out.println(0.1*2 == 0.2 ); System.out.println(0.1*3==0.3);
			 */
		   
		   System.out.println(10 & 8);
		   System.out.println(10 | 8);
		   System.out.println(10 ^ 8);
		   System.out.println(~6);
		   
		   System.out.println(!true);
		   
		   int i=100;
		    i+=20; // i= i+10;  // compound operators 
		    i-=10;
		    i*=2;
		    i/=2;
		    
		  // ternery operator in java 
		    String x=(100>20)?"10 is grater ":"10 is smaller";
		    
		    
		    System.out.println(x);
		    
		    
		   
		   
		   
	}
	

}
