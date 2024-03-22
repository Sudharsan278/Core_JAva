package Single_Inheritance;

public class Student extends Citizen
{
	private int regno;
	private String collegename;
	
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, String aadarno, String address, long phno,int regno,String collegename) {
		super(name, aadarno, address, phno);
		this.regno = regno;
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", collegename=" + collegename + ", Name=" + getName()
				+ ", Aadarno=" + getAadarno() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				+ "]";
	}
}