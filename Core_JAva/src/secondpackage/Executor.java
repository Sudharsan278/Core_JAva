//Driver Program to access the data members outside the Package
package secondpackage;
import firstpackage.Base;

public class Executor 
{
	public static void main(String [] args)
	{
		Base b = new Base();
		b.methodPublic();
		b.pub_var=14;
		b.methodPublic();
	}
}
