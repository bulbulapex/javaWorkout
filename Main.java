public class Main{
	public static void main(String[] args){
		Person prsn = new Person();
		prsn.prsnDtls();

		Person john = new Person(1, "John", 35, "Delhi", "Male");
		john.eat();
		john.study();
		john.sleep();
		john.play();

		Person dessy = new Person(1, "dessy", 20, "Delhi", "Female");
		dessy.eat();
		dessy.study();
		dessy.sleep();
		dessy.play();
	}
}