package expression;

import java.util.function.BiFunction;

public class Addition extends Terme {

	private static final char OP = '+';
	
	private static final BiFunction<Double,Double,Double> F = (i,j) -> i+j;
	
	Addition(Expression op1, Expression op2) {
		super(F, OP, op1, op2);
	}

	
}
