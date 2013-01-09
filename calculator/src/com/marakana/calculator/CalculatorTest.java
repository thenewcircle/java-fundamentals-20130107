package com.marakana.calculator;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = Calculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(5, (int) stack.peek());
	}

	@Test
	public void handleNumberMustNotHandleGarbage() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = Calculator.handleNumber(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustHandleAddition() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(5);
		boolean result = Calculator.handleOperator(stack, "+");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(8, (int) stack.peek());
	}

	@Test
	public void handleOperatorMustNotHandleGarbage() {
		Stack<Integer> stack = new Stack<Integer>();
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
