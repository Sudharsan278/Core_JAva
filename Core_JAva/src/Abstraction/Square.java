package Abstraction;

public class Square extends Shape
{
	private float side;
	public Square()
	{
		side = 2.0f;
	}
	
	public Square(float side)
	{
		this.side=side;
	}

	@Override
	void CalArea() 
	{
		// TODO Auto-generated method stub
		super.area=side*side;
	}
	
	
}
