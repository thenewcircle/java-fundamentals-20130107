import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {

		// make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}
		String expression = args[0];

		// split expression up into tokens
		String[] tokens = expression.split(" ");

		// for each token in the expression ...
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			try {
				int number = Integer.parseInt(token);
				System.out.println(number + " is a number");
				// TODO: push it on the stack
			} catch (NumberFormatException e) {
				if (token.equals("+")) {
					System.out.println(token + " is addition");
				} else if (token.equals("-")) {
					System.out.println(token + " is subtraction");
				} else if (token.equals("*")) {
					System.out.println(token + " is multiplication");
				} else if (token.equals("/")) {
					System.out.println(token + " is division");
				} else {
					System.out.println(token + " is garbage");
				}
				// TODO: if the token is an operator...
				//     - pop two numbers
				//     - perform the op
				//     - push the result
			}
		}
		
		// TODO: the result is the last thing left on the stack

	}

}
