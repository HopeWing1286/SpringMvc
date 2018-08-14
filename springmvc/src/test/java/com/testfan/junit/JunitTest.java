package com.testfan.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" setUpBeforeClass ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" tearDownAfterClass ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(" setUp ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" tearDown ");
	}

	@Test
	public void test1() {
		System.out.println(" test1 ");
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		System.out.println(" test2 ");
		fail("Not yet implemented");
	}


}
