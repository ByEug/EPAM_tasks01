package com.bylkov.homework01.test;


import static org.junit.Assert.assertEquals;
import com.bylkov.homework01.task03.Task3;
import org.junit.Test;

public class Test03 {
	
	@Test
	public void testFindInsideSquare() {
		double square = Task3.findInsideSquare(8.0);
		assertEquals(square, 4.0, 0.0001);
	}
}
