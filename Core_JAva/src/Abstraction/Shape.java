package Abstraction;

//Abstract Class
public abstract class Shape 
{
	protected float area;
	
	//Abstract Method
	abstract void CalArea();
	//Concrete Method
	void ShowArea()
	{
		System.out.println("The Area of the Shape is : "+area);
	}
	
}

