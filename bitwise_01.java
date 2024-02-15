package operators_java;
import java.util.Scanner;


public class bitwise_01 {
	public static void main(String args[])
	{
		  
        String binary[]={
          "0000","0001","0010","0011","0100","0101",
          "0110","0111","1000","1001","1010",
          "1011","1100","1101","1110","1111"
        };
	
	Scanner obj=new Scanner(System.in);
	 int a=10;
	 int b=10;
	 
	 System.out.println("bitwise or ="+(a|b));//bitwise or ;;;;
	 System.out.println("bitwise And ="+(a&b));//bitwise And ;;;;
	 System.out.println("bitwise or ="+(a^b));//bitwise or ;;;;
	 
		System.out.println(binary[a]);

		System.out.println(binary[b]);

		
		
	}

}
