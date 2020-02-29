
public class pyramid {

	public static void main(String[] args)
	{
	
		int space1 = 5;
		for (int i = 0; i < 5; i++)
	      {		
	    	  for(int j=0; j < space1; j++)
	    	  {  
	    		  System.out.print("* ");
	    	  }
	    	  for(int k = 0;k < i;k++)
	    	  	{
	    	  		System.out.print("  ");
	    	  	}
	    System.out.println();
	    space1--;
	 }
}
}
