package operators_java;

import java.util.Scanner;

public class logical_operator03 {

	
	public static void main(String[]args) {
		// NOT gate !;;;;*************rajdeep
		float a;
		float b;
		double c= 20.9;
		
		System.out.println("plz enter the value of a and b");
		
		Scanner gh=new Scanner(System.in);

		a=gh.nextFloat();
		
		b=gh.nextFloat();
	    
	    System.out.println("basic example of OR gate  "    +(a==b||a>=b));

	    System.out.println("before Not gate output  ----- "+ ((a==b||a<=b)||(a<=c)));
	    
	    System.out.println("After Not gate output   ----- "+ !(!(a==b||a<=b)||(a<=c)));
	    
		    
		
		
	}
	
	
	
	
	
	
	
	
}
