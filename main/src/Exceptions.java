public class Exceptions {

	public static void q1() throws Exception{
		Exception e = new RuntimeException("runtime");
		Exception boundsE = new IndexOutOfBoundsException("out of bounds");

		boundsE.printStackTrace();
		throw e;
	}

}
