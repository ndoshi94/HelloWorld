
public class daimondfullshape {

	public static void main(String[] args) 
	{
		int space = 5;
		for (int i = 1; i < 6; ++i)
	      {		
	    	  for(int j=1; j < space; j++)
	    	  {  
	    		  System.out.print(" ");
	    	  }
	    	  	for(int k = 0;k < i;k++)
	    	  		{
	    	  			System.out.print("* ");
	    	  		}
	    System.out.println();
	    space--;
	      }
		int space1 = 5;
		for (int i = 5; i < 9; i++)
	      {		
	    	  for(int j=1; j < space1; j++)
	    	  {  
	    		  System.out.print("* ");
	    	  }
	    	  	for(int k = 1;k < i-1;k++)
	    	  		{
	    	  			System.out.print("* ");
	    	  		}
	    System.out.println();
	    space1--;
	      }
		

	}

}
