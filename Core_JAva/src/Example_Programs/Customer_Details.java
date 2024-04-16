//Program to define Customer entity class
package Example_Programs;

public class Customer_Details 
{
	private int cid;
	private String cname;
	private String caddress;
	
	//getter and setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer_Details [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
	//Default Constructor
	public Customer_Details() 
	{
		this.cid=1;
		this.cname="Elon";
		this.caddress="DC";	
	}
	//Parameterized Constructor
	public Customer_Details(int cid, String cname, String caddress) {
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	
	
}
