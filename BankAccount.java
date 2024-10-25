abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
}

class SavingsAccount extends BankAccount{
	@Override
	void deposit(){
		System.out.println("SavingsAccount deposit");
	}
	@Override
	void withdraw(){
		System.out.println("SavingsAccount withdraw");
	}
}

class CurrentAccount extends BankAccount{
	@Override
	void deposit(){
		System.out.println("CurrentAccount deposit");
	}
	@Override
	void withdraw(){
		System.out.println("CurrentAccount withdraw");
	}
}