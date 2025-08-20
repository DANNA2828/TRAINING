import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
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
		while (true) {
			int i = scanner.nextInt();
			if (i == 45) {
				try {
					throw new IllegalArgumentException("aaa");
				}
				catch (IllegalArgumentException e) {}
			}
			if (i == 100) {
				throw new RuntimeException("asfd");
			}
		}
	}

	public static void q4(int i) throws Exception {
		switch (i) {
			case 1 -> throw new FileNotFoundException();
			case 2 -> throw new BindException();
			case 3 -> throw new AuthenticationException();
		}
	}

	public static void q5(int i) throws Exception {
		try {
			q4(i);
		}
		catch (FileNotFoundException e) {
			System.out.println(1);
		}
		catch (BindException e) {
			System.out.println(2);
		}
		catch (AuthenticationException e) {
			System.out.println(3);
		}
	}

	public static void q6(int i) throws Exception {
		try {
			q4(i);
			System.out.println("here");
			throw new RuntimeException();
		}
		catch (FileNotFoundException e) {
			System.out.println(1);
			throw new FileNotFoundException();
		}
		catch (BindException e) {
			System.out.println(2);
			throw new BindException();
		}
		catch (AuthenticationException e) {
			System.out.println(3);
			throw new AuthenticationException();
		}
	}

	public static void q7() {
//		this is a replacement to printNameUpperCase
		try {
			System.out.println(name.toUpperCase);
		}
		catch (Exception e) {
			System.out.println("error");
		}
	}

	public static int q8(String[] arr) {
//		this is a replacement to getIndex
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("yellow")) {
				return i;
			}
		}
		return -1;
	}

}
