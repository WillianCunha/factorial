package com.softexpert;

import java.util.ArrayList;
import java.util.List;

public class FactorialList {

	public List<String> calculate(List<String> factorials) {
		List<String> results = new ArrayList<String>();
		Factorial factorialCalculator = new Factorial();
		int integerFactorial;

		for (String factorial : factorials)
			if (factorial == null)
				results.add("Não é possivel calcular um fatorial de nulo");
			else if ((integerFactorial = Integer.parseInt(factorial)) < 0)
				results.add("Não é possivel calcular um fatorial de negativo");
			else
				results.add(String.format("Fatorial de %d é %d", integerFactorial,
						factorialCalculator.calculate(integerFactorial)));

		return results;
	}

}
