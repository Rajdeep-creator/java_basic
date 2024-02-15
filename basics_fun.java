package functions_;
import java.util.*;

public class basics_fun {

	/*public static double sumOfNumbers(double a,int b,int c)
	{
		return (a+b+c);
	}*/
	public static double divisonOfNumber(int a,int b)
	{		
		
		if(b==0)
		{
			System.out.println("out of the function");
			return Integer.MIN_VALUE;

		}
		else
		return a/b;
	}
	public static void divisonResult(int k,int b)
	{
		if(b==0)
		{
			return ;
		}
double r=k/b;
System.out.println(r);
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double r=sumOfNumbers(4,4,4);
//System.out.println(r);
		int a;
		int g;
		System.out.println(" plxz enter the vlaue of a nd g ");
		Scanner dc=new Scanner(System.in);
		a=dc.nextInt();
		g=dc.nextInt();
		divisonResult(a,g);
	double k=	divisonOfNumber(a,g);
	System.out.println(k);
	
		
	//error Exception in thread "main" java.lang.ArithmeticException: / by zero
		
	}

}
