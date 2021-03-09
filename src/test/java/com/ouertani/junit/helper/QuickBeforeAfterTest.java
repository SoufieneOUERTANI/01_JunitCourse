package com.ouertani.junit.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	private static Logger logger = Logger.getLogger(QuickBeforeAfterTest.class.getName());

	@BeforeClass
	public static void beforeClass() {
		logger.log(Level.INFO, "Before class executed");
	}

	@Before
	public void setup() {
		logger.log(Level.INFO, "Before executed");
	}

	@Test
	public void test1() {
		logger.log(Level.INFO, "Test1 executed");
	}

	@Test
	public void test2() {
		logger.log(Level.INFO, "Test2 executed");
	}

	@After
	public void teardown() {
		logger.log(Level.INFO, "after executed");
	}

	@AfterClass
	public static void afterClass() {
		logger.log(Level.INFO, "After class executed");
	}
}
