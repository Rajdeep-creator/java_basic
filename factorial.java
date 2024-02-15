package dsa_recurssion;
import java.util.*;




public class factorial {
	public static int fact(int n)
	{
		
		int k= fact(n)*fact(n-1);
		return k;
	}

	
	public static void main(String args[])
	{
		fact(5);
	}
}
