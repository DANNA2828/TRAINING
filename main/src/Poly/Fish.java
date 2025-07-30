package Poly;

public abstract class Fish {

	public String name;
	public int age;
	public String favFood;

	public Fish(String name, int age, String favFood) {
		this.name = name;
		this.age = age;
		this.favFood = favFood;
	}

	public abstract void goToWork();

	public void takeTheCar() {
		System.out.println("car");
	}
	public void takeTheTrain() {
		System.out.println("train");
	}
	public void walkByFoot() {
		System.out.println("walk");
	}

}
