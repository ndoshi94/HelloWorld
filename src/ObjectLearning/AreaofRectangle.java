package ObjectLearning;

public class AreaofRectangle 
{

	public static void main(String[] args) 
	{
	Rectangle rec = new Rectangle();
	Rectangle rec1 = new Rectangle(25,30);
	rec.setLength(20.0);
	rec.setWidth(10.0);
	System.out.println("Area of Rectangle" + rec1.CalculateArea());
	System.out.println("Perimeter of Rectangle" + rec.CalculatePerimeter());
	
	circle cir = new circle();
	cir.setRadius(3.5);
	System.out.println("Area of Circle" +cir.CalculateAreaOfCircle());
	System.out.println("Perimeter of Circle" +cir.CaculatePerimeterOfCircle());
	
	Traingle tri = new Traingle();
	tri.setSide(5);
	System.out.println("Area of Traingle" + tri.AreaOfTraingle());
	}

}
