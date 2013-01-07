public class Hello {

	public static void main(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				String name = args[i];
				System.out.println("Hello, " + name);
			}
		} else {
			System.out.println("Hello, Nobody!");
		}
	}

}
