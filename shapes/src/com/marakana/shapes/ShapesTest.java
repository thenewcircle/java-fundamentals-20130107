package com.marakana.shapes;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ShapesTest {

	private static final Random RANDOM = new Random();

	@Test
	public void copyWithWidthMustNotChangeHeight() {
		for (int i = 0; i < 100; i++) {
			Rectangle r1 = arbitraryRectangle();
			Rectangle r2 = r1.copyWithWidth(RANDOM.nextInt(50));
			assertEquals(r1.getHeight(), r2.getHeight());
		}
	}

	private static Square arbitrarySquare() {
		return new Square(RANDOM.nextInt(50));
	}

	private static Rectangle arbitraryRectangle() {
		return RANDOM.nextBoolean()
				? arbitrarySquare()
				: new Rectangle(RANDOM.nextInt(50), RANDOM.nextInt(50));
	}
}
