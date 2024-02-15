package polymorphism;
import java.util.*;


public class polymorphism_01 {
	
	
	
	public static  int add_num(int n,int b)
	{
		
		System.out.println(n+b);
		return (n+b);
	}
	
	public static int add_num(int y,int i,int h)
	{System.out.println(y+i+h);
		
	

		return (y+i+h);
	}
	
	
	
	
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("plz enter the value of k,p,s");
	
	int k=sc.nextInt();
	int p=sc.nextInt();
	int s=sc.nextInt();
	add_num(k,p,s);
	add_num(k,p);
	
	
}
	
	
	
}
