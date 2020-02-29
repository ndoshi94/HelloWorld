package ObjectLearning;

public class Traingle 
{
	double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double AreaOfTraingle()
	{
		return side * side * side;
	}
}
