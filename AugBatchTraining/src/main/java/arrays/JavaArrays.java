package arrays;

import java.util.Arrays;

public class JavaArrays {
	
	public static void main(String[] args) {
		
		int[] a ; // declared an array 
		a= new int[5];  // created an array 
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int [] b= {30,40,50,60}; // declred , created and initiazed the array in single line.
		
		int len=a.length;
		int lenb=b.length;
		int[] c=new int[len+lenb];
		int index=0;
		for(int i=0;i<len;i++) {
			c[index]=a[i];
			index++;
			
		}
		for(int i=0;i<lenb;i++) {
			c[index]=b[i];
			index++;
			
			
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		
		System.out.println(Arrays.toString(a));
		
		//iteratre the array 
		
		
		System.out.println("before processing the array" );
		for(int i=0;i<=len-1;i++) {
			
			System.out.println(i+" place number in array is :-"+a[i]);
		}
		
		
		
		for(int i=0;i<=len-1;i++) {
			
			a[i]=a[i]/10;
		}
		
		//
		System.out.println("after processing the array" );

		for(int i=0;i<=len-1;i++) {
			
			System.out.println(i+" place number in array is :-"+a[i]);
		}	
		
		
		
		
	}
}
