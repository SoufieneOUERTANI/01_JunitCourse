package com.ouertani.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}
	// AACD => CD ... ACD => CD ... CDEF => CDEF .. CDAA => CDAA

	@Test
	// Should be public void - expected/processed
	public void testtruncateAInFirst2Position_1() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// Expected/Actual
	}

	@Test
	public void testtruncateAInFirst2Position_2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		// Expected/Actual
	}

	@Test
	public void testtruncateAInFirst2Position_3() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
		// Expected/Actual
	}

	@Test
	public void testtruncateAInFirst2Position_4() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
		// Expected/Actual
	}

	// ABCD => false ... ABAB => true .. AB => true .. A => false

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_1() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		// Expected/Actual
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		// Expected/Actual
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_3() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
		// Expected/Actual
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_4() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		// Expected/Actual
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_5() {
		assertTrue("fail", true);
	}

}
