package array;

public class Array_3d_pr1 {
	
	
	public static void main(String[]args)
	{
		int n[][][]=new int[3][3][3];
		int random;
		for(int i=3;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					n[i][j][k]=(int)(Math.random()*10);
					System.out.print(n[i][j][k]+" ");
				}
			}
		}
		System.out.println();
		for(int i=3;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(n[i][j][k]+" ");
				}
			}
		}
		System.out.println();
		
		
		
	}
	
	
	
	
	
	
	

}
