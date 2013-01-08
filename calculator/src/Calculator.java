public class Calculator {

	public static void main(String[] args) {

		// make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}
		String expression = args[0];

		// TODO: split expression up into tokens

		
		
		// for each token:
		//   if we see a number:
		//     - push it on the stack
		//   if we see an operator:
		//     - pop two numbers
		//     - perform the op
		//     - push the result
		// the result is the last thing left on the stack

	}

}
