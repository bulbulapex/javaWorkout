public class Shapes{
	public static void main(String[] args){
		Shape s = new Shape();
		s.draw();
		Shape sq = new Square();
		sq.draw();
		Shape r = new Round();
		r.draw();

		//creating instance of Circle and Rectangle
		ShapeAbstract circle = new Circle(5.3);
		ShapeAbstract rectangle = new Rectangle(5, 6);

		//using the calculateArea method
		System.out.println("Area of the cirlce: " + circle.calculateArea());
		System.out.println("Area of the rectangle: " + rectangle.calculateArea());
	}
}

//it can also maintain another file
class Shape{
	public void draw(){
		System.out.println("draw function into drawmain class");
	}
}

class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("draw function into Square class which is extends Shape ");
	}
}

class Round extends Shape{
	@Override
	public void draw(){
		System.out.println("draw function into Round class extends Shape");
	}
}