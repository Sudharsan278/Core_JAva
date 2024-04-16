//Executor Program to access the data members in the same Package
package firstpackage;

public class Executor
{
	public static void main(String [] args)
	{
		Base b = new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		b.default_var=11;
		b.methodDefault();
		
		//b.pri_var=21;
		//b.methodPrivate();
		b.prot_var=31;
		b.methodProtected();
		b.pub_var=41;
		b.methodPublic();
		
		System.out.println(b instanceof Base);
		/*
		 * Person p = new Person(); System.out.println(p instanceof Base);
		 */
	}
}
