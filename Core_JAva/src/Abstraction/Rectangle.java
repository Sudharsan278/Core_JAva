package Abstraction;

public class Rectangle extends Shape
{
	private float length,width;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		length = 2.0f;
		width = 5.0f;
	}

	public Rectangle(float length, float width) 
	{
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	void CalArea() {
		// TODO Auto-generated method stub
		area = length*width;
	}

}
