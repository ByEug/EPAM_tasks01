package com.bylkov.homework01.test;

import com.bylkov.homework01.task10.Task10;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test10 {
	
	private double[][] array;
	
	@Before
	public void initialize() {
		array = new double[2][];
		array[0] = new double[] {0, 0.25, 0.5, 0.75, 1};
		array[1] = new double[] {0, 0.255342, 0.546302, 0.931596, 1.557408};
	}
	
	@Test
	public void testGetTable() {
		double[][] bufferArray = Task10.getTable(0, 1, 0.25);
		for (int i = 0; i < bufferArray.length; i++) {
			for (int j = 0; j < bufferArray[i].length; j++) {
				assertEquals(bufferArray[i][j], array[i][j], 0.1);
			}
		}
	}
	
}
