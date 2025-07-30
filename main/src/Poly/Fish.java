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

	public static void q4(ProfessionalBasketBallPlayer[] players) {
		for (ProfessionalBasketBallPlayer p : players) {
			if (p instanceof Fish) {
				((Fish) p).goToWork();
				p.playBasketBall();
			} else {
				p.playBasketBall();
			}
		}
	}

	public static void q9(Fish[] fishes) {
		int count = 0;
		for (Fish f : fishes) {
			if (f instanceof ProfessionalBasketBallPlayer) {
				count++;
			}
		}
		ProfessionalBasketBallPlayer[] ar = new ProfessionalBasketBallPlayer[count];
		count = 0;

		for (Fish f : fishes) {
			if (f instanceof ProfessionalBasketBallPlayer) {
				ar[count] = (ProfessionalBasketBallPlayer) f;
				count++;
			}
		}

		q4(ar);
	}

}
