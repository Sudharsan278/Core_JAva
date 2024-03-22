package Single_Inheritance;

public class Citizen 
{
	private String name;
	private String aadarno;
	private String address;
	private long phno;
	
	public Citizen() 
	{
		System.out.println("City Object Created!");
	}

	public Citizen(String name, String aadarno, String address, long phno) {
		super();
		this.name = name;
		this.aadarno = aadarno;
		this.address = address;
		this.phno = phno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadarno() {
		return aadarno;
	}

	public void setAadarno(String aadarno) {
		this.aadarno = aadarno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}
}
