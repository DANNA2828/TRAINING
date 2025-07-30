package Poly;

public class CookSpongebob extends Spongebob{

	public CookSpongebob(String name, int age, String favFood) {
		super(name, age, favFood);
		super.playBasketBall();
	}

	@Override
	public void playBasketBall() {
		System.out.println("i want to cook");
	}
}
