package expression;

public class Nombre extends Expression {
	final double val;
	
	Nombre(double val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}
	
}
