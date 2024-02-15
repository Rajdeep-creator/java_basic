package operators_java;
import java.util.Scanner;

public class Relational_operator {
	public static void main(String args[])
	{
	System.out.println("plz enter the vlalue of x1 y1");
			
 	Scanner obj1=new Scanner(System.in);
		int x1=obj1.nextInt();
		int y2=obj1.nextInt();
		System.out.println(x1==y2);//‘Equal to’ operator (==)
		System.out.println(x1!=y2);//Not ‘Equal to’ operator (==)
	}

}
