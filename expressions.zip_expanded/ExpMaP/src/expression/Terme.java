package expression;

import java.util.Map;
import java.util.function.BiFunction;

public abstract class Terme extends Expression implements Cloneable {
	Expression op1;
	Expression op2;
	private char reprOp;
	private BiFunction<Double, Double, Double> functionOp;
	
	Terme(BiFunction<Double, Double, Double> functionOp, char reprOp, Expression op1, Expression op2) {
		this.functionOp = functionOp;
		this.reprOp = reprOp;
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public String toString() {
		return "(" + this.op1 + " " + this.reprOp + " " + this.op2 + ")";
	}
	

	@Override
	public Expression eval(Map<Character, Expression> registre) {
		Expression rop1 = this.op1.eval(registre);
		Expression rop2 = this.op2.eval(registre);
		if (rop1 instanceof Nombre && rop2 instanceof Nombre) {
			Nombre n1 = (Nombre)rop1;
			Nombre n2 = (Nombre)rop2;
			return new Nombre(this.functionOp.apply(n1.val, n2.val));
		}
		try {
			Terme clone = (Terme) this.clone();
			clone.op1 = rop1;
			clone.op2 = rop2;
			return clone;
			
		} catch (CloneNotSupportedException e) {
			// on n'arrivera pas ici...
			return null;
		}
	}
	
}
