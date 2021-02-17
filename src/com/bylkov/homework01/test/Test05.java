package com.bylkov.homework01.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.bylkov.homework01.task05.Task5;

import org.junit.Test;

public class Test05 {

	@Test
	public void testIsItPerfect() {
		assertTrue(Task5.isItPerfect(1));
		assertFalse(Task5.isItPerfect(3));
	}
}
