public class SUE{
	int number;
	String name;
	String roll;

	public SUE()
	{
		this.number = 2;
		this.name = "Rayan Ahammed";
		this.roll = "2023200021202";
	}

	//constractor for when use class object and then time initialize the variable value
	public SUE(int numberc, String namec, String rollc){
		this.number = numberc;
		this.name = namec;
		this.roll = rollc;

	}

	//multiple constractor create
	public SUE(String name){
		this.name = name;
	}

	public void printString(){
		System.out.println("Name: " + name );
	}
}