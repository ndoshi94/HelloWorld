package ObjectLearning;

public class Rectangle
{
	double length;
	double width;
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double CalculateArea()
	{
		return length * width;
	}
	
	public double CalculatePerimeter()
	{
		return 2 * length * width;
	}
}
