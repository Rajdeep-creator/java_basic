package functions_;
import java.util.*;
import java.util.Scanner;
public class fabonic_series_fun {
	public static void faboSeries(int pre,int next,int maxnum)
	{
		System.out.print("faboseries of " +maxnum+ " numbers :-");
		for(int i=0;i<=maxnum;++i)
		{
		int sum= pre+next;
		pre=next;
		next=sum;
		System.out.print(pre+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
	int b;
	int k;
System.out.println("plz enter the value of previous number and next number and maximun lenght of faboniccc series");
Scanner g=new Scanner(System.in);
n=g.nextInt();
b=g.nextInt();
k=g.nextInt();
faboSeries(n,b,k);
	
	}

}
