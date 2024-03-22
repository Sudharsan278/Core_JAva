//Driver Program for the Employee Class  
package Example_Programs;

import java.util.Scanner;

public class Employee_Executor
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		//Inputs
		System.out.println("Enter the details of the Employee : ");
		int eId = s.nextInt();
		s.nextLine();
		String eName = s.nextLine();
		String eAddress = s.nextLine();
		
		Employee e = new Employee(eName , eId, eAddress);
		System.out.println(e);
		s.close();
	}
}
