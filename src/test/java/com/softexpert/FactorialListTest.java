package com.softexpert;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialListTest {
	private FactorialList factorialList = new FactorialList();
	
	@Test
	public void simpleList() {
		List<Integer> factorials = Arrays.asList(1, 2, 3);
		List<String> results = factorialList.calculate(factorials);
		MatcherAssert.assertThat(results, Matchers.contains("Fatorial de 1 é 1", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
	
	@Test
	public void simpleListWithNull() {
		List<Integer> factorials = Arrays.asList(null, 2, 3);
		List<String> results = factorialList.calculate(factorials);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de nulo", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
	
	@Test
	public void simpleListWithNegative() {
		List<Integer> factorials = Arrays.asList(-1, 2, 3);
		List<String> results = factorialList.calculate(factorials);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de negativo", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
}
