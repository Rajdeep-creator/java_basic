package conditional_statements;
import java.util.*;

public class Attendence03 {
	
	public static void main(String[]args)
	{
		int a;
		
		int total_att;
		Scanner s= new Scanner(System.in);
		System.out.println("plz enter your attendece in class");
		a=s.nextInt();
		System.out.println("plz enter total attendece");
		total_att=s.nextInt();
	
	double percentage=(a/total_att)*100;
	System.out.println(percentage);
	if(percentage<=75)
	{
		System.out.println("you can sit in exam");
	}else
	{
		System.out.println("you are not eligible for exam");
	}
		
		
	}

}
