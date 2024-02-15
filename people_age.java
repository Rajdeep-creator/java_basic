package conditional_statements;
import java.util.*;

public class people_age {
	
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("plz enter the first person age");
		a=s.nextInt();
		System.out.println("plz enter the second person age");
		b=s.nextInt();
		System.out.println("plz enter the Third person age");
        c=s.nextInt();
        
        if(a>b)
        {
        	if (b>c)
        	{
        		System.out.println("a is oldest");
        	}
        
        }
        else {
        	System.out.println("b is oldest");
        	
        }
        if(b<c) {
        	System.out.println("c is oldest");
        }
    

       
		
		
		
		
		
	}

}
