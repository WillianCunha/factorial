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
		List<String> factorials = Arrays.asList("1", "2", "3");
		List<String> results = factorialList.calculate(factorials);
		MatcherAssert.assertThat(results,
				Matchers.contains("Fatorial de 1 é 1", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}

	@Test
	public void simpleListWithNull() {
		List<String> factorials = Arrays.asList(null, "2", "3");
		List<String> results = factorialList.calculate(factorials);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de nulo",
				"Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}

	@Test
	public void simpleFile() {
		List<String> factorialFileInput = Arrays.asList("1", "2", "3");
		List<String> results = factorialList.calculate(factorialFileInput);
		MatcherAssert.assertThat(results,
				Matchers.contains("Fatorial de 1 é 1", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}

	@Test
	public void simpleFileTwo() {
		List<String> factorialFileInput = Arrays.asList("1", "98", "65", "12");
		List<String> results = factorialList.calculate(factorialFileInput);
		MatcherAssert.assertThat(results,
				Matchers.contains("Fatorial de 1 é 1",
						"Fatorial de 98 é 9426890448883247745626185743057242473809693764078951663494238777294707070023223798882976159207729119823605850588608460429412647567360000000000000000000000",
						"Fatorial de 65 é 8247650592082470666723170306785496252186258551345437492922123134388955774976000000000000000",
						"Fatorial de 12 é 479001600"));
	}

	@Test
	public void simpleListWithNegative() {
		List<String> factorialFileInput = Arrays.asList("-9", "2", "3");
		List<String> results = factorialList.calculate(factorialFileInput);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de negativo",
				"Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
}
