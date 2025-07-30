
public class Main {
	public static void main(String[] args) {

		int[] ar = new int[4];
		try {
			System.out.println(ar[7]);
		}
		catch (Exception e) {
			System.out.println("an error occurred");
		}

	}
}