package String;
import java.util.*;
import java.util.Scanner.*;

public class String_Palindrome_ {
	public static boolean CheckPailndrom(String str_a)
	{
		int i=0;
		int j=str_a.length()-1;
		
			
		while(i<j) {
		   if(str_a.charAt(i)!=str_a.charAt(j))
			 {
				
			
	
			 return false;
			 }
			else
			
				i++;
				j--;
				
			
			
		}
		System.out.println("number is paindrome");
	return true;
	}

	
	
	public static void main(String [] args)
	{
		//string is pailndrome or not 
	    Scanner obj=new Scanner(System.in);
	    System.out.println("enter the string");
	    String str1=obj.nextLine();
	    CheckPailndrom(str1);
	    
	    
	    
		
		
	}

	
		


	}
		

