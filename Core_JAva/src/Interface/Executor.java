//Driver Program 
package Interface;

public class Executor 
{
	public static void main(String [] args)
	{
		ArithmeticCalculation ac;
		
		ac = new AdditionSubtraction();
		ac.calculate(20.3f, 10);
		
		ac = new MultiplyDivide();
		ac.calculate(25, 5);
	}
}
