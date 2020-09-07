package com.sapient.training.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before test method");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after class method");
	}

	@Test
	public void isValidTestAddition() {
		Calculator calculator = new Calculator();
		assertEquals("addition passed",5.0,calculator.addition(2.0, 3.0),0.01);
	}
	@Test
	public void isInvalidTestAddition() {
		Calculator calculator = new Calculator();
		assertNotEquals("addtion failed",4.0,calculator.addition(2.0, 3.0),0.01);
	}
	@Test
	public void isValidtestSubstraction() {
		assertEquals("Sub passed",1,new Calculator().substraction(2, 1));
	}
	@Test
	public void isinvalidtestSubstraction() {
		assertNotEquals("Sub failed",5,new Calculator().substraction(2, 1));
	}

}
