package com.bylkov.homework01.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.bylkov.homework01.task09.Task9Circle;

public class Test09 {
	
	private Task9Circle circle;
	
	@Before
	public void initialize() {
		circle = new Task9Circle(2);
	}
	
	@Test
	public void testCountLength() {
		assertEquals(12.56, circle.countLength(), 0.01);
	}
	
	@Test
	public void testCountArea() {
		assertEquals(12.56, circle.countArea(), 0.01);
	}

}
