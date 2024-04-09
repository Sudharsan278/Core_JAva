package Interface;

//Class implementing the interface
public class MultiplyDivide implements ArithmeticCalculation
{
	public void calculate(float a, float b)
	{
		System.out.println("First Number : "+a+"\nSecond Number : "+b);
		System.out.println("Multiplication Result : "+(a*b));
		System.out.println("Division Result : "+(a/b));
	}
}
