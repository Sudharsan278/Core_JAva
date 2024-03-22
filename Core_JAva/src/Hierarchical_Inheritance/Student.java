package Hierarchical_Inheritance;

public class Student extends Person
{
	private String clas;
	private float per;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student Class Default Constructor!");
		clas = "FY";
		per = 70;
	}

	public Student(String clas, float per) {
		super();
		this.clas = clas;
		this.per = per;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public Student(String name,String city,String clas, float per) {
		
		/*Private members can't be inherited in child class 
		super.name=name; super.clas=clas;*/	
		super(name,city);
		this.clas = clas;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
}
