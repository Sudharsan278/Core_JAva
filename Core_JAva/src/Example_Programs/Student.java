package Example_Programs;

public class Student 
{
	private int sid;
	private String sName;
	
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sName;
	}
	public void setSname(String sName) 
	{
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}
	
	
}
