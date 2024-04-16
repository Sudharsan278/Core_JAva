//Driver Program for Person Class
package firstpackage;

import java.util.Scanner;

public class Person_Demo 
{
	public static void main(String [] args)
	{
		Person p = new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Person Details : Name, age and city ");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String city = sc.nextLine();
		
		p.setPersonName(name);
		p.setPersonAge(age);
		p.setPersonCity(city);																			
		
		System.out.println("Person Details Name : "+ p.getPersonName()+" \tAge : "+p.getPersonAge()+"\tCity : "+p.getPersonCity());
		
		System.out.println("Enter Person Details : Name, Age and City");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p = new Person(name,age,city);
		System.out.println("Person Details Name : "+p.getPersonName()+" \tAge : "+p.getPersonAge()+"\tCity : "+p.getPersonCity());
		sc.close();
	}
}
