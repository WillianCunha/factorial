package com.softexpert;

import java.util.ArrayList;
import java.util.List;

public class FactorialList {

	public List<String> calculate(List<Integer> factorials) {
		List<String> results = new ArrayList<String>();
		for (Integer factorial : factorials)
			processFactorial(results, factorial);
		return results;
	}

	public void processFactorial(List<String> results, Integer factorial) {
		if (factorial == null)
			results.add("Não é possivel calcular um fatorial de nulo");
		else if (factorial < 0)
			results.add("Não é possivel calcular um fatorial de negativo");
		else
			results.add(String.format("Fatorial de %d é %d", factorial, new Factorial().calculate(factorial)));
	}

}
