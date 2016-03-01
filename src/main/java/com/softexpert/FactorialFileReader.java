package com.softexpert;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FactorialFileReader {

	public List<String> calculate(String filename) throws NumberFormatException, IOException {
		List<String> results = new ArrayList<String>();
		BufferedReader bufferedReader = readFile(filename);
		readValues(results, bufferedReader);

		results = processFileReader(results);
		bufferedReader.close();

		return results;
	}

	private BufferedReader readFile(String filename) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream(filename);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader;
	}

	private void readValues(List<String> results, BufferedReader bufferedReader) throws IOException {
		String value = "";

		while (true) {
			value = bufferedReader.readLine();
			if (value != null) {
				StringTokenizer stringTokenizer = new StringTokenizer(value, " ,.;?!abcdefghijklmnopqrstuvxyz");
				value = stringTokenizer.nextToken();
				results.add(value);
			} else
				break;
		}
	}

	private List<String> processFileReader(List<String> results) {
		List<Integer> integerList = new ArrayList<Integer>();
		for (String result : results)
			integerList.add(Integer.parseInt(result));

		FactorialList factorialList = new FactorialList();
		return factorialList.calculate(integerList);
	}
}
