//Program to Demonstrate customer executor
//Driver Program for the customer entity class
package Example_Programs;

import java.util.Scanner;

public class Customer_Executor 
{
	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		//Inputs
		System.out.println("Enter the ID , Name and Address : ");
		int cid = s.nextInt();
		s.nextLine();
		String cname = s.nextLine();
		String caddress = s.nextLine();
		
		//Invokes the setters and toString
		Customer_Details c1  = new Customer_Details();
		c1.setCid(cid);
		c1.setCname(cname);       //Use setter methods when you have to set the values for  
		c1.setCaddress(caddress); //specific variables not for a group of variables 
		
		System.out.println(c1);
		
		//Invokes The Parameterized Constructor
		Customer_Details c2 = new Customer_Details(cid,cname,caddress);
		System.out.println(c2);//To set values for a group of variables use Parameterized Constructor 
		
		Customer_Details c3 = new Customer_Details();
		System.out.println(c3); //Invokes the Explicit Default Constructor
		s.close(); //Implicit Default Constructor is the one which is automatically created by the compiler that allocates 
	}              //default values(null,0 etc) to the class variables
}
