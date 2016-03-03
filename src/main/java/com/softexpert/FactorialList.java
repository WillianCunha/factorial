package com.softexpert;

import java.util.ArrayList;
import java.util.List;

public class FactorialList {

	private Factorial factorialCalculator = new Factorial();

	public List<String> calculate(List<String> factorials) {
		List<String> results = new ArrayList<String>();
		for (String factorial : factorials)
			results.add(buildFactorialMessage(factorial));
		return results;
	}

	private String buildFactorialMessage(String factorial) {
		if (factorial == null)
			return "Não é possivel calcular um fatorial de nulo";
		Integer factorialNumber = Integer.parseInt(factorial);
		if (factorialNumber < 0)
			return "Não é possivel calcular um fatorial de negativo";
		return String.format("Fatorial de %d é %d", factorialNumber, factorialCalculator.calculate(factorialNumber));
	}

}
