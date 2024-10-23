public class Person{
	private int unique_id;
	private String name;
	private int age;
	private String city;
	private String gender;

	public Person(){

	}

	public Person(int unique_id, String name, int age, String city, String gender){
		this.unique_id = unique_id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

	public void prsnDtls(){
		System.out.println("Name: " + name + "Age: " + age);
	}

	public void eat(){
		System.out.println(name + " is eating.");
	}
	public void study(){
		System.out.println(name + " is studying.");
	}
	public void sleep(){
		System.out.println(name + " is sleeping.");
	}
	public void play(){
		System.out.println(name + " is playing.");
	}
}