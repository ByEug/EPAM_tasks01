package com.bylkov.homework01.test;

import static org.junit.Assert.assertEquals;
import com.bylkov.homework01.task06.Task6;

import org.junit.Test;

public class Test06 {

	@Test
	public void testGetHours() {
		int hours = Task6.getHours(7201);
		assertEquals(hours, 2);
	}
	
	@Test
	public void testGetMinutes() {
		int minutes = Task6.getMinutes(7324, 2);
		assertEquals(minutes, 2);
	}
	
	@Test
	public void testGetSeconds() {
		int seconds = Task6.getSeconds(7324, 2, 2);
		assertEquals(seconds, 4);
	}
	
}
