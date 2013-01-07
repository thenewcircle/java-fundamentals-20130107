public class Hello {

	public static void main(String[] args) {
		if (args.length != 0) {
			int i = 0;
			while (i < args.length) {
				String name = args[i];
				System.out.println("Hello, " + name);
				i++;
			}
		} else {
			System.out.println("Hello, Nobody!");
		}
	}

}
