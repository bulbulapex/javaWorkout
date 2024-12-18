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

		//polymorphism overload method
		NumberAdder added = new NumberAdder();
		System.out.println("add function has two parameter: return int " + added.add(10, 9));
		System.out.println("add function has three parameter: return int " + added.add(10, 9, 3));
		System.out.println("add function has four parameter: return int " + added.add(10, 9, 3, 5));
		System.out.println("add function has two parameter: return double " + added.add(10.5, 9.35));
		System.out.println("add function has three parameter: return double " + added.add(10.12, 9.35, 3.2));
		System.out.println("add function has four parameter: return double " + added.add(10.24, 9.23, 3.35, 5.52));

		System.out.println("======bank deposit and withdraw example======");
		// Create a SavingsAccount
        BankAccount savings = new SavingsAccount();
        savings.deposit(500);
        savings.withdraw(200);
        savings.displayBalance();

        // Create a CurrentAccount
        BankAccount current = new CurrentAccount();
        current.deposit(1000);
        current.withdraw(1500);
        current.displayBalance();

        System.out.println("======implements class======");

        Pig myPig = new Pig();
        myPig.animalSound();


        Spacecraft sc = new Spacecraft();
        Airplane ap = new Airplane();
        Helicopter hc = new Helicopter();

        sc.fly_obj();
        ap.fly_obj();
        hc.fly_obj();

	}
}