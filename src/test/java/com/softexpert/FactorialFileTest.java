package com.softexpert;

import java.io.IOException;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialFileTest {

	private FactorialFileReader factorialFileReader = new FactorialFileReader();
	private FactorialFile factorialFile = new FactorialFile();

	@Test
	public void simpleFile() throws NumberFormatException, IOException {
		List<String> factorialFileInput = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest.txt");
		List<String> results = factorialFile.processFile(factorialFileInput);
		MatcherAssert.assertThat(results, Matchers.contains("Fatorial de 1 é 1", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}

	@Test
	public void simpleFileTwo() throws NumberFormatException, IOException {
		List<String> factorialFileInput = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest2.txt");
		List<String> results = factorialFile.processFile(factorialFileInput);
		MatcherAssert.assertThat(results,
				Matchers.contains("Fatorial de 1 é 1",
						"Fatorial de 98 é 9426890448883247745626185743057242473809693764078951663494238777294707070023223798882976159207729119823605850588608460429412647567360000000000000000000000",
						"Fatorial de 65 é 8247650592082470666723170306785496252186258551345437492922123134388955774976000000000000000",
						"Fatorial de 12 é 479001600"));
	}

	@Test
	public void simpleFileThree() throws NumberFormatException, IOException {
		List<String> factorialFileInput = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest3.txt");
		List<String> results = factorialFile.processFile(factorialFileInput);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de negativo",
				"Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}

}
