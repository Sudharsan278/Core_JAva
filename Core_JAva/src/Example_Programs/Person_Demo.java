//Driver Program for Person Class
package Example_Programs;

import java.util.Scanner;

public class Person_Demo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Perosn: ");
		String name = sc.nextLine();
		System.out.println("Enter the age of the Person: ");
		int age = sc.nextInt();
		System.out.println("Enter the Gender: ");
		String gender = sc.next();
		System.out.println("Enter the Income: ");
		int income = sc.nextInt();
		
		//Using setter method
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		System.out.println(p);

		
		Tax_Calculation tax = new Tax_Calculation();
		tax.taxCalculation(p);//Passing the object of Person Class to the taxCalculation method
		System.out.println("After Calculating the tax: ");
		System.out.println(p);
		sc.close();
	}
}
