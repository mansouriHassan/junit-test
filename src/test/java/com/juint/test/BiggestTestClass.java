package com.juint.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.test.App;

public class BiggestTestClass {

	@Test
	public void biggestWithNominalCase() {
		App app = new App();
		int[] list = new int[] {7, 8, 9};
		int biggest = app.biggestNumber(list);
		
		assertEquals(9, biggest);
	}
	
	@Test
	public void biggestNumberWithNegativValues() {
		App app = new App();
		int[] list = new int[] {-7, -8, -9};
		int biggest = app.biggestNumber(list);
		
		assertEquals(-7, biggest);
	}
	
	@Test
	public void biggestNumberWithEmptyValues() {
		App app = new App();
		int[] list = new int[] {};
		int biggest = app.biggestNumber(list);
		
		assertEquals(Integer.MIN_VALUE, biggest);
	}
	/*
	@Test
	public void biggestNumberWithNullValues() {
		App app = new App();
		app.biggestNumber(null);
	}
	*/
	@Test
	public void testBiggestWithNullValues() {
		App app = new App();
		app.biggestNumber(null);
	}
}
