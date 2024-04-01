package Abstraction;

public class Abstraction_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Rectangle r = new Rectangle();
		s.CalArea();
		s.ShowArea();
		r.CalArea();
		r.ShowArea();
		System.out.println("---------------------------------------");
		//Runtime Polymorphism /Dynamic Binding / Late Binding
		//EX : Method Overriding
		
		Shape sh;
		sh = new Square(12.5f); 
		sh.CalArea(); // Invokes the CalArea() of the Square Class
		sh.ShowArea();
		sh=new Rectangle(10,20); // Invokes the CalArea() of the Rectangle Class
		sh.CalArea();
		sh.ShowArea();
		
	}

}
