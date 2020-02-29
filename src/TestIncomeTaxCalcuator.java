import java.util.Scanner;

public class TestIncomeTaxCalcuator {

	public static double main(String[] args) 
	{
	double Taxincome = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Taxable Income");
	Taxincome = sc.nextDouble();
	public double TaxA(double Taxincome)
	{
		return (Taxincome * 0.0);
	}
	public double TaxB(Taxincome)
	{
		return (Taxincome - 20000) * 0.10;
	}
	
	/*/double First_tax = .0;
	double Next_Tax = .10;
	double Next_Tax1 = .20;
	double Remaining = .30;
	double IncomeTaxPayable = 0;
	double tax1 = 0;
	double tax2 = 0;
	double tax3 = 0;
	double tx1 = 0;
	double txt2 = 0;
	if(Taxincome <= 20000)
	{
		tax1 = 0;
		System.out.println("tax Payable"+tax1);
	}
	else if(Taxincome > 20000 && Taxincome <= 40000)
	{
		tx1 = Taxincome - 20000;
		tax2 = tx1 * .10;
		System.out.println("tax Payable"+tax2);
	}
	else if (Taxincome > 40000 && Taxincome <= 60000)
	{
		tax3 = Taxincome - 40000 * 0.20 + tax2;
		
		System.out.println("tax Payable"+tax3);
	}
	else
	{
		IncomeTaxPayable = Taxincome * 0.30;
		System.out.println("tax Payable"+IncomeTaxPayable);
	}
	
	
		
	}/*/
	}
}
