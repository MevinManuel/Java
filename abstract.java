abstract class Shape{
	int a=10;
	int b=20;
	abstract void printArea();
}
class Rectangle extends Shape{
	void printArea(){
		System.out.println("Area of Rectangle:"+(a*b));
	}
}
class Triangle extends Shape{
	void printArea(){
		System.out.println("Area of Triangle:"+(0.5*a*b));
	}
}
class Circle extends Shape{
	void printArea(){
		System.out.println("Area of Circle:"+(3.14*a*a));
	}
}

class AbShape{
	
	public static void main(String args[]){
	
		Shape r=new Rectangle();
		Shape t=new Triangle();
		Shape c=new Circle();
		r.printArea();
		t.printArea();
		c.printArea();
	}
}
