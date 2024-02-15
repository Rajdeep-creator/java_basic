package basic;
import java.util.Scanner;

public class inp_out {

	
	public static void main(String args[])
	{
		Scanner myobject=new Scanner(System.in);
		System.out.println("plz enter name");
		String name=myobject.nextLine();
		
	
		System.out.println("enter your age ");
		int age=myobject.nextInt();
		System.out.println(name+" age is "+age);
		
		System.out.println("plz enter true or false");
		boolean k=myobject.nextBoolean();
		System.out.println(k);
		
		
	}
}
