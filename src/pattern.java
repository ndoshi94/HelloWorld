
public class pattern 
{
	public static void main(String args[])
	{
			int i,j,k,l;
		for(i = 1 ; i <= 6; i++)
		{
			for(j = 5; j <=i ; j--)
			{
				System.out.println(" ");
			}
			for(k = 1 ; k <= i;k++)
			{
				System.out.print("*");	
			}
			for(l = 2; l <=i;l++)
			{
				System.out.println(" ");
			}
			System.out.println();
			
			
		}
		
		
	}
}
