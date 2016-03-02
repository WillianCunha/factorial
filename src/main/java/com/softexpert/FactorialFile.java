package com.softexpert;

import java.util.ArrayList;
import java.util.List;

public class FactorialFile {
	
	public List<String> processFile(List<String> results) {
		FactorialList factorialList = new FactorialList();
		List<Integer> integerList = new ArrayList<Integer>();
		for (String result : results)
				integerList.add(Integer.parseInt(result));
		return factorialList.calculate(integerList);
	}
	
}
