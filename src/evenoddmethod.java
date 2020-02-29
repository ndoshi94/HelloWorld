import java.util.Scanner;

public class evenoddmethod {

	public static void main(String[] args) 
	{
	System.out.println("Enter number");
	Scanner sc =new Scanner(System.in);

	int number = sc.nextInt();

	CheckOddorEven(number);
	/*if(CheckOE(number));
	System.out.println(number+"  is an even");*/

	}
	public static void CheckOddorEven(int number)
	{
		if(number%2==0)
			System.out.println(number+"  is an even");
		else
			System.out.print(number+ "is an odd ");
	}
	public static boolean CheckOE(int number)
	{
		if(number%2==0)
			return true;
		else
			return false;
	}
	
}
