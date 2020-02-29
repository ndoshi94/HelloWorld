package ObjectLearning;

public class circle 
{
	double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	double pie = 3.14;
	
	public double CalculateAreaOfCircle()
	{
		return pie * radius * radius;
	}
	public double CaculatePerimeterOfCircle()
	{
		return 2 * pie * radius;
	}
}
