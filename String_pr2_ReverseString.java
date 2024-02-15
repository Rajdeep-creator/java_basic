package String;

import java.util.Scanner;

public class String_pr2_ReverseString {

	public static void PrintChars(String str)
	{
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.println(str.charAt(i));
	}
		
	}
	
	public static void main(String [] args)
	{
		
		System.out.println("plz enter the String Elements");
		Scanner obj=new Scanner(System.in);
		String str1=obj.nextLine();
		
		PrintChars(str1);
	}

}
