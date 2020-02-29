
public class pascal {

	public static void main(String[] args)
	{
		int space1 = 5;
		for (int i = 0; i < 9; ++i)
	      {		
	    	  for(int j=0; j < i; j++)
	    	  {  
	    		  System.out.print("* ");
	    	  }
	    	  	for(int k = 6;k < space1;k++)
	    	  		{
	    	  			System.out.print(" ");
	    	  		}
	    	  	for(int j = 0;j < i-1;j++)
	    	  	{
	    	  		System.out.print("  ");
	    	  	}
	    System.out.println();
	    space1--;
	      }
	}
}
