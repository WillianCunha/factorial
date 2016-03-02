package com.softexpert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialFileTest {
	private FactorialFileReader factorialFileReader = new FactorialFileReader();
	private FactorialFile factorialFile = new FactorialFile();
	private List<String> results = new ArrayList<String>();

	@Test
	public void simpleFile() throws NumberFormatException, IOException {		
		results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest.txt");
		results = factorialFile.processFile(results);
		MatcherAssert.assertThat(results, Matchers.contains("Fatorial de 1 é 1", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
	
	@Test
	public void simpleFileTwo() throws NumberFormatException, IOException {
		results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest2.txt");
		results = factorialFile.processFile(results);
		MatcherAssert.assertThat(results, Matchers.contains("Fatorial de 1 é 1",
				"Fatorial de 98 é 9426890448883247745626185743057242473809693764078951663494238777294707070023223798882976159207729119823605850588608460429412647567360000000000000000000000",
				"Fatorial de 65 é 8247650592082470666723170306785496252186258551345437492922123134388955774976000000000000000",
				"Fatorial de 12 é 479001600"));
	}
	
	@Test
	public void simpleFileThree() throws NumberFormatException, IOException {
		results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest3.txt");
		results = factorialFile.processFile(results);
		MatcherAssert.assertThat(results, Matchers.contains("Não é possivel calcular um fatorial de negativo", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
	}
	
//	@Test
//	public void simpleFileWithLetters() throws NumberFormatException, IOException {
//		results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest4.txt");
//		results = factorialFile.processFile(results);
//		System.out.println(results);
//		MatcherAssert.assertThat(results, Matchers.contains("Não é um número", "Fatorial de 2 é 2", "Fatorial de 3 é 6"));
//	}
}
