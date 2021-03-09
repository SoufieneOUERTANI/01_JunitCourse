package com.ouertani.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraysTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// fail => assertEquals(objects)
	@Test
	public void testSortIntArray_1() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertEquals(expected, numbers);
	}

	// succees => assertArrayEquals(values)
	@Test
	public void testSortIntArray_2() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	// exepect Exception
	@Test(expected = NullPointerException.class)
	public void testSortIntArray_3() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	// milliseconds
	@Test(timeout = 10)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 100000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
