public class Shapes{
	public static void main(String[] args){
		Shape s = new Shape();
		s.draw();
		Shape sq = new Square();
		sq.draw();
		Shape r = new Round();
		r.draw();
	}
}

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