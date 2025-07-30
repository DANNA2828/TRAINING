package Poly;

public class Spongebob extends Fish implements ProfessionalBasketBallPlayer {

	public Spongebob(String name, int age, String favFood) {
		super(name, age, favFood);
	}

	@Override
	public void goToWork() {
		System.out.println("ic make carby patty");
	}

	@Override
	public void playBasketBall() {
		System.out.println("yaaaaaaaa");
	}
}
