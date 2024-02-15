package dsa_recurssion;
import java.util.*;
public class hypothesis_induction {
	
	public static int print(int n)
	{
		if(n==1)
		
		{
			System.out.println(n);
			return 1;
		}
		else {
			System.out.println(n);	//n to 1 printing number
			print(n-1);
			System.out.println(n);// 1 to n number printing 
		}
		return 0;
	}
	
	
public static void main(String args[])

{
	System.out.println("enter the value of n");
	Scanner pa = new Scanner(System.in);
	int n=pa.nextInt();
	;
	print(n);
	
	
	
}
	
	
	
}
