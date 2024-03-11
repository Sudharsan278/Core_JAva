//Driver Program to demonstrate Banking System
package Example_Programs;

import java.util.Scanner;

public class Banking_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Banking b = new Banking();
		System.out.println(b);
	
		System.out.println("Enter the account no , name, amount and address : ");
		
		Scanner s = new Scanner(System.in);
		int acc_no = s.nextInt();
		s.nextLine();
		String name = s.nextLine();
		double amount = s.nextDouble();
		s.nextLine();
		String address = s.nextLine();
	
		Banking b1 = new Banking(acc_no,name,amount,address);
		System.out.println(b1);
		s.close();
	}
}
