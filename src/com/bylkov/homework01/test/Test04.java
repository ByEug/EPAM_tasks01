package com.bylkov.homework01.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.bylkov.homework01.task04.Task4;

import org.junit.Test;



public class Test04 {
	
	@Test
	public void testCheckParity() {
		assertTrue(Task4.checkParity(new int[] {2, 4, 6, 8}));
		assertFalse(Task4.checkParity(new int[] {1, 4, 3, 1}));
	}

}
