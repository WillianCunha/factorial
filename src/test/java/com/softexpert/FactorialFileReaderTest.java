package com.softexpert;

import java.io.IOException;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialFileReaderTest {
	
	private FactorialFileReader factorialFileReader = new FactorialFileReader();

	@Test
	public void simpleFileReaderOne() throws NumberFormatException, IOException {
		List<String> results  = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest.txt");
		MatcherAssert.assertThat(results, Matchers.contains("1", "2", "3"));
	}
	
	@Test
	public void simpleFileReaderTwo() throws NumberFormatException, IOException {
		List<String> results  = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest2.txt");
		MatcherAssert.assertThat(results, Matchers.contains("1", "98", "65", "12"));
	}

	@Test
	public void simpleFileReaderThree() throws NumberFormatException, IOException {
		 List<String> results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest3.txt");
		MatcherAssert.assertThat(results, Matchers.contains("-1", "2", "3"));
	}
	
	@Test
	public void simpleFileReaderFour() throws NumberFormatException, IOException {
		 List<String> results = factorialFileReader.readFile("src/test/resources/com/softexpert/factorialTest4.txt");
		MatcherAssert.assertThat(results, Matchers.contains("a", "2", "3"));
	}
}
