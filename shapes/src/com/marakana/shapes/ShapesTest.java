package com.marakana.shapes;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ShapesTest {

	private static final Random RANDOM = new Random();

	@Test
	public void squaresMustBeSquare() {
		for (int i = 0; i < 100; i++) {
			Square s = arbitrarySquare();
			assertEquals(s.getWidth(), s.getHeight());
		}
	}

	private static Square arbitrarySquare() {
		return new Square(RANDOM.nextInt(50));
	}

	private static Rectangle arbitraryRectangle() {
		return new Rectangle(RANDOM.nextInt(50), RANDOM.nextInt(50));
	}
}
