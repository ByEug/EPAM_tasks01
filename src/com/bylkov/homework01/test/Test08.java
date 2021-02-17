package com.bylkov.homework01.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bylkov.homework01.task08.Task8;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test08 {

	private double number;
	private double result;
	
	@Parameters 
	public static List<Object[]> createParameters(){
		return Arrays.asList(new Object[][]{{2, 0.5}, {4, 5}});
	}
	
	public Test08(double number, double result) {
		super();
		this.number = number;
		this.result = result;
	}
	
	@Test
	public void testFunction() {
		assertEquals(result, Task8.function(number), 0.00001);
	}
}
