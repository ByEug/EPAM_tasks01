package com.bylkov.homework01.test;

import static org.junit.Assert.assertEquals;

import com.bylkov.homework01.task01.Task1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Test01 {

	private double number;
	private double result;
	
	@Parameters 
	public static List<Object[]> createParameters(){
		return Arrays.asList(new Object[][]{{1.7123, 3}, {2.000, 2}});
	}
	
	public Test01(double number, double result) {
		super();
		this.number = number;
		this.result = result;
	}

	@Test
	public void testGetLastDigit() {
		double lastDigit = Task1.getLastDigit(number);
		assertEquals(lastDigit, result, 0.0001);
	}
	
}
