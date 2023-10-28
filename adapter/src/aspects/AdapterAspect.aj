package aspects;

import modelo.Cilindro;

public aspect AdapterAspect {
	pointcut instance(Cilindro c): execution(* cabe(..)) && args(c);
	before(Cilindro c): instance(c) {
		System.out.println(">>> Verificando que el círculo circunscrito del prisma.\n"
				+ "Bajo una pseudo-transformación de prisma a una figura circular para comprobar que este entre en el hoyo.\n" +
				"Por ello se considera que la figura tiene radio "+ c.getRadio() + "\nResultado:");
	}
}
