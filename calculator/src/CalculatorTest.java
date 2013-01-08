import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class CalculatorTest {

	/*
	 * TODO:
	 *   handleNumber:
	 *     x should handle number: push number and return true
	 *     should not handle non-number: do nothing and return false
	 *     
	 *   handleOperator
	 *     should handle operator: pop, op, push and return true
	 *     should not handle non-operator: do nothing and return false
	 *     
	 *   calculate
	 *     integration test: result is calculated correctly
	 *     BONUS: if you pass garbage, it should throw an exception
	 */

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = Calculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(5, (int) stack.peek());
	}

}
