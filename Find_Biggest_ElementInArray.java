package array;
import java.util.*;

import java.io.InputStream;

public class Find_Biggest_ElementInArray {

	public static void main(String[] args) {

			
		int []arr= {55,45,67,88,90,100,567};
		
		
	
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.println(arr[i]+"="+i);

			}
			
		}
		System.out.println(max+"=biggest element");
	
	}



}
