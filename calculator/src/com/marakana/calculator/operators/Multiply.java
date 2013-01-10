package com.marakana.calculator.operators;

public class Multiply implements Operator {

	@Override
	public int operate(int lhs, int rhs) {
		return lhs * rhs;
	}
	
}
