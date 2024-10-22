public class SUE{
	int number;
	String name;
	String roll;

	//constractor for when use class object and then time initialize the variable value
	public SUE(int numberc, String namec, String rollc){
		this.number = numberc;
		this.name = namec;
		this.roll = rollc;

	}

	public void printString(){
		System.out.println("Name: " + name );
	}
}