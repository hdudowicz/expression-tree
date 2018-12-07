package bcu.HubertDAndTillyD.expressiontree;

import java.util.*;
//Pair programming with Hubert Dudowicz and Tilly Davies
abstract public class BinaryOperation extends Expression {
	private final Expression left;
	private final Expression right;
	
	public BinaryOperation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	/*
	 * Evaluates this binary operation on the given operands.
	 */
	abstract public double evaluate(double a, double b);
	
	@Override
	public final double evaluate(Map<String, Double> variables) {
		double a = left.evaluate(variables);
		double b = right.evaluate(variables);
		return evaluate(a, b);
	}
	
	@Override
	public final Set<String> freeVariables() {
		Set<String> variables = new HashSet<>();
		
		variables.addAll(left.freeVariables());
		variables.addAll(right.freeVariables());
		
		return Collections.unmodifiableSet(variables);
	}

	abstract String getSymbol();

	@Override
	public String toString() {
		return "(" + left + getSymbol() + right + ")";
	}
}
