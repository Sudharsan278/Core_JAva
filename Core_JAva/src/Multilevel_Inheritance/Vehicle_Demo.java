package Multilevel_Inheritance;

public class Vehicle_Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car c;
		c = new Car();
		c.vehicleType();
		
		Maruthi m = new Maruthi();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruthi800 m1 = new Maruthi800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
	}
}
