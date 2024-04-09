package Interface;

//class implementing the interface
public class AdditionSubtraction implements ArithmeticCalculation
{
	public void calculate(float a, float b)
	{
		System.out.println("First Number : "+a+"\nSecond Number : "+b);
		System.out.println("Addition Result : "+(a+b));
		System.out.println("Subtraction Result : "+(a-b));
	}
}
