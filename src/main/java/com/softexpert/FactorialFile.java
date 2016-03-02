package com.softexpert;

import java.util.ArrayList;
import java.util.List;

public class FactorialFile {
	public List<String> processFile(List<String> results) {
		List<Integer> integerList = new ArrayList<Integer>();
		for (String result : results) {
				integerList.add(Integer.parseInt(result));
		}
		FactorialList factorialList = new FactorialList();
		return factorialList.calculate(integerList);
	}
}
