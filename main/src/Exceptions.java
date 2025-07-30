import java.util.Scanner;

public class Exceptions {

	public static void q1() throws Exception{
		Exception e = new RuntimeException("runtime");
		Exception boundsE = new IndexOutOfBoundsException("out of bounds");

		boundsE.printStackTrace();
		throw e;
	}

	public static void q2() {
		int[] ar = new int[4];
		try {
			System.out.println(ar[7]);
		}
		catch (Exception e) {
			System.out.println("an error occurred");
		}
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);



	}

}
