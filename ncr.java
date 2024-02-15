package functions_;
import java.util.*;
public class ncr {
	public static int factorial(int x)
	{int fact = 1;
	int i=1;
		for(i=1;i<=x;i++)
		{
			fact=fact*i;
		}
	return(fact);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("plz enter the value of n");
		System.out.println("plz enter the value of r");
	Scanner sn=new Scanner(System.in);
	int n=sn.nextInt();
	int r=sn.nextInt();
	
	int nf=factorial(n);
	int rf=factorial(r);
	int n_r_f=factorial(n-r);
int ncr=nf/(rf*(n_r_f));
System.out.println(ncr);
		

	}

}
