public class JavaArray{
	public static void main(String[] args) {
		//Write a Java array that has three of your friend’s name
		String[] frndsName = {"Rahim", "Karim", "Jamil"};
		System.out.println("Hello World!");
		System.out.println("My first friend name is: " + frndsName[0]);
		System.out.println("My second friend name is: " + frndsName[1]);
		System.out.println("My third friend name is: " + frndsName[2]);

		//2Write a Java loop that prints first 10 natural numbers.
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}

		//Create a Java class named ‘SEU’ that has one integer variable. Create an object of that same class where you can access the variable data through object.
		SUE obj1 = new SUE();
		obj1.number = 10;
		System.out.println(obj1.number);

	}
}