//Driver Program or Executor
package Example_Programs;

public class StudentDemo {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		//s1.setSid(101);
		//s1.setSname("Suriya");
	
		Student s2 =  new Student();
		s2.setSid(102);
		s2.setSname("Raja");
		
	//	System.out.println(s1);
		System.out.println(s2);		
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
	}
}
