package com.bylkov.homework01.task03;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.bylkov.homework01.task03.Task3.*;


public class Task3Main {
	
	public static void main(String[] args) {
		
		double outsideSquare;
		double insideSquare;
		
		try (Scanner scanner = new Scanner(System.in)) {
			outsideSquare = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		insideSquare = findInsideSquare(outsideSquare);
		
		System.out.println(insideSquare);
		System.out.println(getAttitude(outsideSquare, insideSquare));
	}
}
