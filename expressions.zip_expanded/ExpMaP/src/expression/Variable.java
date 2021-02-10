package expression;

import java.util.Map;

public class Variable extends Expression {
	final char label;
	
	Variable(char label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return String.valueOf(this.label);
	}
	
	@Override
	public Expression eval(Map<Character, Expression> registre) {
		Expression res = registre.get(this.label);
		return (res == null ? this : res);
	}


}
