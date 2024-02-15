package array;

public class Array_2d_pr1 {
	public static void main(String[] args)
	{
		int nums[][]=new int[3][4];
		int random=0;
		
	    /*nums[0][0]=1;
		nums[0][1]=2;
		nums[0][2]=3;
		nums[0][3]=4;
		nums[1][0]=5;
		nums[1][1]=6;
		nums[1][2]=7;
		nums[1][3]=8;
		nums[2][0]=9;
		nums[2][1]=10;
		nums[2][2]=11;
		nums[2][3]=12;
		*/
		
		//Math.random()  function genrate rndom value
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*-*-*-*");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
