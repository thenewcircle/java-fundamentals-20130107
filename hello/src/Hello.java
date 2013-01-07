public class Hello {

	public static void main(String[] args) {
		try {
			String name = args[0];
			System.out.println("Hello, " + name);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello, Nobody!");
		}
	}

}
