//Program to demonstrate Access Specifiers/Modifiers
package firstpackage;

public class Base 
{
	int default_var = 100;
	private int pri_var = 120;
	public int pub_var = 140;
	protected int prot_var = 160;
	
	void methodDefault()
	{
		System.out.println("Default Access Base Class");
		System.out.println("Default Varibale : "+default_var);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Access Base Class");
		System.out.println("Public Variable : "+pub_var);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Access Base Class");
		System.out.println("Private Variable : "+pri_var);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected Access Base Class");
		System.out.println("Protected Variable : "+prot_var);
	}
}
