package expression;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Expression e1= new Division(new Nombre(7), new Nombre(2)); //  (7 / 2)
		Expression e2= new Addition(e1, new Variable('a'));        // ((7 / 2) + a)
		System.out.println(e2); // affichage de "((7.0 / 2.0) + a)"
		
		Expression re1= e1.eval(); // 3,5
		Expression re2= e2.eval(); // 3,5 + a
		System.out.println(re1);
		System.out.println(re2);
		
		System.out.println("-----\n"+e2);
		Map<Character, Expression> registre= new HashMap<>();// registre d’éval.
		registre.put('a', new Nombre(1.5));// a -> 1,5
		Expression re2bis= e2.eval(registre); // 5
		registre.put('a', new Variable('b'));// a -> b
		Expression re2ter= e2.eval(registre); // 3,5 + b
		System.out.println(re2bis);
		System.out.println(re2ter);
	}

}
