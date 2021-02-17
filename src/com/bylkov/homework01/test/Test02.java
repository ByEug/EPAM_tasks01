package com.bylkov.homework01.test;

import static org.junit.Assert.assertEquals;
import com.bylkov.homework01.task02.Task2;
import org.junit.Test;

public class Test02 {

	@Test
	public void testGetDays() {
		int days = Task2.getDays(2000, 2);
		assertEquals(days, 29, 0.00001);
	}
}
