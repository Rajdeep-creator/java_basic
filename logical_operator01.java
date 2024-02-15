package operators_java;
import java.util.Scanner;
public class logical_operator01 {
	
	
public static void main(String[]args) {
	
	//      " || "	Logical or	Returns true if one of the statements is true	statement 1 || statement 2
	float a;
	float b;
	double c= 20.9;
	System.out.println("plz enter the value of a and b");
	Scanner gh=new Scanner(System.in);

	a=gh.nextFloat();
    b=gh.nextFloat();
    
    System.out.println(a==b||a>=b);

    
    System.out.println((a==b||a<=b)||(a<=c));
    
	    
	
	
}
}
