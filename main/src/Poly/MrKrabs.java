package Poly;

public class MrKrabs extends Fish{

	public MrKrabs(String name, int age, String favFood) {
		super(name, age, favFood);
	}

	@Override
	public void goToWork() {
		System.out.println("i want money");
	}
}
