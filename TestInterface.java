interface Animal{
	public void animalSound();
}

public class Pig implements Animal{
	@Override
	public void animalSound(){
		System.out.println("Pig sound is: Wee Wee");
	}
}


