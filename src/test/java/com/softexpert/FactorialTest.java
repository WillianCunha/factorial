package com.softexpert;

import java.math.BigInteger;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial = new Factorial();

	@Test
	public void factorialZero() {
		BigInteger result = factorial.calculate(0);
		MatcherAssert.assertThat(result, Matchers.comparesEqualTo(new BigInteger("1")));
	}

	@Test
	public void factorialOne() {
		BigInteger result = factorial.calculate(1);
		MatcherAssert.assertThat(result, Matchers.comparesEqualTo(new BigInteger("1")));
	}

	@Test
	public void factorialFive() {
		BigInteger result = factorial.calculate(5);
		MatcherAssert.assertThat(result, Matchers.comparesEqualTo(new BigInteger("120")));
	}

	@Test
	public void factorialThirdThree() {
		BigInteger result = factorial.calculate(33);
		MatcherAssert.assertThat(result,
				Matchers.comparesEqualTo(new BigInteger("8683317618811886495518194401280000000")));
	}

	@Test
	public void factorialFiftyFour() {
		BigInteger result = factorial.calculate(54);
		MatcherAssert.assertThat(result, Matchers.comparesEqualTo(
				new BigInteger("230843697339241380472092742683027581083278564571807941132288000000000000")));
	}
}
