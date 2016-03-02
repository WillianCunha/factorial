package com.softexpert;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FactorialFileReader {
	private List<String> results = new ArrayList<String>();

	public List<String> readFile(String filename) throws IOException {
		InputStream inputStream = new FileInputStream(filename);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		readValues(bufferedReader);
		bufferedReader.close();

		return results;
	}

	private void readValues(BufferedReader bufferedReader) throws IOException {
		String value = "";

		while (true) {
			value = bufferedReader.readLine();
			if (value != null)
				results.add(value);
			else
				break;
		}

	}

}
