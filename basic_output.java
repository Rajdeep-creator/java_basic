package basic;

public class basic_output {
public static void main(String args[])
{
double a=4.5;
double b=5.678765678765;

System.out.println(a*b);

/*static
When java runtime starts, there is no object of the class present.
 That’s why the main method has to be static 
 so that JVM can load the class into memory and call the main method. 
 If the main method won’t be static, 
 JVM would not be able to call it because there is no object of the class is present. 
 Let’s see what happens when we remove static from java main method.*/ 
	char g='a';
	char y='b';
	float t1=g;
	float t2=y;
	
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(g+y);
	
}
	
	
}
