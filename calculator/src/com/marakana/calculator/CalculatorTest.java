package com.marakana.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import com.marakana.calculator.expressions.Expression;
import com.marakana.calculator.expressions.NumberExpression;
import com.marakana.calculator.expressions.OperationExpression;

public class CalculatorTest {

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(new NumberExpression(5), stack.peek());
	}

	@Test
	public void handleNumberMustNotHandleGarbage() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleNumber(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustHandleAddition() {
		Stack<Expression> stack = new Stack<Expression>();
		stack.push(new NumberExpression(3));
		stack.push(new NumberExpression(5));
		boolean result = Calculator.handleOperator(stack, "+");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(new OperationExpression(new NumberExpression(3), new NumberExpression(5), Operator.ADD), stack.peek());
	}

	@Test
	public void handleOperatorMustNotHandleGarbage() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleOperator(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void onePlusOneMustEqualTwo() {
		assertEquals(2, Calculator.calculate("1 1 +"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatorMustNotAcceptGarbage() {
		Calculator.calculate("garbage");
	}
}
