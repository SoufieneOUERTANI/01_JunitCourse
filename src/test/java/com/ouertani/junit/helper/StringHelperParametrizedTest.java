package com.ouertani.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {
	StringHelper helper = new StringHelper();

	private String input;
	private String excpectedOutput;

	public StringHelperParametrizedTest(String input, String excpectedOutput) {
		super();
		this.input = input;
		this.excpectedOutput = excpectedOutput;
	}

	@Parameters
	// AACD => CD ... ACD => CD ... CDEF => CDEF .. CDAA => CDAA
	public static Collection<String[]> testConditions() {
		String StringexcpectedOutput[][] = { { "AACD", "CD" }, { "ACD", "CD" }, { "CDEF", "CDEF" }, { "CDAA", "CDAA" },
				{ "blabla", "blibli" } };
		return Arrays.asList(StringexcpectedOutput);
	}

	@Test
	// Should be public void - expected/processed
	public void testtruncateAInFirst2Position_1() {
		assertEquals(excpectedOutput, helper.truncateAInFirst2Positions(input));
		// Expected/Actual
	}

}
