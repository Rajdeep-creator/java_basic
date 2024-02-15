package conditional_statements;
import java.util.Scanner;

public class cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("plz enter your age ");
		
		Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	if(age>=18)
	{
		System.out.println("you are eligible for driving");
	}
	else {
		System.out.println("go and drink some milk");

	}

}
}
