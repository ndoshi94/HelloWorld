import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
	
		int number;
		System.out.println("Enter number");
		Scanner sc =new Scanner(System.in);
		number = sc.nextInt();
		Armstrong(number, howmanydigits(number));
	}
	public static int howmanydigits(int number)
	{
		int i = 0;
		while(number > 0)
		{
			number = number/10;
		}
		return i;
	}
	
	public static void Armstrong(int number, int i)
	{
		int remainder;
		int Quotient;
		int results = 0;
		int numcopy = number;
		
		while(number > 0)
		{
			remainder= number%10;
			number = number/10;
			results = (int) (results + Math.pow(remainder, i));
					
		}
		if(number == results)
			System.out.println("it is armstrong");
			else
			System.out.println("it is not");
	}
}
