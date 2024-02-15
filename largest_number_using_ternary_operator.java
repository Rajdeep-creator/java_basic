package operators_java;
import java.util.Scanner;

public class largest_number_using_ternary_operator {

	public static void main(String args[])
	{
	System.out.println("Plz enter the value of a,b,c");
	Scanner s=new Scanner(System.in);
	

	double a=s.nextDouble();
	double b=s.nextDouble();
	double c=s.nextDouble();
	System.out.println("A="+a);
	System.out.println("B="+b);
	System.out.println("C="+c);
	
	double largestnum=(a>c)?(a>b?a:c):(b>c?b:c);
	
	System.out.println("largest Number in Given three numbers = "+largestnum);
	}
	
	
}
