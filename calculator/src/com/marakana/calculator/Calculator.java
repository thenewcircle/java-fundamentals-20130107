package com.marakana.calculator;

import java.util.Stack;

import com.marakana.calculator.operators.Add;
import com.marakana.calculator.operators.Divide;
import com.marakana.calculator.operators.Multiply;
import com.marakana.calculator.operators.Operator;
import com.marakana.calculator.operators.Subtract;

public class Calculator {

	public static void main(String[] args) {
		// make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}
		String expression = args[0];
		int result = calculate(expression);
		System.out.println("result: " + result);
	}

	public static int calculate(String expression) {
		// split expression up into tokens
		String[] tokens = expression.split(" ");

		// for each token in the expression ...
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (!handleOperator(stack, token) && !handleNumber(stack, token)) {
				throw new IllegalArgumentException("garbage");
			}
		}

		// the result is the last thing left on the stack
		return stack.pop();
	}

	public static boolean handleNumber(Stack<Integer> stack, String token) {
		try {
			// if the token is an integer, push it
			int number = Integer.parseInt(token);
			stack.push(number);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean handleOperator(Stack<Integer> stack, String token) {
		// if the token is an operator, pop two numbers,
		// perform the op and push the result
		Operator op;
		if (token.equals("+")) {
			op = new Add();
		} else if (token.equals("-")) {
			op = new Subtract();
		} else if (token.equals("*")) {
			op = new Multiply();
		} else if (token.equals("/")) {
			op = new Divide();
		} else {
			return false;
		}

		int rhs = stack.pop(), lhs = stack.pop();
		stack.push(op.operate(lhs, rhs));
		return true;
	}

}
