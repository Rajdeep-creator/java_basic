package operators_java;
import java.util.Scanner;
public class logical_operator {
	/*&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
	|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
	!	Logical not	Reverse the result, returns false if the result is true*/
	
	public static void main(String args[])
	{
		
		System.out.println("plz enter the number a and b");
		Scanner msObject1=new Scanner(System.in);
	float a;
	float b;
	
	a=msObject1.nextFloat();
    b=msObject1.nextFloat();
    
    System.out.println(a==b&&a>=b);
    System.out.println(a==b&&a<=b);
	
	
		
		
	
		
		
	}
}
