package com.marakana.calculator.expressions;

import com.marakana.calculator.Operator;

public class OperationExpression implements Expression {
	private final Expression lhs, rhs;
	private final Operator op;

	public OperationExpression(Expression lhs, Expression rhs, Operator op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op = op;
	}

	public Expression getLhs() {
		return lhs;
	}

	public Expression getRhs() {
		return rhs;
	}

	public Operator getOp() {
		return op;
	}

	public int getValue() {
		return op.operate(lhs.getValue(), rhs.getValue());
	}

	public String toString() {
		return String.format("(%s %s %s)", lhs, op, rhs);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lhs.hashCode();
		result = prime * result + op.hashCode();
		result = prime * result + rhs.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperationExpression other = (OperationExpression) obj;
		if (!lhs.equals(other.lhs))
			return false;
		if (op != other.op)
			return false;
		if (!rhs.equals(other.rhs))
			return false;
		return true;
	}

}
