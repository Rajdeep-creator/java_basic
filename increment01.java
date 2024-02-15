package operators_java;
import java.lang.*;
public class increment01 {

	
	public static void main(String[] args)
		{
		
		int x=5;
		int b = 6;
	int c= ++x +b;       //Value is incremented first and then the result is computed.
		System.out.println(c);
		float y=5;
		float k=y++ +b; //post incremeted and first computed the result;;;;;
		System.out.println(k);
		
	}
}
