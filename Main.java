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

		Product prod1 = new Product();
		prod1.displayProductInfo();
		System.out.println("Product Total price is: " + prod1.calculateTotalValue());

		Product prod2 = new Product();
		prod2.product_id = 2;
		prod2.name = "Ring";
		prod2.price = 56.32;
		prod2.quantity = 3;
		prod2.description = "Special Product.";
		prod2.displayProductInfo();
		System.out.println("Product Total price is: " + prod2.calculateTotalValue());
	}
}