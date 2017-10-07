package com.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeDemoTest {

	@Test
	public void test() {
		
		assertArrayEquals(3, 2);
		assertFalse(3+4>6);
		assertTrue(assertArrayEquals(3, 2));
		
	}

	private boolean assertArrayEquals(int i, int j) {
		return i+j<6;
		// TODO Auto-generated method stub
		
	}
}
