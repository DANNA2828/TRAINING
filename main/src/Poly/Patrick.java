package Poly;

public class Patrick extends Fish implements ProfessionalBasketBallPlayer {

	public Patrick(String name, int age, String favFood) {
		super(name, age, favFood);
	}

	@Override
	public void goToWork() {
		System.out.println("im patrick");
	}

	@Override
	public void playBasketBall() {
		System.out.println("palyin");
	}
}
