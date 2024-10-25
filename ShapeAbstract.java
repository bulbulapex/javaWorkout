//abstract class
abstract class ShapeAbstract{
	//Abstract method no implementation
	abstract double calculateArea();
}

//Derived class for circle
class Circle extends ShapeAbstract{
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	//implementing the abstract method
	@Override
	double calculateArea(){
		return Math.PI * radius * radius;
	}
}

//Derived class for Rectangle
class Rectangle extends ShapeAbstract{
	private double length;
	private double width;

	public Rectangle(double length, double width){
		this.length	= length;
		this.width = width;
	}

	//implementing the abstract method
	@Override
	double calculateArea(){
		return length * width;
	}
}