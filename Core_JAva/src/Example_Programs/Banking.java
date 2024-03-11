//Entity class for a Banking System
package Example_Programs;

public class Banking 
{
	private int acc_no;
	private String name;
	private double amount;
	private String address;
	public int getAcc_no() {
		return acc_no;
	}
	
	//Getters and Setters
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//toString method
	@Override
	public String toString() {
		return "Banking [acc_no=" + acc_no + ", name=" + name + ", amount=" + amount + ", address=" + address + "]";
	}
	//Explicit Default Constructor
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
		this.acc_no = 10002005;
		this.name = "Surya";
		this.amount=100;
		this.address = "Puducherry";
	}
	
	//Parameterized Constructor
	public Banking(int acc_no, String name, double amount, String address) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
		this.address = address;
	}
	
	
	
	
	
}
