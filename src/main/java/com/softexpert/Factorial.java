package com.softexpert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {

	public BigInteger calculate(int factorial) {
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= factorial; i++)
			result = result.multiply(new BigDecimal(i).toBigInteger());
		return result;
	}
}
