package com.marakana.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.marakana.calculator.expressions.Expression;
import com.marakana.calculator.expressions.NumberExpression;
import com.marakana.calculator.expressions.OperationExpression;

public class Calculator {

	private static final Map<String, Operator> operators;
	static {
		operators = new HashMap<String, Operator>();
		operators.put("+", Operator.ADD);
		operators.put("-", Operator.SUBTRACT);
		operators.put("*", Operator.MULTIPLY);
		operators.put("/", Operator.DIVIDE);
	}

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
		return parse(expression).getValue();
	}

	public static Expression parse(String expression) {
		// split expression up into tokens
		String[] tokens = expression.split(" ");

		// for each token in the expression ...
		Stack<Expression> stack = new Stack<Expression>();
		for (String token : tokens) {
			if (!handleOperator(stack, token) && !handleNumber(stack, token)) {
				throw new IllegalArgumentException("garbage");
			}
		}

		// the result is the last thing left on the stack
		return stack.pop();
	}

	public static boolean handleNumber(Stack<Expression> stack, String token) {
		try {
			// if the token is an integer, push a NumberExpression
			int number = Integer.parseInt(token);
			stack.push(new NumberExpression(number));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean handleOperator(Stack<Expression> stack, String token) {
		// if the token is an operator...
		Operator op = operators.get(token);
		if (op == null) {
			return false;
		}

		// pop two subexpressions, and push an OperationExpression containing them
		Expression rhs = stack.pop(), lhs = stack.pop();
		stack.push(new OperationExpression(lhs, rhs, op));
		return true;
	}

}
