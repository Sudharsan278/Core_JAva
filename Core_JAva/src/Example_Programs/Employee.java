//Program to demonstrate Employee details entity class
package Example_Programs;
public class Employee 
{
	private String eName;
	private int eId;
	private String eAddress;
	//Getters and Setters 
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + ", eAddress=" + eAddress+ "]";
	}
	//Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		this.eId = 100;
		this.eName = "Surya";
		this.eAddress = "Chennai";
	}
	//Parameterized Constructor
	public Employee(String eName, int eId, String eAddress) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eAddress = eAddress;
	}
}
