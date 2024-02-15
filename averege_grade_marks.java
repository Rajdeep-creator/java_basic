package conditional_statements;
import java.util.*;
import java.util.Scanner;
public class averege_grade_marks {

	public static void main(String[]args)
	{
		double m1,m2,m3;
		System.out.println("plz enter three math eng hindi marks upto 100");
		Scanner d=new Scanner(System.in);
		m1=d.nextDouble();
		m2=d.nextDouble();
		m3=d.nextDouble();
		double avg= (double)(m1+m2+m3)/3;
		if(avg>=100 && avg>91)
		{
		System.out.println("GRADE A");
			
		}
		else
		{
		if(avg<=90 && avg>80)
		{
			System.out.println("GRADE B");
			
		}
		else
		{
			if(avg>=80&&avg>70)
		{
				System.out.println("GRADE C");
		}
		
		
		else
		{
			System.out.println("GRADE D ");
		}
		
		
		}
		
	}
	}}

