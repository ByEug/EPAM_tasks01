package com.bylkov.homework01.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bylkov.homework01.task07.Task7Point;

public class Test07 {
	
	private Task7Point point;
	
	@Before
	public void initialize() {
		point = new Task7Point(3, 4);
	}
	
	@Test
	public void testCountLine() {
		assertEquals(5, point.getLength(), 0.00001);
	}

}
